package task_one;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question4 {

    // main method
    public static void main(String[] args) {

        // Creating my list to store 71-150
        List<Integer> listOf71to150 = IntStream.range(71, 150).boxed().collect(Collectors.toList());

        listOf71to150.add(150); // adding last item

        // calling my methods to print the output
        testForNum2(listOf71to150);
        testForNum3(listOf71to150);
        testForNum7(listOf71to150);
    }

    static void testForNum2(List<Integer> myList) {
        System.out.println("\n\n2 has the following multiples:");

        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                System.out.println(myList.get(i));

            }
            
            if (i == 150 - 71) {
                    break;
                }

        }
    }

    static void testForNum3(List<Integer> myList) {
        System.out.println("\n\n3 has the following multiples:");

        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 3 == 0) {
                System.out.println(myList.get(i));
            }
            if (i == 150 - 71) {
                    break;
                }

        }
    }

    static void testForNum7(List<Integer> myList) {
        System.out.println("\n\n7  has the following multiples:");

        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 7 == 0) {
                System.out.println(myList.get(i));

            }
            if (i == 150 - 71) {
                    break;
                }

        }
    }
}
