package br.com.neo4j.teste.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer born;
    private String poster_image;

    public Person(){

    }

    public Person(String name, Integer born, String poster_image){
        this.name = name;
        this.born = born;
        this.poster_image = poster_image;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getBorn() {
        return born;
    }

    public String getPoster_image() {
        return poster_image;
    }

}
