public class oq extends nV {
   float aco;

   protected oq(QI var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 2.0F);
   }

   protected oq(QI var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.aOd *= 0.009999999776482582D;
      this.aOO *= 0.009999999776482582D;
      this.aOL *= 0.009999999776482582D;
      this.aOO += 0.2D;
      this.abD = Pq.bk(((float)var8 + 0.0F) * 3.1415927F * 2.0F) * 0.65F + 0.35F;
      this.abN = Pq.bk(((float)var8 + 0.33333334F) * 3.1415927F * 2.0F) * 0.65F + 0.35F;
      this.abE = Pq.bk(((float)var8 + 0.6666667F) * 3.1415927F * 2.0F) * 0.65F + 0.35F;
      this.abA *= 0.75F;
      this.abA *= var14;
      this.aco = this.abA;
      this.abC = 6;
      this.aOm = false;
      this.bA(64);
   }

   public void hv() {
      this.aOf = this.aNZ;
      this.aNH = this.aNK;
      this.aNW = this.aOt;
      if (this.abG++ >= this.abC) {
         this.yo();
      }

      this.h(this.aOd, this.aOO, this.aOL);
      if (this.aNK == this.aNH) {
         this.aOd *= 1.1D;
         this.aOL *= 1.1D;
      }

      this.aOd *= 0.6600000262260437D;
      this.aOO *= 0.6600000262260437D;
      this.aOL *= 0.6600000262260437D;
      if (this.aNG) {
         this.aOd *= 0.699999988079071D;
         this.aOL *= 0.699999988079071D;
      }

   }

   public void q(qq var1, zk var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.abG + var3) / (float)this.abC * 32.0F;
      var9 = Pq.n(var9, 0.0F, 1.0F);
      this.abA = this.aco * var9;
      super.q(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
