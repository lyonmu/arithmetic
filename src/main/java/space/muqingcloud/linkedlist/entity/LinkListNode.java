package space.muqingcloud.linkedlist.entity;

public class LinkListNode {
    private int value;
    private LinkListNode next;
    private LinkListNode previous;

    public LinkListNode(int value) {
        this.value = value;
    }

    public LinkListNode(int value, LinkListNode next, LinkListNode previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public LinkListNode() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkListNode getNext() {
        return next;
    }

    public void setNext(LinkListNode next) {
        this.next = next;
    }

    public LinkListNode getPrevious() {
        return previous;
    }

    public void setPrevious(LinkListNode previous) {
        this.previous = previous;
    }
}
