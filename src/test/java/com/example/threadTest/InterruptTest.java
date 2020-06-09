package com.example.threadTest;

/**   
* @Description: 线程的中断（用一个布尔型标记控制循环的停止）
* @version: v1.0.0
* @author: linan
* @date: Jan 21, 2020 11:19:06 AM 
*/
public class InterruptTest implements Runnable {
	
	private static boolean isContinue = false;
	private static int num = 0;
	private static InterruptTest runnable = new InterruptTest();

	@Override
	public void run() {
		while(true) {
			if (isContinue) {
				break;
			} else {
				num++;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Thread thread = new Thread(runnable);
		thread.start();
		try {
			Thread.sleep(50);
			setContinue();
			System.out.println(num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}



	public static void setContinue() {
		isContinue = true;
	}

}
