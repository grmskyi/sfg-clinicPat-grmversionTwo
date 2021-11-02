package com.example.sfgclinicpatgrmversion.services.map;

import com.example.sfgclinicpatgrmversion.model.Pet;
import com.example.sfgclinicpatgrmversion.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractJavaService<Pet,Long> implements CrudService<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }
}
