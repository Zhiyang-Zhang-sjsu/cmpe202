public class GumballMachineWithAllCoins extends GumballMachine {
    public GumballMachineWithAllCoins(int size) {
        super(size);
    }
    
    public void insertAnyCoin(int coin) {
    	this.total += coin;
    	if (this.total >= 50 && this.has_quarter != true) {
    			this.has_quarter = true;
    			this.total = 0;
    	} else if (this.has_quarter == true){
    		System.out.println("Truning crank! You don't have to insert a coin!");
    		this.total = 0;
    	} else {
            this.has_quarter = false;
        } 
    }
    
}
