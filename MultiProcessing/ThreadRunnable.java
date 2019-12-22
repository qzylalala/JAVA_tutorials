package MultiProcessing;

public class ThreadRunnable {
	public static void main(String[] args) {
		new Thread(new MyThread1(), "线程一").start();
		new Thread(new MyThread1(), "线程二").start();
		new Thread(new MyThread1(), "线程三").start();
	}
}


// Thread类只能够单继承，而Runnable接口可以克服单继承的局限性。
class MyThread1 implements Runnable {
	@Override
	public void run() {
		for (int x = 0; x < 3; x++) {
			System.out.println(Thread.currentThread().getName() + "执行" + x);
		}
	}
}