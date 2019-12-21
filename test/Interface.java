package test;

// 如果一个抽象类没有字段,所有都是抽象方法，则写为interface
public class Interface {
	
}

interface Person5 {
	// 接口的静态字段
	public static final int Male = 1;
	public static final int Female = 2;
	
	void run();
	String getName();
	default void display() {
		System.out.println(getName() + "run");
	}
}

class Student5 implements Person5 {
	private String name;
	
	public Student5(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(this.name + " run");
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}