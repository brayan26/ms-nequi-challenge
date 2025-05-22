package com.nequi.challenge.contexts.franchise.domain.repositories;

import com.nequi.challenge.contexts.franchise.domain.model.BranchOffice;

import java.util.List;

public interface IBranchOfficeRepository {
   BranchOffice create(BranchOffice branchOffice);
   List<BranchOffice> findAll();
}
