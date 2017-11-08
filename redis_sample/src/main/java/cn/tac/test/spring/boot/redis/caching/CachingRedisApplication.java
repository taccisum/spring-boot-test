package cn.tac.test.spring.boot.redis.caching;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.lang.reflect.Method;

/**
 * @author tac
 * @since 08/11/2017
 */
@SpringBootApplication
@EnableCaching
public class CachingRedisApplication {
    public static void main(String[] args) {
        SpringApplication.run(CachingRedisApplication.class, args);
    }

    @Configuration
    class MyConfig {
        @Autowired
        private StringRedisTemplate redisTemplate;

        @Bean
        public CacheManager cacheManager() {
            RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
            cacheManager.setDefaultExpiration(60);
            setSerializer(redisTemplate);
            return cacheManager;
        }

        @Bean("keyGenerator")
        public KeyGenerator myKeyGenerator() {
            return new SimpleKeyGenerator(){
                @Override
                public Object generate(Object target, Method method, Object... params) {
                    return method.getAnnotation(Cacheable.class).value()[0] + ":" + super.generate(target, method, params);
                }
            };
        }

        private void setSerializer(RedisTemplate<String, String> template) {
            Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<>(Object.class);
            ObjectMapper om = new ObjectMapper();
            om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
            om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
            jackson2JsonRedisSerializer.setObjectMapper(om);
            template.setKeySerializer(new StringRedisSerializer());
            template.setValueSerializer(jackson2JsonRedisSerializer);
        }
    }
}
