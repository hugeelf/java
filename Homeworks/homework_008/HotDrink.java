package Homeworks.homework_008;

public class HotDrink extends Product {
    private int volume;
    private int temperature;

    public HotDrink(String name, int productCounter, int productPrice, int temperature, int volume) {
        super(name, productCounter, productPrice);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink [name= " + super.name + ", volume=" + volume + ", temperature=" + temperature
                + ", productCounter=" + super.productCounter + ", productPrice=" + super.productPrice + "]";
    }

}
