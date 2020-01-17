package com.example.instanceTest;

/**   
* @Description: 静态内部类实现模式（线程安全，调用效率高，可以延时加载）
* @version: v1.0.0
* @author: linan
* @date: Jan 17, 2020 5:10:18 PM 
*/
public class InstanceTest3 {
	
	private static class SingleInstanceClass {
		private static final InstanceTest3 instance = new InstanceTest3();
	}
	
	private InstanceTest3() {}
	
	public static InstanceTest3 getInstance() {
		return SingleInstanceClass.instance;
	}

}
