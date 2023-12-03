package io.bootify.banco_mongo_d_b.repos;

import io.bootify.banco_mongo_d_b.domain.Prestamo;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PrestamoRepository extends MongoRepository<Prestamo, Long> {
}
