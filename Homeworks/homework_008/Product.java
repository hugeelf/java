package Homeworks.homework_008;

public class Product {
    protected String name;
    protected int productCounter;
    protected int productPrice;
    


    public Product(String name, int productCounter, int productPrice) {
        this.name = name;
        this.productCounter = productCounter;
        this.productPrice = productPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductCounter() {
        return productCounter;
    }

    public void setProductCounter(int productCounter) {
        this.productCounter = productCounter;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", productCounter=" + productCounter + ", productPrice=" + productPrice + "]";
    }


    
}
