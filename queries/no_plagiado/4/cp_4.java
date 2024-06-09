class Product {
  int productId;
  String name;
  double price;

  public Product(int productId, String name, double price) {
    this.productId = productId;
    this.name = name;
    this.price = price;
  }
}

public class InventoryManager {

  public static List<Product> getDiscountedProducts(List<Product> products, double discount) {
    List<Product> discountedProducts = new ArrayList<>();
    for (Product product : products) {
      double discountedPrice = product.price * (1 - discount);
      Product discountedProduct = new Product(product.productId, product.name, discountedPrice);
      discountedProducts.add(discountedProduct);
    }
    return discountedProducts;
  }

  public static void main(String[] args) {
    List<Product> inventory = new ArrayList<>();
    inventory.add(new Product(1, "Shirt", 19.99));
    inventory.add(new Product(2, "Jeans", 34.50));
    inventory.add(new Product(3, "Hat", 12.95));

    double discountPercentage = 0.1; // 10% discount
    List<Product> discountedInventory = getDiscountedProducts(inventory, discountPercentage);

    System.out.println("Discounted Inventory:");
    for (Product product : discountedInventory) {
      System.out.println("Product ID: " + product.productId + ", Name: " + product.name + ", Discounted Price: $" + product.price);
    }
  }
}
