
import java.util.ArrayList;

public class Product {
    private int proCode;
    private String name;
    private double price;
    private String cate;

    public Product(int proCode, String name, double price, String cate) {
        this.proCode = proCode;
        this.name = name;
        this.price = price;
        this.cate = cate;
    }

    public int getProductCode() {
        return proCode;
    }

    public void setProductCode(int proCode) {
        this.proCode = proCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return cate;
    }

    public void setCategory(String cate) {
        this.cate = cate;
    }

    public static ArrayList<Product> getProductsList() {
        ArrayList<Product> prods = new ArrayList<>();
        Product f1 = new Product(11, "Fan", 3999.00, "electronics");
        prods.add(f1);
        Product f2 = new Product(12, "Cooler", 8999.00, "electronics");
        prods.add(f2);
        Product f3 = new Product(13, "Air conditioner", 29999.00, "electronics");
        prods.add(f3);
        Product m1 = new Product(21, "Mac", 89999.00, "laptop");
        prods.add(m1);
        Product m2 = new Product(22, "Lenovo", 59999.00, "laptop");
        prods.add(m2);
        Product m3 = new Product(23, "HP", 52000.00, "laptop");
        prods.add(m3);
        Product e1 = new Product(31, "Shirt", 999.00, "Clothes");
        prods.add(e1);
        Product e2 = new Product(32, "Pant", 12999.00, "Clothes");
        prods.add(e2);
        Product e3 = new Product(33, "Trouser", 2999.00, "Clothes");
        prods.add(e3);
        return prods;
    }

    public static void main(String[] args) {

        ProductService productService = new ProductService();
        String prodName = productService.findNameByCode(513);
        System.out.println(prodName);

        Product product_obj = productService.findMaxPriceProduct("laptop");
        System.out.println(product_obj);

        ArrayList<Product> products = productService.getProductsByCategory("electronics");
        if (products != null) {
            for (Product product : products) {
                System.out.println("[ product code: " + product.getProductCode() + ", product name: " + product.getName() + ", product price: Rs." + product.getPrice() + ", product category: " + product.getCategory() + " ]");
            }
        }
    }
}
