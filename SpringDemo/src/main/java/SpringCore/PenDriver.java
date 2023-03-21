package SpringCore;


public class PenDriver {

	public static void main(String[] args) 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("");
		
		Pen p = (Pen)ac.getBean("mypen");
		
		p.test();
	}

}
