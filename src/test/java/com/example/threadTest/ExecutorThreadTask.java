package com.example.threadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**   
* @Description: 线程池与前面所述其他方式的区别在于执行线程的时候由ExecutorService去执行，
* 最终还是利用Thread创建线程。线程池的优势在于线程的复用，从而提高效率。
* @version: v1.0.0
* @author: linan
* @date: Jun 4, 2020 4:30:11 PM 
*/
public class ExecutorThreadTask implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}
	
	public static void main(String[] args) {
		ExecutorThreadTask domoTask = new ExecutorThreadTask();
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.execute(domoTask);
	}

}
