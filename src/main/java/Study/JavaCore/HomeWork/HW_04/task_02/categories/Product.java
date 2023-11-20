package Study.JavaCore.HomeWork.HW_04.task_02.categories;

import lombok.Getter;

@Getter
public class Product {
    private double productPrice;
    private String productName;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return productName + ", " + productPrice + " руб/ш";
    }
}
