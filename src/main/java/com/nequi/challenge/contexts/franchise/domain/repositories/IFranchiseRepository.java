package com.nequi.challenge.contexts.franchise.domain.repositories;

import com.nequi.challenge.contexts.franchise.domain.model.Franchise;

import java.util.List;

public interface IFranchiseRepository {
   Franchise create(Franchise franchise);
   List<Franchise> findAll();
}
