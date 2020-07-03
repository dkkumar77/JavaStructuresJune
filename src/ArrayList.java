import java.util.Arrays;

public class ArrayList<T>
{


    private T[] array;
    /* variable "array" defines an array of "T"
     */
    private int size;
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
        size = 0;
    }
    /* Constructor in which the user can pass the size the wish the
     * arraylist to be.
     * maxSize by default is set to the "size" parameter that the user
     * passes in.
     */


    ArrayList(){
        array = (T[]) new Object[GENERIC_ARRAY_SIZE];
        maxSize = GENERIC_ARRAY_SIZE;
        size = 0;

    }
    /*


     */

    public void add(T value){
            if(arrayIsFull()) {
                array[size] = value;
                size++;
            }
            else{
                resizeToGreaterLength(maxSize*2);
                add(value);


            }
    }


    private boolean arrayIsFull(){
        if(size < (maxSize) == true){
            return true;
        }
        return false;
    }



    public void String(){
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
    }

    public void removeLast(){
        array[size] = null;
        size--;

    }
    private void resizeToGreaterLength(int newSize){

        T[] temporary = (T[]) new Object[newSize];

        System.arraycopy(array,0,temporary,0,size);
        maxSize = newSize;
        array = temporary;



    }


    public void resizeToShorterLength(int size){
        if(size < (maxSize/3)){
            array = Arrays.copyOf(array, array.length / 2);
        }

    }

    private boolean validateRange(int validateIndex){
        if(validateIndex<size){
            return true;

        }
        return false;

    }

    public void remove(int index){
        if(size==0) {
            System.out.print("-1");
            System.exit(0);

        }
        if(validateRange(index)){

            array[index] = null;

            for(int i = index; i< size-index; i++){
                array[i] = array[i+1];
            }

            array[size-1] = null;
            size--;



        }


    }


    public T get(int index) {
        if (index >= 1) {
            return array[index];
        }


            return array[index];

    }



    private boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }

    public int size() {
        return size;
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
        e.add(1);
        e.add(1);
        e.add(1);
        e.add(1);
        e.add(1);
        e.add(1);
        e.add(1);
        e.add(1);
        e.add(1);





    }

}

