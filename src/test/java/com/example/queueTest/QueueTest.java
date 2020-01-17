package com.example.queueTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**   
* @Description: 三种方式实现队列：数组、集合、两个栈
* @version: v1.0.0
* @author: linan
* @date: Jan 17, 2020 2:45:35 PM 
*/
public class QueueTest {
	
	public static void main(String[] args) {
		System.out.println("测试数组队列：");
		Queue queue = new Queue();
		queue.in("a");
		queue.in("b");
		queue.in("c");
		System.out.println(queue.out());
		System.out.println(queue.out());
		queue.in("d");
		System.out.println(queue.out());
		System.out.println(queue.out());
		queue.in("e");
		System.out.println(queue.out());
		
		System.out.println("测试集合队列：");
		ListQueue listQueue = new ListQueue();
		listQueue.in("a");
		listQueue.in("b");
		listQueue.in("c");
		System.out.println(listQueue.out());
		System.out.println(listQueue.out());
		listQueue.in("d");
		System.out.println(listQueue.out());
		System.out.println(listQueue.out());
		
		System.out.println("############ LinkedList 方法 ###########");
		listQueue.linkIn("a");
		listQueue.linkIn("b");
		listQueue.linkIn("c");
		System.out.println(listQueue.linkOut());
		System.out.println(listQueue.linkOut());
		listQueue.linkIn("d");
		System.out.println(listQueue.linkOut());
		System.out.println(listQueue.linkOut());
		
		System.out.println("测试栈队列：");
		StackQueue stackQueue = new StackQueue();
		stackQueue.in("a");
		stackQueue.in("b");
		stackQueue.in("c");
		System.out.println(stackQueue.out());
		System.out.println(stackQueue.out());
		stackQueue.in("d");
		System.out.println(stackQueue.out());
		System.out.println(stackQueue.out());
	}

	/**   
	* @Description: 数组方法
	* @version: v1.0.0
	* @author: linan
	* @date: Jan 17, 2020 2:55:07 PM 
	*/
	public static class Queue {
		
		String[] arr = new String[5];
		int index = 0;
		
		public void in(String str) {
			arr[index++] = str;
		}
		
		public String out() {
			String temp = arr[0];
			for (int i=1; i < arr.length; i++) {
				arr[i-1] = arr[i];
			}
			index--;
			return temp;
		}
	}
	
	/**   
	* @Description: 集合方法
	* @version: v1.0.0
	* @author: linan
	* @date: Jan 17, 2020 3:12:27 PM 
	*/
	public static class ListQueue {
		
		List<String> list = new ArrayList<>();
		
		LinkedList<String> linkList = new LinkedList<>();
		
		public void in(String str) {
			list.add(str);
		}
		
		public String out() {
			if (!list.isEmpty()) {
				return list.remove(0);
			} else {
				return null;
			}
		}
		
		public void linkIn(String str) {
			linkList.addLast(str);
		}
		
		public String linkOut() {
			if (!linkList.isEmpty()) {
				return linkList.removeFirst();
			} else {
				return null;
			}
		}
	}
	
	/**   
	* @Description: 两个队列方法
	* @version: v1.0.0
	* @author: linan
	* @date: Jan 17, 2020 4:08:11 PM 
	*/
	public static class StackQueue {
		
		Stack<String> stack1 = new Stack<String>();
		Stack<String> stack2 = new Stack<String>();
		
		public void in(String str) {
			stack1.push(str);
		}
		
		public String out() {
			if (stack2.isEmpty()) {
				while (stack1.size() > 0) {
					stack2.push(stack1.pop());
				}
			}
			//System.out.println("fistm:"+stack2.firstElement());
 			return stack2.pop();
		}
	}
	
}
