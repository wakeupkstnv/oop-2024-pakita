package lab3.task5;

public class Test {
    public static void main(String[] args) {
        Chocolate c1 = new Chocolate("kit-kat", 2);
        Chocolate c2 = new Chocolate("Snickers", 1);
        Chocolate c3 = new Chocolate("Dubaiski Chocolate xD", 4);

        Chocolate [] array = new Chocolate[3];
        array[0] = c1;
        array[1] = c2;
        array[2] = c3;

        Sort.bubbleSort(array);
        System.out.println("\nBubble sort result:");
        for (int i = 0; i < array.length; ++i){
            System.out.println(array[i]);
        }

        array[0] = new Chocolate("Yashkino", 1000000);
        Chocolate [] array2 = Sort.stalinSort(array);

        System.out.println("\nStalin Sort result:");
        for (Chocolate chocolate : array2) {
            System.out.println(chocolate);
        }
    }
}
