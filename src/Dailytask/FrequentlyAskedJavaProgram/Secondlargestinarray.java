package Dailytask.FrequentlyAskedJavaProgram;

public class Secondlargestinarray {
    static void main() {
        int a []={2,1,4,5,7,6};
        int b;
        for (int i=0;i< a.length-1;i++){
            if(a[i]>a[i+1]){
                b=a[i];
                a[i]=a[i+1];
                a[i+1]=b;
            }
        }
        System.out.println(a[a.length-2]);
    }
}
