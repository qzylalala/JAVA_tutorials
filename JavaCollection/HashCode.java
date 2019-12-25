package JavaCollection;

import java.util.HashMap;
import java.util.Map;

public class HashCode {
	public static void main(String[] args) {
		 String key1 = "a";
	     Map<String, Integer> map = new HashMap<>();
	     map.put(key1, 123);

	     String key2 = new String("a");
	     map.get(key2); // 123
	     
	     // 在Map的内部，对key做比较是通过equals()实现的
	     System.out.println(key1 == key2); // false
	     System.out.println(key1.equals(key2)); // true
	}
}

//int hashCode() {
//	return Objects.hash(firstName, lastName, age);
//}

//编写equals()和hashCode()遵循的原则是：
//equals()用到的用于比较的每一个字段，都必须在hashCode()中用于计算；
//equals()中没有使用到的字段，绝不可放在hashCode()中计算。