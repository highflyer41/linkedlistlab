public class ListDriver {
    
    public static void main(String[] args) {
        MLinkedList mylist = new MLinkedList();

        //System.out.println(mylist.isEmpty());

        mylist.add(new ListNode("Hello"));
        mylist.add(new ListNode("Goodbye"));
        mylist.add(new ListNode("World"));
        mylist.add(new ListNode("Goodbye"));

        mylist.printList();
        System.out.println();

        //mylist.makeEmpty();
        //mylist.remove("Hello");
        //mylist.removeAll("Goodbye");
        //mylist.addLast(new ListNode("Last"));
        //mylist.addAfter("World", new ListNode("Venus"));
        //mylist.printListRev();

        //mylist.printList();
    }
}