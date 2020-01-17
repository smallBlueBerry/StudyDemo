package com.example.instanceTest;

/**   
* @Description: 懒汉式单例，线程安全，调用效率不高，但是能延时加载
* @version: v1.0.0
* @author: linan
* @date: Jan 17, 2020 4:29:30 PM 
*/
public class InstanceTest {
	
	private static InstanceTest instance;
	
	private InstanceTest() {
		
	}
	
	public static synchronized InstanceTest getInstance() { 
		if (instance == null) {
			instance = new InstanceTest();
		}
		return instance;
	}

}
