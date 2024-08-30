import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class MK extends ME {
   protected String d(GameProfile var1) {
      return var1.getId().toString();
   }

   public boolean o(GameProfile var1) {
      ML var2 = (ML)this.g(var1);
      return var2 != null ? var2.QN() : false;
   }

   // $FF: synthetic method
   protected String h(Object var1) {
      return this.d((GameProfile)var1);
   }

   protected MJ z(JsonObject var1) {
      return new ML(var1);
   }

   public MK(File var1) {
      super(var1);
   }

   public GameProfile cG(String var1) {
      for(ML var3 : this.QL().values()) {
         if (var1.equalsIgnoreCase(((GameProfile)var3.ad()).getName())) {
            return (GameProfile)var3.ad();
         }
      }

      return null;
   }

   public String[] QK() {
      String[] var1 = new String[this.QL().size()];
      int var2 = 0;

      for(ML var4 : this.QL().values()) {
         var1[var2++] = ((GameProfile)var4.ad()).getName();
      }

      return var1;
   }
}
