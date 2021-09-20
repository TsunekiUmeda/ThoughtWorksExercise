 public enum Drink {
     COKE(0), DIET_COKE(1),TEA(2);


    private int kind;

     Drink(int kind) {
        this.kind = kind;
    }

    public int getKind() {
        return kind;
    }
}
