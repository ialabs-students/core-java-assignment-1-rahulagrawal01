
import java.util.ArrayList;
import java.util.Objects;

public class ProductService {
    public static ArrayList<Product> prods = Product.getProductsList();
    String proName;
    double temp = 0.00;
    Product product_object, temp_obj;
    ArrayList<Product> newList = new ArrayList<>();

    public String findNameByCode(int proCode) {
        prods.forEach(a -> {
            if (proCode == a.getProductCode()) proName = a.getName();
            else proName = null;

        });
        return ("Product Name: " + proName);
    }

    public Product findMaxPriceProduct(String cate) {

        prods.forEach(a -> {
            if (Objects.equals(cate, a.getCategory())) {
                product_object = a;
                if (temp < a.getPrice()) {
                    temp = a.getPrice();
                    temp_obj = a;
                }
            } else {
                product_object = null;
            }
        });
        return (temp_obj);
    }

    public ArrayList<Product> getProductsByCategory(String cate) {
        prods.forEach(a -> {
            if (Objects.equals(cate, a.getCategory())) {
                newList.add(a);
            } else {
                product_object = null;
            }
        });
        return newList;
    }
