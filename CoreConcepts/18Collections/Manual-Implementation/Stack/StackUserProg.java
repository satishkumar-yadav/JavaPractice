class StackUserProg{
    public static void  main(String []args){
        Stack s = new Stack();   // Last in First Out

        s.push(20);
        s.push(30);
        s.push(50);
        s.push(80);

        System.out.println(s.size());

        System.out.println(s.peek());

        System.out.println(s.pop());
        System.out.println(s.pop());

        System.out.println(s.peek());

        System.out.println(s.isEmpty());
    }
}