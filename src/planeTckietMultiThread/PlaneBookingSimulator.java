package planeTckietMultiThread;

public class PlaneBookingSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plane plane = new Plane();
		
		// Create Runnable passengers
		Passanger p1 = new Passanger(plane,"Passanger 1");//thread1
		Passanger p2 = new Passanger(plane,"Passanger 2");//thread2
		
		// Wrap in Thread objects and start them
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);

        t1.start();
        t2.start();
	}

}
