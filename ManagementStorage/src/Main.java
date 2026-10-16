import java.util.Scanner;

public class Main {
    public static void main(String[]args) {

        StorageManagement storage = new StorageManagement();
        Scanner input = new Scanner(System.in);

        System.out.println("---- Storage Management ----");
        System.out.println("1. Add Products");
        System.out.println("2. Remove Product");
        System.out.println("3. Update Product");
        System.out.println("4. Show List Of Product");
        System.out.println("5. Exit");
        System.out.print("Choice: ");

        int choice = input.nextInt();

        switch(choice) {
            case 1:
                String answer;
                do {
                    System.out.print("Enter Product Name: ");
                    String productName = input.next();
                    System.out.print("Enter Product Price: ");
                    int productPrice = input.nextInt();
                    storage.addProduct(productName, productPrice);

                    System.out.print("Do you want to continue add product in store ? (Yes/No) ");
                    answer = input.next();
                } while (answer.equalsIgnoreCase("Yes"));
                break;

            case 2:
                System.out.print("Enter Product Name: ");
                String productName = input.next();
                storage.removeProduct(productName);
                break;

            case 3:
                System.out.print("Enter Product Name: ");
                productName = input.next();
                System.out.print("Enter a new product name: ");
                String newProductName = input.next();
                System.out.print("Enter a new product price: ");
                int newProductPrice = input.nextInt();
                storage.updateProduct(productName, newProductName, newProductPrice);
                break;

            case 4:
                storage.displayProducts();
                break;

            case 5:
                System.exit(0);
                break;
        }
        
        input.close();
    }
}
