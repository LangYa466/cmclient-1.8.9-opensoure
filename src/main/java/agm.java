import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class agM extends iU {
   private final d dvr;
   private float dvs;
   private final d dvt;
   private final d dvu;
   private PJ SI;

   public void r(hS var1, int var2, int var3) {
      if (this.hW) {
         this.hZ = (boolean)(var2 >= this.Gv && var3 >= this.hF && var2 < this.Gv + this.eo && var3 < this.hF + this.eC ? 9265 & -28529 : 17603 & 4096);
         z.q((float)this.Gv, (float)this.hF, (float)(this.Gv + this.eo), (float)(this.hF + this.eC), this.dvr.q(this.hZ).getRGB(), this.dvt.q(this.hZ).getRGB(), this.dvu.q(this.hZ).getRGB());
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.6666666F * 0.48000002F);
         z.w(this.SI, this.dvs, (float)this.Gv + (float)this.eo / 2.0F - this.dvs, (float)this.hF + (float)this.eC / 2.0F - this.dvs);
      }

   }

   public agM(int var1, int var2, int var3, int var4, int var5, PJ var6) {
      super(var1, var2, var3, var4, var5, q.q[25060 & 28021 & -28735 & -10729]);
      this.dvs = 5.1267605F * 0.7802198F;
      this.SI = var6;
      Color var7 = new Color(-1277534345 & -1327497261, (boolean)(-31423 & 2697));
      Color var8 = new Color(-456234380 & 1089028709, (boolean)(257 & 8707));
      Color var9 = new Color(1220301659 & 1622558291, (boolean)(25133 & 5249));
      this.dvr = new d(1342177279 & 1342177279, var7.getRGB());
      this.dvt = new d(450201485 & 528979365, var8.getRGB());
      this.dvu = new d(512066951 & 469616549, var9.getRGB());
   }

   public agM(int var1, int var2, int var3, int var4, int var5, float var6, PJ var7) {
      super(var1, var2, var3, var4, var5, q.q[7246 & 31830 & -32266 & -15440]);
      this.dvs = 3.4285715F * 1.1666666F;
      this.SI = var7;
      if (var7 == aew.dmF) {
         aew.atw().w(r.q[17400 & 21498 & 26605 & 10105] + hS.eV().fD().XD(), (var1x) -> {
            this.SI = var1x;
         });
      }

      this.dvs = var6;
      Color var8 = new Color(-1193648301 & -1327857709, (boolean)(641 & -28381));
      Color var9 = new Color(1221345908 & 1357412967, (boolean)(275 & 11817));
      Color var10 = new Color(1173636947 & -894025133, (boolean)(513 & -15277));
      this.dvr = new d(1610612735 & -805306369, var8.getRGB());
      this.dvt = new d(461735301 & -1699904025, var9.getRGB());
      this.dvu = new d(445492655 & -1635400299, var10.getRGB());
   }
}
