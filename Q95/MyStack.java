package Q95;

public class MyStack {
    private int[] array;
    private int t;

    public MyStack() {
        array = new int[10];
        t = -1;
    }

    public boolean isEmpty() {
        if (t == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (t == array.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return t;
    }

    public int top() {
        return array[t];
    }

    public void push(int item) {
        if (!isFull()) {
            t++;
            array[t] = item;
        }
    }

    public void pop() {
        if (!isEmpty()) {
            System.out.println(array[t]);
            t--;
        }
    }
}
