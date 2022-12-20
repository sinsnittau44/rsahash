package rsahash;

import java.security.MessageDigest;

public class hash {
    public static void main(String[] args) throws Exception {
        String data = "Hello, world!";
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(data.getBytes());
        byte[] hash = md.digest();
        System.out.println(new String(hash));
    }
}