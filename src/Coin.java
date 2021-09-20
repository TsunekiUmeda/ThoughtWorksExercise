public enum Coin {
    ONE_HUNDRED(100), FIVE_HUNDRED(500);
    private int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}