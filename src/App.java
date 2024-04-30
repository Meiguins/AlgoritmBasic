public class App {

    public class BubbleSort {
        // Método para ordenar um array usando Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                   // Compara o elemento atual com o próximo elemento
                    if (array[j] > array[j + 1]) {
                        // Troca os elementos se estiverem na ordem errada
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Array antes da ordenação:");
        printArray(array);
        
        bubbleSort(array);
        
        System.out.println("Array depois da ordenação:");
        printArray(array);
        }
    }
}