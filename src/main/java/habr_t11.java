public class habr_t11 {
    public static void main(String[] args) {
        double[] array = new double[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        bubbleSort(array);
    }
    private static void bubbleSort(double[] array){
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for(double item : array)
        System.out.println(item);
    }
}
