package Homeworks.homework_008;

import java.util.Map;

public class HotDrinkMachine extends MainMachine{

    public HotDrinkMachine(int machineId) {
        super(machineId);
        //TODO Auto-generated constructor stub
    }
    
    public Product getProduct(String name, int temperature){
        for(Map.Entry<Integer, Product> entry : super.product.entrySet()){
            if(!(entry.getValue() instanceof HotDrink)){
                continue;
            }
            if (entry.getValue().getName().equals(name) && ((HotDrink) entry.getValue()).getTemperature()<=temperature){
                return entry.getValue();
            }
        }
        throw new IllegalStateException("Товар не найден!");
    }
}
