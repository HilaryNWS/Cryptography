package encryption;

/**
 * Interface through which to implement en/decryption algorithms for each strategy.
 * @author ngwun22h
 *
 */
public interface encryptionStrategy{

    /**
     * Decrypts text using the currently selected algorithm
     * @param cipherText the text to encrypt
     * @param key the key the algorithm should use
     * @return the decrypted text
     */
    public default String decryptWithKey(String cipherText, int key) {
        return "decrypted text";
    }

    /**
     * Encrypts text using the currently selected algorithm
     * @param plainText the text to encrypt
     * @param key the key the algorithm should use
     * @return the encrypted text
     */
    public default String encryptWithKey(String plainText, int key) {
        return "encrypted text";
    }
}
