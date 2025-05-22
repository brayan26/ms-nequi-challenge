package com.nequi.challenge.contexts.franchise.application.uses_case.inventory;

import com.nequi.challenge.contexts.franchise.domain.model.Inventory;
import com.nequi.challenge.contexts.franchise.domain.repositories.IInventoryRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InventoryListUseCase {
   private final IInventoryRepository repository;

   public InventoryListUseCase(IInventoryRepository repository) {
      this.repository = repository;
   }

   public List<Inventory> execute(long branchOfficeId) {
      return this.repository.listByBranchOffice(branchOfficeId);
   }
}
