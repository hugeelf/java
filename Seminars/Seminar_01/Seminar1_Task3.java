package Seminars.Seminar_01;
/*
Дан массив nums = [3,2,2,3] и число val = 3. 
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */
public class Seminar1_Task3 {
    public static void main(String[] args) {
        int [] nums = {3,2,2, 3, 2, 4 , 67, 8, 3, 3, 3};      
        int val = 3;
        int count = 0;
        for (int i = nums.length-1; i >=0 ; i--) {
            if(nums[i] == val) {
                count++;
            }
            else break;
        }

        for (int i = 0; i < nums.length-count; i++) {
            if(nums[i] == val) { 

                int temp = nums[nums.length-count-1];
                nums[nums.length-count-1] = nums[i];
                nums[i] = temp;

                count++;

            }            
        }

        for (int index = 0; index < nums.length; index++) {
            System.out.print(nums[index] + " ");

        }
    }
}
