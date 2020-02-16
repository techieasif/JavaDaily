/**
 * Created by @techieasif on February, 2020
 */
public class Sum3and5Challenge {



    public static void main(String[] args) {
        int sum =0;
        int count = 0;
        for(int i=0; i<1000; i++){
            if(sum3And5(i)){
                count++;
                sum = sum+i;
                System.out.println(i+"  Divisible with 3 and 5");
            }
            if(count == 5){
                System.out.println(sum+" sum ");
                return;
            }

        }
    }


    public static boolean sum3And5(int num){
        if(num <= 0){
            return false;
        }
        for(int i = 0; i<num; i++){
            if(num%3==0 && num%5==0){
                return true;
            }
        }
        return false;
    }
}
