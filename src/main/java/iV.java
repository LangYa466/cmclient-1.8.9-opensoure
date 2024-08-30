import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class IV implements IF {
   private GameProfile SH;

   public void r(IG var1) {
      var1.bX(this.SH.getName());
   }

   public IV(GameProfile var1) {
      this.SH = var1;
   }

   public GameProfile Jw() {
      return this.SH;
   }

   public void q(IU var1) {
      var1.q(this);
   }

   public void e(IG var1) {
      this.SH = new GameProfile((UUID)null, var1.fB(16));
   }

   public IV() {
   }

   // $FF: synthetic method
   public void w(Ie var1) {
      this.q((IU)var1);
   }
}
