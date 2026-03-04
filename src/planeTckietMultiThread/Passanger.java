package planeTckietMultiThread;

public class Passanger implements Runnable {
	
	Plane plane;
	String passengerName;
	
	Passanger(Plane plane, String passengerName){
		
		this.plane = plane;
		this.passengerName = passengerName;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		plane.bookSeat(passengerName);
		
	}
	

}
