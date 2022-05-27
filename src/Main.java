public class Main {
    public static void main(String[] args) {
        String[] data = new String[]{"green", "blue", "red"};
        Integer[] orderValues = new Integer[]{5, 8, 1};
        for (String s : data) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (Integer i : orderValues) {
            System.out.print(i + " ");
        }
        System.out.printf("\n\n");
        Double[] data2 = new Double[]{5.0, 6.0, 3.0, 0.0, 2.0, 1.0};
        Integer[] orderValues2 = new Integer[]{5, 6, 3, 0, 2, 1};
        for (Double d : data2) {
            System.out.print(d + " ");
        }
        System.out.println();
        for (Integer i : orderValues2) {
            System.out.print(i + " ");
        }
        System.out.printf("\n\n");

        BubbleSort.sort(data, orderValues);
        BubbleSort.sort(data2, orderValues2);

        for (String s : data) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (Integer i : orderValues) {
            System.out.print(i + " ");
        }
        System.out.printf("\n\n");

        for (Double d : data2) {
            System.out.print(d + " ");
        }
        System.out.println();
        for (Integer i : orderValues2) {
            System.out.print(i + " ");
        }
        System.out.printf("\n\n");

    }
}
