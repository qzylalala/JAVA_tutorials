package test;

public class Abstract {
	public static void main(String[] args) {
	    Person4 p = new Student();
	        p.run();
	    }
}

abstract class Person4 {
    public abstract void run();
}

class Student extends Person4 {
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}
