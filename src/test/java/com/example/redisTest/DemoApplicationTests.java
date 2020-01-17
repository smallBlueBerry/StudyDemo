package com.example.redisTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Test
	public void contextLoads() {
		// 保存字符串
		stringRedisTemplate.opsForValue().set("name", "linan");
		Assert.assertEquals("linan", stringRedisTemplate.opsForValue().get("name"));
		System.out.println("保存数据到redis");
	}

}
