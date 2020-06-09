package com.example.threadTest;

import java.util.Timer;
import java.util.TimerTask;

/**   
* @Description: TimerTask的实现了Runnable接口，Timer内部有个TimerThread继承自Thread，因此绕回来还是Thread + Runnable
* 5秒后开始执行，2秒执行一次
* @version: v1.0.0
* @author: linan
* @date: Jun 4, 2020 4:11:05 PM 
*/
public class TimerTest {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				System.out.println("定时任务1执行了....");
			}
			
		}, 5000, 2000);
		
	}
}
