public class BinaryTree <T>{


    private final static int NODE = 0;

    ArrayList<Object> tree = new ArrayList<>();

    private int elementsInTree = 0;


    public void add(T value){
        if(elementsInTree == 0){
            tree.add(value);
            elementsInTree++;

        }
    }


}


