package Exception;

public class ExceptionExample {
	public static void main(String[] args) {
        ExceptionSolution e = new ExceptionSolution();
        e.f(5);
    }
}

class ExceptionSolution {
    // 异常恢复模型
    static int[] array = new int[2];
    public void f(int index){
        while(true){
            try {
                array[index] = 1;
                System.out.println(array[index]);
                break;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("捕捉到异常: ArrayIndexOutOfBoundsException");
                e.printStackTrace(System.out);
            //    e.printStackTrace();  // 信息会输出到标准错误流
                index--;
            }finally {
                System.out.println("还未正确？");
            }
        }
        System.out.println("正确了！");
    }
}

