import java.util.Scanner;
public class SubstitutionCipher
{
    static final String ALPHABET="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String Key="QWERTYUIOPASDFGHJKLZXCVBNM";
    public static String encrypt(String plainText)
    {
        plainText=plainText.toUpperCase();
        StringBuilder cipherText= new StringBuilder();
        for(int i=0; i<plainText.length();i++)
        {
            char c=plainText.charAt(i);
            if(Character.isLetter(c))
            {
              int index=ALPHABET.indexOf(c);
              char encryptedChar=Key.charAt(index);
              cipherText.append(encryptedChar);
            }else{
                cipherText.append(c);
            }
        }
        return cipherText.toString();
    }
    public static String decrypt(String cipherText){
        cipherText=cipherText.toUpperCase();
        StringBuilder plainText=new StringBuilder();
        for(int i=0;i<cipherText.length();i++){
            char c=cipherText.charat(i);
            if(Character.isLetter(c)){
                int index=KEY.indexOf(c);
                char decryptChar=ALPHABET.charAt(idex);
                plainText.append(decryptChar);
            }else{
                plainText.append(c);
            }
        }
        return plaintext.toString();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println(x:"----Substitution Cipher----");
        System.out.println("Alphabet:"+ALPHABET);
        System.out.println("Key:"+KEY);
        System.out.println(x:"\n Enter Plain Text:");
        String plain=sc.nextLine();
        String encrypted=encrypt(plain);
        System.out.println("Encrypted Text:"+encrypted);
        String decrypted=decrypt(encrypted);
        System.out.println("Decrypted Text:"+Decrypted);
        sc.close();
    }
}