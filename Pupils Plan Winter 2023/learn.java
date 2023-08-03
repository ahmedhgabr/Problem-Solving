public class vods {

    // Bubble Sort - 0(nA2)
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            flag = true;
            for (int j = 0; j < n; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    flag = false;
                }
            }
            if (flag)
                break;
        }
        
    }



}