import java.awt.Color;

public class aQ {
   private boolean he;
   private float hf;
   protected final hS hg;
   protected final vP hh;
   protected long hi;
   protected final aN hj;

   public void aD() {
      boolean var1 = this.aE();
      this.r(var1);
      String var2 = vL.dh(this.hh.bB());
      this.q(var2, (this.ay() - (float)this.hg.CB.K(var2)) / 2.0F, (this.ax() - (float)this.hg.CB.Gf) / 2.0F + 1.0F, var1);
   }

   public float ay() {
      return this.hj.gZ.br();
   }

   public float ax() {
      return this.hj.gZ.br();
   }

   public void r(boolean var1) {
      pz.nX();
      pz.nC();
      pz.s(-27850 & 17346, 6943 & 9027, 12301 & 35, -32588 & 20480);
      qk var2 = qk.pm();
      qq var3 = var2.pl();
      this.y(var1);
      var3.q(4647 & 327, us.axO);
      var3.i(0.0D, (double)this.ax(), 0.0D).pJ();
      var3.i((double)this.ay(), (double)this.ax(), 0.0D).pJ();
      var3.i((double)this.ay(), 0.0D, 0.0D).pJ();
      var3.i(0.0D, 0.0D, 0.0D).pJ();
      var2.pn();
      pz.nP();
      pz.nz();
      if (this.hj.gW.af()) {
         int var4 = this.q(this.hj.gU.bo(), this.hj.gX, var1);
         int var5 = this.q(this.hj.gU.bo(), this.hj.gX + this.ay(), var1);
         bQ.q(0.0F, 0.0F, this.ay(), 1.0F, var4, var5, var4, var5, 28748 & 3473);
         bQ.q(this.ay() - 1.0F, 1.0F, this.ay(), this.ax() - 1.0F, var5, var5, var5, var5, -29743 & 4);
         bQ.q(this.ay(), this.ax(), 0.0F, this.ax() - 1.0F, var5, var4, var5, var4, 2160 & 8578);
         bQ.q(1.0F, this.ax() - 1.0F, 0.0F, 1.0F, var4, var4, var4, var4, 1458 & 16960);
      }

   }

   protected void q(String var1, float var2, float var3, boolean var4) {
      bP var5 = this.hj.gT.bo();
      if (var5.bz()) {
         if (var4) {
            bQ.q(var1, var2, var3, -14614425 & -15332344);
         } else {
            char[] var6 = var1.toCharArray();
            char[] var7 = var6;
            int var8 = var6.length;

            for(int var9 = -15799 & 8226; var9 < var8; ++var9) {
               char var10 = var7[var9];
               float var11 = var5.bA();
               int var12 = (new Color(Color.HSBtoRGB((float)(((double)System.currentTimeMillis() - (double)var2 * 11.30952380952381D * 0.8842105263157894D - (double)this.hj.gX * 1.15625D * 8.64864864864865D) % (double)var11) / var11, 8.0F * 0.1F, 1.6590909F * 0.4821918F))).getRGB();
               String var13 = String.valueOf(var10);
               bQ.q(var13, var2, var3, var12);
               var2 += (float)this.hg.CB.K(var13);
            }
         }
      } else {
         int var14 = this.u(var4);
         bQ.q(var1, var2, var3, var14);
      }

   }

   protected int t(boolean var1) {
      int var2 = this.hj.gS.bl();
      int var3 = this.hj.gQ.bl();
      int var4 = var1 ? var3 : var2;
      if (this.hf < 1.0F) {
         int var5 = var1 ? var2 : var3;
         return r(var4, var5, this.hf);
      } else {
         return var4;
      }
   }

   private void y(boolean var1) {
      int var2 = this.t(var1);
      bQ.B(var2);
   }

   protected int u(boolean var1) {
      int var2 = this.hj.gT.bl();
      int var3 = this.hj.gY.bl();
      int var4 = var1 ? var3 : var2;
      if (this.hf < 1.0F) {
         int var5 = var1 ? var2 : var3;
         return r(var4, var5, this.hf);
      } else {
         return var4;
      }
   }

   protected static int r(int var0, int var1, float var2) {
      float var3 = (float)(var0 >> (5137 & -30150) & 20735 & 511) * var2 + (float)(var1 >> (1297 & 25170) & 255 & 29951) * (1.0F - var2);
      float var4 = (float)(var0 >> (792 & -13173) & 25087 & -31489) * var2 + (float)(var1 >> (21005 & 8474) & 1279 & 24831) * (1.0F - var2);
      float var5 = (float)(var0 & 6399 & -23809) * var2 + (float)(var1 & -3841 & 1279) * (1.0F - var2);
      float var6 = (float)(var0 >> (5400 & -13672) & 20223 & 8447) * var2 + (float)(var1 >> (1528 & 6680) & 767 & -26113) * (1.0F - var2);
      return (new Color(var3 / (103.68131F * 2.4594595F), var4 / (0.43589744F * 585.0F), var5 / (28.977272F * 8.8F), var6 / (247.5F * 1.030303F))).getRGB();
   }

   protected boolean aE() {
      boolean var1 = this.hh.bC();
      if (this.he != var1) {
         this.hi = System.currentTimeMillis();
      }

      this.hf = (float)(System.currentTimeMillis() - this.hi) / (float)this.hj.gP.bk();
      return this.he = var1;
   }

   public aQ(hS var1, vP var2, aN var3) {
      this.hg = var1;
      this.hh = var2;
      this.hj = var3;
   }

   protected int q(bP var1, float var2, boolean var3) {
      if (var1.bz()) {
         if (var3) {
            return this.hj.gY.bl();
         } else {
            float var4 = this.hj.gT.bo().bA();
            int var5 = (new Color(Color.HSBtoRGB((float)(((double)System.currentTimeMillis() - (double)var2 * 3.588235294117647D * 2.7868852459016393D - (double)this.hj.gX * 36.2962962962963D * 0.2755102040816326D) % (double)var4) / var4, 1.6F * 0.5F, 1.0784314F * 0.7418182F))).getRGB();
            return var5;
         }
      } else {
         return this.u(var3);
      }
   }
}
