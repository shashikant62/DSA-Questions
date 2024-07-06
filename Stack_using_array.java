class Stack_using_array{
    static int s[]=new int[1000];
    static int top=0;
    public static class stack{
        stack(){
            top=-1;
        }

        void push(int data){
            if(top==s.length){
                System.out.println("stack is full");
                return ;
            }
            s[++top]=data;
        }

        int  pop(){
            if(top==-1){
                System.out.println("stack is empty");
                return -1;
            }
            return s[top--];
        }

        boolean isempty(){
            if(top==-1){
                return true;
            }
            return false;
        }

        boolean isfull(){
            if(top==s.length){
                return true;
            }
            return false;
        }

        int peek(){
            if(top==-1){
                System.out.println("empty");
                return -1;
            }
            return s[top];
        }
        
        void print(){ 
        for(int i = top;i>-1;i--){ 
            System.out.print(" "+ s[i]); 
        } 
       }}

    public static void main(String args[]){
        stack obj=new stack();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.peek());
        obj.print();
    }
}
