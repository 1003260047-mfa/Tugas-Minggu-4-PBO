public class Service0047 {

    private String code;
    private String name;
    private double price;

    public Service0047(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        this.price = price;
    }
}
