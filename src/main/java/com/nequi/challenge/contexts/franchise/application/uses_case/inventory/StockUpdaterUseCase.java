package com.nequi.challenge.contexts.franchise.application.uses_case.inventory;

import com.nequi.challenge.contexts.franchise.domain.model.Inventory;
import com.nequi.challenge.contexts.franchise.domain.repositories.IInventoryRepository;
import org.springframework.stereotype.Component;

@Component
public class StockUpdaterUseCase {
   private final IInventoryRepository repository;

   public StockUpdaterUseCase(IInventoryRepository repository) {
      this.repository = repository;
   }

   public void execute(Inventory inventory) {
      return this.repository.updateStock(inventory);
   }
}
