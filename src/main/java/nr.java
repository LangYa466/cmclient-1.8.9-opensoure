public class nR extends nV {
   private double abu;
   private double abv;
   private float abw;
   private double abx;

   public float J(float var1) {
      float var2 = super.J(var1);
      float var3 = (float)this.abG / (float)this.abC;
      var3 = var3 * var3;
      var3 = var3 * var3;
      return var2 * (1.0F - var3) + var3;
   }

   public int I(float var1) {
      int var2 = super.I(var1);
      float var3 = (float)this.abG / (float)this.abC;
      var3 = var3 * var3;
      var3 = var3 * var3;
      int var4 = var2 & 255;
      int var5 = var2 >> 16 & 255;
      var5 = var5 + (int)(var3 * 15.0F * 16.0F);
      if (var5 > 240) {
         var5 = 240;
      }

      return var4 | var5 << 16;
   }

   protected nR(QI var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.aOd = var8;
      this.aOO = var10;
      this.aOL = var12;
      this.abv = var2;
      this.abu = var4;
      this.abx = var6;
      this.aNZ = this.aOf = var2 + var8;
      this.aNK = this.aNH = var4 + var10;
      this.aOt = this.aNW = var6 + var12;
      float var14 = this.oF.nextFloat() * 0.6F + 0.4F;
      this.abw = this.abA = this.oF.nextFloat() * 0.5F + 0.2F;
      this.abD = this.abN = this.abE = 1.0F * var14;
      this.abN *= 0.9F;
      this.abD *= 0.9F;
      this.abC = (int)(Math.random() * 10.0D) + 30;
      this.aOm = true;
      this.bA((int)(Math.random() * 26.0D + 1.0D + 224.0D));
   }

   public void hv() {
      this.aOf = this.aNZ;
      this.aNH = this.aNK;
      this.aNW = this.aOt;
      float var1 = (float)this.abG / (float)this.abC;
      var1 = 1.0F - var1;
      float var2 = 1.0F - var1;
      var2 = var2 * var2;
      var2 = var2 * var2;
      this.aNZ = this.abv + this.aOd * (double)var1;
      this.aNK = this.abu + this.aOO * (double)var1 - (double)(var2 * 1.2F);
      this.aOt = this.abx + this.aOL * (double)var1;
      if (this.abG++ >= this.abC) {
         this.yo();
      }

   }
}
