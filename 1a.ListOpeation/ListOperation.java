package ListOperation;
import java.util.*;
public class ListOperation {
		    public static void main(String[] args) {
		        // Initialize both ArrayList and LinkedList
		        ArrayList<String> arrayList = new ArrayList<>();
		        LinkedList<String> linkedList = new LinkedList<>();

		        // 1. Adding elements to both lists
		        addElements(arrayList, linkedList);

		        // 2. Adding element at a specific index
		        addAtIndex(arrayList, linkedList, "Grapes", 1);

		        // 3. Adding multiple elements
		        addMultipleElements(arrayList, linkedList);

		        // 4. Accessing elements
		        accessElements(arrayList, linkedList);

		        // 5. Updating elements
		        updateElements(arrayList, linkedList, 2, "Kiwi");

		        // 6. Removing elements
		        removeElement(arrayList, linkedList, "Banana");

		        // 7. Searching for elements
		        searchElement(arrayList, linkedList, "Orange");

		        // 8. List size
		        listSize(arrayList, linkedList);

		        // 9. Iterating over the list
		        iterateOverList(arrayList, linkedList);

		        // 10. Using Iterator
		        useIterator(arrayList, linkedList);

		        // 11. Sorting the lists
		        sortLists(arrayList, linkedList);

		        // 12. Creating sublist
		        createSublist(arrayList, linkedList, 1, 3);

		        // 13. Clearing the lists
		        clearLists(arrayList, linkedList);
		    }

		    // 1. Adding elements to both ArrayList and LinkedList
		    static void addElements(ArrayList<String> aList, LinkedList<String> lList) {
		        aList.add("Apple");
		        aList.add("Banana");
		        aList.add("Orange");

		        lList.add("Apple");
		        lList.add("Banana");
		        lList.add("Orange");

		        System.out.println("1. Elements added to both lists.");
		    }

		    // 2. Adding an element at a specific index
		    static void addAtIndex(ArrayList<String> aList, LinkedList<String> lList, String item, int index) {
		        aList.add(index, item);
		        lList.add(index, item);
		        System.out.println("2. '" + item + "' added at index " + index);
		    }

		    // 3. Adding multiple elements
		    static void addMultipleElements(ArrayList<String> aList, LinkedList<String> lList) {
		        aList.addAll(Arrays.asList("Pineapple", "Mango"));
		        lList.addAll(Arrays.asList("Pineapple", "Mango"));
		        System.out.println("3. Multiple elements added to both lists.");
		    }

		    // 4. Accessing elements from both lists
		    static void accessElements(ArrayList<String> aList, LinkedList<String> lList) {
		        System.out.println("4. Accessing first element from ArrayList: " + aList.get(0));
		        System.out.println("   Accessing first element from LinkedList: " + lList.get(0));
		    }

		    // 5. Updating elements in both lists
		    static void updateElements(ArrayList<String> aList, LinkedList<String> lList, int index, String newVal) {
		        aList.set(index, newVal);
		        lList.set(index, newVal);
		        System.out.println("5. Element at index " + index + " updated to '" + newVal + "'");
		    }

		    // 6. Removing elements from both lists
		    static void removeElement(ArrayList<String> aList, LinkedList<String> lList, String item) {
		        aList.remove(item);
		        lList.remove(item);
		        System.out.println("6. Element '" + item + "' removed from both lists.");
		    }

		    // 7. Searching for elements in both lists
		    static void searchElement(ArrayList<String> aList, LinkedList<String> lList, String item) {
		        boolean foundInArrayList = aList.contains(item);
		        boolean foundInLinkedList = lList.contains(item);
		        System.out.println("7. '" + item + "' found in ArrayList? " + foundInArrayList);
		        System.out.println("   '" + item + "' found in LinkedList? " + foundInLinkedList);
		    }

		    // 8. Getting the size of both lists
		    static void listSize(ArrayList<String> aList, LinkedList<String> lList) {
		        System.out.println("8. ArrayList size: " + aList.size());
		        System.out.println("   LinkedList size: " + lList.size());
		    }

		    // 9. Iterating over the list using a for-each loop
		    static void iterateOverList(ArrayList<String> aList, LinkedList<String> lList) {
		        System.out.println("9. Iterating over ArrayList:");
		        for (String item : aList) {
		            System.out.println("   " + item);
		        }

		        System.out.println("   Iterating over LinkedList:");
		        for (String item : lList) {
		            System.out.println("   " + item);
		        }
		    }

		    // 10. Using an Iterator to iterate over the lists
		    static void useIterator(ArrayList<String> aList, LinkedList<String> lList) {
		        System.out.println("10. Using Iterator on ArrayList:");
		        Iterator<String> arrIterator = aList.iterator();
		        while (arrIterator.hasNext()) {
		            System.out.println("   " + arrIterator.next());
		        }

		        System.out.println("    Using Iterator on LinkedList:");
		        Iterator<String> linkIterator = lList.iterator();
		        while (linkIterator.hasNext()) {
		            System.out.println("   " + linkIterator.next());
		        }
		    }

		    // 11. Sorting the lists
		    static void sortLists(ArrayList<String> aList, LinkedList<String> lList) {
		        Collections.sort(aList);
		        Collections.sort(lList);
		        System.out.println("11. Sorted ArrayList: " + aList);
		        System.out.print("    Sorted LinkedList: " + lList);
		    }

		    // 12. Creating a sublist from both lists
		    static void createSublist(ArrayList<String> aList, LinkedList<String> lList, int from, int to) {
		        System.out.println("12. Sublist of ArrayList from index " + from + " to " + to + ": " + aList.subList(from, to));
		        System.out.print("    Sublist of LinkedList from index " + from + " to " + to + ": " + lList.subList(from, to));
		    }

		    // 13. Clearing both lists
		    static void clearLists(ArrayList<String> aList, LinkedList<String> lList) {
		        aList.clear();
		        lList.clear();
		        System.out.println("13. Both lists have been cleared.");
		    }
		}

