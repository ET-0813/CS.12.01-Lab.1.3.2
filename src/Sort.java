import java.util.ArrayList;

public class Sort {

    public static int[] bubbleSort(int[] arr) {
        int temp;
        for(int i =0; i<arr.length -1; i++){

            for(int j=0; j<arr.length -1 - i; j++){

                if(arr[j] > arr[j+1]){

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        return arr;

    }

    public static String[] bubbleSort(String[] arr) {
        String temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {

        int temp;
        for(int i =0; i<list.size() - 1; i++){

            for (int j = 0; j < list.size() - 1 - i; j++) {

                if (list.get(j) > list.get(j+1)) {

                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j + 1, temp);

                }
            }
        }
        return list;

    }

    public static int[] selectionSort(int[] array) {

        for(int i = 0; i<array.length -1; i++){
            int minIndex = i;
            for(int j = i+1; j<array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static String[] selectionSort(String[] array) {


            for (int i = 0; i < array.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j].compareTo(array[minIndex]) < 0) {
                        minIndex = j;
                    }
                }
                String temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
            return array;



    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {

        for(int i = 0; i<list.size() -1; i++){
            int minIndex = i;
            for(int j = i+1; j<list.size(); j++){
                if(list.get(j).compareTo(list.get(minIndex)) < 0){
                    minIndex = j;
                }
            }
            String temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
        return list;

    }

}
