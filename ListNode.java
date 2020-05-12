/**
 * ListNode
 */
public class ListNode {

    private String data;
    private ListNode next;

    public ListNode(String input) {
        data = input;
    }

    public String getData() {
        return data;
    }

    public void setNext(ListNode node) {
        next = node;
    }

    public ListNode getNext() {
        return next;
    }

    public void print() {
        System.out.println(data);
    }
}