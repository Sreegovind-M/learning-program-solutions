import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Product products[] = new Product[5];

        products[0] = new Product(1, "IPhone 16", "Electronics");
        products[1] = new Product(2, "Cetaphil Face Cleanser", "Beauty");
        products[2] = new Product(3, "Crocs", "Clothing");
        products[3] = new Product(4, "Air Fryer", "Home/Kitched Appliances");
        products[4] = new Product(5, "Hotwheels Car", "Toys/Games");

        String prodName = "IPhone 16";
        if (linearSearch(products, prodName)) {
            System.out.println("Product Item found --> Linear Search");
        }
        else {
            System.out.println("Product Item not found --> Linear Search");
        }

        prodName = "IPhone 15";
        if (binarySearch(products, prodName)) {
            System.out.println("Product Item found --> Binary Search");
        }
        else {
            System.out.println("Product Item not found --> Binary Search");
        }
    }
    public static boolean linearSearch(Product products[], String prodName) {
        boolean check = false;

        int n = products.length;
        for (int i = 0; i < n; i++) {
            if (products[i].productName.equals(prodName)) {
                check = true;
            }
        }
        return check;
    }
    public static boolean binarySearch(Product products[], String prodName) {
        boolean check = false;

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int comp = products[mid].productName.compareToIgnoreCase(prodName);

            if (comp == 0) {
                check = true;
            }
            else if (comp < 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return check;
    }
}
