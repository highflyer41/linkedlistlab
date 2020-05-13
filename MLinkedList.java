import java.util.ArrayList;
import java.util.List;

public class MLinkedList {
    
    private ListNode first, last;
    private int size;

    public MLinkedList() {
        first = last = null;
        size = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int getSize() {
        return size;
    }

    public ListNode getLast() {
        return last;
    }

    public ListNode getFirst() {
        return first;
    }

    public void add(ListNode n) {
        if(isEmpty()) {
            first = last = n;
        }else {
            ListNode temp = first;
            first = n;
            first.setNext(temp);
        }
        size++;
    }

    public void addLast(ListNode n) {
        last.setNext(n);
        last = last.getNext();
        size++;
    }

    public void addAfter(String search, ListNode n) {
        ListNode current = first;
        while(current != null) {
            if(current.getData().equals(search)) {
                if(current.getNext() == null) {
                    current.setNext(n);
                    last = current.getNext();
                    break;
                } else {
                    ListNode temp = current.getNext();
                    current.setNext(n);
                    n.setNext(temp);
                    break;
                }
            }
            current = current.getNext();
        }
        size++;
    }

    public void append(MLinkedList list){
        this.last.setNext(list.first);
        this.last = list.last;
    }

    public ListNode remove(String search) {
        ListNode current = first;
        ListNode temp = null;
        while(current.getNext() != null) {
            if(current == first) {
                if(current.getData().equals(search)) {
                    temp = first;
                    first = temp.getNext();
                    break;
                }
            }
            if(current.getNext().getData().equals(search)) {
                temp = current.getNext();
                current.setNext(temp.getNext());
                break;
            }
            
            current = current.getNext();
        }

        size--;
        return temp;
    }

    public ListNode removeAll(String search) {
        ListNode current = first;
        ListNode temp = null;
        while(current.getNext() != null) {
            if(current == first) {
                if(current.getData().equals(search)) {
                    temp = first;
                    first = temp.getNext();
                }
            }
            if(current.getNext().getData().equals(search)) {
                temp = current.getNext();
                current.setNext(temp.getNext());
            }
            
            current = current.getNext();
        }

        size--;
        return temp;
    }

    public void makeEmpty() {
        first = last = null;
        size = 0;
    }

    public void printList() {
        ListNode current = first;
        while(current != null) {
            current.print();
            current = current.getNext();
        }
    }

    public void printListRev() {
        ListNode current = first;
        List<String> arr = new ArrayList<>();
        while(current != null) {
            arr.add(current.getData());
            current = current.getNext();
        }
        for(int i = arr.size() - 1; i >= 0; i--) {
            System.out.println(arr.get(i));
        }
    }
}