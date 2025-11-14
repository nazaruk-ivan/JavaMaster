package labsanduniwork.lab14Nov.Exercise2;

public class Main {
    public static void main(String[] args) {

        Shop ivanShop = new Shop("Ivan Shop", 3, new int[]{4,5,6});
        Shop newShop = new Shop();

        System.out.println(checkStock(ivanShop));
        System.out.println(checkStock(newShop));

        Buyer buyer = new Buyer(ivanShop, new int[]{0,1,2});
        processPurchase(buyer);
    }

    public static boolean checkStock(Shop shop){
        return shop.getArticles().length == shop.getNumberOfArticles();
    }

    public static void processPurchase(Buyer buyer){
        Shop shop = buyer.getShopToGo();
        for(int index : buyer.getArticlesToBuy()) shop.decrement(index);
    }
}