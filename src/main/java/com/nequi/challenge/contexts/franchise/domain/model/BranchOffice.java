package com.nequi.challenge.contexts.franchise.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BranchOffice {
   private long id;
   private String name;
   private List<Product> products = new ArrayList<>();
}
