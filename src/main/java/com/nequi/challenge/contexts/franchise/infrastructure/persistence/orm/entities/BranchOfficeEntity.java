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
@Table(name = "branch_offices")
public class BranchOfficeEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(name = "name")
   private String name;
   @ManyToOne
   @JoinColumn(name = "franquicia_id")
   private FranchiseEntity franchise;
   @OneToMany(mappedBy = "branchOffice", cascade = CascadeType.ALL)
   private List<InventoryEntity> products;
}
