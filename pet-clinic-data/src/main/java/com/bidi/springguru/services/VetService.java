package com.bidi.springguru.services;

import com.bidi.springguru.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
