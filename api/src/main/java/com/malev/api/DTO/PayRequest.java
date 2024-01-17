package com.malev.api.DTO;

public record PayRequest(String cardNumber, String cardName, String CCV, String currency, String orderNumber) {
}
