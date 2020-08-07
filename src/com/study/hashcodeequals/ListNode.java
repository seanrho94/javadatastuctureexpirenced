package com.study.hashcodeequals;

import com.sun.xml.internal.ws.util.xml.CDATA;

public class ListNode {
    int data;
    ListNode next;
    public ListNode(){}
    public ListNode(int val,ListNode next){
        this.next=next;
        this.data=val;
    }
    public ListNode(int val){
        this.data= val;
        this.next = null;

    }
   public static ListNode head=null;
    public static ListNode tail=null;

    public ListNode(ListNode val){
        this.next= val;

    }

    public static void main(String args[]){
        ListNode p=new ListNode(2,new ListNode(4,new ListNode(3,null)));
        ListNode q=new ListNode(5,new ListNode(6,new ListNode(4,null)));
        int carry=0;
        int sum=0;
        //ListNode sumd=new ListNode(0,null);
        ListNode data=null;
        while(p!=null && q!=null){
            sum=p.data+q.data+carry;
            carry=sum/10;
            //carry.data=sum%10;


            p=p.next;
            q=q.next;
            if(data==null){
                data=new ListNode(sum%10);
                head=data;
                tail=data;


            }else{
                data=new ListNode(sum%10);
         tail.next=data;
            tail=data;
            }
            //data=data.next;

        }
        ListNode current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
