package org.develop.wechatpay.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 节点注解，用于数组
 * 
 * @author qiuzhhenhao
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface XmlElementArray {

	public String value();

	public String indexElement();
}
