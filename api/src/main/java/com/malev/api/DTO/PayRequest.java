package com.malev.api.DTO;

public record PayRequest(String card, String name, String currency, String payeeName, Integer amount) {
}
