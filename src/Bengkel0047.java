import java.util.List;

public class Bengkel0047 {

    private double defaultPriceMechanic;

    public Bengkel0047(double defaultPriceMechanic) {
        this.defaultPriceMechanic = defaultPriceMechanic;
    }

    public double calculatePrice(List<Service0047> serviceList) {
        double totalPrice = 0;

        for (Service0047 s : serviceList) {
            totalPrice += s.getPrice();
        }

        return totalPrice + defaultPriceMechanic;
    }
}
