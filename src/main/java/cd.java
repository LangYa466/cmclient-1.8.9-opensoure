class Cd extends zW {
   private Cc aZS;
   public int aZT;

   public boolean Av() {
      return this.aZS.zc() != null;
   }

   public void Az() {
      this.aZT = 0;
   }

   public void Aw() {
      this.aZS.aE(false);
   }

   public Cd(Cc var1) {
      this.aZS = var1;
   }

   public void Ax() {
      zz var1 = this.aZS.zc();
      double var2 = 64.0D;
      if (var1.B(this.aZS) < var2 * var2 && this.aZS.J(var1)) {
         QI var4 = this.aZS.vR;
         ++this.aZT;
         if (this.aZT == 10) {
            var4.w((DD)null, 1007, new NW(this.aZS), 0);
         }

         if (this.aZT == 20) {
            double var5 = 4.0D;
            PX var7 = this.aZS.l(1.0F);
            double var8 = var1.aNZ - (this.aZS.aNZ + var7.bUV * var5);
            double var10 = var1.xE().bNT + (double)(var1.gJ / 2.0F) - (0.5D + this.aZS.aNK + (double)(this.aZS.gJ / 2.0F));
            double var12 = var1.aOt - (this.aZS.aOt + var7.bUX * var5);
            var4.w((DD)null, 1008, new NW(this.aZS), 0);
            DQ var14 = new DQ(var4, this.aZS, var8, var10, var12);
            var14.bgp = this.aZS.De();
            var14.aNZ = this.aZS.aNZ + var7.bUV * var5;
            var14.aNK = this.aZS.aNK + (double)(this.aZS.gJ / 2.0F) + 0.5D;
            var14.aOt = this.aZS.aOt + var7.bUX * var5;
            var4.p(var14);
            this.aZT = -40;
         }
      } else if (this.aZT > 0) {
         --this.aZT;
      }

      this.aZS.aE(this.aZT > 10);
   }
}
