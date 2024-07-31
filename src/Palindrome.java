public class Palindrome {
    public static void main(String args[]) {
        String input[]={"racecar","man","madam","question"};
        char character;
        for(int i=0;i<4;i++){
            String reverse="";
            for (int j=0;j<input[i].length();j++){
                character=input[i].charAt(j);
                reverse=character+reverse;
            }
            if(input[i].equals(reverse)){
                System.out.println(input[i]+" is palindrome");

            }
        }



    }
}
