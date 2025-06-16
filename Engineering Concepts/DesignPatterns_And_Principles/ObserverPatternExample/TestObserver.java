package ObserverPatternExample;

public class TestObserver {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileObserver = new MobileApp("InvestorPro");
        Observer webObserver = new WebApp("TradeView");

        market.registerObserver(mobileObserver);
        market.registerObserver(webObserver);

        market.setStock("TCS", 3570.25);
        market.setStock("INFY", 1462.80);

        market.removeObserver(webObserver);

        market.setStock("WIPRO", 435.60);
    }
}

