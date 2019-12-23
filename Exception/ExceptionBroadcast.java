package Exception;

public class ExceptionBroadcast {
	public static void main(String[] args) {
		try {
			process1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void process1() {
		process2();
	}
	
	static void process2() {
		Integer.parseInt(null);
	}
}

// 当某个方法抛出了异常时，如果当前方法没有捕获异常，异常就会被抛到上层调用方法，
// 直到遇到某个try ... catch被捕获为止
