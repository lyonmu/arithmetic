package space.muqingcloud.linkedlist.entity;

public class LinkList {
    private LinkListNode linkHead;
    private LinkListNode linkTail;
    private int length;

    public LinkList() {
    }

    public LinkList(LinkListNode linkHead, LinkListNode linkTail, int length) {
        this.linkHead = linkHead;
        this.linkTail = linkTail;
        this.length = length;
    }

    public LinkListNode getLinkHead() {
        return linkHead;
    }

    public void setLinkHead(LinkListNode linkHead) {
        this.linkHead = linkHead;
    }

    public LinkListNode getLinkTail() {
        return linkTail;
    }

    public void setLinkTail(LinkListNode linkTail) {
        this.linkTail = linkTail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
