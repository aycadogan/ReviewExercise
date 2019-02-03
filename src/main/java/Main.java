public class Main {

    public static void main(String[] args) {

        Price printPrices = new Price();
        printPrices.setFirstPrice(0);
        printPrices.setSecondPrice(0);
        printPrices.isExcludeFirstPrice();
        printPrices.isExcludeSecondPrice();
        printPrices.printPriceRange();
        printPrices.listPriceRange();
        System.out.println(printPrices.getFirstPrice());


    }
}
