package com.example.lambdaTest;

import java.util.HashMap;

/**   
* @Description: map.putIfAbsent()  map.replace(K key, V oldValue, V newValue),map.replaceAll
* 作用是只有在不存在key值的映射或映射值为null时，才将value指定的值放入到Map中，否则不对Map做更改．
* 只有在当前Map中key的映射存在且等于oldValue时才用newValue去替换原来的值，否则什么也不做
* 需求：将原来映射关系中的单词都转换成大写．
* @version: v1.0.0
* @author: linan
* @date: Jun 4, 2020 5:59:32 PM 
*/
public class PutIfAbsentTest {
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("key1", "one");
		map.put("key2", "two");
		map.put("key3", null);
		
		map.putIfAbsent("key3", "three");
		map.putIfAbsent("key4", "four");
		
		map.replace("key4", "four", "newFour");
		
		map.replaceAll((k, v) -> v.toUpperCase());
		System.out.println(map.toString());
	}

}
