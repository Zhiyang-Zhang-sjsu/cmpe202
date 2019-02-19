
public class Main {
	public static void main(String[] args) {
		GumballMachineWithAllCoins gumballMachine = new GumballMachineWithAllCoins(2);

		System.out.println(gumballMachine);

		gumballMachine.insertAnyCoin(100);
		
		gumballMachine.insertAnyCoin(25);
		gumballMachine.ejectCoin();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		gumballMachine.insertAnyCoin(10);
		gumballMachine.insertAnyCoin(5);
		gumballMachine.ejectCoin();
		gumballMachine.ejectCoin();
		gumballMachine.turnCrank();
		gumballMachine.insertAnyCoin(25);
		gumballMachine.insertAnyCoin(25);
		gumballMachine.ejectCoin();

		gumballMachine.turnCrank();
		gumballMachine.insertAnyCoin(25);
		gumballMachine.turnCrank();
		gumballMachine.insertAnyCoin(25);
		gumballMachine.insertAnyCoin(25);
		gumballMachine.turnCrank();
		gumballMachine.insertAnyCoin(50);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
