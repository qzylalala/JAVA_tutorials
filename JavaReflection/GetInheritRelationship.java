package JavaReflection;

public class GetInheritRelationship {
    public static void main(String[] args) throws Exception {
        Class s = Integer.class;
        Class[] is = s.getInterfaces(); //返回直接继承的接口
        for (Class i : is) {
            System.out.println(i);
        }
    }
}

