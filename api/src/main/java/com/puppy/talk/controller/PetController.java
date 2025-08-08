package com.puppy.talk.controller;

import com.puppy.talk.service.PetLookUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pets")
@RequiredArgsConstructor
public class PetController {
    
    private final PetLookUpService petLookUpService;

    @GetMapping
    public List<PetResponse> getPets() {
        return petLookUpService.findAllPets()
                .stream()
                .map(PetResponse::from)
                .toList();
    }
}
