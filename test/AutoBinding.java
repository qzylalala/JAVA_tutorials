package test;

public class AutoBinding {
	public static void main(String[] args){  
	      Father father=new Son(); //多态  
	      father.f1(); //打印结果： Son-f1()  
	  }  
}

//被调用的父类  
class Father{  
    public void f1(){  
        System.out.println("father-f1()");  
    }
    // 重载
    public void f1(int i){  
        System.out.println("father-f1()  para-int "+i);  
      }  
}  
//被调用的子类  
class Son extends Father{  
	@Override
    public void f1(){ //覆盖父类的方法  
		System.out.println("Son-f1()");  
	}
	// 重载
    public void f1(char c){  
        System.out.println("Son-s1() para-char "+c);  
      }  
} 