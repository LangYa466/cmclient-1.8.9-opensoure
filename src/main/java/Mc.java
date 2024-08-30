public class mc extends lJ {
   public mm Wc;
   public mm Wd;
   public mm We;
   public mm Wf;
   public mm Wg;
   public mm Wh;

   public mc(float var1) {
      this(var1, -7.0F);
   }

   public void q(zz var1, float var2, float var3, float var4) {
      Co var5 = (Co)var1;
      int var6 = var5.Dn();
      if (var6 > 0) {
         this.Wg.Xw = -2.0F + 1.5F * this.u((float)var6 - var4, 10.0F);
         this.Wf.Xw = -2.0F + 1.5F * this.u((float)var6 - var4, 10.0F);
      } else {
         int var7 = var5.Dp();
         if (var7 > 0) {
            this.Wg.Xw = -0.8F + 0.025F * this.u((float)var7, 70.0F);
            this.Wf.Xw = 0.0F;
         } else {
            this.Wg.Xw = (-0.2F + 1.5F * this.u(var2, 13.0F)) * var3;
            this.Wf.Xw = (-0.2F - 1.5F * this.u(var2, 13.0F)) * var3;
         }
      }

   }

   public void q(float var1, float var2, float var3, float var4, float var5, float var6, zk var7) {
      this.Wh.Xn = var4 / 57.295776F;
      this.Wh.Xw = var5 / 57.295776F;
      this.Wc.Xw = -1.5F * this.u(var1, 13.0F) * var2;
      this.We.Xw = 1.5F * this.u(var1, 13.0F) * var2;
      this.Wc.Xn = 0.0F;
      this.We.Xn = 0.0F;
   }

   public void q(zk var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.q(var2, var3, var4, var5, var6, var7, var1);
      this.Wh.H(var7);
      this.Wd.H(var7);
      this.Wc.H(var7);
      this.We.H(var7);
      this.Wg.H(var7);
      this.Wf.H(var7);
   }

   private float u(float var1, float var2) {
      return (Math.abs(var1 % var2 - var2 * 0.5F) - var2 * 0.25F) / (var2 * 0.25F);
   }

   public mc() {
      this(0.0F);
   }

   public mc(float var1, float var2) {
      short var3 = 128;
      short var4 = 128;
      this.Wh = (new mm(this)).D(var3, var4);
      this.Wh.e(0.0F, 0.0F + var2, -2.0F);
      this.Wh.C(0, 0).w(-4.0F, -12.0F, -5.5F, 8, 10, 8, var1);
      this.Wh.C(24, 0).w(-1.0F, -5.0F, -7.5F, 2, 4, 2, var1);
      this.Wd = (new mm(this)).D(var3, var4);
      this.Wd.e(0.0F, 0.0F + var2, 0.0F);
      this.Wd.C(0, 40).w(-9.0F, -2.0F, -6.0F, 18, 12, 11, var1);
      this.Wd.C(0, 70).w(-4.5F, 10.0F, -3.0F, 9, 5, 6, var1 + 0.5F);
      this.Wg = (new mm(this)).D(var3, var4);
      this.Wg.e(0.0F, -7.0F, 0.0F);
      this.Wg.C(60, 21).w(-13.0F, -2.5F, -3.0F, 4, 30, 6, var1);
      this.Wf = (new mm(this)).D(var3, var4);
      this.Wf.e(0.0F, -7.0F, 0.0F);
      this.Wf.C(60, 58).w(9.0F, -2.5F, -3.0F, 4, 30, 6, var1);
      this.Wc = (new mm(this, 0, 22)).D(var3, var4);
      this.Wc.e(-4.0F, 18.0F + var2, 0.0F);
      this.Wc.C(37, 0).w(-3.5F, -3.0F, -3.0F, 6, 16, 5, var1);
      this.We = (new mm(this, 0, 22)).D(var3, var4);
      this.We.Xx = true;
      this.We.C(60, 0).e(5.0F, 18.0F + var2, 0.0F);
      this.We.w(-3.5F, -3.0F, -3.0F, 6, 16, 5, var1);
   }
}
