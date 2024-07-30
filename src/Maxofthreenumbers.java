public class Maxofthreenumbers {
    public static void main(String[] args) {
        int i, j, temp;
        int []arr={40,50,90,60};
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length;j++){
                if (arr[i] > arr[j]) {
                    temp= arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }


            }
        }
        System.out.println("1st largest" + arr[arr.length-3]);
        System.out.println("2nd largest" + arr[arr.length-2]);
        System.out.println("3rd largest" + arr[arr.length-1]);
    }
}
