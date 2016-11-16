import java.util.Arrays;
import java.util.Random;

/**
 * Created by User on 13.11.2016.
 */
//Задача 4 урок 5 с неправильным заполнением масива выдала правильное решение
public class Main {
    public static void main(String[] args){
        int[] array4;
        array4 = new int[11];
        try {
            array4[0] = array4[1] = 1;
            for (int q = 2; q < 12; q++) {
            array4[q] = array4[q - 2] + array4[q - 1];

            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("индекс за пределами массива" + e);
        }
        System.out.println(Arrays.toString(array4));
    }}

