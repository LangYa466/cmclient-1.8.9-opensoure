import java.awt.Color;

public class agL extends iU {
   private final d dvo;
   private final d dvp;
   private final d dvq;

   public void r(hS var1, int var2, int var3) {
      if (this.hW) {
         this.hZ = (boolean)(var2 >= this.Gv && var3 >= this.hF && var2 < this.Gv + this.eo && var3 < this.hF + this.eC ? 11297 & 4117 : -23536 & 6786);
         z.q((float)this.Gv, (float)this.hF, (float)(this.Gv + this.eo), (float)(this.hF + this.eC), this.dvq.q(this.hZ).getRGB(), this.dvo.q(this.hZ).getRGB(), this.dvp.q(this.hZ).getRGB());
         var1.Bn.dmr.w(this.iX, (float)this.Gv + (float)this.eo / 2.0F, (float)this.hF + 2.0F, -1 & -1);
      }

   }

   public agL(int var1, int var2, int var3, int var4, int var5, String var6) {
      super(var1, var2, var3, var4, var5, var6);
      Color var7 = new Color(-1310728237 & -119898277, (boolean)(483 & -24575));
      Color var8 = new Color(1254769252 & 1154270180, (boolean)(2063 & 24705));
      Color var9 = new Color(1236689619 & 1895058011, (boolean)(6275 & 16425));
      this.dvq = new d(1342177279 & 1610612735, var7.getRGB());
      this.dvo = new d(446006663 & 1521327525, var8.getRGB());
      this.dvp = new d(512591749 & 465931663, var9.getRGB());
   }
}
