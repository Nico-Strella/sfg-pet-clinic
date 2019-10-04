package demo.springframework.sfgpetclinic.services;

import java.util.List;

import demo.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findByLastNameLike(String lastName);
}
