import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    static void Bucket_sort(float arr[]) {
        int n = arr.length;
        ArrayList<Float>[] buckets = new ArrayList[n];
        // Creat empty buckets
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }
        // Now add element into buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * 10;
            buckets[bucketIndex].add(arr[i]);
        }
        // Sort each bucket indivijually
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }
        // Merger all buckets to get final sorted array
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currentBuckets = buckets[i];
            for (int j = 0; j < currentBuckets.size(); j++) {
                arr[index++] = currentBuckets.get(j);
            }
        }
    }

    public static void main(String[] args) {
        float arr[] = { 0.5f, 0.4f, 0.3f, 0.2f, 0.1f };
        Bucket_sort(arr);
        for (float f : arr) {
            System.out.print(f + " ");
        }
    }
}
