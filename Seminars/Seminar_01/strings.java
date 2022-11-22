package Seminars.Seminar_01;

public class strings {
    public static void main(String[] args) {
        String[] array = {"dadalife", "dadalifeagain","dadalifeagainandagain"};
        String result = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                result=result+array[j].charAt(i);
            }
        }
        System.out.println(result);

    }
    
}
