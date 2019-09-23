package demo.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import demo.springframework.sfgpetclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
