package com.nequi.challenge.app.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class CacheConfig {

   @Bean
   public CacheManager cacheManager() {
      CaffeineCacheManager cacheManager = new CaffeineCacheManager("FranchiseCache");
      cacheManager.setCaffeine(Caffeine.newBuilder()
            .expireAfterWrite(30, TimeUnit.MINUTES)
            .maximumSize(100));
      return cacheManager;
   }
}
