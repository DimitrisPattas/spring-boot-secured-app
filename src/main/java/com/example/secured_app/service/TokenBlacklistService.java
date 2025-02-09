package com.example.secured_app.service;

import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.HashSet;

@Service
public class TokenBlacklistService {
    private final Set<String> blacklistedTokens = new HashSet<>();

    public void blacklistToken(String token) {
        blacklistedTokens.add(token);
    }

    public boolean isTokenBlacklisted(String token) {
        return blacklistedTokens.contains(token);
    }
}
