class LinkedList{
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }

    public static class ll{
    node head=null;
    node tail=null;
    void insert(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return ;
        }
        newnode.next=head;
        head=newnode;
    }

    void insertend(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return ;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    void insertmiddle(int data,int position){
        node newnode=new node(data);
        if(position==1 || head==null){
            newnode.next=head;
            head=newnode;
            return;
        }
        node curr=head;
        for(int i=1;i<position-1 && curr.next!=null;++i){
            curr=curr.next;
        }
        newnode.next=curr.next;
        curr.next=newnode;
    }

    //delation of ll
    void delathead(){
        if(head==null){
            return;
        }
        node temp=head;
        head=temp.next;
    }

    void del_at_tail(){
        if(head==null){
            return;
        }
        node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    // void del_at_position(int position){
    //     if(head==null){
    //         return;
    //     }
    //     node temp=head;
    //     for(int i=1;i<position && temp!=null;i++){
    //         temp=temp.next;
    //     }
    //     temp.next=null;
    // }
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
    public static void main(String args[]){
        ll l=new ll();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        // l.insertend(1);
        // l.insertend(2);
        // l.insertend(3);
        // l.insertend(4);

        // l.insertmiddle(2,1);
        // l.insertmiddle(3,2);
        // l.insertmiddle(4,3);
        // l.insertmiddle(5,4);
        // l.insertmiddle(35,3);
        l.display();
        // l.delathead();
        // l.delathead();
        // l.display();

        // l.del_at_tail();
        // l.del_at_tail();
        l.display();
    }
}