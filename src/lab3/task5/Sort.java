package lab3.task5;

public class Sort {
    private Sort(){}

    static <E> void swap(E [] array, int i, int j){
        if (i >= 0 && j >= 0 && i <= array.length && j <= array.length){
            E temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    static <E extends Comparable<E>> void bubbleSort(E [] array){
        for (int i = 0; i < array.length; ++i){
            for (int j = i; j < array.length; ++j){
                if (array[i].compareTo(array[j]) > 0){
                    swap(array, i, j);
                }
            }
        }
    }

    static <E extends Comparable<E>> E[] stalinSort(E[] array) {
        java.util.List<E> result = new java.util.ArrayList<>();

        for (E element : array) {
            if (result.isEmpty() || element.compareTo(result.get(result.size() - 1)) >= 0) {
                result.add(element);
            }
        }

        return result.toArray(java.util.Arrays.copyOf(array, result.size()));
    }


}
