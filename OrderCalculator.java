/** Context (Part 2): รับ strategy เข้ามาแล้วคำนวณราคาสุดท้าย */
public class OrderCalculator {
    public double calculateFinalPrice(Order order, DiscountStrategy strategy) {
        if (order == null || strategy == null)
            throw new IllegalArgumentException("order/strategy must not be null");
        // TODO (2c): ใช้ strategy คำนวณราคาสุดท้ายแล้วคืนค่า
        //   hint: strategy.applyDiscount(order)
        return strategy.applyDiscount(order);
    }
}
