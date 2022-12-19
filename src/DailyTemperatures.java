import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures){
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for (int i=1;i< temperatures.length;i++){
            while (!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                answer[stack.peek()]=i-stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        return answer;
    }
}
