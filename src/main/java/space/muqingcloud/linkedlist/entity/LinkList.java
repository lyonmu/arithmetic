package space.muqingcloud.linkedlist.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkList {
    private LinkListNode linkHead;
    private LinkListNode linkTail;
    private Integer length;
}
