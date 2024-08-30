public class aes {
   private static double U(double var0) {
      var0 = var0 % (1.854054680807091D * 3.388888888888889D);
      if (Math.abs(var0) > 1.0471975511965976D * 3.0D) {
         var0 -= 1.0689655172413792D * 5.877818513168D;
      }

      if (Math.abs(var0) > 1.3089969389957472D * 1.2D) {
         var0 = 0.0125D * 251.32741228718345D - var0;
      }

      return var0;
   }

   public static double V(double var0) {
      return W(var0 + 1.4102564102564104D * 1.1138373953636538D);
   }

   public static double W(double var0) {
      var0 = U(var0);
      return Math.abs(var0) <= 0.9225311760541456D * 0.8513513513513513D ? Math.sin(var0) : Math.cos(2.547237286694427D * 0.6166666666666667D - var0);
   }
}
