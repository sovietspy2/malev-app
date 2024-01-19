package com.malev.api;

import com.malev.api.DTO.PayRequest;
import com.malev.api.DTO.PayResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="Pay api", description = "This API will allow users to pay")
public interface PayApi {

    @Operation(
            summary = "Pay",
            description = "pays with credit card")
    @ApiResponse(responseCode = "200", description = "successful operation")
    @ApiResponse(responseCode = "400", description = "invalid card data")
    PayResponse pay(PayRequest request);

    @Operation(
            summary = "Revert payment",
            description = "revert payment")
    @ApiResponse(responseCode = "200", description = "successful operation")
    @ApiResponse(responseCode = "400", description = "error")
    PayResponse revert(PayRequest request);

}
