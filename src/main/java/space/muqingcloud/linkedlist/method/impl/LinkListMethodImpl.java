package space.muqingcloud.linkedlist.method.impl;

import space.muqingcloud.linkedlist.entity.LinkList;
import space.muqingcloud.linkedlist.method.LinkListMethod;

public class LinkListMethodImpl implements LinkListMethod {
    @Override
    public boolean init(LinkList linkList) {
        return true;
    }

    @Override
    public boolean add(LinkList linkList, Integer value) {
        return false;
    }

    @Override
    public boolean traverse(LinkList linkList) {
        return false;
    }

    @Override
    public boolean deleteValue(LinkList linkList, Integer value) {
        return false;
    }

    @Override
    public boolean deleteNumber(LinkList linkList, Integer number) {
        return false;
    }

    @Override
    public boolean updateValue(LinkList linkList, Integer number, Integer value) {
        return false;
    }

    @Override
    public boolean selectNodeWithValue(LinkList linkList, Integer value) {
        return false;
    }

    @Override
    public boolean selectNodeWithNumber(LinkList linkList, Integer number) {
        return false;
    }
}
