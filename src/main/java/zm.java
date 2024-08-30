import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.nio.charset.StandardCharsets;

public class Zm implements YV {
   private String cBl = null;

   public Zm(String var1) {
      this.cBl = var1;
   }

   public void q(String var1, byte[] var2, Throwable var3) {
      if (var2 != null) {
         try {
            String var4 = new String(var2, StandardCharsets.US_ASCII);
            JsonParser var5 = new JsonParser();
            JsonElement var6 = var5.parse(var4);
            Zl var7 = new Zl(this.cBl);
            Zk var8 = var7.o(var6);
            if (var8 != null) {
               var8.cn(true);
               Zn.q(this.cBl, var8);
            }
         } catch (Exception var9) {
            MV.cM(p.q[20971 & 1142] + var1 + q.q[8318 & 18542] + var9.getClass().getName() + q.q[1702 & -19756] + var9.getMessage());
         }
      }

   }
}
