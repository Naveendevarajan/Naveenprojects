public class Occurance {
    public static void main(String[] args) {
        String input="asdswasdaweafasdaewadadasadswfaswadadaaaaddaaad";
        String result="";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!='a'){
                result=result+input.charAt(i);
            }
        }
        System.out.println("String after removing character a "+result);
    }
}
