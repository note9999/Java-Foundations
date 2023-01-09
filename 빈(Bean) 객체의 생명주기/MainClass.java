package sanghoon.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sanghoon.beans.TestBean1;
import sanghoon.beans.TestBean2;
import sanghoon.beans.TestBean3;
import sanghoon.beans.TestBean4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("sanghoon/config/beans.xml");
	
	TestBean1 t1 = ctx.getBean("t1",TestBean1.class);
	System.out.printf("t1:%s\n", t1);
	
	System.out.println("----------------------------");
	
	TestBean2 t2 = ctx.getBean("t2",TestBean2.class);
	System.out.printf("t2:%s\n", t2);
	
	System.out.println("----------------------------");
	TestBean3 t3 = ctx.getBean("t3",TestBean3.class);
	System.out.printf("t3:%s\n", t3);
	
	System.out.println("----------------------------");
	TestBean4 t4 = ctx.getBean("t4",TestBean4.class);
	System.out.printf("t4:%s\n", t4);
	
	
	System.out.println("----------------------------");
	ctx.close();
	
	}

}
