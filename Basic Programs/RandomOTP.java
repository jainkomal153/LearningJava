public class RandomOTP{

    public static void main(String[] args) {
        
        double random;
        int lowerlimit = 100000, upperlimit = 999999;  // 6 digit OTP
        //int lowerlimit = 1, upperlimit = 6;  // random number on dice

        random = Math.random() * (upperlimit - lowerlimit + 1) + lowerlimit;
        System.out.println((int) random);

    }
}