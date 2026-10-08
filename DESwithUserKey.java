import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import java.security.KeyFactory;
import java.util.Base64;
import java.util.Scanner;
public class DESwithUserKey{
    public static void main(string[]args)throws Exception{
        Scanner sc=new Scanner(System.in);
        System.err.print("enter palintext");
        String plainText=sc.nextLine();
        System.out.print("Enter Key(must be 8 chars eg.12345678):");
        String keyInput=sc.nextLine();
        DESKeySpec DESKeySpec=new DESKeySpec(keyinput.getBytes());
        SecretKeyFactory keyFactory=SecretKeyFactory.get instance("DES");
        SecretKey SecretKey=KeyFactory.generateSecret(DESKeySpec);
        Cipher cipher=cipher.get instance("DES/ECB/PKCSS")
    }
} 
