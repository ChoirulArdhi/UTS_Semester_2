package soal_no_1;
import java.util.Arrays;

public class membalikArray {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Array asli: " + Arrays.toString(array));

        reverseArray(array);

        System.out.println("Array setelah dibalik: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        int awal = 0;
        int akhir = array.length - 1;

        while (awal < akhir) {
            // Menukar elemen pada posisi awal dengan elemen pada posisi akhir
            int hasil = array[awal];
            array[awal] = array[akhir];
            array[akhir] = hasil;

            // Memindahkan indeks awal ke kanan dan indeks akhir ke kiri
            awal++;
            akhir--;
        }
    }
    
}
