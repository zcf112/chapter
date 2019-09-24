package com.smart.beanfactory;

import com.smart.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class BeanFactoryTest {
    public static void main(String[] args) throws Throwable{
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();//??
        Resource res = resolver.getResource("classpath:beans.xml");
        BeanFactory bf = new XmlBeanFactory(res);
        System.out.println("init BeanFactory");
        Car car = bf.getBean("car", Car.class);
        System.out.println("car bean is ready for us");
    }
}
