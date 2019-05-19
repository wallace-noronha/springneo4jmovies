package br.com.neo4j.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories("br.com.neo4j.teste.repository")
public class MovieApplicationRun {

    public static void main(String[] args) {
        SpringApplication.run(MovieApplicationRun.class, args);
    }

}
