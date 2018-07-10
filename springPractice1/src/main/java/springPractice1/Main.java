package springPractice1;

//엄청 간단한 스프링 구조 연습
//인프런 수강후 연습
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class Main {

		public static void main(String[] args) {

			String configLocation = "classpath:applicationCTX.xml";
			AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
			MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);

			myCalculator.add();
			myCalculator.sub();
			myCalculator.multi();
			myCalculator.div();
		}


}
