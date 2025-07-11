package com.cognizant.jwt_auth.model;

public class AuthResponse {
    private String token;

    // no-args constructor
    public AuthResponse() {
    }

    public AuthResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
