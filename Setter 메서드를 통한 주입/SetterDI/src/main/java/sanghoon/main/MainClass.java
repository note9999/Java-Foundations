package sanghoon.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sanghoon.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBean obj1 = new TestBean();
		obj1.setData1(100);
		
		System.out.printf("obj1.data1:%d\n",obj1.getData1());

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("sanghoon/config/beans.xml");
	
		TestBean t1 = ctx.getBean("t1",TestBean.class);
		System.out.printf("t1.data1:%d\n",t1.getData1());
		System.out.printf("t1.data5:%s\n",t1.getData5());
		System.out.printf("t1.data6:%s\n",t1.getData6());

		ctx.close();
	}

}
