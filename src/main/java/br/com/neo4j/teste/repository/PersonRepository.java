package br.com.neo4j.teste.repository;

import br.com.neo4j.teste.model.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface PersonRepository extends Neo4jRepository<Person, Long> {

    Person findByName(@Param("name") String name);

    Collection<Person> findByNameLike(@Param("name") String name);

    @Query("MATCH p=()-[r:ACTED_IN]->() RETURN p LIMIT {limit}")
    Collection<Person> relation(@Param("limit") Integer limit);
}
