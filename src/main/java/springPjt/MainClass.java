package springPjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

//		TransportationWalk tranasportationWalk = new TransportationWalk();
//		tranasportationWalk.move();

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);

		transportationWalk.move();

		ctx.close();
	}

}
