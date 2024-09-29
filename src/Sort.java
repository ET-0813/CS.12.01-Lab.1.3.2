import java.util.ArrayList;

public class Sort {

    public static int[] bubbleSort(int[] arr) {

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static String[] bubbleSort(String[] arr) {

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j].compareToIgnoreCase(arr[j+1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {

        for(int i = 0; i < list.size(); i++){
            for(int j = 0 ; j < list.size()-1; j++){
                if(list.get(j) > list.get(j+1)){
                    Integer temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        return list;
    }

    public static int[] selectionSort(int[] array) {

        for(int i = 0; i < array.length; i++){
            int min = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;

    }

    public static String[] selectionSort(String[] array) {

        for(int i = 0; i < array.length; i++){
            int min = i;
            for(int j = i+1; j < array.length; j++){
                if(array[min].compareToIgnoreCase(array[j]) > 0){
                    min = j;
                }
            }
            String temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {

        for(int i = 0; i < list.size(); i++){
            int min = i;
            for(int j = i+1; j < list.size(); j++){
                if(list.get(min).compareToIgnoreCase(list.get(j)) > 0){
                    min = j;
                }
            }
            String temp = list.get(min);
            list.set(min, list.get(i));
            list.set(i, temp);
        }
        return list;
    }

}
