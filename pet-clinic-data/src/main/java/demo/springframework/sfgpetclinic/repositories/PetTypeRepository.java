package demo.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import demo.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
