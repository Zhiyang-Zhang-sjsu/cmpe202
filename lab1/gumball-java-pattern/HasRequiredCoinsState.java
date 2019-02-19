
public class HasRequiredCoinsState implements State {
	GumballMachine gumballMachine;
	 
	public HasRequiredCoinsState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin() {
		System.out.println("You can't insert another coin");
	}
 
	public void ejectCoin() {
		System.out.println("Coins returned");
		gumballMachine.setState(gumballMachine.getNoRequiredCoinsState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
