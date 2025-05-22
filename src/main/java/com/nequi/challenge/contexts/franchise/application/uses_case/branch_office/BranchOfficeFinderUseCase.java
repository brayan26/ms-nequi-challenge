package com.nequi.challenge.contexts.franchise.application.uses_case.branch_office;

import com.nequi.challenge.contexts.franchise.domain.model.BranchOffice;
import com.nequi.challenge.contexts.franchise.domain.repositories.IBranchOfficeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BranchOfficeFinderUseCase {
   private final IBranchOfficeRepository repository;

   public BranchOfficeFinderUseCase(IBranchOfficeRepository repository) {
      this.repository = repository;
   }

   public List<BranchOffice> execute() {
      return this.repository.findAll();
   }
}
