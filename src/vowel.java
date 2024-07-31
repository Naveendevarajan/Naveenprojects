public class vowel {
    public static void main(String[] args) {
        String[] input = {"apple",
                "ball", "collection", "meeting"};


        for (int i = 0; i <input.length;i++) {
            int count=0;
            for(int j=0;j< input[i].length();j++){
            if (input[i].charAt(j) == 'a' || input[i].charAt(j) == 'e' || input[i].charAt(j) == 'i' || input[i].charAt(j) == 'o' || input[i].charAt(j) == 'u') {
                count++;
            }

        }
            System.out.println(input[i]+"="+count);
    }
}
}