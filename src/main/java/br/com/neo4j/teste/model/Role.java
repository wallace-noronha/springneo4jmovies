package br.com.neo4j.teste.model;

import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RelationshipEntity(type = "ACTED_IN")
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    private List<String > role = new ArrayList<>();

    @StartNode
    private Person person;

    @EndNode
    private Movie movie;

    public Role(){

    }

    public Role(Movie movie, Person person){
        this.movie = movie;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public List<String> getRoles() {
        return role;
    }

    public Person getPerson() {
        return person;
    }

    public Movie getMovie() {
        return movie;
    }

    public void addRoleName(String name){
        if (this.role == null){
            this.role = new ArrayList<>();
        }
        this.role.add(name);
    }

}
