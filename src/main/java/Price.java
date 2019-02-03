import java.util.ArrayList;
import java.util.List;

public class Price {

    private int firstPrice;
    private int secondPrice;
    public boolean excludeFirstPrice;
    public boolean excludeSecondPrice;

    public Price(int firstPrice, int secondPrice) {
        this.firstPrice = firstPrice;
        this.secondPrice = secondPrice;
    }

    public Price(){
        this.firstPrice = 0;
        this.secondPrice = 0;
        this.excludeFirstPrice = false;
        this.excludeSecondPrice = false;
    }


    public void printPriceRange(){

        for (int number = this.firstPrice; number <= this.secondPrice ; number++) {
            System.out.println("The price is "+ number+ "." );
        }
    }
    public List<Integer> listPriceRange(){
        List<Integer> list = new ArrayList<Integer>();

        for (int number = this.firstPrice; number <= this.secondPrice ; number++) {
            list.add(number);
            System.out.println(" The price is " +number+" in the list of price.");
        }

        return list;
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

    public boolean isExcludeFirstPrice() {
        return excludeFirstPrice;
    }

    public void setExcludeFirstPrice(boolean excludeFirstPrice) {
        this.excludeFirstPrice = excludeFirstPrice;

    }

    public boolean isExcludeSecondPrice() {
        return excludeSecondPrice;
    }

    public void setExcludeSecondPrice(boolean excludeSecondPrice) {
        this.excludeSecondPrice = excludeSecondPrice;
    }


}
