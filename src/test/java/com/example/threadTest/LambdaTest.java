package com.example.threadTest;

/**   
* @Description: Lambda表达式创建线程
* @version: v1.0.0
* @author: linan
* @date: Jun 4, 2020 4:32:26 PM 
*/
public class LambdaTest {
	
	public static void main(String[] args) {
		new Thread(() -> {
			System.out.println("Hello");
			System.out.println("running...");
		}).start();
		
	}

}
