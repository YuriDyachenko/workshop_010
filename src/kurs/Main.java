package kurs;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.println(intToBinaryString(i));
        }
    }
    
    public static String intToBinaryString(int n) {
        StringBuilder sb = new StringBuilder();
        int rest = n;
        while (true) {
            if (rest < 2) {
                sb.append(Integer.toString(rest));
                break;
            }
            int dig = rest % 2;
            sb.append(Integer.toString(dig));
            rest /= 2;
        }
        return sb.reverse().toString();
    }
    
}
