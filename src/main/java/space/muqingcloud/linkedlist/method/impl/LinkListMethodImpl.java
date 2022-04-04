package space.muqingcloud.linkedlist.method.impl;

import cn.hutool.log.StaticLog;
import space.muqingcloud.linkedlist.entity.LinkList;
import space.muqingcloud.linkedlist.entity.LinkListNode;
import space.muqingcloud.linkedlist.method.LinkListMethod;

public class LinkListMethodImpl implements LinkListMethod {
    @Override
    public boolean init(LinkList linkList) {
        linkList.setLinkHead(null);
        linkList.setLinkTail(null);
        linkList.setLength(0);
        return true;
    }

    @Override
    public boolean insert(LinkList linkList, int value) {
        LinkListNode node = new LinkListNode(value);
        LinkListNode tagNode = new LinkListNode();
        if (0 == linkList.getLength()) {
            node.setPrevious(null);
            node.setNext(null);
            linkList.setLinkHead(node);
            linkList.setLinkTail(node);
        } else {
            if (value >= linkList.getLinkTail().getValue()) {
                node.setPrevious(linkList.getLinkTail());
                node.setNext(null);
                linkList.getLinkTail().setNext(node);
                linkList.setLinkTail(node);
            } else if (value <= linkList.getLinkHead().getValue()) {
                node.setPrevious(null);
                node.setNext(linkList.getLinkHead());
                linkList.getLinkHead().setPrevious(node);
                linkList.setLinkHead(node);
            } else {

                tagNode = linkList.getLinkHead();
                while (tagNode != null) {
                    if (tagNode.getValue() >= node.getValue()) {
                        node.setPrevious(tagNode.getPrevious());
                        node.setNext(tagNode);
                        tagNode.getPrevious().setNext(node);
                        tagNode.setPrevious(node);
                        tagNode = null;
                        break;
                    }
                    tagNode = tagNode.getNext();
                }
            }
        }
        linkList.setLength(linkList.getLength() + 1);
        return true;
    }

    @Override
    public boolean foreach(LinkList linkList) {
        if (0 == linkList.getLength()) {
            StaticLog.info("linkList is null");
            return true;
        }
        LinkListNode tagNode = new LinkListNode();
        tagNode = linkList.getLinkHead();
        while (tagNode != null) {
            System.out.print(tagNode.getValue() + "\t");
            tagNode = tagNode.getNext();
        }
        System.out.println();
        return true;
    }

    @Override
    public LinkListNode updateWithNumber(LinkList linkList, int number, int value) {
        if (linkList.getLength() < number) {
            StaticLog.info("超出链表长度，应该采用插入！");
            return null;
        }
        LinkListNode tagNode = linkList.getLinkHead();
        for (int i = 0; i < number; i++) {
            tagNode = tagNode.getNext();
        }
        tagNode.setValue(value);
        return tagNode;
    }

    @Override
    public LinkListNode selectNodeWithValue(LinkList linkList, int value) {
        LinkListNode node = new LinkListNode();
        LinkListNode tagNode = linkList.getLinkHead();
        while (tagNode != null) {
            if (value == tagNode.getValue()) {
                node = tagNode;
                break;
            }
            tagNode = tagNode.getNext();
        }
        return node;
    }

    @Override
    public LinkListNode getNumber(LinkList linkList, int number) {
        LinkListNode tagNode = linkList.getLinkHead();
        for (int i = 0; i < number; i++) {
            tagNode = tagNode.getNext();
        }
        return tagNode;
    }

    @Override
    public LinkListNode deleteWithNumber(LinkList linkList, int number) {
        linkList.setLength(linkList.getLength() - 1);
        LinkListNode node = new LinkListNode();
        LinkListNode tagNode = linkList.getLinkHead();
        for (int i = 0; i < number; i++) {
            tagNode = tagNode.getNext();
        }
        tagNode.getNext().setPrevious(tagNode.getPrevious());
        tagNode.getPrevious().setNext(tagNode.getNext());
        return node;
    }

    ;
}
