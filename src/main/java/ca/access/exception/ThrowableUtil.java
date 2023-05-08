package ca.access.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author: Lei Fu
 * @date: 2023/05/08
 * @description: Exception handling
 */
public class ThrowableUtil {
    /**
     * Get stack information
     * @param throwable
     * @return
     */
    public static String getStackTrace(Throwable throwable){
        StringWriter sw = new StringWriter();
        try(PrintWriter pw = new PrintWriter(sw)){
            throwable.printStackTrace();
            return sw.toString();
        }
    }
}
