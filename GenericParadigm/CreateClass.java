package GenericParadigm;

public class CreateClass {

}


class Pair<T> {
    private T first;
    private T last;
    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }
    public T getFirst() {
        return first;
    }
    public T getLast() {
        return last;
    }
    
 // 静态泛型方法应该使用其他类型区分:
 // 在static修饰符后面加一个<K>，编译就能通过
    public static <K> Pair<K> create(K first, K last) {
        return new Pair<K>(first, last);
    }
}

// Java泛型的实现方式——擦拭法，我们就知道了Java泛型的局限：
// 不能是基本类型，例如：int；
// 不能获取带泛型类型的Class，例如：Pair<String>.class；
// 不能判断带泛型类型的类型，例如：x instanceof Pair<String>；
// 不能实例化T类型，例如：new T()。
// 泛型方法要防止重复定义方法 例如：public boolean equals(T obj)
// 子类可以获取父类的泛型类型<T> ：public class IntPair extends Pair<Integer>。IntPair可以获取到父类的泛型类型Integer 