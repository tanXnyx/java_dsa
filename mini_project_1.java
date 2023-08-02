import java.util.Scanner;
public class mini_project_1 
{
  
  public static final int alphabet_size = 26;
  
  public static void main(String[] args) 
  {
    Scanner ob = new Scanner(System.in);
    System.out.print("Enter text to encrypt: ");
    String plainText = ob.nextLine();
    System.out.print("Enter key a (must be co-prime to 26): ");
    int a = ob.nextInt();
    System.out.print("Enter key b: ");
    int b = ob.nextInt();
    String cipherText = encrypt(plainText, a, b);
    System.out.println("Encrypted text: " + cipherText);
    System.out.println("Decrypted text: " + decrypt(cipherText, a, b));
  }
  
  public static String encrypt(String plainText, int a, int b) 
  {
    StringBuilder cipherText = new StringBuilder();
    plainText = plainText.toUpperCase();
    
    for (int i = 0; i < plainText.length(); i++) 
    {
      char c = plainText.charAt(i);
      if (c >= 'A' && c <= 'Z') 
      {
        cipherText.append((char) (((a * (c - 'A') + b) % alphabet_size) + 'A'));
      } 
      else 
      {
        cipherText.append(c);
      }
    }
    
    return cipherText.toString();
  }
  
  public static String decrypt(String cipherText, int a, int b) 
  {
    StringBuilder plainText = new StringBuilder();
    cipherText = cipherText.toUpperCase();
    
    int aInverse = 0;
    for (int i = 0; i < alphabet_size; i++) 
    {
      if ((a * i) % alphabet_size == 1) 
      {
        aInverse = i;
        break;
      }
    }
    
    for (int i = 0; i < cipherText.length(); i++) 
    {
      char c = cipherText.charAt(i);
      if (c >= 'A' && c <= 'Z') 
      {
        plainText.append((char) (((aInverse * ((c - 'A' - b + alphabet_size) % alphabet_size)) % alphabet_size) + 'A'));
      } 
      else 
      {
        plainText.append(c);
      }
    }
    
    return plainText.toString();
  }
}