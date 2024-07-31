public class Commomnumbers {
    public static void main(String[] args) {

        int[] array1 = {350, 450, 250};
        int[] array2 = {850, 750, 540, 250};
        int[] array3 = {450, 250, 350, 471};
        for (int i = 0; i < array1.length; i++) {
            for (int j = -0; j < array2.length; j++) {
                for (int k = 0; k < array3.length; k++) {
                   if (array1[i] == array2[j] && array2[j] == array3[k]&&array3[k]==array1[i]) {
                        System.out.println("The common number in the given array is " + array1[i]);
                    }
                }
            }

        }
    }
}