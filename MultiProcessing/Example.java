package MultiProcessing;

public class Example {
	public static void main(String[] args) {
		Runnable source = new MyThread3();        //资源类
		new Thread(source, "线程一").start();
		new Thread(source, "线程二").start();
		new Thread(source, "线程三").start();
	}
}

class MyThread3 implements Runnable{
	private int ticket = 5;
	@Override
	public void run() {
		for(int x = 0; x<1000; x++) {
			if(ticket > 0)
				System.out.println(Thread.currentThread().getName() + "买票，剩余票数：" + --this.ticket);
		}
	}
}

