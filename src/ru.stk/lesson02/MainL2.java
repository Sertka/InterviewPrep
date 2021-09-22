public class MainL2 {

    public static void main(String[] args) {

        // MyArrayList
        ArrayList arr = new MyArrayList();
        arr.add(10);
        arr.add(8);
        arr.add(3);
        arr.add(7);
        arr.add(12);

        System.out.println("Задание 1");
        for (int i = 0; i < arr.getSize(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println("-----------------");
        System.out.println("Element removed - " + arr.remove(2));

        for (int i = 0; i < arr.getSize(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println("-----------------");
        System.out.println(arr.search(12));
        System.out.println(arr.search(112));
        System.out.println();

        //MyLinkedList

        LinkedList<Integer> linkedList = new MyLinkedList<>();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);

        System.out.println("Задание 2");
        linkedList.display();

        System.out.println("Find 2: " + linkedList.contains(2));
        System.out.println("Find 1: " + linkedList.contains(1));
        System.out.println("Find 4: " + linkedList.contains(4));
        System.out.println("Find 555: " + linkedList.contains(555));

        linkedList.removeFirst();
        linkedList.remove(2);

        linkedList.display();


    }
}

