package encryption;

/**
 * Contains the algorithms to decrypt/encrypt using the copy strategy,
 * in which characters from one text field are simply copied to the other.
 * @author ngwun22h
 *
 */
public class copyStrategy implements encryptionStrategy {

    /**
     * Copies text from cipherTextField to plainTextField.
     * @param cipherText the text to copy
     * @param key not used for this strategy
     */
    public String decryptWithKey(String cipherText, int key) {
        return cipherText;
    }

    /**
     * Copies text from plainTextField to cipherTextField.
     * @param plainText the text to copy
     * @param key not used for this strategy
     */
    public String encryptWithKey(String plainText, int key) {
        return plainText;
    }

}
