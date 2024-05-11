package soal_no_7;

public class mengurutkanArraySort {
     private static String[] namaOrang = {"Budi", "Andi", "Caca", "Dimas", "Eka", "Fani", "Gita"};

    public static void main(String[] args) {
        // Menampilkan array nama sebelum diurutkan
        System.out.println("Array sebelum diurutkan:");
        for (String nama : namaOrang) {
            System.out.print(nama + " ");
        }

        // Mengurutkan dengan Insertion Sort
        insertionSort();
        System.out.println("\nArray setelah diurutkan dengan Insertion Sort:");
        for (String nama : namaOrang) {
            System.out.print(nama + " ");
        }

        // Mengurutkan dengan Selection Sort
        selectionSort();
        System.out.println("\nArray setelah diurutkan dengan Selection Sort:");
        for (String nama : namaOrang) {
            System.out.print(nama + " ");
        }

        // Mengurutkan dengan Bubble Sort
        bubbleSort();
        System.out.println("\nArray setelah diurutkan dengan Bubble Sort:");
        for (String nama : namaOrang) {
            System.out.print(nama + " ");
        }
    }

    private static void insertionSort() {
        for (int i = 1; i < namaOrang.length; i++) {
            String key = namaOrang[i];
            int j = i - 1;
            while (j >= 0 && namaOrang[j].compareTo(key) > 0) {
                namaOrang[j + 1] = namaOrang[j];
                j--;
            }
            namaOrang[j + 1] = key;
        }
    }

    private static void selectionSort() {
        for (int i = 0; i < namaOrang.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < namaOrang.length; j++) {
                if (namaOrang[j].compareTo(namaOrang[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = namaOrang[i];
            namaOrang[i] = namaOrang[minIndex];
            namaOrang[minIndex] = temp;
        }
    }

    private static void bubbleSort() {
        for (int i = namaOrang.length - 1; i > 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (namaOrang[j].compareTo(namaOrang[j + 1]) > 0) {
                    String temp = namaOrang[j];
                    namaOrang[j] = namaOrang[j + 1];
                    namaOrang[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
