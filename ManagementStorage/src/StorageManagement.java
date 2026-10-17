import java.util.ArrayList;

public class StorageManagement {

    private ArrayList <ProductInfo> products = new ArrayList<ProductInfo>();

    public ArrayList<ProductInfo>addProduct(String productName, int productPrice) {
        products.add(new ProductInfo(productName, productPrice));
        products.trimToSize();
        return products;
    }

    public boolean removeProduct(String productName) {

        if (products.isEmpty()) {
            System.out.println("This Product Is Not Found");
            return false;
        }

        for (int i = 0; i < products.size(); i++) {

            if(products.get(i).getProductName().equalsIgnoreCase(productName)) {
                products.remove(i);
                products.trimToSize();
                return true;
            }
                System.out.println("This Product Is Not Found");
                return false;
        }
        return false;
    }

    public boolean updateProduct(String productName, String newName, int newPrice) {

        if (products.isEmpty()) {
            System.out.println("This Product Is Not Found");
            return false;
        }

        for (ProductInfo product: products) {
            if(product.getProductName().equalsIgnoreCase(productName)) {
                product.setProductName(newName);
                product.setProductPrice(newPrice);
                return true;
            }

            System.out.println("This Product Is Not Found");
            return false;

        }
        return false;
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }
        for (ProductInfo product : products) {
            System.out.println(product);
        }
    }
}
