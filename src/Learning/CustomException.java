package Learning;

public class CustomException {
    public static void main(String[] args){
        try {
            isEligible(15);
        }
       catch (Exception e){
           System.out.println(e);
       }
    }

    static void isEligible(int age) throws InvaliageException {
       if(age>=18){
           System.out.println("Eligible for vote");
       }
       else{
         throw new InvaliageException("Not Eligible for vote");
       }
    }

}

class InvaliageException extends  Exception{
    public InvaliageException(String message){

        super();
    }
}


