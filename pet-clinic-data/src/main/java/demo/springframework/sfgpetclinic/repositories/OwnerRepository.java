package demo.springframework.sfgpetclinic.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import demo.springframework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findByLastNameLike(String lastName);
}
