package JavaCore.HomeWork.HW_04.task_02v2.categories;

import lombok.Getter;

@Getter
public class Product {
    private int productPrice;
    private String productName;

    public Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return productName + ", " + productPrice + " руб/ш";
    }
}
