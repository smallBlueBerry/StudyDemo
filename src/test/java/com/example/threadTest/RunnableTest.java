package com.example.threadTest;

/**   
* @Description: 采用Runnable接口的方式创建的多个线程可以共享线程类的实例变量.是因为:程序创建的Runnable对象只是线程的target,
* 而多个线程可以共享一个target,所以多个线程可以共享一个线程类(实际上应该是线程的target类)的实例变量.
* @version: v1.0.0
* @author: linan
* @date: Jan 21, 2020 11:36:31 AM 
*/
public class RunnableTest {
	
	public static void main(String[] args) {
		Runnable runnable = new Test();
		Thread thread = new Thread(runnable);
		thread.start();
	}
	
	public static class Test implements Runnable {
		
		private int count = 10;

		@Override
		public void run() {
			while (true) {
				System.out.println(count + " ");
				if (--count == 0) {
					return;
				}
			}
		}
		
	}

}
