package homework_sem2;

import java.io.FileWriter;
import java.io.IOException;

//1.Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл. (через FileWriter).
public class Task1_homework {
    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        try (FileWriter in = new FileWriter("test.txt")) {
            for (int i = 0; i < len - 1; i++) {
                for (int j = 0; j < len - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                    in.write(arr[i] + "\t"+ "");
                }
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}



// 0   1   2   3   4

// 1
//      \/
//  4   3   1   2   5
//
//  4   3   1   2   5
//                  /\

//4