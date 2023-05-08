package ca.access.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;


/**
 * @author: Lei Fu
 * @date: 2023/05/08
 * @description: Custom annotations for query
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableAccessQuery {
    /**
     * The property name of the base object
     * @return
     */
    String propName() default "";

    /**
     * Inquiry type
     * @return
     */
    Type type() default Type.EQUAL;

    /**
     * The property name of the link query, such as dept in the user class
     */
    String joinName() default "";
    /**
     * Default left join.
     */
    Join join() default Join.LEFT;
    /**
     * Multi-field fuzzy search, only supports string type fields, multiple separated by commas
     */
    String blurry() default "";

    /**
     * enumerate
     */
    enum Type{
        EQUAL
        ,GREATER_THAN
        ,LESS_THAN
        ,INNER_LIKE
        ,LEFT_LIKE
        ,RIGHT_LIKE
        ,LESS_THAN_NQ
        ,in
        ,NOT_EQUAL
        ,BETWEEN
        ,NOT_NULL
    }
    /**
     * enumerate （joint query）
     */
    enum Join{
        LEFT,RIGHT
    }
}
