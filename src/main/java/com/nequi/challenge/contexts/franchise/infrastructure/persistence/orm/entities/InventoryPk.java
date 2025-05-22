package com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class InventoryPk implements Serializable {
   @Column(name = "producto_id")
   private Long productId;

   @Column(name = "sucursal_id")
   private Long branchOfficeId;
}
