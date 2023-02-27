public class Produkt {

    private String name;
    private double price;
    private int number;
    private String type;

    public Produkt(String name, double price, int number, String type) {
        this.name = name;
        this.price = price;
        this.number = number;
        this.type = type;
    }

    public Produkt() {
        this.name = null;
        this.price = 0.0;
        this.number = 0;
        this.type = null;
    }

    public String toString() {
        return name + " цена: " + price;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

}
