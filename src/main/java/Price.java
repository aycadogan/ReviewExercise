public class Price {

    private int firstPrice;
    private int secondPrice;

    public Price(int firstPrice, int secondPrice) {
        this.firstPrice = firstPrice;
        this.secondPrice = secondPrice;
    }

    public void printPriceRange(){

        for (int number = this.firstPrice; number <= this.secondPrice ; number++) {
            System.out.println("The number: "+ number );
        }
    }

    public int getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(int firstPrice) {
        this.firstPrice = firstPrice;
    }

    public int getSecondPrice() {
        return secondPrice;
    }

    public void setSecondPrice(int secondPrice) {
        this.secondPrice = secondPrice;
    }


}
