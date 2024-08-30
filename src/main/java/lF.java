// $FF: synthetic class
class Lf {
   // $FF: synthetic field
   static final int[] bAI = new int[Lg.values().length];

   static {
      try {
         bAI[Lg.bAK.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
         ;
      }

      try {
         bAI[Lg.bAL.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
         ;
      }

   }
}
