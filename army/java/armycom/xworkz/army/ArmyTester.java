package armycom.xworkz.army;

import java.awt.Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import armycom.xworkz.army.component.ArmyComponent;

public class ArmyTester {

	public static void main(String[] args) {

		String xmlFileName="army.xml";
		ApplicationContext army=new ClassPathXmlApplicationContext(xmlFileName);
		ArmyComponent ref=army.getBean("armyComponent1",ArmyComponent.class);
		
		System.out.println(ref.getStrength());
		System.out.println(ref.getType());
		
		//ArmyComponent refOfArmy=army.getBean(ArmyComponent.class);
		//System.out.println(refOfArmy.getStrength());
		
		
	}
}
