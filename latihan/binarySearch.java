public class binarySearch {
        public static void main(String[] args) {
                int[] data = { 10, 14, 19, 27, 33, 35, 42, 44 };
                int key = 32;
                boolean found = false;
                int low = 0, mid = 0, high = 0;

                high = data.length - 1;
                while (low <= high && !found) {
                        mid = (high + low) / 2;
                        if (data[mid] > key) {
                                high = mid - 1;
                        } else if (data[mid] < key) {
                                low = mid + 1;
                        } else if (data[mid] == key) {
                                found = true;
                        } else if (low > high) {
                                break;
                        }

                }
                if (found) {
                        System.out.println("found at index" + mid);
                } else if (!found) {
                        System.out.println("not found");
                }

                // find middle of array by averaging
                // assign y to the result of average
                // put x, y, z pointers
                // if target is bigger than key. point z to y-1
                // if target is smaller than key. point x to y+1
        }
}
