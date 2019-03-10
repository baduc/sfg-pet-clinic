package com.bidi.springguru.services;

import com.bidi.springguru.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
