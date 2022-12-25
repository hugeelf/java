package Homeworks.homework_011;

public class BeginWithA implements IsGood<String> {

    @Override
    public boolean isGood(String item) {
        return item.charAt(0)=='A';
    }

}