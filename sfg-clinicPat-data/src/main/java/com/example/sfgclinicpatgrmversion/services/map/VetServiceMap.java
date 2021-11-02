package com.example.sfgclinicpatgrmversion.services.map;

import com.example.sfgclinicpatgrmversion.model.Vet;
import com.example.sfgclinicpatgrmversion.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractJavaService<Vet,Long> implements CrudService<Vet,Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }
}
