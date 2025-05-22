package com.nequi.challenge.contexts.franchise.application.uses_case.franchise;

import com.nequi.challenge.contexts.franchise.domain.model.Franchise;
import com.nequi.challenge.contexts.franchise.domain.repositories.IFranchiseRepository;
import org.springframework.stereotype.Component;

@Component
public class FranchiseCreatorUseCase {
   private final IFranchiseRepository repository;

   public FranchiseCreatorUseCase(IFranchiseRepository repository) {
      this.repository = repository;
   }

   public Franchise execute(Franchise franchise) {
      return this.repository.create(franchise);
   }
}
