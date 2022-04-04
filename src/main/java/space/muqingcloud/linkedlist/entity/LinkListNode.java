package space.muqingcloud.linkedlist.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinkListNode {
    private Integer value;
    private LinkListNode next;
    private LinkListNode previous;
}
