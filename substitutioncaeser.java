import java.util.Scanner;
public class SubstitutionCipher
{
    static final String ALPHABET="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String Key="QWERTYUIOPASDFGHJKLZXCVBNM"
    public static String encrypt(String plainText)
    {
        plainText=plainText.toUpperCase();
        StringBuilder cipherText= new StringBuilder();
        for(int i=0; i<plainText.length()i++)
        {
            char c=plainText.charAt(i);
            if(Character.isLetter(c))
            {
                int index=ALPHABET.indexOf(c);
                char encryptedChar=KEY.charAt(index)
                cipherText.append(encryptedChar);
            }
            else{
                cipherText.append(c);

            }
        }
        return cipherText.toString();
    }
}
public static Sring decrypt(String cipherString)
{
    cipherText=cipherText.toUpperCase();
    StringBuilder plainText=new StringBuilder();
    for(int i=0; i<cipherText.length();i++)
    {
        char c=cipherText.charAt(i);
        if(Character.isLetter(c))
        {
           
        }
    }
}