import java.util.*;

public class OTPGenerator {
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean checkUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);
        return set.size() == arr.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
        System.out.println("All OTPs Unique? " + checkUnique(otps));
    }
}
