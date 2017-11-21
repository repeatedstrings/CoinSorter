public class CoinSorterMachine {

    public static void main(String[] args) {
        Coin quarter = new Coin().setValue(25);
        Coin nickel = new Coin().setValue(5);
        Coin dime = new Coin().setValue(10);

        AbstractCoinHandler quarterHandler = new QuarterHandler(quarter);
        AbstractCoinHandler dimeHandler = new DimeHandler(dime);
        AbstractCoinHandler nickelHandler = new NickelHandler(nickel);
        quarterHandler.setNext(dimeHandler);
        dimeHandler.setNext(nickelHandler);



        quarterHandler.handleRequest(dime);
    }
}


