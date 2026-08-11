import java.util.HashMap;

public class ModeOfArray {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 1, 2, 2, 3, 7, 7, 7, 7, 7, 7, 7, 3, 3, 4, 4, 5, 5, 5, 5, 5, 7, 7, 7, 7 };
        int ans = getMode(arr);

        System.out.println("The mode of the array is: " + ans);

        // getMode(arr);

        System.out.println();
    }

    static int getMode(int arr[]) {

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        int maximumFrequency = -1;
        int keyWithMaxFreq = -1;
        for (int key : frequency.keySet()) {
            int currentKey = key;
            int freqOfCurrentKey = frequency.get(key);
            if (freqOfCurrentKey > maximumFrequency) {
                maximumFrequency = freqOfCurrentKey;
                keyWithMaxFreq = currentKey;
            }
        }

        return keyWithMaxFreq;
    }
}
