package JavaCollection;

import java.util.List;
import java.util.Iterator;


// List是按索引顺序访问的长度可变的有序表
public class JavaList {
	public static void main(String[] args) {
		List<String> list = List.of("apple", "pear", "banana");
		for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
		
		// Java的for each循环本身就可以帮我们使用Iterator遍历
		for (String s : list) {
            System.out.println(s);
        }
	}
}
