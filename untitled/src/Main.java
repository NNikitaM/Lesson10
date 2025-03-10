import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(1.0);
        list1.add(2.0);
        list1.add(3.0);

        System.out.println("В первом списке " + size(list1) + " элементов");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("uno");
        list2.add("dos");
        list2.add("tres");
        list2.add("cuatro");
        list2.add("cinco");

        System.out.println("Во втором списке " + size(list2) + " элементов");
    }

    public static <T> int size(ArrayList<T> list) {
        int count = 0;
        for (T element : list) {
            count++;
        }
        return count;
    }

}
