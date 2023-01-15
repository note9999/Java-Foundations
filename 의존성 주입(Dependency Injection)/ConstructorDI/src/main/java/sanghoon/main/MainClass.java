package sanghoon.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sanghoon.beans.DataBean;
import sanghoon.beans.TestBean;
import sanghoon.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("sanghoon/config/beans.xml");
		
		TestBean t1= new TestBean();
		t1.printData();
		
		System.out.println("-------------------");
		
		TestBean t2= new TestBean(100);
		t2.printData();
		
		System.out.println("-------------------");
		
		TestBean t3= new TestBean(11.11);
		t3.printData();
		
		System.out.println("-------------------");
		
		
		TestBean t4 = new TestBean("���ڿ�");
		t4.printData();
		
		System.out.println("-------------------");

		TestBean t5 = new TestBean(200,22.22,"�ȳ��ϼ���");
		t5.printData();
		
		
		System.out.println("-------------------");
		
//		TestBean t6 = new TestBean("�ݰ����ϴ�",300,33.33);
//		t6.printData(); -> TestBeanŬ������ �����ڿ� ���ǵǾ��ִ� �Ű������� ������ ��ġ���� �ʱ⶧���� �������� 

		/*TestBeanClass �̿� ��*/	

		
		/*beans.xml �̿� �� */	
		TestBean obj1 = ctx.getBean("obj1",TestBean.class);
		obj1.printData();
		
		System.out.println("-------------------");
		
		TestBean obj2 = ctx.getBean("obj2",TestBean.class);
		obj2.printData();
		
		System.out.println("-------------------");

		TestBean obj3 = ctx.getBean("obj3",TestBean.class);
		obj3.printData();
		
		
		System.out.println("-------------------");

		TestBean obj4 = ctx.getBean("obj4",TestBean.class);
		obj4.printData();
		
		System.out.println("-------------------");
		
		TestBean obj5 = ctx.getBean("obj5",TestBean.class);
		obj5.printData();
		
		TestBean obj6 = ctx.getBean("obj6",TestBean.class);
		obj6.printData();
		// beans.xml�� ��������ִ� �Ű������� ������ �޶� ���������� ��µ� (�ڹٿ��� ����)
		
		TestBean obj7 = ctx.getBean("obj7",TestBean.class);
		obj7.printData();
		
		System.out.println("-------------------");
//�ڹ��ڵ�� �Ҷ� 
		DataBean d1= new DataBean();
		DataBean d2= new DataBean();
		TestBean2 t200 = new TestBean2(d1, d2);
		t200.printData();
//beans.xml�� �� ��		
		
		System.out.println("-------------------");
		
		TestBean2 obj8 = ctx.getBean("obj8",TestBean2.class);
		obj8.printData();
	
		System.out.println("-------------------");

		TestBean2 obj9 = ctx.getBean("obj9", TestBean2.class);
		obj9.printData();
		ctx.close();
	}
}
