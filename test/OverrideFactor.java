package test;

public class OverrideFactor {
	public static void main(String[] args) {
		Students0 stu = new Students0();
		stu.run();
	}
}

class Person0{
	public void run() {
		System.out.println("person run");
	}
}

class Students0 extends Person0 {
	@Override
	public void run() {
		System.out.println("students run");
	}
}
