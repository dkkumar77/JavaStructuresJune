


public class Queue <T>  {



    private ArrayList<T> e;
    private final static int HEAD = 0;

    private int queueCap;
    private int queueElements;
    /*
    * Queue will start at size 5 capacity, if needed, it will be adjusted if
    * the value of capacity (number of data in queue) is greater than than the
    * maxValue of the queue;
     */

    public Queue(){

        e = new ArrayList<>(5);
        queueCap = 0;
        queueElements = 0; //current elements in the queue;

    }


    public void add(T value){
        e.add(value);

    }

    public void remove(){
        e.remove(0);

    }

    public T peek(){
        return e.get(HEAD);
    }

    public void String(){
        e.String();
    }
    public static void main(String[] args) {
        Queue<Object> e = new Queue<>();
        e.add(1);
        e.add(2);
        e.add(3);
        e.String();
        System.out.println();


        System.out.println(e.peek());

        e.remove();
        System.out.println(e.peek());
        e.remove();
        System.out.println(e.peek());
        e.remove();
        System.out.println(e.peek());



    }


}
