package org.com.SpringAop.Examples;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class ExecutionObject {
  
	
	public static void main(String[] args) {
		//Resource r=new ClassPathResource("application-context.xml");  
	    //BeanFactory factory=new XmlBeanFactory(r);
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
	    InterfaceA impA=(InterfaceA) context.getBean("impa");
	    //Below 3 method invocation is to test @Before Advice
		impA.methodA();
		impA.methodA1();
		impA.methodA2();
		 
	  //Below 3 method invocation is to test @After Advice
	    impA.methodB11();
	    impA.methodB12();
	    impA.methodB13();
		

	}

}
