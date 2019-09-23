package demo.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import demo.springframework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
