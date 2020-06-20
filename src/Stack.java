
public class Stack<T> {

    /*
    * Stack() Default
    * popg()   - return T
    * push()  -
    * peek()
    * empty()

     */

    private ArrayList<T> array;
    private int size;

    public Stack(){
        array = new ArrayList<>();

    }

    public void push(T value) {
        array.add(value);
        size++;
    }

    public void pop(){

        if(size>0) {
            array.remove(size - 1);
            size--;
        }
        else{
            System.out.println("Array Index out of Bounds");

        }



    }

    public void peek(){

        System.out.println(array.get(size-1));


    }

    public boolean isEmpty(){
        if(size ==0){
            return true;
        }
        return false;

    }

    public void string(){

        array.String();
    }


    public static void main(String[] args) {
        Stack<Object> test = new Stack<>();
        test.push(2);
        test.push("3");
        test.push(true);
        test.push("hellooo");
        test.peek();


    }
}
