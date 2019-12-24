package JavaReflection;

public class JavaClass {
	public static void main(String[] args) {
		String s = "Hello, world";
		Class cls = s.getClass();
		Class cls2 = String.class;
		boolean sameClass = (cls == cls2);
		System.out.println(sameClass);
	}
}
