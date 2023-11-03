import java.lang.Math;
public class GetPrimes2 {
    public boolean isFactor(int num, int x){
        return num%x == 0;
    }
    public void getprimes(int N){
        for(int i=2;i<=N;i++){
            int count=0;
            for(int j=1;j<=Math.sqrt(i);j++){
                if (isFactor(i,j)){
                    count+=2;
                }
            }
            if (count == 2){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        GetPrimes2 obj = new GetPrimes2();
        obj.getprimes(1000);
    }
}