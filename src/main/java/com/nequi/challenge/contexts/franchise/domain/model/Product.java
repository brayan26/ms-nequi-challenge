package com.nequi.challenge.contexts.franchise.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
   private long id;
   private String name;
   private double price;
}
