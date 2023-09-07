public class Number_of_1_Bits {
     // you need to treat n as an unsigned value
     public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >>> 1;
        }
        return count;
     }

     public static void main(String[] args) {
            Number_of_1_Bits test = new Number_of_1_Bits();
            System.out.println(test.hammingWeight(Integer.parseInt("11111111111111111111111111111101", 2)));
     }
}
