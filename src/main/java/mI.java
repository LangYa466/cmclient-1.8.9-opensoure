import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.UUID;

public class MI extends Mn {
   protected void l(JsonObject var1) {
      if (this.ad() != null) {
         var1.addProperty(q.q[-21769 & 1615], ((GameProfile)this.ad()).getId() == null ? q.q[9216 & 18982] : ((GameProfile)this.ad()).getId().toString());
         var1.addProperty(q.q[-32641 & 29175], ((GameProfile)this.ad()).getName());
         super.l(var1);
      }

   }

   public MI(GameProfile var1, Date var2, String var3, Date var4, String var5) {
      super(var1, var4, var3, var4, var5);
   }

   private static GameProfile c(JsonObject var0) {
      if (var0.has(q.q[23111 & 8791]) && var0.has(q.q[119 & 31479])) {
         String var1 = var0.get(q.q[23111 & 1607]).getAsString();

         UUID var2;
         try {
            var2 = UUID.fromString(var1);
         } catch (Throwable var4) {
            return null;
         }

         return new GameProfile(var2, var0.get(q.q[20599 & 1783]).getAsString());
      } else {
         return null;
      }
   }

   public MI(JsonObject var1) {
      super(c(var1), var1);
   }

   public MI(GameProfile var1) {
      this(var1, (Date)null, (String)null, (Date)null, (String)null);
   }
}
