package Homeworks.homework_008;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMachine {
    private int machineId;
    protected HashMap<Integer, Product> product = new HashMap<>();
    protected Scanner scanner = new Scanner(System.in);

    public MainMachine(int machineId) {
        this.machineId = machineId;
    }

    public int getMachineId() {
        return machineId;
    }

    // public HashMap<Integer, Product> getProduct() {
    // return product;
    // }

    public void addProduct(int productNumber, Product product) {
        this.product.put(productNumber, product);
    }

    @Override
    public String toString() {
        return "MainMachine [machineId=" + machineId + ", product=" + product + "]";
    }

    public Product getProduct(String name) {
        for (Map.Entry<Integer, Product> entry : product.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                return entry.getValue();
            }
        }
        throw new IllegalStateException("Товар не найден!");
    }
    public String getProductNameFromUser (){
        System.out.println("Введите название продукта для покупки: ");
        String name = scanner.nextLine();
        return name;
    }

    public void showProducts(){
        toString();
    }
}
