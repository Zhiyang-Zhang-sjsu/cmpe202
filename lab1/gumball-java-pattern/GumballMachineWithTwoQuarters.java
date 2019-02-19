
public class GumballMachineWithTwoQuarters extends GumballMachine{
	private final int COINTYPE = 25;
	private final int LIMIT = 50;

    public GumballMachineWithTwoQuarters(int size) {
        super(size);
    }
    
    public void insertQuarter(int coin) {
    	if (coin == COINTYPE) {
    	  	this.total += coin;
        	
        	if ((this.total == LIMIT) || (state instanceof HasRequiredCoinsState)) {
            	state.insertCoin();
        		this.total = 0;
        	}
        } else {
        	System.out.println("Please insert only a quarter, reject other coin");
        }
    }
}