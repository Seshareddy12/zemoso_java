package Problem6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class VampireNumber {
    public static int numDigits(long l){
        return Long.toString(l).length();
    }

    private static boolean fangCheck(long orig, long fang1, long fang2){
        if(Long.toString(fang1).endsWith("0") && Long.toString(fang2).endsWith("0")) return false;

        int origLen = numDigits(orig);
        if(numDigits(fang1) != origLen / 2 || numDigits(fang2) != origLen / 2) return false;

        byte[] origBytes = Long.toString(orig).getBytes();
        byte[] fangBytes = (Long.toString(fang1) + Long.toString(fang2)).getBytes();
        Arrays.sort(origBytes);
        Arrays.sort(fangBytes);
        return Arrays.equals(origBytes, fangBytes);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Long> vamps = new HashSet<>();
        for(long i=10;vamps.size()<n;i++){
            if(numDigits(i)%2!=0){
                i=i*10-1;
                continue;
            }
            for(long fang1 = 2; fang1 <= Math.sqrt(i) + 1; fang1++){
                if(i % fang1 == 0){
                    long fang2 = i / fang1;
                    if(fangCheck(i, fang1, fang2) && fang1 <= fang2){
                        vamps.add(i);
                        System.out.println(i + ": [" + fang1 + ", " + fang2 +"]");
                    }
                }
            }
        }
    }
}

