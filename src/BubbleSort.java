import java.util.Comparator;

public class BubbleSort {
    public static <V, K> void sort(V[] data, K[] orderValues, Comparator<K> c){
        int size = data.length;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if (c.compare(orderValues[j-1], orderValues[j]) > 0){
                    K tmp1 = orderValues[j-1];
                    orderValues[j-1] = orderValues[j];
                    orderValues[j] = tmp1;
                    V tmp2 = data[j-1];
                    data[j-1] = data[j];
                    data[j] = tmp2;
                }
            }
        }
    }

    public static <V, K extends Comparable<K>> void sort(V[] data, K[] orderValues){
        sort(data, orderValues, Comparable::compareTo);
    }
}
