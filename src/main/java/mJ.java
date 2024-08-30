public class mj extends lL {
   public mm Wv;
   private mm Ww;
   public mm Wx;
   private boolean Wy;
   public mm Wz;
   private mm WA;
   public mm WB;
   public mm WC;
   private final hS WD = hS.eV();

   public void lf() {
      this.TW.H(0.0625F);
      this.WB.H(0.0625F);
   }

   public void L(boolean var1) {
      super.L(var1);
      this.WB.Xb = var1;
      this.Wv.Xb = var1;
      this.WC.Xb = var1;
      this.Wx.Xb = var1;
      this.Wz.Xb = var1;
      this.WA.Xb = var1;
      this.Ww.Xb = var1;
   }

   public mj(float var1, boolean var2) {
      super(var1, 0.0F, 64, 64);
      this.Wy = var2;
      this.Ww = new mm(this, 24, 0);
      this.Ww.w(-3.0F, -6.0F, -1.0F, 6, 6, 1, var1);
      this.WA = new mm(this, 0, 0);
      this.WA.D(64, 32);
      this.WA.w(-5.0F, 0.0F, -1.0F, 10, 16, 1, var1);
      if (var2) {
         this.TW = new mm(this, 32, 48);
         this.TW.w(-1.0F, -2.0F, -2.0F, 3, 12, 4, var1);
         this.TW.e(5.0F, 2.5F, 0.0F);
         this.TZ = new mm(this, 40, 16);
         this.TZ.w(-2.0F, -2.0F, -2.0F, 3, 12, 4, var1);
         this.TZ.e(-5.0F, 2.5F, 0.0F);
         this.WB = new mm(this, 48, 48);
         this.WB.w(-1.0F, -2.0F, -2.0F, 3, 12, 4, var1 + 0.25F);
         this.WB.e(5.0F, 2.5F, 0.0F);
         this.Wv = new mm(this, 40, 32);
         this.Wv.w(-2.0F, -2.0F, -2.0F, 3, 12, 4, var1 + 0.25F);
         this.Wv.e(-5.0F, 2.5F, 10.0F);
      } else {
         this.TW = new mm(this, 32, 48);
         this.TW.w(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1);
         this.TW.e(5.0F, 2.0F, 0.0F);
         this.WB = new mm(this, 48, 48);
         this.WB.w(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1 + 0.25F);
         this.WB.e(5.0F, 2.0F, 0.0F);
         this.Wv = new mm(this, 40, 32);
         this.Wv.w(-3.0F, -2.0F, -2.0F, 4, 12, 4, var1 + 0.25F);
         this.Wv.e(-5.0F, 2.0F, 10.0F);
      }

      this.Ue = new mm(this, 16, 48);
      this.Ue.w(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.Ue.e(1.9F, 12.0F, 0.0F);
      this.WC = new mm(this, 0, 48);
      this.WC.w(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1 + 0.25F);
      this.WC.e(1.9F, 12.0F, 0.0F);
      this.Wx = new mm(this, 0, 32);
      this.Wx.w(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1 + 0.25F);
      this.Wx.e(-1.9F, 12.0F, 0.0F);
      this.Wz = new mm(this, 16, 32);
      this.Wz.w(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1 + 0.25F);
      this.Wz.e(0.0F, 0.0F, 0.0F);
   }

   public void q(float var1, float var2, float var3, float var4, float var5, float var6, zk var7) {
      super.q(var1, var2, var3, var4, var5, var6, var7);
      q(this.Ue, this.WC);
      q(this.TX, this.Wx);
      q(this.TW, this.WB);
      q(this.TZ, this.Wv);
      q(this.Uf, this.Wz);
   }

   public void B(float var1) {
      if (this.Wy) {
         this.TZ.WW += 0.5F;
         this.TZ.E(var1);
         this.TZ.Xj -= 0.5F;
      } else {
         this.TZ.E(var1);
      }

   }

   public void C(float var1) {
      this.WA.H(var1);
   }

   public void D(float var1) {
      q(this.TY, this.Ww);
      this.Ww.WW = 0.0F;
      this.Ww.Xr = 0.0F;
      this.Ww.H(var1);
   }

   public void lg() {
      this.TZ.H(0.0625F);
      this.Wv.H(0.0625F);
   }

   public void q(zk var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.q(var1, var2, var3, var4, var5, var6, var7);
      pz.nE();
      if (this.TL) {
         float var8 = 2.0F;
         pz.u(1.0F / var8, 1.0F / var8, 1.0F / var8);
         pz.y(0.0F, 24.0F * var7, 0.0F);
         this.WC.H(var7);
         this.Wx.H(var7);
         this.WB.H(var7);
         this.Wv.H(var7);
         this.Wz.H(var7);
      } else {
         if (M.cg.ce.af()) {
            pz.t(0.0D, 0.20000000298023224D * var1.yb().auf(), 0.0D);
         } else if (var1.hI()) {
            pz.y(0.0F, 0.2F, 0.0F);
         }

         this.WC.H(var7);
         this.Wx.H(var7);
         this.WB.H(var7);
         this.Wv.H(var7);
         this.Wz.H(var7);
         this.WD.Bn.dmD.q((iO)var1, var4, var7, this.TY, this.TW, this.TZ);
      }

      pz.nF();
   }
}
