package io.neil.benalifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Neil
 * Created on 2020/06/24
 */

public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

	private String name;
	private String addr;
	private int phone;

	private BeanFactory beanFactory;
	private String beanName;

	public Person() {
		System.out.println("【构造器】调用Person的构造器实例化");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", addr='" + addr + '\'' +
				", phone='" + phone + '\'' +
				'}';
	}

	@Override
	// BeanFactoryAware
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()");
		this.beanFactory = beanFactory;
	}

	@Override
	// BeanNameAware
	public void setBeanName(String name) {
		System.out.println("【BeanNameAware接口】调用BeanNameAware.setBeanName()");
		this.beanName = name;
	}

	@Override
	// InitializingBean
	public void afterPropertiesSet() throws Exception {
		System.out.println("【InitializingBean接口】调用InitializingBean.afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("【DiposibleBean接口】调用DiposibleBean.destory()");
	}

	// 通过<bean>的init-method属性指定的初始化方法
	public void myInit() {
		System.out.println("【init-method】调用<bean>的init-method属性指定的初始化方法");
	}

	// 通过<bean>的destroy-method属性指定的初始化方法
	public void myDestory() {
		System.out.println("【destroy-method】调用<bean>的destroy-method属性指定的初始化方法");
	}
}
