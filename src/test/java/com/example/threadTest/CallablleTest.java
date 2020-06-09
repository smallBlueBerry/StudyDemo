package com.example.threadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**   
* @Description: Callable接口并不是Runnable接口的子接口,所以Callable对象不能直接作为Thread的target.
* 而且call()方法还有一个返回值,call()方法并不是直接调用的,它是作为线程执行体被调用的.好在Java提供了Future接口来代表Callable接口里的
* Call()方法的返回值,并为Future接口提供了一个FutureTask实现类,该实现类既实现了Future接口,并实现了Runnable接口----可以作为Thread类的target.
* @version: v1.0.0
* @author: linan
* @date: Jan 21, 2020 11:38:11 AM 
*/
public class CallablleTest implements Callable {
	
	public static void main(String[] args) {
		CallablleTest test = new CallablleTest();
		ExecutorService excutorService = Executors.newSingleThreadExecutor();  
		Future submit = excutorService.submit(test);
		try {
			Object o = submit.get();
			System.out.println(o);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} finally {
			excutorService.shutdown();
		}
		
	}

	@Override
	public Object call() throws Exception {
		return true;
	}

}
