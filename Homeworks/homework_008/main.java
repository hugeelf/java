package Homeworks.homework_008;

public class main {
    public static void main(String[] args) {
        MainMachine vm1 = new MainMachine(12);
        Product chips = new Product("Potato-chips", 12, 40);
        Product chocolate = new Product("Chocolate rabbit", 12, 50);
        Product cookie = new Product("Cookie", 15, 25);
        HotDrink coffee = new HotDrink("Latte", 10, 100, 85, 1000);
        HotDrink hotChocolate = new HotDrink("Hot chocolate", 10, 60, 80, 500);

        vm1.addProduct(0, hotChocolate);
        vm1.addProduct(1, coffee);
        vm1.addProduct(3, cookie);
        vm1.addProduct(4, chocolate);
        vm1.addProduct(5, chips);

        System.out.println(vm1);
        System.out.println(vm1.getProduct(vm1.getProductNameFromUser()));
    }
}
