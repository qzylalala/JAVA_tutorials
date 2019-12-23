package Exception;

public class Exception_addSuppressed {
	public static void main(String[] args) throws Exception {
        Exception origin = null;
        try {
            System.out.println(Integer.parseInt("abc"));
        } catch (Exception e) {
            origin = e;
            throw e;
        } finally {
        	Exception e = new IllegalArgumentException();
        	if (origin != null) {
        		e.addSuppressed(origin);
        	}
        	throw e;
        	// 绝大多数情况下，在finally中不要抛出异常。
        	// 因此，我们通常不需要关心Suppressed Exception
        }
    }
}
