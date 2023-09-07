public class Sum_of_Two_Integers {
    public int getSum(int a, int b) {
        
        if(a==0 || b == 0)
            return a==0?b:a;
        
        int sum = 0;
        while(b != 0){
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return sum;
    }

}
