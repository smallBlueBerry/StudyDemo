package com.example.instanceTest;

/**   
* @Description: 饿汉式单例 初始化创建实例，造成资源浪费，不能延时加载
* @version: v1.0.0
* @author: linan
* @date: Jan 17, 2020 5:07:26 PM 
*/
public class InstanceTest2 {
	
	private static InstanceTest2 instance = new InstanceTest2();
	
	private InstanceTest2() {}
	
	public static InstanceTest2 getInstance() {
		return instance;
	}

}
