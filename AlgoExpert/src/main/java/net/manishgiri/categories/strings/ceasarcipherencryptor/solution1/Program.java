package java.net.manishgiri.categories.strings.ceasarcipherencryptor.solution1;

/**
 * EDGE CASE - for large keys, example - 52, directly adding key will create a number > 122
 * modding by 26 ensures key is always in the range 0 to 25, => 97(a) to 122(z)
 */
class Program {

    static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        char[] letters = str.toCharArray();
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
