public class nH extends nV {
   float abp;

   public void hv() {
      this.aOf = this.aNZ;
      this.aNH = this.aNK;
      this.aNW = this.aOt;
      if (this.abG++ >= this.abC) {
         this.yo();
      }

      this.h(this.aOd, this.aOO, this.aOL);
      this.abN = (float)((double)this.abN * 0.96D);
      this.abE = (float)((double)this.abE * 0.9D);
      this.aOd *= 0.699999988079071D;
      this.aOO *= 0.699999988079071D;
      this.aOL *= 0.699999988079071D;
      this.aOO -= 0.019999999552965164D;
      if (this.aNG) {
         this.aOd *= 0.699999988079071D;
         this.aOL *= 0.699999988079071D;
      }

   }

   protected nH(QI var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 1.0F);
   }

   public void q(qq var1, zk var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.abG + var3) / (float)this.abC * 32.0F;
      var9 = Pq.n(var9, 0.0F, 1.0F);
      this.abA = this.abp * var9;
      super.q(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   protected nH(QI var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.aOd *= 0.10000000149011612D;
      this.aOO *= 0.10000000149011612D;
      this.aOL *= 0.10000000149011612D;
      this.aOd += var8 * 0.4D;
      this.aOO += var10 * 0.4D;
      this.aOL += var12 * 0.4D;
      this.abD = this.abN = this.abE = (float)(Math.random() * 0.30000001192092896D + 0.6000000238418579D);
      this.abA *= 0.75F;
      this.abA *= var14;
      this.abp = this.abA;
      this.abC = (int)(6.0D / (Math.random() * 0.8D + 0.6D));
      this.abC = (int)((float)this.abC * var14);
      this.aOm = false;
      this.bA(65);
      this.hv();
   }
}
