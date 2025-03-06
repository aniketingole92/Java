import java.util.ArrayList;

public class seven {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1)); // 20

        // Modifying elements
        list.set(1, 25);

        // Iterating over ArrayList
        System.out.println("Elements in list:");
        for (int elem : list) {
            System.out.println(elem);
        }

        // Size of ArrayList
        System.out.println("Size of list: " + list.size());

        // Removing elements
        list.remove(Integer.valueOf(10));
        list.remove(0); // Removes element at index 0

        // Check if ArrayList is empty
        System.out.println("Is list empty? " + list.isEmpty());

        // Clearing the ArrayList
        list.clear();
    }
}