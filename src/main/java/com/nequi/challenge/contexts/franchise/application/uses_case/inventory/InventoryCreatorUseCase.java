package com.nequi.challenge.contexts.franchise.application.uses_case.inventory;

import com.nequi.challenge.contexts.franchise.domain.model.Inventory;
import com.nequi.challenge.contexts.franchise.domain.repositories.IInventoryRepository;
import org.springframework.stereotype.Component;

@Component
public class InventoryCreatorUseCase {
   private final IInventoryRepository repository;

   public InventoryCreatorUseCase(IInventoryRepository repository) {
      this.repository = repository;
   }

   public Inventory execute(Inventory inventory) {
      return this.repository.addProduct(inventory);
   }
}
