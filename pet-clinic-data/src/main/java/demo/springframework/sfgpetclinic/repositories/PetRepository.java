package demo.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import demo.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
