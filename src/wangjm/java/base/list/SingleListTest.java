package wangjm.java.base.list;

import java.util.Collection;

//单链表
public class SingleListTest {
    public static void main(String[] args) {

        Node node1 = new Node("node1");
        Node node2 = new Node("node2");
        Node node3 = new Node("node3");

        SingleNode singleNode = new SingleNode();
        singleNode.appendNode(node1);
        singleNode.appendNode(node2);
        singleNode.appendNode(node3);

        singleNode.printNode();
        System.out.println(singleNode.len());//3
        //System.out.println(singleNode.getNodeByPos(3));

        Node addNewNode = new Node("addNode");
        singleNode.addNode(addNewNode,1);

        Node addNewNode1 = new Node("addNewSecondNode");
        singleNode.addNode(addNewNode1,3);

        singleNode.printNode();
        System.out.println(singleNode.len());
    }
}

class SingleNode{

    //定义头节点
     static Node head = new Node("headNode");
    //链表长度
    //private static int len = 0;

    //在链表结尾添加新节点
    public void appendNode(Node node){
        //当前节点
        Node curNode = head;

        //从头节点开始添加
        if(head.next == null){
            //如果头节点的next为null,则将head.next指向新增的第一个节点
            head.next = node;
        }else {// 如果head.next非空,找到链表最后一个节点
            while(curNode.next != null){
                //从head往后查找最后一个节点
                curNode = curNode.next;
            }
            curNode.next = node;
        }
    }

    //打印节点
    public void printNode(){
        Node curNode = head;
        while (curNode.next != null){
            System.out.println(curNode.next);
            curNode = curNode.next;
        }
    }

    //在链表中间添加新节点(在链表第i个节点后插入元素)
    public void addNode(Node node,int i){
        SingleNode singleNode = new SingleNode();
        //tmp存放要插入目标节点后
        Node targetNode = singleNode.getNodeByPos(i);
        if (targetNode != null){
            Node temp = targetNode;
            //targetNode.next = node;
            node.next = temp.next;//指向后一个节点
            //前一个节点指向新插入节点
            targetNode.next = node;
        }else {
            System.out.println("未找到目标节点...");
        }

    }

    //删除指定节点(? 根据什么来删除)
    public void deleteNode(){

    }

    //查找节点(根据第i个位置)
    public Node getNodeByPos(int pos){
        Node targetNode = head;
        int curLen = 0;
        if (pos>len()){
            System.out.println("查找的元素位置超过元素链表长度");
            //break;
            return null;
        }else {
            while (curLen<pos){
                targetNode = targetNode.next;
                curLen++;
            }
            return targetNode;
        }
    }

    //链表长度
    public static int len(){

        int len = 0;
        //定义当前指针所指节点
        Node curNode = head;

        //空链表
        if (head.next == null){
            len = 0;
            return len;
        }

        while(curNode.next != null){
            curNode = curNode.next;
            len++;
        }
        return len;
    }
}

//定义单链表节点
class Node{
    String data;
    Node next;

    //构造函数
    public Node(String data) {
        this.data = data;
    }

    public Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }

    //重写toString()
    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + '\'' +
                ", next=" + next +
                '}';
    }
}