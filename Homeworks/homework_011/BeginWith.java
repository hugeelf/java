package Homeworks.homework_011;

public class BeginWith implements IsGood <String>{
    private String compare;

    public BeginWith(String compare) {
        this.compare = compare;
    }

    @Override
    public boolean isGood(String item) {    
        return compare.equals(item.substring(0, compare.length()));
    }
    
}
