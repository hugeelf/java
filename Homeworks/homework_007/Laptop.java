
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.xml.transform.Templates;

public class Laptop {
    private String brand;
    private String os;
    private int ramSize;
    private int hddSize;
    private String serialNumber;
    private int price;
    private String color;

    /**
     * @param brand        это название бренда
     * @param os           это название операционной системы
     * @param ramSize      это размер оперативной памяти
     * @param hddSize      это размер жесткого диска
     * @param color        это цвет
     * @param price        это цена
     * @param serialNumber это серийный номер
     */
    public Laptop(String brand, String os, int ramSize, int hddSize, int price, String color, String serialNumber) {
        this.brand = brand;
        this.os = os;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.color = color;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", os=" + os + ", ramSize=" + ramSize + ", hddSize=" + hddSize
                + ", color=" + color + ", price=" + price + "]";
    }

    public static ArrayList<String> filter() {
        TreeMap<Integer, String> filterFields = new TreeMap<>();
        filterFields.put(1, "Объем оперативной памяти");
        filterFields.put(2, "Объем встроенной памяти");
        filterFields.put(3, "Операционная система");
        filterFields.put(4, "Цвет");

        ArrayList<String> fieldsFromUser = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= filterFields.size(); i++) {
            System.out.println("Укажите " + filterFields.get(i) + " или \"no\" если параметр не должен учитываться: ");
            fieldsFromUser.add(scanner.nextLine());
        }
        scanner.close();
        return fieldsFromUser;
    }

    public static HashSet <Laptop> filterLaptops(ArrayList<String> fieldsFromUser, HashSet<Laptop> laptops) {

        HashSet<Laptop> tempLaptops = new HashSet<>();
        tempLaptops.addAll(laptops);
        HashSet<Laptop> ramLaptops = new HashSet<>();
        HashSet<Laptop> hddLaptops = new HashSet<>();
        HashSet<Laptop> osLaptops = new HashSet<>();
        HashSet<Laptop> colorLaptops = new HashSet<>();

        for (Laptop laptop : laptops){
            if (!fieldsFromUser.get(0).equals("no") && laptop.getRamSize()>=Integer.parseInt(fieldsFromUser.get(0))){
                ramLaptops.add(laptop);
            }
            if (fieldsFromUser.get(0).equals("no")){
                ramLaptops.addAll(laptops);
            }
        }
        for (Laptop laptop : laptops){
            if (!fieldsFromUser.get(1).equals("no") && laptop.getHddSize()>=Integer.parseInt(fieldsFromUser.get(1))){
                hddLaptops.add(laptop);
            }
            if (fieldsFromUser.get(1).equals("no")){
                hddLaptops.addAll(laptops);
            }
        }
        for (Laptop laptop : laptops){
            if (!fieldsFromUser.get(2).equals("no") && laptop.getOs().equals(fieldsFromUser.get(2))){
                osLaptops.add(laptop);
            }
            if (fieldsFromUser.get(2).equals("no")){
                osLaptops.addAll(laptops);
            }
        }
        for (Laptop laptop : laptops){
            if (!fieldsFromUser.get(3).equals("no") && laptop.getColor().equals(fieldsFromUser.get(3))){
                colorLaptops.add(laptop);
            }
            if (fieldsFromUser.get(3).equals("no")){
                colorLaptops.addAll(laptops);
            }
        }
        tempLaptops.retainAll(ramLaptops);
        tempLaptops.retainAll(hddLaptops);
        tempLaptops.retainAll(osLaptops);
        tempLaptops.retainAll(colorLaptops);
        if (tempLaptops.size()==0){
            System.out.println("подходящих ноутбуков нет. Попробуйте изменить критерии поиска");
        }
        return tempLaptops;
    }
    // HashSet<Laptop> filteredLaptops = new HashSet<>();
    // for (Laptop laptop : laptops) {

    // if (laptop.getRamSize() < Integer.parseInt(fieldsFromUser.get(1))) {
    // continue;
    // }
    // if (laptop.getHddSize() < Integer.parseInt(fieldsFromUser.get(2))) {
    // continue;
    // }
    // if (laptop.getBrand().equals(fieldsFromUser.get(3)) == false) {
    // continue;
    // }
    // if (laptop.getOs().equals(fieldsFromUser.get(4)) == false) {
    // continue;
    // }
    // filteredLaptops.add(laptop);
    // }
    // return filteredLaptops;
    // }

    public String getBrand() {
        return brand;
    }

    public String getOs() {
        return os;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((os == null) ? 0 : os.hashCode());
        result = prime * result + ramSize;
        result = prime * result + hddSize;
        result = prime * result + price;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (os == null) {
            if (other.os != null)
                return false;
        } else if (!os.equals(other.os))
            return false;
        if (ramSize != other.ramSize)
            return false;
        if (hddSize != other.hddSize)
            return false;
        if (price != other.price)
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        return true;
    }

}
