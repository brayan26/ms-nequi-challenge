package com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.repositories.jpa;

import com.nequi.challenge.contexts.franchise.domain.model.Inventory;
import com.nequi.challenge.contexts.franchise.domain.repositories.IInventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class InventoryRepository implements IInventoryRepository {
   private final JpaInventoryRepository repository;

   @Override
   public Inventory addProduct(Inventory inventory) {
      return null;
   }

   @Override
   public void updateStock(Inventory inventory) {

   }

   @Override
   public List<Inventory> listByBranchOffice(long branchOfficeId) {
      return List.of();
   }
}
