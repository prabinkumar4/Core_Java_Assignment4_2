package Core_Java_Assignment4_2;



																								
public class Maruti extends Car{																			
    private int maxSpeed;																						
    private int doors;																							
    private int airbags;																						
    public Maruti(String Name, String Engine, int minSpeed, int maxSpeed, int doors, int airbags) {		
        super(Name, Engine, minSpeed);																			
        this.maxSpeed = maxSpeed;																				
        this.doors = doors;																						
        this.airbags = airbags;																					
        System.out.println("Name of the Car : " + Name +														
                "\nEngine Type : " + Engine +
                "\nMin Speed in the car :" +minSpeed+
                "\nMax Speed in the car :" +maxSpeed+
                "\nDoors in the car : " + doors +
                "\nAirbags in the car :" +airbags);}
    public void setMaxSpeed(int maxSpeed) {																		
        this.maxSpeed = maxSpeed;}																				
    public void EngineStopDemo(){																				
        Engine Engine = new Engine();																			
        Engine.stop();}																							
}																												