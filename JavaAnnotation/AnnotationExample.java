package JavaAnnotation;

import java.lang.reflect.Field;

public class AnnotationExample {
	public static void main(String[] args) throws Exception {
		PersonClass p1 = new PersonClass("Bob", "Beijing", 20);
		PersonClass p2 = new PersonClass("", "Shanghai", 20);
		PersonClass p3 = new PersonClass("Alice", "Shanghai", 199);
		for (PersonClass p : new PersonClass[] { p1, p2, p3 }) {
			try {
				check(p);
				System.out.println("Person " + p + " checked ok.");
			} catch (IllegalArgumentException e) {
				System.out.println("Person " + p + " checked failed: " + e);
			}
		}
	}

	static void check(PersonClass person) throws IllegalArgumentException, ReflectiveOperationException {
		for (Field field : person.getClass().getFields()) {
			Range range = field.getAnnotation(Range.class);
			if (range != null) {
				Object value = field.get(person);
				// TODO:
			}
		}
	}
}
