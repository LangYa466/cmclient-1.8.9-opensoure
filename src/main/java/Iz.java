import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class IZ implements IF {
   private GameProfile SH;

   public IZ() {
   }

   // $FF: synthetic method
   public void w(Ie var1) {
      this.q((IT)var1);
   }

   public void e(IG var1) {
      String var2 = var1.fB(36);
      String var3 = var1.fB(16);
      UUID var4 = UUID.fromString(var2);
      this.SH = new GameProfile(var4, var3);
   }

   public void r(IG var1) {
      UUID var2 = this.SH.getId();
      var1.bX(var2 == null ? q.q[-26623 & 25248] : var2.toString());
      var1.bX(this.SH.getName());
   }

   public GameProfile Jw() {
      return this.SH;
   }

   public void q(IT var1) {
      var1.q(this);
   }

   public IZ(GameProfile var1) {
      this.SH = var1;
   }
}
