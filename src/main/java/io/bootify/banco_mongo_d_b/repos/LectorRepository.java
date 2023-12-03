package io.bootify.banco_mongo_d_b.repos;

import io.bootify.banco_mongo_d_b.domain.Lector;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LectorRepository extends MongoRepository<Lector, Long> {
}
