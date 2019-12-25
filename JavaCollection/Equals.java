package JavaCollection;

import java.util.List;

public class Equals {
	public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");
        System.out.println(list.contains("C")); // true
        System.out.println(list.contains("X")); // false
        System.out.println(list.indexOf("C")); // 2
        System.out.println(list.indexOf("X")); // -1
        
        // List内部并不是通过==判断两个元素是否相等，
        // 而是使用equals()方法判断两个元素是否相等
        System.out.println(list.contains(new String("C"))); // true or false?
        System.out.println(list.indexOf(new String("C"))); // 2 or -1?
	}
}


// 编写equals()方法
//先确定实例“相等”的逻辑，即哪些字段相等，就认为实例相等；
//用instanceof判断传入的待比较的Object是不是当前类型，如果是，继续比较，否则，返回false；
//对引用类型用Objects.equals()比较，对基本类型直接用==比较。
//public boolean equals(Object o) {
//    if (o instanceof Person) {
//        Person p = (Person) o;
//        return Objects.equals(this.name, p.name) && this.age == p.age;
//    }
//    return false;
//}