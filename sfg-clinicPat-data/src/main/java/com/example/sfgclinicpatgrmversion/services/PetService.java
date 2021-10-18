package com.example.sfgclinicpatgrmversion.services;

import com.example.sfgclinicpatgrmversion.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
