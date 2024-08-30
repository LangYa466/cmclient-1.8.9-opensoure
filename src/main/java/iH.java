public class IH {
   public static int bvI = Integer.MIN_VALUE;

   protected static void y(IF var0) {
      if (var0 instanceof JQ) {
         MV.Td().oF();
      }

      if (var0 instanceof JP) {
         JP var1 = (JP)var0;
         bvI = var1.KE();
      } else if (var0 instanceof JJ) {
         JJ var2 = (JJ)var0;
         bvI = var2.Kt();
      } else {
         bvI = Integer.MIN_VALUE;
      }

   }

   public static void q(IF var0, Ie var1, Pe var2) {
      if (!var2.fg()) {
         var2.q(new II(var0, var1));
         throw IQ.bvW;
      } else {
         y(var0);
      }
   }
}
