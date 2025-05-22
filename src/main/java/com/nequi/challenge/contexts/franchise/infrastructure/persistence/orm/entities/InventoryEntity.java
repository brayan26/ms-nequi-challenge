package com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "inventory")
public class InventoryEntity {
   @EmbeddedId
   private InventoryPk inventoryId;

   @Column(name = "stock")
   private int stock;

   @ManyToOne
   @MapsId("productId")
   @JoinColumn(name = "producto_id")
   private ProductEntity product;

   @ManyToOne
   @MapsId("branchOfficeId")
   @JoinColumn(name = "sucursal_id")
   private BranchOfficeEntity branchOffice;
}
