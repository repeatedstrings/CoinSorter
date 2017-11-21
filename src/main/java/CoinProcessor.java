public class CoinProcessor {
    private AbstractCoinHandler prevHandler;

    public void addHandler(AbstractCoinHandler handler) {
        if (prevHandler != null) {
            prevHandler.setNext(handler);
        }
        prevHandler = handler;
    }

    public void handleRequest(Coin coin) {

        prevHandler.handleRequest(coin);
    }
}

