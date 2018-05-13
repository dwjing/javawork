package may11;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(80,"1t","公交");
		
		
		
		vehicle.move();
		vehicle.speedUp(200);
		vehicle.speedDown(120);
		vehicle.show();
		vehicle.setSpeed(100);
		
	}
	
	
	
	

}
