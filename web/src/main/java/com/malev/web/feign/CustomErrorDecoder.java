package com.malev.web.feign;


import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {
        @Override
        public Exception decode(String methodKey, Response response) {

            return switch (response.status()) {
                case 400 -> new Exception("400");
                case 404 -> new Exception("404");
                default -> new Exception("Generic error");
            };
        }
}