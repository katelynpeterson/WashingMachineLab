package kp_washingMachineLab;

public class WashingMachine {

	WashingMachineState notFullyPaidState;
	WashingMachineState hasPaidState;
	WashingMachineState inUseState;
	
	WashingMachineState state; 
	
	public WashingMachine() {
		notFullyPaidState = new NotFullyPaid(this);
		hasPaidState = new HasPaid(this);
		inUseState = new InUse(this);
		state  = notFullyPaidState;
	}
	
	public void insertQuarter() {
		state.insertQuarters();
	}
	
	public void ejectQuarter() {
			state.ejectQuarters();
		}
	
	public void startMachine() throws InterruptedException {
		state.startMachine();
	}
	
	public void cancel() {
		state.cancel();
	}
	
	void setState(WashingMachineState state) {
		this.state = state;
	}
	
	public WashingMachineState getState() {
		return state;
	}
	
	public WashingMachineState getNotFullyPaidState() {
		return notFullyPaidState;
	}
	
	public WashingMachineState getHasPaidState() {
		return hasPaidState;
	}

	public WashingMachineState getInUseState() {
		return inUseState;
	}
}
