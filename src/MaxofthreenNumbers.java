public class MaxofthreenNumbers {
    public static void main(String[] args) {
        int i, j, temp;
        int []arr={1452,4574,12547,45458,1245115,457451,325415,32541,25415};
        for (i = 0; i < arr.length; i++) {
            for (j = i; j < arr.length;j++) {
                if (arr[i] > arr[j]) {
                    temp= arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println("1st largest"+arr[arr.length-1]);
        System.out.println("2nd largest"+arr[arr.length-2]);
        System.out.println("3rd largest"+arr[arr.length-3]);
    }
}
