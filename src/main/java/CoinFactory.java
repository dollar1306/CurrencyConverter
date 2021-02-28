public class CoinFactory {
    public static Coin getCoinInstance(Coin coin){
        switch (coin){
            case USD:
                return new USD();
            case ILS:
                return new ILS();
            case EUR:
                return new EUR();
        }
        return null;
    }
}
