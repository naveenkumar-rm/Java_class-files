package Java_programs;

public class Looping {
    static  String globalVar="Hi i am global scoped";

    public static void main(String[] args){

        String local="Hi i am local scoped";
        //definite loop-for
        for(int i=0;i<=10;i++){
            if(i==6 || i==9)
                //break;
                continue;
            System.out.println(i);
        }

        //indefinite loop
        int i=1;
        while(i<=10){                      //entry control loop
            System.out.println("while loop");
            i++;
        }
       System.out.println(globalVar);
       System.out.println(local);

        f1();

        //do while loop
        int j=1;
        do{                                    //exit control loop
          System.out.println(j+" do-while loop");
          j++;
        }
        while(j>=10);
    }
        static void f1(){

         System.out.println(globalVar);
          //System.out.println(local);
     }

}
