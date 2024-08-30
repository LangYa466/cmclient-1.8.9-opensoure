import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Oy {
   private static final Logger bPn = LogManager.getLogger();

   public static byte[] q(Key var0, byte[] var1) {
      return q(1, var0, var1);
   }

   public static SecretKey We() {
      try {
         KeyGenerator var0 = KeyGenerator.getInstance(r.q[252 & -15656]);
         var0.init(128);
         return var0.generateKey();
      } catch (NoSuchAlgorithmException var1) {
         throw new Error(var1);
      }
   }

   private static byte[] q(String var0, byte[]... var1) {
      try {
         MessageDigest var2 = MessageDigest.getInstance(var0);

         for(byte[] var6 : var1) {
            var2.update(var6);
         }

         return var2.digest();
      } catch (NoSuchAlgorithmException var7) {
         var7.printStackTrace();
         return null;
      }
   }

   public static byte[] w(Key var0, byte[] var1) {
      return q(2, var0, var1);
   }

   public static byte[] q(String var0, PublicKey var1, SecretKey var2) {
      try {
         return q(o.q[1920 & 25592], var0.getBytes(o.q[-29805 & 17281]), var2.getEncoded(), var1.getEncoded());
      } catch (UnsupportedEncodingException var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static SecretKey q(PrivateKey var0, byte[] var1) {
      return new SecretKeySpec(w(var0, var1), r.q[5592 & 216]);
   }

   private static Cipher q(int var0, String var1, Key var2) {
      try {
         Cipher var3 = Cipher.getInstance(var1);
         var3.init(var0, var2);
         return var3;
      } catch (InvalidKeyException var4) {
         var4.printStackTrace();
      } catch (NoSuchAlgorithmException var5) {
         var5.printStackTrace();
      } catch (NoSuchPaddingException var6) {
         var6.printStackTrace();
      }

      bPn.error(o.q[1925 & -31804]);
      return null;
   }

   public static KeyPair Wf() {
      try {
         KeyPairGenerator var0 = KeyPairGenerator.getInstance(o.q[9214 & 4991]);
         var0.initialize(1024);
         return var0.generateKeyPair();
      } catch (NoSuchAlgorithmException var1) {
         var1.printStackTrace();
         bPn.error(o.q[13311 & -28801]);
         return null;
      }
   }

   public static Cipher q(int var0, Key var1) {
      try {
         Cipher var2 = Cipher.getInstance(o.q[-30843 & 903]);
         var2.init(var0, var1, new IvParameterSpec(var1.getEncoded()));
         return var2;
      } catch (GeneralSecurityException var3) {
         throw new RuntimeException(var3);
      }
   }

   public static PublicKey e(byte[] var0) {
      try {
         X509EncodedKeySpec var1 = new X509EncodedKeySpec(var0);
         KeyFactory var2 = KeyFactory.getInstance(o.q[25598 & 2942]);
         return var2.generatePublic(var1);
      } catch (NoSuchAlgorithmException var3) {
         ;
      } catch (InvalidKeySpecException var4) {
         ;
      }

      bPn.error(o.q[-27762 & 27523]);
      return null;
   }

   private static byte[] q(int var0, Key var1, byte[] var2) {
      try {
         return q(var0, var1.getAlgorithm(), var1).doFinal(var2);
      } catch (IllegalBlockSizeException var4) {
         var4.printStackTrace();
      } catch (BadPaddingException var5) {
         var5.printStackTrace();
      }

      bPn.error(o.q[-12353 & 899]);
      return null;
   }
}
