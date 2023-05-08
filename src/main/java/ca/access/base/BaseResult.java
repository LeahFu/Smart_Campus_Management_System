package ca.access.base;
import lombok.Data;
import java.io.Serializable;
/**
 * @author: Lei Fu
 * @date: 2023/05/08
 * @description: Unified return result set
 */
@Data
public class BaseResult implements Serializable{
    public static final int STATUS_SUCCESS = 200;
    public static final int STATUS_FALL = 500;
    /**
     * return status code
     */
    private int status;
    /**
     * return message
     */
    private String message;
    /**
     * return data
     */
    private Object result;
    /**
     * return time
     */
    private long timestamp = System.currentTimeMillis();

    /**
     * create return object
     * @param status
     * @param message
     * @param result
     * @return
     */
    private static BaseResult creatResult(int status,String message,Object result){
        BaseResult baseResult = new BaseResult();
        baseResult.setStatus(status);
        baseResult.setMessage(message);
        baseResult.setResult(result);
        return baseResult;
    }

    /**
     * Default method for returning success
     * @return
     */
    public static BaseResult success(){
        return BaseResult.creatResult(STATUS_SUCCESS,"success",null);
    }

    /**
     * Return success with message
     * @param message
     * @return
     */
    public static BaseResult success(String message){
        return BaseResult.creatResult(STATUS_SUCCESS,message,null);
    }

    /**
     * Return success with data
     * @param result
     * @return
     */
    public static BaseResult success(Object result){
        return BaseResult.creatResult(STATUS_SUCCESS,"success",result);
    }

    /**
     * Return success with data and message
     * @param message
     * @param result
     * @return
     */
    public static BaseResult success(String message,Object result){
        return BaseResult.creatResult(STATUS_SUCCESS,message,result);
    }

    /**
     * Default method for returning fail
     * @return
     */
    public static BaseResult fail(){
        return BaseResult.creatResult(STATUS_FALL,"fail",null);
    }
    /**
     * Return fail with message
     * @param message
     * @return
     */
    public static BaseResult fail(String message){
        return BaseResult.creatResult(STATUS_FALL,message,null);
    }
    /**
     * Return fail with data and message
     * @param message
     * @param result
     * @return
     */
    public static BaseResult fail(String message,Object result){
        return BaseResult.creatResult(STATUS_FALL,message,result);
    }
}
