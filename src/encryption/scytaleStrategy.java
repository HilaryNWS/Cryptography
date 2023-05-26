package encryption;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 * Contains the algorithms to decrypt/encrypt using the scytale strategy, in which characters 
 * are placed in the smallest array possible with a predetermined number of columns, and then 
 * rearranged by order in which they appear in each column (encryption) or row (decryption).
 * @author ngwun22h
 *
 */
public class scytaleStrategy implements encryptionStrategy {

    /**
     * Decrypts encrypted text using the Scytale cipher.
     * @param cipherText the text to decrypt
     * @param key the number of columns used to encrypt/decrypt this text
     */
    public String decryptWithKey(String cipherText, int key) {
        
        
        String finalText = "";
        int length = cipherText.length();
        
        //Create error message if key does not create at least one extra row of non-space characters.
        if (key >= length) {
            Alert a = new Alert(AlertType.ERROR);
            a.setContentText("Key too large to perform Scytale cipher. Please select a smaller number.");
            a.show();
        }
        
        //Find lowest number of rows which can accommodate all characters (length) into columns (key).
        int rows = length / key;
        int even = length % key;
        if (even != 0) {
            rows ++;
        }
        
        //Populate array with values by column.
        char[][] array = new char[rows][key];
        int init = 0;
        for (int i = 0; i < key; i ++) {
            for (int j = 0; j < rows; j ++) {
                if (init < length) {
                    array[j][i] = cipherText.charAt(init);
                    init++; 
                } else {
                    array[j][i] = (char) 32;
                }
            }
        }
        
        //Read and obtain array values by row.
        init = 0;
        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j < key; j ++) {
                if (init < length) {
                    finalText += array[i][j];
                }
            }
        }
        return finalText;
    }

    /**
     * Encrypts text using the Scytale cipher.
     * @param plainText the text to encrypt
     * @param key - the number of columns to arrange the text into
     */
    public String encryptWithKey(String plainText, int key) {
        String finalText = "";
        int length = plainText.length();
        
        //Create error message if key does not create at least one extra row of non-space characters.
        if (key >= length) {
            Alert a = new Alert(AlertType.ERROR);
            a.setContentText("Key too large to perform Scytale cipher. Please select a smaller number.");
            a.show();
        }
        
        //Find lowest number of rows which can accommodate all characters (length) into columns (key).
        int rows = length / key;
        int even = length % key;
        if (even != 0) {
            rows ++;
        }
        
        //Populate array with values by row.
        char[][] array = new char[rows][key];
        int init = 0;
        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j < key; j ++) {
                if (init < length) {
                    array[i][j] = plainText.charAt(init);
                    init++; 
                } else {
                    array[i][j] = (char) 32;
                }
            }
        }
        
        //Read and obtain array values by column.
        init = 0;
        for (int i = 0; i < key; i ++) {
            for (int j = 0; j < rows; j ++) {
                if (init < length) {
                    finalText += array[j][i];
                }
            }
        }
        return finalText;
    }
    
    
}
