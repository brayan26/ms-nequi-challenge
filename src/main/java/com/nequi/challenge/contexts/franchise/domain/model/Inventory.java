package com.nequi.challenge.contexts.franchise.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Inventory {
   private long branchOfficeId;
   private String branchOfficeName;
   private long productId;
   private String productName;
   private double productPrice;
   private int stock;
}

