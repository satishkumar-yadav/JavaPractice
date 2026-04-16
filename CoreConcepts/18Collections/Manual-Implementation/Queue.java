public class Queue {
    private Object[] arr;
    private int count;

    public Queue(){
        arr = new Object[5]; 
        count=0;
    }

    private void increase() {
        Object[] temp = new Object[arr.length + (arr.length / 2)];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public void add(Object o) {
        if (count >= arr.length)
            increase();
        arr[count++] = o;
    }

    public int size() { return count; }

    public boolean isEmpty() {  return count == 0; }

    public Object peek() {  return arr[0];  }

    public Object poll() {
        Object ele = arr[0];
        for (int i = 0; i < size(); i++) {
            arr[i] = arr[i+1];
        }

       // arr[count] = null;
        count--;
        return ele;
    }
}
