package com.google.genai.TestandoAPIInvestimentos;

public record FundamentalData(
        String name,
        String symbol,
        String sector,
        String industry,
        String marketCapitalization,
        String peRatio,
        String dividendYield,
        String returnOnEquityTTM,
        String profitMargin,
        String description
) {}
