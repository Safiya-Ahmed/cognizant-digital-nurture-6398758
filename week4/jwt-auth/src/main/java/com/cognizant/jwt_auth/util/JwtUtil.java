package com.cognizant.jwt_auth.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.util.Date;
import javax.crypto.SecretKey;

@Component
public class JwtUtil {

    private final SecretKey SECRET_KEY = Keys.hmacShaKeyFor("secret_key_12345678901234567890123456789012".getBytes());
    // Key must be 32+ bytes for HS256

    public String generateToken(String username) {
        long now = System.currentTimeMillis();
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date(now))
                .setExpiration(new Date(now + 1000 * 60 * 10)) // 10 minutes
                .signWith(SECRET_KEY, SignatureAlgorithm.HS256) // ✅ New syntax
                .compact();
    }
}
