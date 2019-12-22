package MultiProcessing;

class ThreadExample {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		new MyThread("线程1").run();
		new MyThread("线程2").run();
		new MyThread("线程3").run();
		// start()启动多线程 2ms；
		// run() 未启动多线程 164ms;
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
	}
}



class MyThread extends Thread {
	private String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for(int x = 0; x < 1000; x++) {
			System.out.println(this.name + "执行" + x);
		}
	}
}