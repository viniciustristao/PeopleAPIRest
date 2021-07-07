package api.project.curso.person.person.api.repository;

import api.project.curso.person.person.api.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long > {
}
