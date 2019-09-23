package demo.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import demo.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
