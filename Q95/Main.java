package Q95;

public class Main {
    public static void main(String[] args) {

        MyStack stack = new MyStack();
        MyQueue queue = new MyQueue();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            queue.enqueue(i + 5);
        }
        for (int i = 0; i < 5; i++) {
            queue.enqueue(queue.front() - stack.top());
            stack.pop();
            queue.dequeue();
        }
    }
}
