package com.example.redisTest;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
	
	@Resource 
	private RedisTemplate<String, Object> redisTemplate;

	@Test
	public void test() throws Exception {

		// 保存对象
		User user = new User("超人", 20);
		redisTemplate.opsForValue().set(user.getName(), user);

//		user = new User("蝙蝠侠", 30);
//		redisTemplate.opsForValue().set(user.getName(), user);
//
//		user = new User("蜘蛛侠", 40);
//		redisTemplate.opsForValue().set(user.getName(), user);

		User users = (User) redisTemplate.opsForValue().get("超人");
		System.out.println(users.getName()+", "+users.getAge());
		
		//Assert.assertEquals(20, redisTemplate.opsForValue().get(user));
		//Assert.assertEquals(30, redisTemplate.opsForValue().get("蝙蝠侠").getAge());
		//Assert.assertEquals(40, redisTemplate.opsForValue().get("蜘蛛侠").getAge());

	}

}
