public abstract class AbstractCoinHandler {
    protected AbstractCoinHandler nextHandler;
    protected Coin coin;

    public void setNext(AbstractCoinHandler handler){
        this.nextHandler = handler;
    }

    public void handleRequest(Coin coin){
        if(this.coin == coin){
            sort(coin);
        }

        if(nextHandler != null){
            nextHandler.handleRequest(coin);
        }
    }

    abstract protected void sort(Coin coin);
}

