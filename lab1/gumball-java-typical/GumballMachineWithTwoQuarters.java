public class GumballMachineWithTwoQuarters extends GumballMachine{

	public GumballMachineWithTwoQuarters(int size) {
		super(size);
	}
	
    public void insertQuarter(int coin) {
    	if (coin == 25 && this.has_quarter != true) {
    		this.total += coin;
    			
    		if (this.total == 50) {
    			this.has_quarter = true;
    			this.total = 0;
    		}		
    	} else if (this.has_quarter == true){
    		System.out.println("Truning crank! You don't have to insert a quarter!");
    	} else {
            this.has_quarter = false;
        }
    }
}
