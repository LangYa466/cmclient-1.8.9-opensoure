public class oN extends nV {
   protected oN(QI var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4 - 0.125D, var6, var8, var10, var12);
      this.abD = 0.4F;
      this.abN = 0.4F;
      this.abE = 0.7F;
      this.bA(0);
      this.d(0.01F, 0.01F);
      this.abA *= this.oF.nextFloat() * 0.6F + 0.2F;
      this.aOd = var8 * 0.0D;
      this.aOO = var10 * 0.0D;
      this.aOL = var12 * 0.0D;
      this.abC = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void hv() {
      this.aOf = this.aNZ;
      this.aNH = this.aNK;
      this.aNW = this.aOt;
      this.h(this.aOd, this.aOO, this.aOL);
      if (this.vR.g(new NW(this)).ds().cB() != hn.zS) {
         this.yo();
      }

      if (this.abC-- <= 0) {
         this.yo();
      }

   }
}
