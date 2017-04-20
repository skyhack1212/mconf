package cn.ms.mconf.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The Configure Entity Annotations.
 * 
 * @author lry
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MconfEntity {

	/**
	 * Application ID
	 * 
	 * @return
	 */
	String appId();

	/**
	 * Configure ID
	 * 
	 * @return
	 */
	String confId() default "$";

}
