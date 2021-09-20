public class ReadyState implements State {
    VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void buy() {

    }

    @Override
    public void insertCoin(Coin i) {

    }
}
