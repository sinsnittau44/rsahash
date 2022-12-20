package rsahash;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Signature;

public class sign {
    public static void main(String[] args) throws Exception {
        // 生成密钥对
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(2048);
        KeyPair kp = kpg.generateKeyPair();
        PrivateKey privateKey = kp.getPrivate();
        byte[] data = "Hello, world!".getBytes();
        // 对数据进行签名
        Signature sig = Signature.getInstance("SHA256withRSA");
        sig.initSign(privateKey);
        sig.update(data);
        byte[] signature = sig.sign();
        System.out.println(new String(signature));
    }
}
