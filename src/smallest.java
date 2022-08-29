public class smallest {
        public static void main(String[] args) {
            int arr[] = new int[]{5,20,50};
            int smallest = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < smallest)
                    smallest = arr[i];
            }
            System.out.println("smallest Number is : " + smallest);
        }
    }
