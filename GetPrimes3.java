import java.lang.Math;
public class GetPrimes3 {
    public void getPrimes(int N){
        boolean[] ar = new boolean[N+1];
        // Set all elements to true using a loop
        for (int i = 0; i < ar.length; i++) {
            ar[i] = true;
        }
        
        // lets say i= 7: 7*2 is already marked as false by 2, 7*3 is marked as false by 3....
        // so dont start from 2*i in 2nd loop instead start from i*i

        // We are marking all the mutiples of prime as False from 2 to N
        /* E.g: N= 16
        1st loop 2 marks ->  4, 6, 8, 10, 12, 14, 16
        2nd loop 3 marks ->  9, 12(already marked), 15
        3rd loop 5 marks ->  none (5*5=25)

        so we can stop at 4 itself (sqrt(16))
         */
        for(int i=2;i<=Math.sqrt(N);i++){
            if (ar[i]==true){
                for (int j=i*i;j<N+1;j++){
                    if (j%i==0){
                        ar[j]=false;
                    }
                }
            }
        }
        for(int i=2;i<N+1;i++){
            if (ar[i]==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        GetPrimes3 obj = new GetPrimes3();
        obj.getPrimes(200000);
    }
}
