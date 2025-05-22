package com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.repositories.jpa;

import com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface JpaProductRepository extends CrudRepository<ProductEntity, Long> {
}
