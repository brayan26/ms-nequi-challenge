package com.nequi.challenge.contexts.franchise.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BranchOffice {
   private long id;
   private String name;
   private long franchiseId;
   private long franchiseName;
}
