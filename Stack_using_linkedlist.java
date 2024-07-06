class Stack_using_linkedlist{
 public static class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
 }
 public static class stack{
 node head=null;
 void push(int data){
    node newnode=new node(data);
    if(head==null){
        head=newnode;
        return;
    }
    newnode.next=head;
    head=newnode;
 }
 int pop(){
    // node temp=head;
    if(head==null){
        return -1;
    }
    int x=head.data;
    head=head.next;
    return x;
 }

 void display(){
    node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
 }
 }
 public static void main(String args[]){
    stack o=new stack();
    o.push(1);
    o.push(2);
    o.push(3);
    o.display();
    System.out.println();
    o.pop();
    o.display();
 }
}