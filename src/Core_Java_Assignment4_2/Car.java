package Core_Java_Assignment4_2;

public class Car {

  private String Name;											
    private String Engine;											
    private int minSpeed;											
    public Car() {}													
    public Car(String Name, String Engine, int minSpeed) {			
        this.minSpeed= minSpeed;}									
    public void EngineStartDemo() {									
        Engine Engine = new Engine();								
        Engine.start();}											
    public void carInfo(){											
        System.out.println("Default Car Name = "+Name + 			
        		"\nDefault Engine Type = "+Engine+
        		"\nMinimum Speed= " + minSpeed);}
    public void setName(String name) {								
        Name = name;}
    public void setEngine(String engine) {							
        Engine = engine;}
    public void setMinSpeed(int minSpeed) {							
        this.minSpeed = minSpeed;}
}																	
