
public class NoRequiredCoinsState implements State {
	 GumballMachine gumballMachine;
	 
	    public NoRequiredCoinsState(GumballMachine gumballMachine) {
	        this.gumballMachine = gumballMachine;
	    }
	 
		public void insertCoin() {
			System.out.println("You inserted the required coins");
			gumballMachine.setState(gumballMachine.getHasRequiredCoinsState());
		}
	 
		public void ejectCoin() {
			System.out.println("You haven't inserted required coins");
		}
		
		public void turnCrank() {
			System.out.println("You turned, but there's no required coins");
		 }
	 
		public void dispense() {
			System.out.println("You need to pay first");
		} 
	 
		public String toString() {
			return "waiting for coins";
		}
}
