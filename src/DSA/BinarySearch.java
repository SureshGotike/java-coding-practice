package DSA;
class BinarySearch {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean found = binarySearch.search(a, 2);
        System.out.println(found);
    }

    private boolean search(int[] a, int key) {
        if (a.length == 0) {
            return false; // Base case for empty array
        }

        int mid = a.length / 2;

        if (key == a[mid]) {
            return true; // Found the key
        }

        if (key < a[mid]) {
            int[] leftArray = new int[mid];
            for (int i = 0; i < mid; i++) {
                leftArray[i] = a[i];
            }
            return search(leftArray, key); // Return result of left search
        } else {
            int[] rightArray = new int[a.length - mid - 1]; // Fix length for right array
            for (int i = mid + 1; i < a.length; i++) {
                rightArray[i - mid - 1] = a[i]; // Adjust index for right array
            }
            return search(rightArray, key); // Return result of right search
        }
    }
}
