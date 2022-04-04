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
    public boolean insert(LinkList linkList, Integer value){
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
        return true;
    }

    @Override
    public boolean deleteValue(LinkList linkList, Integer value) {
        return true;
    }

    @Override
    public boolean deleteNumber(LinkList linkList, Integer number) {
        return true;
    }

    @Override
    public boolean updateValue(LinkList linkList, Integer number, Integer value) {
        return true;
    }

    @Override
    public boolean selectNodeWithValue(LinkList linkList, Integer value) {
        return true;
    }

    @Override
    public boolean selectNodeWithNumber(LinkList linkList, Integer number) {
        return true;
    }
}
