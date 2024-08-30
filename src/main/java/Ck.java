import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.newsclub.net.unix.AFUNIXSocket;
import org.newsclub.net.unix.AFUNIXSocketAddress;

public class ck extends ci {
   private final AFUNIXSocket ml = AFUNIXSocket.ate();
   private static final Logger mm = LogManager.getLogger(ck.class);

   public cc cb() {
      InputStream var1 = this.ml.getInputStream();

      while(var1.available() == 0 && this.lX == cj.mh) {
         try {
            Thread.sleep(6963875936041177138L & -6963875936516169677L);
         } catch (InterruptedException var8) {
            ;
         }
      }

      if (this.lX == cj.mj) {
         throw new IOException(r.q[8861 & -2531 & 20223 & -12705]);
      } else if (this.lX == cj.mi) {
         return new cc(cd.lt, (JsonObject)null);
      } else {
         byte[] var2 = new byte[796 & 138];
         var1.read(var2);
         ByteBuffer var3 = ByteBuffer.wrap(var2);
         cd var4 = cd.values()[Integer.reverseBytes(var3.getInt())];
         var2 = new byte[Integer.reverseBytes(var3.getInt())];
         var1.read(var2);
         Gson var5 = (new GsonBuilder()).registerTypeAdapter(cc.class, new cm(var4)).create();
         JsonObject var6 = (JsonObject)var5.fromJson(new String(var2), JsonObject.class);
         cc var7 = (cc)var5.fromJson(var6, cc.class);
         Logger var10000 = mm;
         String var10001 = r.q[6782 & 21439 & -289 & -31009];
         Object[] var10002 = new Object[16473 & 7685];
         var10002[-20479 & 2442] = var7.toString();
         var10000.debug(String.format(var10001, var10002));
         if (this.kS != null) {
            this.kS.w(this.ma, var7);
         }

         return var7;
      }
   }

   public void q(byte[] var1) {
      this.ml.getOutputStream().write(var1);
   }

   ck(bW var1, HashMap var2, String var3) {
      super(var1, var2);
      this.ml.connect(new AFUNIXSocketAddress(new File(var3)));
   }

   public void close() {
      mm.debug(r.q[10783 & 25311 & -14529 & -6273]);
      this.q(cd.lt, new JsonObject(), (ca)null);
      this.lX = cj.mi;
      this.ml.close();
   }
}
