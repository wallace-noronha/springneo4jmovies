package br.com.neo4j.teste.services;

import java.util.Collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.neo4j.teste.model.Person;
import br.com.neo4j.teste.repository.PersonRepository;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @Transactional(readOnly = true)
    public Person findByName(String name){
        Person result = personRepository.findByName(name);
        return result;
    }

    @Transactional(readOnly = true)
    public Collection<Person> findByNameLike(String name){
        Collection<Person> result = personRepository.findByNameLike(name);
        return result;
    }

    @Transactional(readOnly = true)
    public Collection<Person> relation(Integer limit){
        Collection<Person> result = personRepository.relation(limit);
        return result;
    }

}
