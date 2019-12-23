package Exception;

public class ThrowOutException {
	public static void main(String[] args) {
		try {
			process1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void process1() {
		try {
			process2();
		} catch (NullPointerException e) {
			throw new IllegalArgumentException(e);
		} // 若为IllegalArgumentException();则初始Exception被忽略了
	}     // 原始的Exception实例传进去，新的Exception就可以持有原始Exception信息
	
	static void process2() {
		throw new NullPointerException();
	}
}
