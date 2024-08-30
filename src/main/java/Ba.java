import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ba implements uK {
   private final float hL;

   public vn y(String var1) {
      return null;
   }

   public InputStream getInputStream() {
      StringBuilder var1 = new StringBuilder();

      try {
         BufferedReader var2 = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(a.q[15287 & 29759 & -32289 & -15913])));
         Throwable var3 = null;

         try {
            String var4;
            try {
               while((var4 = var2.readLine()) != null) {
                  var1.append(var4.replace(a.q[14776 & 20632 & 16731 & 859], Float.toString(this.hL))).append(q.q[27002 & 23610 & 9271 & -905]);
               }
            } catch (Throwable var13) {
               var3 = var13;
               throw var13;
            }
         } finally {
            if (var2 != null) {
               if (var3 != null) {
                  try {
                     var2.close();
                  } catch (Throwable var12) {
                     var3.addSuppressed(var12);
                  }
               } else {
                  var2.close();
               }
            }

         }
      } catch (IOException var15) {
         var15.printStackTrace();
      }

      return new ByteArrayInputStream(var1.toString().getBytes());
   }

   public ba(float var1) {
      this.hL = var1;
   }

   public String aO() {
      return null;
   }

   public boolean aP() {
      return (boolean)(7680 & 258);
   }

   public PJ aQ() {
      return null;
   }
}
