public class DimeHandler extends AbstractCoinHandler {
    private AbstractCoinHandler handler;

    public DimeHandler(){}
    public DimeHandler(Coin coin){
        this.coin = coin;
    }

    @Override
    protected  void sort(Coin coin) {
        System.out.println("sorted 10 cents!");
    }

}
