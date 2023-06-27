import java.util.LinkedList;

public class StackUsingLinkedList {

    public class Stack{


    }

    public int push(LinkedList<Integer> stack, int number){
        stack.addLast(number);
        return stack.size();
    }
    public int pop(LinkedList<Integer> stack){
        if (stack.size()==0){
            return -1;
        }
        int number = stack.pollFirst();
        return number;
    }
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();

        for (int i=0; i<10; i++){
            System.out.println("The size of stack : " + stackUsingLinkedList.push(stack, i));
            System.out.println(stack.get(i));
        }
        for (int i=1; i<=10; i++){
            System.out.println("The size of stack : " + stackUsingLinkedList.push(stack, i));
        }


    }
}
