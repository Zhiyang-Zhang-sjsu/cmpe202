public class GumballMachineWithOneQuarter  extends GumballMachine{
	
	public GumballMachineWithOneQuarter(int size) {
        super(size);
    }

    public void insertQuarter(int coin) {
        if (coin == 25 || this.has_quarter == true) {
            this.has_quarter = true;
        }
        else { 
            this.has_quarter = false;
        }
    }
}
