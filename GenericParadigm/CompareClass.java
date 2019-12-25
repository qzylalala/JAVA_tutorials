package GenericParadigm;

import java.util.Arrays;

public class CompareClass {
	public static void main(String[] args) {
		PersonCompare[] ps = new PersonCompare[] {
			new PersonCompare("Bob", 61),
			new PersonCompare("Alice", 88),
			new PersonCompare("Lily", 75),
		};
		
		Arrays.sort(ps);
		System.out.println(Arrays.toString(ps));
	}
}

class PersonCompare implements Comparable<PersonCompare> {
	String name;
	int score;
	PersonCompare(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public int compareTo(PersonCompare another) {
		return this.name.compareTo(another.name);
	}
	
	public String toString() {
		return this.name + "," + this.score;
	}
}