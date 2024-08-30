// $FF: synthetic class
class fk {
   // $FF: synthetic field
   static final int[] sY = new int[fl.values().length];

   static {
      try {
         sY[fl.sZ.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
         ;
      }

      try {
         sY[fl.ta.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
         ;
      }

   }
}
