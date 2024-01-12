package com.malev.api;

import com.malev.domain.Post;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Post", description = "the Post Api")
public interface PostApi {
    @Operation(
            summary = "Fetch a Post",
            description = "...")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    Post getPost(Integer id);
}
