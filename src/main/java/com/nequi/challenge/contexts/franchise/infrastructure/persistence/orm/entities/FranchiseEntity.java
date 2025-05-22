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
@Table(name = "franchise")
public class FranchiseEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(name = "name")
   private String name;
   @OneToMany(mappedBy = "franchise", cascade = CascadeType.ALL, orphanRemoval = true)
   private List<BranchOfficeEntity> branchOffices;
}
