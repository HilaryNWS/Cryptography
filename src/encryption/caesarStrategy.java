package encryption;

/**
 * Contains the algorithms to decrypt/encrypt using the caesar strategy, 
 * in which ASCII characters are shifted uniformly by some number.
 * @author ngwun22h
 *
 */
public class caesarStrategy implements encryptionStrategy {

    /**
     * Decrypts encrypted text using the Caesar cipher
     * @param cipherText the text to decrypt
     * @param key the number of characters by which the original text was shifted
     */
    public String decryptWithKey(String cipherText, int key) {
        String finalText = "";
        int length = cipherText.length();
        for (int i = 0; i < length; i++) {
            char cCipher = cipherText.charAt(i);
            int ascii = cCipher - key;
            if (ascii < 32) {
                ascii += 95;
            }
            finalText += (char) ascii;
        }
        return finalText;
    }

    /**
     * Encrypts plain text using the Caesar cipher
     * @param plainText the text to encrypt
     * @param key the number of characters by which the text needs to be shifted
     */
    public String encryptWithKey(String plainText, int key) {
        String finalText = "";
        int length = plainText.length();
        for (int i = 0; i < length; i++) {
            char cInit = plainText.charAt(i);
            int ascii = cInit + key;
            if (ascii > 126) {
                ascii -= 95;
            }
            finalText += (char) ascii;
        }
        return finalText;
    }

    
}
