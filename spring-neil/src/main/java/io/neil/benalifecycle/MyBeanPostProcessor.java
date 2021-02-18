package io.neil.benalifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Neil
 * Created on 2020/06/24
 */

public class MyBeanPostProcessor implements BeanPostProcessor {
	public MyBeanPostProcessor() {
		super();
		System.out.println("这是BeanPostProcessor实现类构造器！！");
		// todo Auto-generated constructor stub
	}


	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改！");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改！");
		return bean;
	}
}
