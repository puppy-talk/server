package com.puppy.talk.exception;

import com.puppy.talk.model.PetIdentity;

public class PetNotFoundException extends RuntimeException {
    
    public PetNotFoundException(PetIdentity petIdentity) {
        super("Pet not found with id: " + petIdentity.getId());
    }
}