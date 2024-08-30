public class XD {
   private static long ctX = -1L;
   private static int ctY = 0;
   private static boolean ctZ = false;
   private static int cua = 0;
   private static final int cub = 10;
   private static boolean cuc = false;
   private static final long cud = 3000L;
   private static boolean cue = false;

   public static void afv() {
      cue = true;
      if (ctX < 0L) {
         ctX = System.currentTimeMillis();
      }

      if (System.currentTimeMillis() > ctX + 3000L) {
         if (cua > 0) {
            MV.cL(y.q[457 & 4490] + ctY + y.q[-25685 & 8605]);
         }

         ctZ = ctY > 10;
         ctX = System.currentTimeMillis();
         ctY = 0;
         cua = 0;
         cuc = true;
      }

   }

   public static boolean U(int var0) {
      if (!cue) {
         return true;
      } else {
         ++ctY;
         if (cuc) {
            cuc = false;
            return true;
         } else {
            if (ctZ) {
               ++cua;
            }

            return !ctZ;
         }
      }
   }
}
