package sanghoon.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sanghoon.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("sanghoon/config/beans.xml");

		TestBean1 obj1 =ctx.getBean("obj1",TestBean1.class);
		System.out.printf("obj1.data1:%s\n" , obj1.getData1());
		System.out.printf("obj1.data2:%s\n" , obj1.getData2());
		
		System.out.println("-----------------------");
		
		TestBean1 obj2 = ctx.getBean("obj2",TestBean1.class);
		System.out.printf("obj2.data1:%s\n" , obj1.getData1());
		System.out.printf("obj2.data2:%s\n" , obj1.getData2());
		
		ctx.close();
	}

}
