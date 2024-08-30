public enum Lm {
   bBh,
   bBi,
   bBj,
   bBk,
   bBl;

   public static Lm ca(String var0) {
      for(Lm var4 : values()) {
         if (var4.name().equalsIgnoreCase(var0)) {
            return var4;
         }
      }

      return bBh;
   }

   public static String[] Np() {
      String[] var0 = new String[values().length];
      int var1 = 0;

      for(Lm var5 : values()) {
         var0[var1++] = var5.name().toLowerCase();
      }

      return var0;
   }
}
