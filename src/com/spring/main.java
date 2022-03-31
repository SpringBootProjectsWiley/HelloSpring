package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class main {
	public static void main(String args[]) {
		 Resource resource=new ClassPathResource("objects.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);  
		      
		    Bar bar=(Bar)factory.getBean("bar");  
		    System.out.println(bar);
	}
}
