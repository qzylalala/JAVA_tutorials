package test;

public class StructureFunction {
	public static void main(String[] args)
	{
		Person1 p = new Person1("qzylalala", 18);
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}

class Person1
{
	private String name;
	private int age;
	
	public Person1(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
}
