import java.security.AccessController;

public class adR {
   private static boolean dhW = (boolean)(2208 & -31996);
   private static boolean dhX = (boolean)(16457 & 163);
   private static final String dhY = "org.newdawn.slick.pngloader";

   // $FF: synthetic method
   static boolean cP(boolean var0) {
      dhX = var0;
      return var0;
   }

   public static adV hs(String var0) {
      asd();
      var0 = var0.toLowerCase();
      if (var0.endsWith(o.q[-19186 & -19026 & -26722 & 8703])) {
         return new aeb();
      } else if (var0.endsWith(q.q[8510 & -9428 & -12193 & -3553])) {
         adN var2 = new adN();
         if (dhX) {
            var2.q(new adZ());
         }

         var2.q(new adT());
         return var2;
      } else {
         return new adT();
      }
   }

   private static void asd() {
      if (!dhW) {
         dhW = (boolean)(17425 & -32445);

         try {
            AccessController.doPrivileged(new adS());
         } catch (Throwable var1) {
            ;
         }
      }

   }
}
