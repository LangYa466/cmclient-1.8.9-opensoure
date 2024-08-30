public class Qo {
   private static int[] bWa = new int[65536];

   public static int i(double var0, double var2) {
      var2 = var2 * var0;
      int var4 = (int)((1.0D - var0) * 255.0D);
      int var5 = (int)((1.0D - var2) * 255.0D);
      return bWa[var5 << 8 | var4];
   }

   public static int YW() {
      return 6396257;
   }

   public static int YX() {
      return 8431445;
   }

   public static void p(int[] var0) {
      bWa = var0;
   }

   public static int YY() {
      return 4764952;
   }
}
