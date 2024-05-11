package soal_no_4;
import java.util.Arrays;

public class hapusDuplikatArray {
     public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        System.out.println("Array input: " + Arrays.toString(array));

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array setelah menghapus duplikat: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        // Mengurutkan array
        Arrays.sort(array);

        // Menghitung jumlah duplikat
        int duplicateCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                duplicateCount++;
            }
        }

        // Membuat array baru tanpa duplikat
        int[] uniqueArray = new int[array.length - duplicateCount];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                uniqueArray[j++] = array[i];
            }
        }

        // Menambahkan elemen terakhir
        uniqueArray[j] = array[array.length - 1];

        return uniqueArray;
    }
}
