final class adA implements adF {
   // $FF: synthetic field
   final float dhx;
   // $FF: synthetic field
   final float dhy;
   // $FF: synthetic field
   final acw dhz;

   adA(float var1, float var2, acw var3) {
      this.dhy = var1;
      this.dhx = var2;
      this.dhz = var3;
   }

   public float[] r(adx var1, float var2, float var3) {
      float var4 = var2 * this.dhy;
      float var5 = var3 * this.dhx;
      var4 = this.dhz.apC() + this.dhz.apI() * var4;
      var5 = this.dhz.apN() + this.dhz.apD() * var5;
      ady.arH().Y(var4, var5);
      return null;
   }
}
