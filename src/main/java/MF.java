public class mF {
   private boolean YA;
   public int YB;
   public mD[] Ut;

   public mF(mD[] var1, int var2, int var3, int var4, int var5, float var6, float var7) {
      this(var1);
      float var8 = 0.0F / var6;
      float var9 = 0.0F / var7;
      var1[0] = var1[0].i((float)var4 / var6 - var8, (float)var3 / var7 + var9);
      var1[1] = var1[1].i((float)var2 / var6 + var8, (float)var3 / var7 + var9);
      var1[2] = var1[2].i((float)var2 / var6 + var8, (float)var5 / var7 - var9);
      var1[3] = var1[3].i((float)var4 / var6 - var8, (float)var5 / var7 - var9);
   }

   public mF(mD[] var1) {
      this.Ut = var1;
      this.YB = var1.length;
   }

   public void w(qq var1, float var2) {
      PX var3 = this.Ut[1].Yv.g(this.Ut[0].Yv);
      PX var4 = this.Ut[1].Yv.g(this.Ut[2].Yv);
      PX var5 = var4.p(var3).XT();
      float var6 = (float)var5.bUV;
      float var7 = (float)var5.bUW;
      float var8 = (float)var5.bUX;
      if (this.YA) {
         var6 = -var6;
         var7 = -var7;
         var8 = -var8;
      }

      if (MV.Tf()) {
         var1.q(7, net.optifine.shaders.n.cFo);
      } else {
         var1.q(7, us.axR);
      }

      for(int var9 = 0; var9 < 4; ++var9) {
         mD var10 = this.Ut[var9];
         var1.i(var10.Yv.bUV * (double)var2, var10.Yv.bUW * (double)var2, var10.Yv.bUX * (double)var2).e((double)var10.Yx, (double)var10.Yw).o(var6, var7, var8).pJ();
      }

      qk.pm().pn();
   }

   public void lm() {
      mD[] var1 = new mD[this.Ut.length];

      for(int var2 = 0; var2 < this.Ut.length; ++var2) {
         var1[var2] = this.Ut[this.Ut.length - var2 - 1];
      }

      this.Ut = var1;
   }
}
