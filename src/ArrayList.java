import java.util.Arrays;

public class ArrayList<T>
{


    private T[] array;
    /* variable "array" defines an array of "T"
     */
    private int currentSize;
    /* variable "size" defines the current element size
     * within the arraylist. As an object is added onto the list
     * size will get incremented by one. As an objeect is removed
     * from the arraylist, size will get decremented by one.
     */

    private static final int GENERIC_ARRAY_SIZE = 5;
    /* This defines the generic size of the array when this class is called.
     * For instance if a use calls for the class, without providing a paramater
     * as to how large they want the array to be, it will be assigned a size
     * of five.
     */

    private int maxSize;
    /* maxSize defines the size the arraylist can not surpass, unless of course
     * it is forced to resize. Every time the resize method is called, maxSize
     * is potential to change.
     */

    private int rangeStart, rangeEnd;

    @SuppressWarnings("unchecked")
    ArrayList(int size){
        array = (T[]) new Object[size];
        maxSize = size;
        currentSize = 0;
    }
    /* Constructor in which the user can pass the size the wish the
     * arraylist to be.
     * maxSize by default is set to the "size" parameter that the user
     * passes in.
     */


    ArrayList(){
        array = (T[]) new Object[GENERIC_ARRAY_SIZE];
        maxSize = GENERIC_ARRAY_SIZE;
        currentSize = 0;

    }
    /*
        add value method, takes in the parameter value.
        It will first check if the arraylist is full. If
        the boolean method arrayIsFull() returns back true,
        it will continue to add the 'T' value in the next available
        indice.
        However, if arrayIsFull() returns back asa false, it will
        call for the resizeToGreaterLength() method in which it will
        double the size of the current list.
     */

    public void add(T value){
            if(arrayIsFull()) {
                array[currentSize] = value;
                currentSize++;
            }
            else{
                resizeToGreaterLength(maxSize*2);
                add(value);


            }
    }


    /*
        Simple boolean method which returns true, if the arraylist
        isn't at its max capacity, and returns false if it is full.

     */

    private boolean arrayIsFull(){
        if(currentSize < (maxSize) == true){
            return true;
        }
        return false;
    }



    /*
        For loop that displays all contents within the arraylist.
     */
    public void String(){
        for (int i = 0; i < currentSize; i++) {
            System.out.print(array[i] + " ");

        }
    }
    /*
        Method removeLast() will remove the last value within the arraylist.
     */

    public void removeLast(){
        array[currentSize] = null;
        currentSize--;

    }


        /*
            This method resizes the arraylist to the length of
            newSize.
            It first creates a new List, then it adds the contents
            of the previous list onto the new list, and completely
            replacing the old list, with the new list.k
         */
    private void resizeToGreaterLength(int newSize){

        T[] temporary = (T[]) new Object[newSize];

        System.arraycopy(array,0,temporary,0, currentSize);
        maxSize = newSize;
        array = temporary;



    }


    public void resizeToShorterLength(int size){
        if(size < (maxSize/3)){
            array = Arrays.copyOf(array, array.length / 2);
        }

    }

    private boolean validateRange(int validateIndex){
        if(validateIndex< currentSize){
            return true;

        }
        return false;

    }

    public void remove(int index){
        if(currentSize ==0) {
            System.out.print("-1");
            System.exit(0);

        }
        if(validateRange(index)){

            array[index] = null;

            for(int i = index; i< currentSize -index; i++){
                array[i] = array[i+1];
            }

            array[currentSize -1] = null;
            currentSize--;



        }


    }


    public T get(int index) {
        if (index >= 1) {
            return array[index];
        }


            return array[index];

    }



    private boolean isEmpty(){
        if(currentSize ==0){
            return true;
        }
        return false;
    }

    public int size() {
        return currentSize;
    }


    public int returnMaxSize(){
        return maxSize;
    }


    public static void main(String[] args) {
        ArrayList<Object> e = new ArrayList<>();
        e.add(1);
        e.add(2);
        e.add(3);
        e.String();
        System.out.println();
        e.remove(0);

        e.String();
        System.out.println();

        e.add(3);

        e.String();
        System.out.println();
        e.add(4);

        e.String();

        e.remove(0);

        System.out.println();
        e.String();


        System.out.println();
        e.String();
        System.out.println();
        e.String();
        e.remove(1);
        e.String();
        e.remove(1);
        e.remove(1);
        e.remove(1);
        e.remove(1);
        e.remove(1);
        e.remove(1);
        System.out.println();
        e.String();
        e.remove(1);
        System.out.println();
        e.String();
        e.remove(0);
        System.out.println();
        e.String();
        e.removeLast();
        e.removeLast();
        System.out.println();
        e.String();





    }

}

