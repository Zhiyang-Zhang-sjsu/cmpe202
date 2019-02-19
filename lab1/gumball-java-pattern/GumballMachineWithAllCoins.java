
public class GumballMachineWithAllCoins extends GumballMachine {
	private final int LIMIT = 50;

    public GumballMachineWithAllCoins(int size) {
        super(size);
    }
    
    public void insertAnyCoin(int coin) {
    	this.total += coin;
    	
        if (this.total == LIMIT || (state instanceof HasRequiredCoinsState)) {
        	state.insertCoin();
    		this.total = 0;
        } else if (this.total > LIMIT) {
        	this.total -= coin;
        	System.out.println("You can't insert over 50 cents!");

        }
    }
    
    public void ejectCoin() {
    	if (this.total > 0 || (state instanceof HasRequiredCoinsState)) {
    		this.total = 0;
    		System.out.println("Coins returned");
    		state = noRequiredCoins;
    	} else {
    		System.out.println("You haven't inserted required coins!");
    	}
    }
}
