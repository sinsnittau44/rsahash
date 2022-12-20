package rsahash;

import java.security.PublicKey;
import java.security.Signature;

public class verify {
    public static void main(String[] args) throws Exception {
        PublicKey publicKey = null ; // 公钥
        byte[] data = "Hello, world!".getBytes();
        byte[] signature = null ; // 签名值
        // 验证签名
        Signature sig = Signature.getInstance("SHA256withRSA");
        sig.initVerify(publicKey);
        sig.update(data);
        boolean valid = sig.verify(signature);
        System.out.println(valid);
    }
}
