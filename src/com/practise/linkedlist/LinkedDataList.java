package com.practise.linkedlist;

public class LinkedDataList {
Node head;
    class Node{
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void push(int new_node_data){
        //Node temp=head;
        Node new_node=new Node(new_node_data);
        new_node.next=head;
        head=new_node;
    }

    public static void main(String args[]){
        LinkedDataList x=new LinkedDataList();

        for(int i=60;i>=59;i--){
            x.push(i);
        }
    }
}
