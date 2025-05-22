package com.nequi.challenge.contexts.franchise.infrastructure.persistence.orm.repositories;

import com.nequi.challenge.contexts.franchise.domain.model.Product;
import com.nequi.challenge.contexts.franchise.domain.repositories.IProductRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository implements IProductRepository {
   private String jpsProucString;

   @Override
   public Product create(Product product) {
      return null;
   }

   @Override
   public void deleteProduct(long id) {

   }
}
