package io.bootify.banco_mongo_d_b.repos;

import io.bootify.banco_mongo_d_b.domain.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LibroRepository extends MongoRepository<Libro, Long> {
}
