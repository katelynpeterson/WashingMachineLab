package kp_washingMachineLab;

public interface WashingMachineState {
	public void insertQuarters();
	public void ejectQuarters();
	public void startMachine() throws InterruptedException;
	public void cancel();
}
