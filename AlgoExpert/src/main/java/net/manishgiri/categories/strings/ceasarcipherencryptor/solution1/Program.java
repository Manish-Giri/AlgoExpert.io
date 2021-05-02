package main.java.net.manishgiri.categories.strings.ceasarcipherencryptor.solution1;

/**
 * EDGE CASE - for large keys, example - 52
 * modding by 26 ensures key is always in the range 0 to 25 (26 alphabets)
 * https://www.algoexpert.io/questions/Caesar%20Cipher%20Encryptor
 */
class Program {

    static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        char[] letters = str.toCharArray();
        // to ensure key remains in a(97) to z(122) range
        key = key % 26;
        for (int i = 0; i < letters.length; i++) {
            int pos = letters[i] + key;
            if (pos > 122) {
                letters[i] = (char) ((pos % 122) + 96);
            } else {
                letters[i] = (char) pos;
            }
        }
        return new String(letters);
    }
}
