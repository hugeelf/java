import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("MSI", "Windows", 8, 1024, 80_000, "Black", "SN12121212");
        Laptop laptop2 = new Laptop("Lenovo", "Windows", 8, 1024, 82_000, "Black", "SN13131313");
        Laptop laptop3 = new Laptop("Lenovo", "Linux", 16, 2048, 97_000, "White","SN14141414");
        Laptop laptop4 = new Laptop("Microsoft", "Windows", 32, 1024*4, 150_000, "Blue","SN15151515");   

        HashSet <Laptop> laptopList = new HashSet<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);
        laptopList.add(laptop3);
        laptopList.add(laptop4);

        // System.out.println(Laptop.userFilterFields(laptopList));;
        System.out.println(Laptop.filterLaptops(Laptop.filter(), laptopList));;

    }
    
}
