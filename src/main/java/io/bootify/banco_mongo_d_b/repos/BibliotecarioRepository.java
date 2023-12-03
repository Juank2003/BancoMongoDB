package io.bootify.banco_mongo_d_b.repos;

import io.bootify.banco_mongo_d_b.domain.Bibliotecario;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BibliotecarioRepository extends MongoRepository<Bibliotecario, Long> {
}
