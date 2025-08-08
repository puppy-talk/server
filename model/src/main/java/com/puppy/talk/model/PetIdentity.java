package com.puppy.talk.model;

import java.util.Objects;

public class PetIdentity {
    private final Long id;
    
    public PetIdentity(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }
    
    public static PetIdentity of(Long id) {
        return new PetIdentity(id);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PetIdentity that = (PetIdentity) obj;
        return Objects.equals(id, that.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return "PetIdentity{id=" + id + '}';
    }
}