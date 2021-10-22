package service;

public class PersonTest {

   private String name;
   private double price;
   private int capability;

    public PersonTest() {
        //musi byc konstruktor domyslny, ponieważ wywala błąd
    }

    public PersonTest(String name, double price, int capability) {
        this.name = name;
        this.price = price;
        this.capability = capability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapability() {
        return capability;
    }

    public void setCapability(int capability) {
        this.capability = capability;
    }

    @Override
    public String toString() {
        return "PersonTest{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", capability=" + capability +
                '}';
    }
}
