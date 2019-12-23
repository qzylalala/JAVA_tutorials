package JavaLogging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoggingExample {
	public static void main(String[] args) {
        Log log = LogFactory.getLog(LoggingExample.class);
        log.info("start...");
        log.warn("end.");
    }
}
// 在当前目录下运行命令  java -cp commons-logging-1.2.jar LoggingExample.java即可成功运行