package ca.access.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

/**
 * @author: Lei Fu
 * @date: 2023/05/08
 * @description: Exception handling
 */
@Getter
public class BadRequestException extends RuntimeException{
    private Integer status = BAD_REQUEST.value();
    private BadRequestException(String msg){super(msg);}
    public BadRequestException(HttpStatus status,String msg){
        super(msg);
        this.status = status.value();
    }
}
