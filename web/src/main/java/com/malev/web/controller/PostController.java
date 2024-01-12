package com.malev.web.controller;

import com.malev.api.PostApi;
import com.malev.domain.Post;
import com.malev.web.feign.PostClient;
import com.malev.web.feign.FeignConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Import(FeignConfiguration.class)
public class PostController implements PostApi {

    private final PostClient postClient;

    public PostController(PostClient postClient) {
        this.postClient = postClient;
    }

    @Override
    @GetMapping(value = "custom_url_posts/{id}")
    public Post getPost(@PathVariable(value = "id") Integer id) {
         return postClient.getPostById(id);
    }
}
