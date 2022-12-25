package Homeworks.homework_011;

public class IsEven implements IsGood<Integer> {

    @Override
    public boolean isGood(Integer item) {
        return item % 2 == 0;
    }

}
