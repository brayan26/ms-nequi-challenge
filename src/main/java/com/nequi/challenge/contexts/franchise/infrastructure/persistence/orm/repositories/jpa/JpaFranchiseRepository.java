package com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.repositories.jpa;

import com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.entities.FranchiseEntity;
import org.springframework.data.repository.CrudRepository;

public interface JpaFranchiseRepository extends CrudRepository<FranchiseEntity, Long> {
}
