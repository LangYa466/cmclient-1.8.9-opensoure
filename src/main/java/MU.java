public class mu extends lJ {
   public mm UH;
   public mm XM;
   public mm XN;
   public mm UD;
   public mm XO;

   public mu() {
      float var1 = 4.0F;
      float var2 = 0.0F;
      this.UH = (new mm(this, 0, 0)).D(64, 64);
      this.UH.w(-4.0F, -8.0F, -4.0F, 8, 8, 8, var2 - 0.5F);
      this.UH.e(0.0F, 0.0F + var1, 0.0F);
      this.XN = (new mm(this, 32, 0)).D(64, 64);
      this.XN.w(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.XN.e(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      this.XM = (new mm(this, 32, 0)).D(64, 64);
      this.XM.w(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.XM.e(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      this.UD = (new mm(this, 0, 16)).D(64, 64);
      this.UD.w(-5.0F, -10.0F, -5.0F, 10, 10, 10, var2 - 0.5F);
      this.UD.e(0.0F, 0.0F + var1 + 9.0F, 0.0F);
      this.XO = (new mm(this, 0, 36)).D(64, 64);
      this.XO.w(-6.0F, -12.0F, -6.0F, 12, 12, 12, var2 - 0.5F);
      this.XO.e(0.0F, 0.0F + var1 + 20.0F, 0.0F);
   }

   public void q(zk var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.q(var2, var3, var4, var5, var6, var7, var1);
      this.UD.H(var7);
      this.XO.H(var7);
      this.UH.H(var7);
      this.XN.H(var7);
      this.XM.H(var7);
   }

   public void q(float var1, float var2, float var3, float var4, float var5, float var6, zk var7) {
      super.q(var1, var2, var3, var4, var5, var6, var7);
      this.UH.Xn = var4 / 57.295776F;
      this.UH.Xw = var5 / 57.295776F;
      this.UD.Xn = var4 / 57.295776F * 0.25F;
      float var8 = Pq.bk(this.UD.Xn);
      float var9 = Pq.bi(this.UD.Xn);
      this.XN.Xp = 1.0F;
      this.XM.Xp = -1.0F;
      this.XN.Xn = 0.0F + this.UD.Xn;
      this.XM.Xn = 3.1415927F + this.UD.Xn;
      this.XN.WW = var9 * 5.0F;
      this.XN.Xj = -var8 * 5.0F;
      this.XM.WW = -var9 * 5.0F;
      this.XM.Xj = var8 * 5.0F;
   }
}
