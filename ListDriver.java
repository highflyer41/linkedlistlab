public class ListDriver {
    
    public static void main(String[] args) {
        MLinkedList mylist = new MLinkedList();
        MLinkedList mylist2 = new MLinkedList();

        //System.out.println(mylist.isEmpty());

        mylist.add(new ListNode("Hello"));
        mylist.add(new ListNode("Goodbye"));
        mylist.add(new ListNode("World"));
        mylist.add(new ListNode("Goodbye"));

        mylist2.add(new ListNode("Mercury"));
        mylist2.add(new ListNode("Venus"));
        mylist2.add(new ListNode("Earth"));

        mylist.printList();
        System.out.println("--------------");

        mylist2.printList();
        System.out.println("--------------");

        //mylist.append(mylist2);

        //mylist.printList();
        //System.out.println();

        //mylist.makeEmpty();
        //mylist.remove("World");
        //mylist.removeAll("Goodbye");
        //mylist.addLast(new ListNode("Last"));
        //mylist.addAfter("World", new ListNode("Venus"));
        //mylist.printListRev();

        //mylist.printList();
    }
}