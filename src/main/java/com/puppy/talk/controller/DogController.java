package com.puppy.talk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 내가 등록한 반려동물의 정보
 */
@RestController
@RequestMapping
public class DogController {

    @GetMapping
    public String getPuppies() {
        return "Puppy!";
    }
}
