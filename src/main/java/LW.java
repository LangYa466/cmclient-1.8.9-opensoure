import com.mojang.authlib.GameProfile;

public class lw implements lt {
   private final GameProfile SH;
   private final PJ SI;

   public boolean kU() {
      return true;
   }

   public void w(float var1, int var2) {
      hS.eV().fJ().o(this.SI);
      pz.u(1.0F, 1.0F, 1.0F, (float)var2 / 255.0F);
      iT.q(2, 2, 8.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
      iT.q(2, 2, 40.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
   }

   public OX kT() {
      return new Oo(this.SH.getName());
   }

   public void w(lx var1) {
      hS.eV().fy().q(new JF(this.SH.getId()));
   }

   public lw(GameProfile var1) {
      this.SH = var1;
      this.SI = iO.F(var1.getName());
      iO.q(this.SI, var1.getName());
   }
}
