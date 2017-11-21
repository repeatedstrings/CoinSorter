public class QuarterHandler extends AbstractCoinHandler {

    public QuarterHandler(){}

    public QuarterHandler(Coin coin){
        this.coin = coin;
    }


    @Override
    protected void sort(Coin coin) {
        System.out.println("Sorted 25 Cents!");
    }
}

