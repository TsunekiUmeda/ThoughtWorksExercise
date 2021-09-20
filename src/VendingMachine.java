public class VendingMachine {

    Inventory drinks;
    State state;
    State soldState;
    State nochangeState;
    State readyState;
    State noCashState;

    int numberOf100Yen = 10; // 100円玉の在庫
    int charge = 0;

    public VendingMachine() {

        drinks = new Inventory();
        drinks.setInventory(Drink.COKE, 5);
        drinks.setInventory(Drink.DIET_COKE, 5);
        drinks.setInventory(Drink.TEA, 5);
        soldState = new SoldState(this);
        nochangeState = new NoChangeState(this);
        readyState = new ReadyState(this);
        if (numberOf100Yen < 5) {
            state = nochangeState;
        } else {
            state = readyState;
        }


    }

    public void insertCoin(Coin coin) {
        if (isValidCoin(coin)) {
            state.insertCoin(coin);
        }
    }

    public boolean isValidCoin(Coin coin) {
        if (coin != Coin.FIVE_HUNDRED && coin != Coin.ONE_HUNDRED) {
            System.out.println("We only accept 100 and 500 coins");
            return false;
        }
        return true;
    }

    public void buy(Drink kindOfDrink) {
        if (!drinks.isInventoryAvailable(kindOfDrink)) {
            System.out.println("Item is currently not available, please select another item");
            return;
        }

        state.buy();


//        if (i == 100) {
//            // 100円玉を釣り銭に使える
//            numberOf100Yen++;
//        } else if (i == 500) {
//            // 400円のお釣り
//            charge += (i - 100);
//            // 100円玉を釣り銭に使える
//            numberOf100Yen -= (i - 100) / 100;
//        }
//
//        return new Drink(kindOfDrink);
    }

    public void dispense(Drink type) {
        System.out.println("Dispensing a drink");
        drinks.deductInventory(type);

    }

    public int getCharge() {
        return charge;
    }

    public void addCharge(Coin charge) {
        if (charge == Coin.FIVE_HUNDRED || charge == Coin.ONE_HUNDRED) {
            this.charge += charge.getValue();
        }
    }


    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getNochangeState() {
        return nochangeState;
    }

    public State getNoCashState() {
        return noCashState;
    }

    /**
     * お釣りを取り出す.
     *
     * @return お釣りの金額
     */
    public int refund() {
        int result = charge;
        charge = 0;
        return result;
    }
}