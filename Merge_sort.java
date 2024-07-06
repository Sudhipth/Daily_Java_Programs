package Daily_Problem;

public class Merge_sort {
    static int arr[] = {20, 10, 30, 50, 60, 5, 80, 25};

    public static void main(String[] args) {
        int[] sortedArray = mergeSort(0, arr.length - 1, arr);
        for (int i : sortedArray) {
            System.out.print(i + " ");
        }
    }

    static int[] mergeSort(int s, int l, int ans[]) {
        if (s == l) {
            return new int[]{ans[s]};
        }
        int mid = (s + l) / 2;
        int arr1[] = mergeSort(s, mid, ans);
        int arr2[] = mergeSort(mid + 1, l, ans);
        return merge(arr1, arr2);
    }

    static int[] merge(int arr1[], int arr2[]) {
        int ans[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                ans[k++] = arr1[i++];
            } else {
                ans[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            ans[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            ans[k++] = arr2[j++];
        }

        return ans;
    }
}
