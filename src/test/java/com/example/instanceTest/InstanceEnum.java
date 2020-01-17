package com.example.instanceTest;

/**   
* @Description: 枚举类（线程安全，调用效率高，不能延时加载，可以天然的防止反射和反序列化调用）
* @version: v1.0.0
* @author: linan
* @date: Jan 17, 2020 5:26:58 PM 
*/
public enum InstanceEnum {
	
	//枚举元素本身就是单例
	INSTANCE;
	
	//添加自己需要的操作
	public void singletonOperation() {
		
	}
}
