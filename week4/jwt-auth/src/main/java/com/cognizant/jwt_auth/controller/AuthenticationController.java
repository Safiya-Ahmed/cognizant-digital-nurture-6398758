package com.cognizant.jwt_auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.cognizant.jwt_auth.util.JwtUtil;
import com.cognizant.jwt_auth.model.AuthResponse;

import jakarta.servlet.http.HttpServletRequest;  // ✅ If you're using Spring Boot 3+ and Jakarta EE
import java.util.Base64;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")  // ✅ Ensures Spring handles GET method
    public AuthResponse authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        String[] credentials = extractUsernameAndPassword(authHeader);

        // Simple credential validation
        if ("user".equals(credentials[0]) && "pwd".equals(credentials[1])) {
            String token = jwtUtil.generateToken(credentials[0]);
            return new AuthResponse(token);
        } else {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials");
        }
    }

    private String[] extractUsernameAndPassword(String authHeader) {
        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Missing or invalid Authorization header");
        }

        String base64Credentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
        String decoded = new String(decodedBytes);
        return decoded.split(":", 2);
    }
}
