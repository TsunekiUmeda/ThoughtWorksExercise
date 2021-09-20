public class SoldState implements State {
    VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void buy() {

    }

    @Override
    public void insertCoin(Coin i) {

        System.out.println("Cannot insert coin right now");
    }
}
