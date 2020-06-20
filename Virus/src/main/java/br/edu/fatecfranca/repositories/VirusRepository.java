package br.edu.fatecfranca.repositories;
import br.edu.fatecfranca.entities.Virus;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VirusRepository extends MongoRepository<Virus, String>{

}
