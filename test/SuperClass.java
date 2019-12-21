package test;

public class SuperClass {
	public static void main(String[] args)
	{
		Student2 stu = new Student2("qzy", 18, 100);
		System.out.println(stu.hello());
		
		Person2 p = new Person2();
		System.out.println(p instanceof Person2); // true
		System.out.println(p instanceof Student2); // false

		Student2 s = new Student2();
		System.out.println(s instanceof Person2); // true
		System.out.println(s instanceof Student2); // true

		Student2 n = null;
		System.out.println(n instanceof Student2); // false
	}
}


class Person2 {
    protected String name;
    protected int age;

    public Person2() {
    	
    }
    
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student2 extends Person2 {
    protected int score;
    
    public Student2() {
    	
    }
    
    public Student2(String name, int age, int score)
    {
    	super(name, age);
    	// 任何class的构造方法，
    	// 第一行语句必须是调用父类的构造方法
        this.score = score;
    }
    
    public String hello() {
        return "Hello, " + super.name;
    }
}
