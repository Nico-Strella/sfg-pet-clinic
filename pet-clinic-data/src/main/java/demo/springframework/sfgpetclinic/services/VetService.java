package demo.springframework.sfgpetclinic.services;

import java.util.Set;

import demo.springframework.sfgpetclinic.model.Vet;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
