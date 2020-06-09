package com.example.lambdaTest;

import java.util.HashMap;

/**   
* @Description: map.getOrDefault方法实例
* 需求；假设有一个数字到对应英文单词的Map，输出key4对应的英文单词，如果不存在则输出NoValue
* @version: v1.0.0
* @author: linan
* @date: Jun 4, 2020 5:51:17 PM 
*/
public class GetOrDefaultTest {

	public static void main(String[] args) {
		// 查询Map中指定的值，不存在时使用默认值
		HashMap<String, String> map = new HashMap<>();
		map.put("key1", "one");
		map.put("key2", "two");
		map.put("key3", "three");
		// Java7以及之前做法
		if(map.containsKey("key4")){ // 1
		    System.out.println(map.get("key4"));
		}else{
		    System.out.println("NoValue");
		}
		// Java8使用Map.getOrDefault()
		System.out.println(map.getOrDefault("key3", "NoValue")); // 2
	}
}
