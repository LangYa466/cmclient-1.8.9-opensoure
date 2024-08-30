public class os extends nV {
   private zk acp;
   private int acq;
   private OP acr;
   private int acs;

   public os(QI var1, zk var2, OP var3) {
      super(var1, var2.aNZ, var2.xE().bNT + (double)(var2.gJ / 2.0F), var2.aOt, var2.aOd, var2.aOO, var2.aOL);
      this.acp = var2;
      this.acs = 3;
      this.acr = var3;
      this.hv();
   }

   public int mv() {
      return 3;
   }

   public void q(qq var1, zk var2, float var3, float var4, float var5, float var6, float var7, float var8) {
   }

   public void hv() {
      for(int var1 = 0; var1 < 16; ++var1) {
         double var2 = (double)(this.oF.nextFloat() * 2.0F - 1.0F);
         double var4 = (double)(this.oF.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(this.oF.nextFloat() * 2.0F - 1.0F);
         if (var2 * var2 + var4 * var4 + var6 * var6 <= 1.0D) {
            double var8 = this.acp.aNZ + var2 * (double)this.acp.gK / 4.0D;
            double var10 = this.acp.xE().bNT + (double)(this.acp.gJ / 2.0F) + var4 * (double)this.acp.gJ / 4.0D;
            double var12 = this.acp.aOt + var6 * (double)this.acp.gK / 4.0D;
            this.vR.q(this.acr, false, var8, var10, var12, var2, var4 + 0.2D, var6);
         }
      }

      ++this.acq;
      if (this.acq >= this.acs) {
         this.yo();
      }

   }
}
