import java.util.TreeSet;

public class Leet_3510 {

    private long flipped;
    private int[] left;// -1 0 1 2 3
    private int[] right;// 1 2 3 4 5
    private TreeSet<long[]> pairSum;

    public int minimumPairRemoval(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return 0;

        long[] array = toLongArray(nums);
        initLinks(n);
        initPairSum(array, n);
        
        int ops = 0;
        while (flipped > 0 && !pairSum.isEmpty()) {
            int i = (int) pairSum.pollFirst()[1];
            mergeAt(i, array, n);
            ops++;
        }
        return ops;
    }

    private long[] toLongArray(int[] nums) {
        long[] arr = new long[nums.length];
        for (int i = 0; i < nums.length; i++)
            arr[i] = nums[i];
        return arr;
    }

    private void initLinks(int n) {
        left = new int[n];
        right = new int[n];
        for (int i = 0; i < n; i++) {
            left[i] = i - 1;
            right[i] = i + 1;
        }
    }

    private void initPairSum(long[] array, int n) {
        flipped = 0;
        pairSum = new TreeSet<>((a, b) -> {
            if (a[0] != b[0])
                return Long.compare(a[0], b[0]);
            return Long.compare(a[1], b[1]);
        });

        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1])
                flipped++;
            pairSum.add(new long[] { array[i] + array[i + 1], i });
        }
    }

    private void mergeAt(int i, long[] array, int n) {
        int j = right[i];
        int h = left[i];
        int k = right[j];

        removePair(h, n, array);
        if (array[i] > array[j])
            flipped--;
        removePair(j, n, array);

        array[i] += array[j];
        right[i] = k;
        if (k < n)
            left[k] = i;

        addPair(h, n, array);
        addPair(i, n, array);
    }

    private void addPair(int i, int n, long[] array) {
        if (i >= 0 && i < n) {
            int j = right[i];
            if (j < n) {
                pairSum.add(new long[] { array[i] + array[j], i });
                if (array[i] > array[j])
                    flipped++;
            }
        }
    }

    private void removePair(int i, int n, long[] array) {
        if (i >= 0 && i < n) {
            int j = right[i];
            if (j < n) {
                long[] target = new long[] { array[i] + array[j], i };
                if (pairSum.remove(target)) {
                    if (array[i] > array[j])
                        flipped--;
                }
            }
        }
    }

}
