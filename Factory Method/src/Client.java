import Factory.DeliverFactory;
import Model.Transport;

public class Client {

    public static void main(String[] args) {
        System.out.println("### Ordering an delivery SEA");
        Transport delivery = DeliverFactory.requestDelivery("SEA", 1.8);
        delivery.deliver();

        System.out.println("\n\n### Ordering an delivery SEA");
        Transport delivery2 = DeliverFactory.requestDelivery("SEA", 125.5);
        delivery2.deliver();

        System.out.println("\n\n### Ordering an delivery Earth");
        Transport delivery3 = DeliverFactory.requestDelivery("EARTH", 2.78);
        delivery3.deliver();

        System.out.println("\n\n### Ordering an delivery Earth");
        Transport delivery4 = DeliverFactory.requestDelivery("EARTH", 197.98);
        delivery4.deliver();
    }
}
