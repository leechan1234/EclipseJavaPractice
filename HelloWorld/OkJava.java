import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJava {

	public static void main(String[] args) {
		String id ="JAVA APT 507";
     //Elevator call
		Elevator myeElevator = new Elevator(id);
		myeElevator.callForUp(1);
		//security off
		Security mySecurity = new Security(id);
			mySecurity.off();
		//Light on
			Lighting floorLamp = new Lighting(id +" / floor Lamp");
			floorLamp.on();
			
			Lighting hallLamp = new Lighting(id + "/ Hall Lamp");
			hallLamp.on();
			System.out.println(Math.PI);
	}

}
