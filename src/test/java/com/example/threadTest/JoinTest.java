package com.example.threadTest;

public class JoinTest {
	
	private static int A = 0;
	private static int B = 0;
	private Thread thread01;
	private Thread thread02;
	
	public JoinTest() {
		
		thread02 = new Thread(()->{
			for (int i=0; i < 100; i++) {
				if (B == 99) {
					System.out.println("B==99");
				}
				B++;
			}
		});
		
		
		thread01 = new Thread(()->{
			for (int j=0; j < 100; j++) {
				if (A == 99) {
					System.out.println("A==99");
				}
				A++;
				try {
					thread02.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	public Thread getThread01() {
		return thread01;
	}

	public Thread getThread02() {
		return thread02;
	}


	public static void main(String[] args) {
		new JoinTest().getThread01().start();
		new JoinTest().getThread02().start();
	}
	

}
