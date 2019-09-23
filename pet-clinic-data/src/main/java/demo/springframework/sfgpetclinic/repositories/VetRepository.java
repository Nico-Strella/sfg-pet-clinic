package demo.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import demo.springframework.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
