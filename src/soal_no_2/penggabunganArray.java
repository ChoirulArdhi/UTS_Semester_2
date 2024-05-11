package soal_no_2;
import java.util.Arrays;

public class penggabunganArray {
     public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Array pertama: " + Arrays.toString(array1));
        System.out.println("Array kedua: " + Arrays.toString(array2));
        System.out.println("Array yang digabungkan: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;

        // Membuat array baru dengan ukuran total elemen dari kedua array
        int[] mergedArray = new int[length1 + length2];

        // Menyalin elemen array pertama ke array baru
        System.arraycopy(array1, 0, mergedArray, 0, length1);

        // Menyalin elemen array kedua ke array baru, mulai dari posisi akhir array pertama
        System.arraycopy(array2, 0, mergedArray, length1, length2);

        return mergedArray;
    }
}
