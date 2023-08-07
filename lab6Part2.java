package CS102_lab6;

import java.util.*;

public class lab6Part2 {
    private static ArrayList<Integer> arrayListBag = new ArrayList<>();
    private static LinkedList<Integer> linkedListBag = new LinkedList<>();
    private static HashSet<Integer> hashSetBag = new HashSet<>();
    private static TreeSet<Integer> treeSetBag = new TreeSet<>();

    public static void addToArrayListBag(int element) {
        arrayListBag.add(element);
    }
    public static void addToLinkedListBag(int element) {
        linkedListBag.add(element);
    }
    public static void addToHashSetBagBag(int element) {
        hashSetBag.add(element);
    }
    public static void addToTreeSetBag(int element) {
        treeSetBag.add(element);
    }
    public static boolean arrayListContains(int element) {
        return arrayListBag.contains(element);
    }
    public static boolean linkedListContains(int element) {
        return linkedListBag.contains(element);
    }
    public static boolean hashSetContains(int element) {
        return hashSetBag.contains(element);
    }
    public static boolean treeSetContains(int element) {
        return treeSetBag.contains(element);
    }
    public static void removeFromArrayList(int element) {
        arrayListBag.remove(element);
    }
    public static void removeFromLinkedList(int element) {
        linkedListBag.remove(element);
    }
    public static void removeFromHashSet(int element) {
        hashSetBag.remove(element);
    }
    public static void removeFromTreeSet(int element) {
        treeSetBag.remove(element);
    }

    public static void executeTheArrayList() {
        int count = 0;
        for (int i = 0; i < 1000000; i++) {
            addToArrayListBag(count);
            count++;
        }
    }


    public static void executeTheLinkedList() {
        int count = 0;
        for (int i = 0; i < 1000000; i++) {
            addToLinkedListBag(count);
            count++;
        }
    }

    public static void executeTheHashSet() {
        int count = 0;
        for (int i = 0; i < 1000000; i++) {
            addToHashSetBagBag(count);
            count++;
        }
    }

    public static void executeTheTree() {
        int count = 0;
        for (int i = 0; i < 1000000; i++) {
            addToTreeSetBag(count);
            count++;
        }
    }

    public static void addToArray() {
        addToArrayListBag(200);
    }

    public static void addToLinked() {
        addToLinkedListBag(200);
    }

    public static void addToHash() {
        addToHashSetBagBag(200);
    }

    public static void addToTree() {
        addToTreeSetBag(200);
    }

    public static Iterator<Integer> arrayIterator() {
        return arrayListBag.iterator();
    }

    public static Iterator<Integer> linkedIterator() {
        return linkedListBag.iterator();
    }

    public static Iterator<Integer> hashIterator() {
        return hashSetBag.iterator();
    }

    public static Iterator<Integer> treeIterator() {
        return treeSetBag.iterator();
    }




    public static void main(String[] args) {

        System.out.println();
        System.out.println("Adding 1 Million items");
        long begin1 = System.nanoTime();
        executeTheArrayList();
        long end1 = System.nanoTime();
        long time1 = end1-begin1;
        System.out.println("Elapsed Time: "+time1);

        long begin2 = System.nanoTime();
        executeTheLinkedList();
        long end2 = System.nanoTime();
        long time2 = end2-begin2;
        System.out.println("Elapsed Time: "+time2);

        long begin3 = System.nanoTime();
        executeTheHashSet();
        long end3 = System.nanoTime();
        long time3 = end3-begin3;
        System.out.println("Elapsed Time: "+time3);

        long begin4 = System.nanoTime();
        executeTheTree();
        long end4 = System.nanoTime();
        long time4 = end4-begin4;
        System.out.println("Elapsed Time: "+time4);

        System.out.println();
        System.out.println("Adding one more element");
        long begin11 = System.nanoTime();
        executeTheTree();
        long end11 = System.nanoTime();
        long time11 = end11-begin11;
        System.out.println("Elapsed Time: "+time11);

        long begin22 = System.nanoTime();
        executeTheTree();
        long end22 = System.nanoTime();
        long time22 = end22-begin22;
        System.out.println("Elapsed Time: "+time22);

        long begin33 = System.nanoTime();
        executeTheTree();
        long end33 = System.nanoTime();
        long time33 = end33-begin33;
        System.out.println("Elapsed Time: "+time33);

        long begin44 = System.nanoTime();
        executeTheTree();
        long end44 = System.nanoTime();
        long time44 = end44-begin44;
        System.out.println("Elapsed Time: "+time44);

        System.out.println();
        System.out.println("The average time taken to check if a random integer is contained (average of 100 tests)");
        long begin111 = System.nanoTime();
        arrayListContains(999999);
        long end111 = System.nanoTime();
        long time111 = end111-begin111;
        System.out.println("Elapsed Time: "+time111);

        long begin222 = System.nanoTime();
        linkedListContains(999999);
        long end222 = System.nanoTime();
        long time222 = end222-begin222;
        System.out.println("Elapsed Time: "+time222);

        long begin333 = System.nanoTime();
        hashSetContains(999999);
        long end333 = System.nanoTime();
        long time333 = end333-begin333;
        System.out.println("Elapsed Time: "+time333);

        long begin444 = System.nanoTime();
        treeSetContains(999999);
        long end444 = System.nanoTime();
        long time444 = end444-begin444;
        System.out.println("Elapsed Time: "+time444);

        System.out.println();
        System.out.println("The average time taken to delete a random element from the original 1 million integers (average of 100 tests)");
        long begin1111 = System.nanoTime();
        removeFromArrayList(500000);
        long end1111 = System.nanoTime();
        long time1111 = end1111-begin1111;
        System.out.println("Elapsed Time: "+time1111);

        long begin2222 = System.nanoTime();
        removeFromLinkedList(500000);
        long end2222 = System.nanoTime();
        long time2222 = end2222-begin2222;
        System.out.println("Elapsed Time: "+time2222);

        long begin3333= System.nanoTime();
        removeFromHashSet(500000);
        long end3333= System.nanoTime();
        long time3333 = end3333-begin3333;
        System.out.println("Elapsed Time: "+time3333);

        long begin4444 = System.nanoTime();
        removeFromTreeSet(500000);
        long end4444 = System.nanoTime();
        long time4444 = end4444-begin4444;
        System.out.println("Elapsed Time: "+time4444);

        System.out.println();
        System.out.println("Time taken to traverse the collection using an iterator");
        long begin11111 = System.nanoTime();
        arrayIterator();
        long end11111 = System.nanoTime();
        long time11111 = end11111-begin11111;
        System.out.println("Elapsed Time: "+time11111);

        long begin22222 = System.nanoTime();
        linkedIterator();
        long end22222 = System.nanoTime();
        long time22222 = end22222-begin22222;
        System.out.println("Elapsed Time: "+time22222);

        long begin33333 = System.nanoTime();
        hashIterator();
        long end33333 = System.nanoTime();
        long time33333 = end33333-begin33333;
        System.out.println("Elapsed Time: "+time33333);

        long begin44444 = System.nanoTime();
        treeIterator();
        long end44444 = System.nanoTime();
        long time44444 = end44444-begin44444;
        System.out.println("Elapsed Time: "+time44444);

        LinkedList<String> linkedList = new LinkedList<>();
        String s = "a";
        for (int i = 0; i < 20; i++) {
            linkedList.add(s);
            s += "a";
        }
        int selection = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println();
            System.out.println("1: Add string to the list");
            System.out.println("2. Remove a selected item");
            System.out.println("3. Move a selected item to a different position");
            System.out.println("4. Display the linked-list");
            System.out.println("5. Exit");
            selection = scan.nextInt();

            if (selection == 1) {
                System.out.println("Enter a string to add: ");
                String toBeAdded = scan.next();
                linkedList.add(toBeAdded);
            } else if (selection == 2) {
                System.out.println("Enter an index for the removal:");
                int index = scan.nextInt();
                linkedList.remove(index);
            } else if (selection == 3) {
                System.out.println("Enter an index for the move:");
                int index = scan.nextInt();
                System.out.println("Enter an index for the new position:");
                int indexNew = scan.nextInt();
                linkedList.set(indexNew, linkedList.remove(index));
            } else {
                System.out.println(linkedList);
            }

        } while (selection != 5);


    }




}
