public class SecondLargest {
    public static void main(String[] args) {
        int temp, size;
        int a[] = {10,67,25,63,96};
        size = a.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("second largest= " + a[size- 2]);
    }
}