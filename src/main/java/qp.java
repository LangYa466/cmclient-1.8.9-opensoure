public class Qp {
   private static int[] bWb = new int[65536];

   public static void a(int[] var0) {
      bWb = var0;
   }

   public static int o(double var0, double var2) {
      var2 = var2 * var0;
      int var4 = (int)((1.0D - var0) * 255.0D);
      int var5 = (int)((1.0D - var2) * 255.0D);
      int var6 = var5 << 8 | var4;
      return var6 > bWb.length ? -65281 : bWb[var6];
   }
}
