import java.util.Arrays;

public class ArrayList<T>
{

    private T[] array;

    private int size;

    private static final int ARRAYCAP = 2;

    private int maxSize;

    @SuppressWarnings("unchecked")
    ArrayList(int size){
        array = (T[]) new Object[size];
        maxSize = size;
        size = 0;
    }

    ArrayList(){
        array = (T[]) new Object[ARRAYCAP];
        maxSize = ARRAYCAP;
        size = 0;

    }

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

            for(int i = index; i< size-index+1; i++){
                array[i] = array[i+1];
            }

            array[size-1] = null;
            size--;



        }


    }

    public void removeRange(int indexStart, int nIndex) {

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
        ArrayList<Object> e = new ArrayList<>(5);
        e.add(1);
        e.add("2");
        e.add(true);
        e.String();
        e.removeLast();
        e.String();

    }


}

