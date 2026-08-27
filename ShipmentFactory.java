/** FACTORY (Part 3): จุดเดียวที่รู้จัก concrete Shipment ทุกชนิด */
public class ShipmentFactory {
    /**
     *   createShipment("STANDARD") -> StandardShipment
     *   createShipment("EXPRESS")  -> ExpressShipment
     *   unknown type -> IllegalArgumentException
     */
    public Shipment createShipment(String type) {
        if (type == null) throw new IllegalArgumentException("type must not be null");
        return switch (type.toUpperCase()) {
            // TODO (3a): "STANDARD" -> คืน new StandardShipment()
            case "STANDARD" -> new StandardShipment();
            // TODO (3b): "EXPRESS"  -> คืน new ExpressShipment()
            case "EXPRESS" -> new ExpressShipment();
            //   hint: case "STANDARD" -> new StandardShipment();
            /* ====== fill in the two cases here ====== */
            // TODO (3c): type อื่น -> throw IllegalArgumentException("unknown shipment type: " + type)
            default -> throw new IllegalArgumentException();
        };
    }
}
