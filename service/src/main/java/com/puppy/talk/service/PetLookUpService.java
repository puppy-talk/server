package com.puppy.talk.service;

import com.puppy.talk.exception.PetNotFoundException;
import com.puppy.talk.infrastructure.PetRepository;
import com.puppy.talk.model.Pet;
import com.puppy.talk.model.PetIdentity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetLookUpService {
    private final PetRepository petRepository;

    public Pet findPet(PetIdentity identity) {
        return petRepository.findByIdentity(identity)
                .orElseThrow(() -> new PetNotFoundException(identity));
    }

    public List<Pet> findAllPets() {
        return petRepository.findAll();
    }
}