import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class ML extends MJ {
   private final boolean bHv;
   private final int bHw;

   protected void l(JsonObject var1) {
      if (this.ad() != null) {
         var1.addProperty(q.q[5735 & -32177], ((GameProfile)this.ad()).getId() == null ? q.q[-28628 & 8592] : ((GameProfile)this.ad()).getId().toString());
         var1.addProperty(q.q[1271 & -32649], ((GameProfile)this.ad()).getName());
         super.l(var1);
         var1.addProperty(t.q[-31813 & 919], Integer.valueOf(this.bHw));
         var1.addProperty(o.q[1010 & 5498], Boolean.valueOf(this.bHv));
      }

   }

   private static GameProfile v(JsonObject var0) {
      if (var0.has(q.q[24295 & 583]) && var0.has(q.q[-31625 & 2431])) {
         String var1 = var0.get(q.q[-31881 & 6727]).getAsString();

         UUID var2;
         try {
            var2 = UUID.fromString(var1);
         } catch (Throwable var4) {
            return null;
         }

         return new GameProfile(var2, var0.get(q.q[22775 & 9591]).getAsString());
      } else {
         return null;
      }
   }

   public boolean QN() {
      return this.bHv;
   }

   public ML(JsonObject var1) {
      super(v(var1), var1);
      this.bHw = var1.has(t.q[915 & 3003]) ? var1.get(t.q[-13381 & 9107]).getAsInt() : 0;
      this.bHv = var1.has(o.q[-31878 & 8562]) && var1.get(o.q[-20106 & 17778]).getAsBoolean();
   }

   public ML(GameProfile var1, int var2, boolean var3) {
      super(var1);
      this.bHw = var2;
      this.bHv = var3;
   }

   public int QO() {
      return this.bHw;
   }
}
