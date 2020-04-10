package com.hemanshu.cloud.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingController {

    private final String greetWord;

    public GreetingController(@Value("${greet.word}") String greetWord) {
        this.greetWord = greetWord;
    }

    @GetMapping("/")
    public @ResponseBody String greetWord() {
        return greetWord;
    }
}
