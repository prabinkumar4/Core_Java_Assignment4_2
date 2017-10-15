package Core_Java_Assignment4_2;

public class Assignment4_2 {

	


														
public static void main(String[] args) {												
		System.out.println("\nThe program in java to show the difference "				
				+ "between is-a relationship and has-a relationship "
							+ "and also show which one is better.\n");
		Car car = new Car();															
        car.EngineStartDemo();														    
        Maruti myMercedesBenz = new Maruti("Maruti","V12",80,370,4,4);
        myMercedesBenz.setName("MercedesBenz Prototype");								
        System.out.println("******************************************");				
        myMercedesBenz.setEngine("V6");													
        myMercedesBenz.setMaxSpeed(350);												
        myMercedesBenz.setMinSpeed(80);													
        myMercedesBenz.carInfo();														
        myMercedesBenz.EngineStopDemo();												
	}																					
}																						

