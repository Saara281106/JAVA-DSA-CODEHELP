import java.util.HashMap;

public class HieghestAndLowestFrequency {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 1, 2, 2, 3, 7, 7, 7, 7, 7, 7, 7, 3, 3, 4, 4, 5, 5, 5, 5, 5, 7, 7, 7, 7 };
        int ans[] = getMaxAndMinFreq(arr);

        System.out.println("Element with LOWEST frequency: " + ans[1]);
        System.out.println("Element with HIGHEST frequency: " + ans[0]);

        System.out.println();
    }

    static int[] getMaxAndMinFreq(int arr[]) {

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        int maximumFrequency = Integer.MIN_VALUE;
        int keyWithMaxFreq = -1;

        int minimumFrequency = Integer.MAX_VALUE;
        int keyWithMinFreq = -1;

        for (int key : frequency.keySet()) {
            int currentKey = key;
            int freqOfCurrentKey = frequency.get(key);
            if (freqOfCurrentKey > maximumFrequency) {
                maximumFrequency = freqOfCurrentKey;
                keyWithMaxFreq = currentKey;
            } 
            if (freqOfCurrentKey < minimumFrequency) {
                minimumFrequency = freqOfCurrentKey;
                keyWithMinFreq = currentKey;
            }
        }

        int ans[] = {keyWithMaxFreq , keyWithMinFreq};

        return ans ;
    }
}
