package space.muqingcloud.linkedlist.method;

import space.muqingcloud.linkedlist.entity.LinkList;

public interface LinkListMethod {
    boolean init(LinkList linkList);

    boolean insert(LinkList linkList, Integer value);

    boolean foreach(LinkList linkList);

    boolean deleteValue(LinkList linkList, Integer value);

    boolean deleteNumber(LinkList linkList, Integer number);

    boolean updateValue(LinkList linkList, Integer number, Integer value);

    boolean selectNodeWithValue(LinkList linkList, Integer value);

    boolean selectNodeWithNumber(LinkList linkList, Integer number);
}
