package com.malev.api;

import com.malev.domain.Email;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Email", description = "the Email Api")
public interface EmailApi {

    @Operation(
            summary = "Send email",
            description = "sends email to recipient")
    @ApiResponse(responseCode = "200", description = "successful operation")
    @ApiResponse(responseCode = "400", description = "invalid email")
    Email sendEmail(Email email);
}
