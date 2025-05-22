package com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.repositories.jpa;

import com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.entities.InventoryEntity;
import com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.entities.InventoryPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaInventoryRepository extends JpaRepository<InventoryEntity, InventoryPk> {
}
