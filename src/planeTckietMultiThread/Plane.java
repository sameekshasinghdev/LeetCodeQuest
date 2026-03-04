package planeTckietMultiThread;

public class Plane {
	
	int availableSeats = 1;
	public synchronized void bookSeat(String passangerName) {
		
		if(availableSeats >0) {
			System.out.println(passangerName + " found Seat available ");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			availableSeats--;
			System.out.println(passangerName + " successfully booked the seat!");
		} 
		else {
			System.out.println(passangerName + " could NOT book seat — No seats available");
		}
		
	}

}
