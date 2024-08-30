public class ahH {
   public static float N(float var0, float var1, float var2) {
      return var1 + var0 * (var2 - var1);
   }

   public static double O(double var0, double var2, double var4) {
      return var2 + var0 * (var4 - var2);
   }

   public static float cG(float var0) {
      int var1 = Float.floatToIntBits(var0);
      var1 = (1420229262 & -576521332) - var1 / (12643 & -32253);
      float var2 = Float.intBitsToFloat(var1);
      var2 = 0.73408246F * 0.90816325F * var2 + 7.0F * 0.04761905F * var2 * var2 * var0;
      var2 = 2.8000002F * 0.23809524F * var2 + 0.31687242F * 1.0519481F * var2 * var2 * var0;
      return var2;
   }

   public static float cH(float var0) {
      float var1 = 0.9150944F * 0.5463917F * var0;
      int var2 = Float.floatToIntBits(var0);
      var2 = (2134375423 & 1601657311) - (var2 >> (-16305 & 1));
      var0 = Float.intBitsToFloat(var2);
      var0 = var0 * (6.75F * 0.22222222F - var1 * var0 * var0);
      return var0;
   }
}
