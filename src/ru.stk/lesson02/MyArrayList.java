import java.util.Arrays;

public class MyArrayList implements ArrayList{

    private int size;
    private Integer[] array;

    public MyArrayList(){
        this.size = 0;
        array = new Integer[size];
    }

    @Override
    public Integer getSize(){
        return size;
    }

    @Override
    public Integer get(Integer index){
        if (!checkIndex(index)){ return null; };

        return array[index];
    }

    @Override
    public void add(int value){
        grow();
        array[size] = value;
        size++;
    }

    @Override
    public Integer remove (int index){

        if (!checkIndex(index)){ return null; };

        Integer removed = array[index];
        System.arraycopy(array, index + 1, array, index, size - 1 - index);

        array[size - 1] = null;
        size--;
        return removed;
    }

    @Override
    public Integer search (Integer value){
        for (int i = 0; i < size; i++) {
            if (value.equals(array[i])){
                return i;
            }
        }
        return null;
    }

    private void grow() {
        int newSize;
        if (size == 0){
            newSize = 1;
        } else {
            newSize = size * 2;
        }

        if (array.length == size) {
            array = Arrays.copyOf(array, newSize);
        }
    }

    private boolean checkIndex(int index){
        return index >= 0 && index < size;
    }

}
