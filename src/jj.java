import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class jj {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // 原始字符
        String data = "a1sd3f51as6d5f13a13sd5f1"+(Integer.parseInt("1900300511")*520/1314);
        String data2 = "a1sd3f51as6d5f13a13sd5f1";
        System.out.println(data);
        // 编码
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(data.getBytes());
        // 转化为16进制编码
        BigInteger bigInteger = new BigInteger(1, digest);

        byte[] digest2 = md.digest(data2.getBytes());
        BigInteger bigInteger2 = new BigInteger(1, digest2);

        //
        System.out.println("JDK MD5: " +  bigInteger.toString());
        System.out.println("JDK MD5: " +  bigInteger.toString(36));
        System.out.println("JDK MD5: " +  bigInteger2.toString(36));
    }
}
