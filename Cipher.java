public class Cipher {
    String key;
    String ciphertextAlphabet;
    final String plaintextAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    Cipher(String key) {

        this.key = key;
        initCiphertextAlphabet();
    }

    String initCiphertextAlphabet() {

        if(key.length() <= 0)
            return plaintextAlphabet.toUpperCase();
        ciphertextAlphabet = Cipher.removeDups(key);
        ciphertextAlphabet = ciphertextAlphabet.toUpperCase();
        for (int i = 0; i < plaintextAlphabet.length(); i++) {
            int differentLetter = 1; //repetitive letter
            for (int j = 0; j < ciphertextAlphabet.length(); j++) {
                if (plaintextAlphabet.charAt(i) == ciphertextAlphabet.charAt(j)) {
                    differentLetter++;
                }
            }
            if (differentLetter == 1) {
                ciphertextAlphabet += plaintextAlphabet.charAt(i);
            }

        }
        return ciphertextAlphabet;
    }

    static String removeDups(String s) {
        String result = new String();

        for(int i=0; i<s.length(); i++){
            if(result.indexOf(s.charAt(i)) == -1 )
                result = result + s.charAt(i);
        }
        return result;
    }

    String encrypt(String message) {
        message = message.toUpperCase();
        if(key.length() <= 0)
            return message;
        String sifre = new String();

        for (int i = 0; i<message.length(); i++){
            if(plaintextAlphabet.indexOf(message.charAt(i)) != -1)
                sifre = sifre + ciphertextAlphabet.charAt(plaintextAlphabet.indexOf(message.charAt(i)));

            else{
                sifre = sifre + message.charAt(i);

            }

        }

        return sifre;
    }

    String decrypt(String ciphertext) {
        ciphertext = ciphertext.toUpperCase();
        if(key.length() <= 0)
            return ciphertext;
        String dsifre = new String();

        for (int i = 0; i<ciphertext.length(); i++){
            if(plaintextAlphabet.indexOf(ciphertext.charAt(i)) != -1)
                dsifre = dsifre + plaintextAlphabet.charAt(ciphertextAlphabet.indexOf(ciphertext.charAt(i)));

            else{
                dsifre = dsifre + ciphertext.charAt(i);
            }
        }

        return dsifre;

    }

    public static void main(String[] args) {
        Cipher c = new Cipher("medeniyet2021");
        System.out.println(c.encrypt("this is a secret"));
        System.out.println(c.decrypt("O20L 0L M LIDKIO"));
    }

}