package com.example.sfgclinicpatgrmversion.services;

import com.example.sfgclinicpatgrmversion.model.Owner;



public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
