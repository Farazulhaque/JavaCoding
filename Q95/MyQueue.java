package Q95;

public class MyQueue {
    private int[] array;
    private int f;
    private int r;

    public MyQueue() {
        array = new int[10];
        f = r = -1;
    }

    public boolean isEmpty() {
        if (f == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (r == array.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return r;
    }

    public int front() {
        return f;
    }

    public int rear() {
        return r;
    }

    public void enqueue(int item) {
        if (!isFull()) {
            f = 0;
            array[++r] = item;
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            int item = array[f]; // item at front is copied
            for (int i = f; i < r; i++) {// remaining all items shifted towards frontend
                array[i] = array[i + 1];
            }
            r--;
            if (r == -1) // if q has only one item and that is being removed
                f = -1;

            System.out.println(item);
        }
    }
}
