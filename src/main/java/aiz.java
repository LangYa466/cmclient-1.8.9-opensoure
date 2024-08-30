public final class aiz {
   public static int D(double var0) {
      int var2 = (int)var0;
      return var0 < (double)var2 ? var2 - (115 & 18697) : var2;
   }

   public static float e(float var0, float var1, float var2, float var3, float var4) {
      return (var0 - var1) / (var2 - var1) * (var4 - var3) + var3;
   }

   public static float N(float var0, float var1, float var2) {
      return var2 >= 1.0F ? var1 : (var2 <= 0.0F ? var0 : var0 + (var1 - var0) * var2);
   }

   public static double T(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var0, var4));
   }
}
