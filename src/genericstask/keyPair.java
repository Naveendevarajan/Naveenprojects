package genericstask;

public class keyPair<N,P> {
     public P age;
     public N name;

     public keyPair (P age, N name){
         this.age=age;
         this.name=name;

     }

    public static void main(String[] args) {
        keyPair keyPair = new keyPair(20,"Naveen");
        keyPair keyPair1 = new keyPair("18","raju");

        System.out.println(" Integer: "+keyPair.age+" String: "+keyPair.name);
        System.out.println(" String: "+keyPair1.age+" String: "+keyPair1.name);
    }


}
