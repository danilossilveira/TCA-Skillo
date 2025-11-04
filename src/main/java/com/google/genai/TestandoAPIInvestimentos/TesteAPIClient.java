package com.google.genai.TestandoAPIInvestimentos;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class TesteAPIClient {

    private final String API_KEY = "6XS6KZWX0R6SVQ5G";

    @Bean
    public WebClient webClient(WebClient.Builder builder) {
        return builder.baseUrl("https://www.alphavantage.co/query?function=OVERVIEW&symbol=IBM&apikey=" + API_KEY).
                build();
    }
}

