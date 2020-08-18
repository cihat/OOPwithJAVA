public class Main {

    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Asus Laptop", 3000.0, 4, "Siyah", "KJOd34");
        //Product product = new Product();

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}
