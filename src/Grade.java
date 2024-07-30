public class Grade {
     static void main(String[] args) {


        int mark = 349;
        if(mark==500){
        if (mark>450&&mark>=500){
            System.out.println("Grade A");
        } else if (mark<=450&&mark>400) {
            System.out.println("Grade B");

        } else if (mark>=400&&mark<350) {
            System.out.println("Grade c");

        }
        else {
            System.out.println("fail");
        }
    }
}
}
