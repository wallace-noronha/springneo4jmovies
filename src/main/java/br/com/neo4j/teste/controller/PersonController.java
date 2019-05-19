package br.com.neo4j.teste.controller;

import br.com.neo4j.teste.model.Person;
import br.com.neo4j.teste.services.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("person")
    public Person findByName(@RequestParam String name){

        return personService.findByName(name);
    }

    @GetMapping("persons")
    public Collection<Person> findByNameLike(@RequestParam String name){
        return personService.findByNameLike(name);
    }

    @GetMapping("relation")
    public Collection<Person> relation(@RequestParam(value = "limit", required = false) Integer limit){
        return personService.relation(limit == null ? 100 : limit);
    }

}
