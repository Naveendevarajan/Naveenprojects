public class Smallestandlargestnumber {
    public static void main(String[] args) {
        {
            int i, j, temp;
            int []arr={42,445547,784857,145142,78448};
            for (i = 0; i < arr.length; i++) {
                for (j = i; j < arr.length;j++){
                    if (arr[i] < arr[j]) {
                        temp= arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }


                }
            }
            System.out.println("largest:" + arr[arr.length-3]);
            System.out.println("smallest:" + arr[arr.length-1]);
        }
    }
}
