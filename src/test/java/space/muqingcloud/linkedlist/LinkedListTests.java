package space.muqingcloud.linkedlist;

import cn.hutool.log.StaticLog;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import space.muqingcloud.linkedlist.entity.LinkList;
import space.muqingcloud.linkedlist.entity.LinkListNode;
import space.muqingcloud.linkedlist.method.LinkListMethod;
import space.muqingcloud.linkedlist.method.impl.LinkListMethodImpl;

import java.util.concurrent.ThreadLocalRandom;

public class LinkedListTests {

    @Test
    void testInit() {
        LinkList list = new LinkList();
        LinkListMethod listMethod = new LinkListMethodImpl();
        boolean init = listMethod.init(list);
        String jsonString = JSON.toJSONString(list);
        StaticLog.info(jsonString);
    }

    @Test
    void testInsert() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        LinkList list = new LinkList();
        LinkListMethod listMethod = new LinkListMethodImpl();
        boolean init = listMethod.init(list);
        for (int i = 0; i < 20; i++) {
            listMethod.insert(list, random.nextInt(100));
        }
        System.out.println(list.getLength());
        listMethod.foreach(list);
    }

    @Test
    void testRandom() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            // 生成 0-9 随机整数
            int number = random.nextInt(1000);
            // 打印结果
            System.out.println("生成随机数：" + number);
        }
    }

    @Test
    void testGetNumber() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        LinkList list = new LinkList();
        LinkListMethod listMethod = new LinkListMethodImpl();
        boolean init = listMethod.init(list);
        for (int i = 0; i < 20; i++) {
            listMethod.insert(list, random.nextInt(100));
        }
        listMethod.foreach(list);
        for (int i = 0; i < 20; i++) {
            System.out.println(listMethod.getNumber(list, i).getValue());
        }
    }

    @Test
    void testUpdateWithNumber() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        LinkList list = new LinkList();
        LinkListMethod listMethod = new LinkListMethodImpl();
        boolean init = listMethod.init(list);
        for (int i = 0; i < 20; i++) {
            listMethod.insert(list, random.nextInt(100));
        }
        listMethod.foreach(list);
        listMethod.updateWithNumber(list, 3, 8);
        listMethod.updateWithNumber(list, 4, 8);
        listMethod.foreach(list);
    }

    @Test
    void testSelectNodeWithValue() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        LinkList list = new LinkList();
        LinkListMethod listMethod = new LinkListMethodImpl();
        boolean init = listMethod.init(list);
        for (int i = 0; i < 20; i++) {
            listMethod.insert(list, random.nextInt(100));
        }
        listMethod.foreach(list);
        listMethod.updateWithNumber(list, 3, 8);
        listMethod.updateWithNumber(list, 4, 8);
        LinkListNode linkListNode = listMethod.selectNodeWithValue(list, 8);
        System.out.println(linkListNode.getValue());
    }

    @Test
    void testDeleteWithNumber() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        LinkList list = new LinkList();
        LinkListMethod listMethod = new LinkListMethodImpl();
        boolean init = listMethod.init(list);
        for (int i = 0; i < 20; i++) {
            listMethod.insert(list, random.nextInt(100));
        }
        listMethod.foreach(list);
        listMethod.deleteWithNumber(list, 3);
        listMethod.deleteWithNumber(list, 8);
        listMethod.foreach(list);
        System.out.println(list.getLength());
    }
}
