package com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.repositories;

import com.nequi.challenge.contexts.franchise.domain.model.BranchOffice;
import com.nequi.challenge.contexts.franchise.domain.repositories.IBranchOfficeRepository;
import com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.repositories.jpa.JpaBranchOfficeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BranchOfficeRepository implements IBranchOfficeRepository {
   private final JpaBranchOfficeRepository repository;

   @Override
   public BranchOffice create(BranchOffice branchOffice) {
      return null;
   }

   @Override
   public List<BranchOffice> findAll() {
      return List.of();
   }
}
