package springPractice3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//di 활용
//인터페이스를 활용

public class MainClass {
	public static void main(String[] args) {

		String configLoc="classpath:applicationCTX.xml";
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(configLoc);
		Pencil pencil =ctx.getBean("pencil",Pencil.class);

		pencil.use();
	}
}
