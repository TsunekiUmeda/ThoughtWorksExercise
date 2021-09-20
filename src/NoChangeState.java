public class NoChangeState implements State {
    VendingMachine vendingMachine;

    public NoChangeState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(Coin i) {
        vendingMachine.addCharge(i);
    }

    @Override
    public void buy() {

    }
}
