package api.project.curso.person.person.api.service;

import api.project.curso.person.person.api.dto.MessageResponseDTO;
import api.project.curso.person.person.api.entity.Person;
import api.project.curso.person.person.api.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created Person with ID "+savedPerson.getId())
                .build();
    }
}
