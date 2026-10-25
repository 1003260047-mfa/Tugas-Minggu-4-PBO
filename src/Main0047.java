import java.util.ArrayList;
import java.util.List;

public class Main0047 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Service0047 paket1= new Service0047(
                "paket001",
                "Service ganti oli",
                32000.0
        );

        Service0047 paket2= new Service0047(
                "paket002",
                "Service VCT",
                15000.0
        );

        Bengkel0047 bengkel = new Bengkel0047(
                5000
        );

        List<Service0047> list = new ArrayList<>();
        list.add(paket2);

        System.out.println("Total Price: " + bengkel.calculatePrice(list));
    }
}