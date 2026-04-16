
public class Stack {
    private Object[] arr;
    private int count;

    public Stack(){
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

    public void push(Object o) {
        if (count >= arr.length)
            increase();
        arr[count++] = o;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty(){return count==0;}

    public Object peek(){
       // System.out.println(count);
        return arr[count-1];}

    public Object pop(){
          Object ele= arr[count-1];
          arr[count] = null;
          count--;
          return ele; 
    }

}
