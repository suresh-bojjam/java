package snippets3;

/**
 * Created by root on 13/3/16.
 */
public class StackImpementation {

    int stack[]=new int[10];
    int tos;

    StackImpementation(){
        tos=-1;
    }

    void push(int data){
        if(tos==9){
            System.out.printf("Stack is Full");
            System.exit(0);
        }
        System.out.println("push data = " + data);
        stack[++tos]=data;
    }

    int pop(){
        if(tos<0)
        {
            System.out.println("Stack is empty");
            System.exit(0);
        }
        System.out.println("pop data"+stack[tos]);
        return stack[tos--];
    }

    public static void main(String[] args) {
        StackImpementation st=new StackImpementation();
        st.push(5);
        st.push(10);
        System.out.println("Display Stack Contents");
        for (int d:st.stack) {
            System.out.println("d = " + d);
        }
        st.pop();
        st.pop();
        st.pop();
    }
}
