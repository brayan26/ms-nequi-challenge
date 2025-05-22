package com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "products")
public class ProductEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(name = "name")
   private String name;
   @Column(name = "price")
   private Double price;
   @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
   private List<InventoryEntity> branchOffices;
}
