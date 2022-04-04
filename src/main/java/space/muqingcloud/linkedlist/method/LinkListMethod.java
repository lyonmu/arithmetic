package space.muqingcloud.linkedlist.method;

import space.muqingcloud.linkedlist.entity.LinkList;
import space.muqingcloud.linkedlist.entity.LinkListNode;

public interface LinkListMethod {
    boolean init(LinkList linkList);

    boolean insert(LinkList linkList, int value);

    boolean foreach(LinkList linkList);

    LinkListNode updateWithNumber(LinkList linkList, int number, int value);

    LinkListNode selectNodeWithValue(LinkList linkList, int value);

    LinkListNode getNumber(LinkList linkList, int number);

    LinkListNode deleteWithNumber(LinkList linkList, int number);
}
