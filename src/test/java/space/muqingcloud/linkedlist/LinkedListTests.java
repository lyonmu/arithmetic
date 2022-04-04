package space.muqingcloud.linkedlist;

import cn.hutool.log.StaticLog;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import space.muqingcloud.linkedlist.entity.LinkList;
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
}
