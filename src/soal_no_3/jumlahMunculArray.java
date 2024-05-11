package soal_no_3;
import java.util.HashMap;
import java.util.Map;

public class jumlahMunculArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 4, 2, 1};
        
        //Menghitung kemunculan tiap elemen dalam array dan menyimpan hasilnya
        Map<Integer, Integer> occurrences = countOccurrences(array);

        System.out.println("Array input: " + arrayToString(array));
        System.out.println("Jumlah kemunculan setiap elemen:");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> countOccurrences(int[] array) {
        //Menyimpan jumlah kemunculan tiap elemen
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int num : array) {
            if (occurrences.containsKey(num)) {
                // Jika elemen sudah ada di map, tambahkan 1 ke jumlah kemunculannya
                occurrences.put(num, occurrences.get(num) + 1);
            } else {
                // Jika elemen belum ada di map, tambahkan dengan jumlah kemunculan pertama (1)
                occurrences.put(num, 1);
            }
        }

        return occurrences;
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
