public enum Yp {
   cwI,
   cwJ,
   cwK;

   public static Yp q(QI var0, float var1) {
      float var2 = var0.bp(var1);
      if (var2 > 0.5F) {
         return cwK;
      } else {
         float var3 = var0.bu(var1);
         return var3 > 0.5F ? cwJ : cwI;
      }
   }
}
