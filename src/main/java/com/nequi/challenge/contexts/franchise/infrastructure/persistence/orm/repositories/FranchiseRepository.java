package com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.repositories;

import com.nequi.challenge.contexts.franchise.domain.model.Franchise;
import com.nequi.challenge.contexts.franchise.domain.repositories.IFranchiseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FranchiseRepository implements IFranchiseRepository {
   private final IFranchiseRepository repository;

   @Override
   public Franchise create(Franchise franchise) {
      return null;
   }

   @Override
   public List<Franchise> findAll() {
      return List.of();
   }
}
