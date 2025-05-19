public class Review26 {
    public static void main(String[] args) {
        int[] numArray = {11, 12, 13, 14,13};
        int target = 13;
        int cnt=0;
        for (int i = 0; i < numArray.length; i++) {
            if(numArray[i]==target){

                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

