package com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.repositories.jpa;

import com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.entities.BranchOfficeEntity;
import org.springframework.data.repository.CrudRepository;

public interface JpaBranchOfficeRepository extends CrudRepository<BranchOfficeEntity, Long> {
}
