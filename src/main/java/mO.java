import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;

public class Mo extends ME {
   public boolean w(SocketAddress var1) {
      String var2 = this.e(var1);
      return this.d(var2);
   }

   public Mo(File var1) {
      super(var1);
   }

   protected MJ z(JsonObject var1) {
      return new Mp(var1);
   }

   private String e(SocketAddress var1) {
      String var2 = var1.toString();
      if (var2.contains(q.q[-24097 & 2175])) {
         var2 = var2.substring(var2.indexOf(47) + 1);
      }

      if (var2.contains(w.q[-16270 & 4726])) {
         var2 = var2.substring(0, var2.indexOf(58));
      }

      return var2;
   }

   public Mp r(SocketAddress var1) {
      String var2 = this.e(var1);
      return (Mp)this.g(var2);
   }
}
