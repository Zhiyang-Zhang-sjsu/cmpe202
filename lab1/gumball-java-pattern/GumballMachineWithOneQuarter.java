
public class GumballMachineWithOneQuarter extends GumballMachine{
	private final int COINTYPE = 25;
	
    public GumballMachineWithOneQuarter(int size) {
    	super(size);
    }
    
    public void insertQuarter(int coin) {
    	if (coin == COINTYPE) {
    		state.insertCoin();
        } else {
        	System.out.println("Please insert only a quarter, reject other coin");
        }
    }
}
