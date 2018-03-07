package kp_washingMachineLab;

public class WasherDriver {

	public static void main(String[] args) throws InterruptedException {
		// washing machine driver program
		
		WashingMachine washer = new WashingMachine();
		
		System.out.println("Washer #1");
		//System.out.println("Status: "+washer.getState());
		
		washer.insertQuarter();
		washer.startMachine();
		
		washer.insertQuarter();
		washer.insertQuarter();
		washer.startMachine();
		
		washer.insertQuarter();
		washer.insertQuarter();
		washer.insertQuarter();
		washer.startMachine();
		washer.cancel();
	}

}
