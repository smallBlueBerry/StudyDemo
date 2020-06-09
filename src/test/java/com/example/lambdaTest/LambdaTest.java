package com.example.lambdaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**   
* @Description: lambda表达式常用
* @version: v1.0.0
* @author: linan
* @date: Jun 4, 2020 5:49:10 PM 
*/
public class LambdaTest {
	
	public static void main(String[] args) {
		// 使用forEach()结合Lambda表达式迭代
		ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
		list.forEach(str -> {
			if(str.length() > 3) System.out.println(str);
		});
		
		list.sort((str1, str2) -> str1.length()-str2.length());
		System.out.println(list.toString());
		
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.forEach((k, v) -> System.out.println(k + "=" + v));
	}

}
