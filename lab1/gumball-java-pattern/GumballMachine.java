public class GumballMachine {
	State soldOut;
	State noRequiredCoins;
	State hasRequiredCoins;
	State sold;
	
	State state = soldOut;
	
	private int count = 0;
	int total = 0;
 
	public GumballMachine(int numberGumballs) {
		soldOut = new SoldOutState(this);
		noRequiredCoins = new NoRequiredCoinsState(this);
		hasRequiredCoins = new HasRequiredCoinsState(this);
		sold = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noRequiredCoins;
		} else {
			System.out.print("There is no gumballs!");
			
			return;
		}
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
 
	public void ejectCoin() {
		state.ejectCoin();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noRequiredCoins;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOut;
    }

    public State getNoRequiredCoinsState() {
        return noRequiredCoins;
    }

    public State getHasRequiredCoinsState() {
        return hasRequiredCoins;
    }

    public State getSoldState() {
        return sold;
    }
}
