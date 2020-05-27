package com.util.generic.configuration;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;


@EnableCaching
@Configuration
public class CacheConfiguration extends CachingConfigurerSupport {
	private static int CACHE_TIME = 30; // Time in Minutes

	private static int CACHE_TIME_TWO = 30; // Time in Minutes

	public final static String CACHE_MERCHANT_SITES = "CACHE_MERCHANT_SITES";
	public final static String CACHE_CAR_CONTRACT_TYPE = "CACHE_CAR_CONTRACT_TYPE";
	public final static String CACHE_AREA = "CACHE_AREA";
	public final static String CACHE_AREA_ALL = "CACHE_AREA_ALL";
	public final static String CACHE_CAR_TYPE = "CACHE_CAR_TYPE";
	public final static String CACHE_PROMOTION_TYPE = "CACHE_PROMOTION_TYPE";
	public final static String CACHE_OBJECT_MERCHANT = "CACHE_OBJECT_MERCHANT";
	public final static String CACHE_DICT_ITEM  = "CACHE_DICT_ITEM";

//	@Override
//	public CacheManager cacheManager() {
////		ConcurrentMapCacheManager cacheManager = new ConcurrentMapCacheManager() {
////			@Override
////			protected Cache createConcurrentMapCache(final String name) {
////				if (name.equalsIgnoreCase(CACHE_AREA) || name.equalsIgnoreCase(CACHE_AREA_ALL)) {
////					return new ConcurrentMapCache(name, CacheBuilder.newBuilder().build().asMap(), false);
////				} else {
////					if (name.equalsIgnoreCase(CACHE_OBJECT_MERCHANT)) {
////						return new ConcurrentMapCache(name, CacheBuilder.newBuilder()
////								.expireAfterWrite(CACHE_TIME_TWO, TimeUnit.MINUTES).build().asMap(), false);
////					}
////
////					return new ConcurrentMapCache(name,
////							CacheBuilder.newBuilder().expireAfterWrite(CACHE_TIME, TimeUnit.MINUTES).build().asMap(),
////							false);
////				}
////			}
////		};
//		return cacheManager;
//	}
}
