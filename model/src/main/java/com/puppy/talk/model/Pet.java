package com.puppy.talk.model;

public class Pet {
    private final PetIdentity identity;
    private final String name;
    private final String breed;
    private final int age;
    
    public Pet(PetIdentity identity, String name, String breed, int age) {
        this.identity = identity;
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    
    public PetIdentity getIdentity() {
        return identity;
    }
    
    public String getName() {
        return name;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public int getAge() {
        return age;
    }
    
    public static Builder builder() {
        return new Builder();
    }
    
    public static class Builder {
        private PetIdentity identity;
        private String name;
        private String breed;
        private int age;
        
        public Builder identity(PetIdentity identity) {
            this.identity = identity;
            return this;
        }
        
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        
        public Builder breed(String breed) {
            this.breed = breed;
            return this;
        }
        
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        
        public Pet build() {
            return new Pet(identity, name, breed, age);
        }
    }
}