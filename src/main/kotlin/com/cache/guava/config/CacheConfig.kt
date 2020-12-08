package com.cache.guava.config

import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.Configuration

@Configuration
@EnableCaching
class CacheConfig {

    /**
     * Caffeine cache manager programmatic configuration
     */
//    @Bean
//    fun cacheManager(): CacheManager {
//        val caffeineCacheManager = CaffeineCacheManager()
//        caffeineCacheManager.setCaffeine(
//            Caffeine.newBuilder()
//                .expireAfterWrite(1, TimeUnit.MINUTES)
//                .initialCapacity(100)
//                .recordStats()
//        )
//        return caffeineCacheManager
//    }

//    /**
//     * default configuration, 1 hours expired, maximum 1000
//     */
//    @Bean
//    fun cacheManager(): CacheManager {
//        val cacheManager = GuavaCacheManager()
//        cacheManager.setCacheBuilder(
//            CacheBuilder.newBuilder().expireAfterWrite(1, TimeUnit.MINUTES).maximumSize(1000)
//        )
//        return cacheManager
//    }

//    /**
//     * here we can define an alternative bean with different configurations for different caches "book" and "books"
//     */
//    @Bean
//    fun cacheManagerAlternative(): CacheManager {
//        val simpleCacheManager = SimpleCacheManager()
//        val bookCache = GuavaCache(
//            "book",
//            CacheBuilder
//                .newBuilder()
//                .expireAfterAccess(10, TimeUnit.HOURS)
//                .build()
//        )
//        val booksCache = GuavaCache(
//            "books", CacheBuilder
//                .newBuilder()
//                .expireAfterAccess(30, TimeUnit.MINUTES)
//                .build()
//        )
//        simpleCacheManager.setCaches(listOf(bookCache, booksCache))
//        return simpleCacheManager
//    }

}