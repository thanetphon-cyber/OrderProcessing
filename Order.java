import java.util.List;

/** คำสั่งซื้อหนึ่งใบ (Part 1) */
public record Order(String orderId, List<Product> products, String customerEmail) {
    /** ผลรวมราคาสินค้าทุกชิ้น (ก่อนหักส่วนลด) */
    public double getTotalPrice() {
        double sum = 0;
       for (Product p : products) {
            sum+= p.price();
       }
        return sum;
    }
}
