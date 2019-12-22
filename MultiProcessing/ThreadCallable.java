package MultiProcessing;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread2 implements Callable<String>{
	@Override
	public String call() throws Exception {
		for(int x = 0; x<3; x++) {
			System.out.println(Thread.currentThread().getName() + "执行" + x);
		}
		return Thread.currentThread().getName() + "执行完毕";
	}
}

public class ThreadCallable {
	public static void main(String[] args) throws Exception{
		FutureTask<String> taskA = new FutureTask<String>(new MyThread2());
		new Thread(taskA, "线程一").start();
		new Thread(new FutureTask<String>(new MyThread2()), "线程二").start();
		System.out.println(taskA.get());       //获取线程taskA的返回值
	}
}
