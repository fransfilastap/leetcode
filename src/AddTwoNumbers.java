import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode firstNodePointer = l1;
        ListNode secondNodePointer = l2;
        int savedDigit = 0;
        ListNode head = null;
        ListNode pointer = null;
        while((firstNodePointer != null || secondNodePointer != null) || savedDigit > 0){
            ListNode temp = null;
            int sum =0;

            if(firstNodePointer !=null) sum += firstNodePointer.val;
            if(secondNodePointer !=null) sum += secondNodePointer.val;

            sum += savedDigit;

            if(sum > 9){
                String[] sSum = String.valueOf(sum).split("");
                savedDigit = Integer.valueOf(sSum[0]);
                temp = new ListNode(Integer.valueOf(sSum[1]));
            }else {
                savedDigit=0;
                temp = new ListNode(sum);
            }

            if(pointer==null) {
                pointer = temp;
                head=pointer;
            }else {
                pointer.next = temp;
                pointer = pointer.next;
            }

            if(firstNodePointer!=null) firstNodePointer = firstNodePointer.next;
            if(secondNodePointer!=null) secondNodePointer = secondNodePointer.next;
        }

        return head;
    }

    public static void main(String ...args){
        ListNode l1 = ListNode.createListNode(new int[]{9,9,9,9,9,9,9});

        ListNode l2 = ListNode.createListNode(new int[]{9,9,9,9});

        AddTwoNumbers atn = new AddTwoNumbers();

        ListNode result = atn.addTwoNumbers(l1,l2);

        ListNode temp=result;
        while(temp!= null){
            System.out.print(temp.val);
            temp=temp.next;
        }
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }

    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    public static ListNode createListNode(int... numbers){
        ListNode headNode = new ListNode(numbers[0]);
        ListNode pointer = headNode;
        for (int i=1;i<numbers.length;i++){
            pointer.next = new ListNode(numbers[i]);
            pointer = pointer.next;
        }

        return headNode;
    }
}
