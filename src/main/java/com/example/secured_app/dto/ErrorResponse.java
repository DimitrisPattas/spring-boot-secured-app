package com.example.secured_app.dto;

import java.util.Map;

public record ErrorResponse(
        String message,
        Map<String, String> errors
) {}
