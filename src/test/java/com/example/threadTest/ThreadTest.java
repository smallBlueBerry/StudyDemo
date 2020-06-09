package com.example.threadTest;

/**   
* @Description: 继承Thread类的方法来创建线程类时,多个线程之间是无法共享线程类的实例变量.
* @version: v1.0.0
* @author: linan
* @date: Jan 21, 2020 11:36:01 AM 
*/
public class ThreadTest {
	
	public static void main(String[] args) {
		new Test().start();
	}
	
	public static class Test extends Thread {
		
		private int count = 10;
		
		public void run () {
			while (true) {
				System.out.println(count + " ");
				if (--count == 0) {
					return;
				}
			}
 		}
		
	}

}
