import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Consumer;

public abstract class A implements B {
   protected final x at;
   protected final double au;
   public final String av;
   protected final File aw;

   public String q(File var1) {
      if (var1.exists()) {
         try {
            BufferedReader var2 = new BufferedReader(new FileReader(var1));
            Throwable var3 = null;

            String var6;
            try {
               StringBuilder var4 = new StringBuilder();

               String var5;
               while((var5 = var2.readLine()) != null) {
                  var4.append(var5);
               }

               var6 = var4.toString().isEmpty() ? w.q[475 & -7206 & 18270 & -14977] : var4.toString();
            } catch (Throwable var16) {
               var3 = var16;
               throw var16;
            } finally {
               if (var2 != null) {
                  if (var3 != null) {
                     try {
                        var2.close();
                     } catch (Throwable var15) {
                        var3.addSuppressed(var15);
                     }
                  } else {
                     var2.close();
                  }
               }

            }

            return var6;
         } catch (IOException var18) {
            var18.printStackTrace();
         }
      }

      return w.q[23931 & 24443 & -29217 & -28290];
   }

   protected void C() {
      if (!this.aw.exists()) {
         try {
            this.aw.createNewFile();
         } catch (IOException var2) {
            this.at.k().error(w.q[14719 & 17750 & -31785 & -30729] + this.aw.getName() + w.q[7543 & 2431 & 17887 & 17759], var2);
         }
      }

   }

   public A(x var1, String var2, String var3, double var4) {
      this.at = var1;
      this.av = var2;
      this.au = var4;
      this.aw = new File(x.aa, var2 + q.q[-32409 & -30229 & 28255 & 25295] + var3);
   }

   protected void q(JsonObject var1, String var2, Consumer var3) {
      if (var1 != null && var1.get(var2) != null) {
         var3.accept(var1.get(var2));
      }

   }

   public JsonObject w(File var1) {
      if (var1.exists()) {
         JsonElement var2 = (new JsonParser()).parse(this.q(var1));
         if (var2 != null && !var2.isJsonNull() && var2.isJsonObject()) {
            return var2.getAsJsonObject();
         }

         this.at.k().info(w.q[19454 & 21882 & 9693 & 14846] + var1.getName() + w.q[-19139 & -31947 & 4020 & 3380]);
         if (var1.delete()) {
            this.at.k().info(w.q[12763 & 5469 & -25253 & -13863] + var1.getName());
         }
      }

      return null;
   }
}
