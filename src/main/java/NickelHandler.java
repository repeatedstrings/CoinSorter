public class NickelHandler extends AbstractCoinHandler {

    public NickelHandler(){}

    public NickelHandler(Coin coin) {
        this.coin = coin;
    }

    @Override
    protected void sort(Coin coin) {
        System.out.println("Sorted 5 cents!");
    }
}
