public class Main {

    public static void main(String[] args) {

        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        Product product2 = new Product(2, "Laptop", "DELL Laptop", 4000, 3, "Siyah", "2");

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        System.out.println("Ürün kodu: " + product.getKod());


    }
}