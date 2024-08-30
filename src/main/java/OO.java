public class oo extends nV {
   private float acn;

   public float J(float var1) {
      return 1.0F;
   }

   protected oo(QI var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.aOd *= 0.800000011920929D;
      this.aOO *= 0.800000011920929D;
      this.aOL *= 0.800000011920929D;
      this.aOO = (double)(this.oF.nextFloat() * 0.4F + 0.05F);
      this.abD = this.abN = this.abE = 1.0F;
      this.abA *= this.oF.nextFloat() * 2.0F + 0.2F;
      this.acn = this.abA;
      this.abC = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
      this.aOm = false;
      this.bA(49);
   }

   public void q(qq var1, zk var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.abG + var3) / (float)this.abC;
      this.abA = this.acn * (1.0F - var9 * var9);
      super.q(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void hv() {
      this.aOf = this.aNZ;
      this.aNH = this.aNK;
      this.aNW = this.aOt;
      if (this.abG++ >= this.abC) {
         this.yo();
      }

      float var1 = (float)this.abG / (float)this.abC;
      if (this.oF.nextFloat() > var1) {
         this.vR.q(OP.bRv, this.aNZ, this.aNK, this.aOt, this.aOd, this.aOO, this.aOL);
      }

      this.aOO -= 0.03D;
      this.h(this.aOd, this.aOO, this.aOL);
      this.aOd *= 0.9990000128746033D;
      this.aOO *= 0.9990000128746033D;
      this.aOL *= 0.9990000128746033D;
      if (this.aNG) {
         this.aOd *= 0.699999988079071D;
         this.aOL *= 0.699999988079071D;
      }

   }

   public int I(float var1) {
      float var2 = ((float)this.abG + var1) / (float)this.abC;
      var2 = Pq.n(var2, 0.0F, 1.0F);
      int var3 = super.I(var1);
      short var4 = 240;
      int var5 = var3 >> 16 & 255;
      return var4 | var5 << 16;
   }
}
