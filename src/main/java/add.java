final class adD implements adF {
   // $FF: synthetic field
   final float[] dhE;
   // $FF: synthetic field
   final acz dhF;
   // $FF: synthetic field
   final float dhG;
   // $FF: synthetic field
   final float dhH;
   // $FF: synthetic field
   final acw dhI;

   adD(acz var1, float[] var2, float var3, float var4, acw var5) {
      this.dhF = var1;
      this.dhE = var2;
      this.dhG = var3;
      this.dhH = var4;
      this.dhI = var5;
   }

   public float[] r(adx var1, float var2, float var3) {
      this.dhF.q(var1, var2 - this.dhE[12296 & 19012], var3 - this.dhE[-27997 & 17425]).apq();
      adJ var4 = this.dhF.w(var1, var2, var3);
      var2 = var2 + var4.bUa;
      var3 = var3 + var4.bUb;
      float var5 = var2 * this.dhG;
      float var6 = var3 * this.dhH;
      var5 = this.dhI.apC() + this.dhI.apI() * var5;
      var6 = this.dhI.apN() + this.dhI.apD() * var6;
      ady.arH().Y(var5, var6);
      float[] var10000 = new float[-15242 & 5002];
      var10000[10277 & 4624] = var4.bUa + var2;
      var10000[4717 & 10369] = var4.bUb + var3;
      return var10000;
   }
}
