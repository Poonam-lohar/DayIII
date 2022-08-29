public class OddPosition {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 7, 8, 9, 10, 2, 4, 6, 1};
        System.out.println("Elements of array present on odd position");
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);

        }
    }
}