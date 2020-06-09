package com.example.threadTest;

/**   
* @Description: 由于调用了interrupt()方法，所以抛出了InterruptedException异常，在异常中我们关闭while循环
* @version: v1.0.0
* @author: linan
* @date: Jan 21, 2020 11:29:00 AM 
*/
public class InterruptThreadTest implements Runnable {
	
	private static boolean isContinue = false;
	private static int num = 0;
	static InterruptThreadTest interruptThread = new InterruptThreadTest();

	@Override
	public void run() {
		while(true) {
			if (isContinue) {
				break;
			} else {
				num++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("线程被中断");
					setContinue();
				}
			}
		}
	}

	public static void setContinue() {
		isContinue = true;
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(interruptThread);
		thread.start();
		thread.interrupt();
		System.out.println(num);
	}

}
