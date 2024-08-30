public enum bY {
   kY((boolean)(4356 & -30200)),
   kZ((boolean)(320 & 12)),
   la((boolean)(5200 & -30683)),
   lb((boolean)(10253 & -32733)),
   lc((boolean)(3397 & 29321)),
   ld((boolean)(4113 & 18689)),
   le((boolean)(-31741 & 20644));

   private final boolean lf;

   private bY(boolean var3) {
      this.lf = var3;
   }

   public boolean bK() {
      return this.lf;
   }

   static bY o(String var0) {
      if (var0 == null) {
         return kY;
      } else {
         bY[] var1 = values();
         int var2 = var1.length;

         for(int var3 = 3523 & 4624; var3 < var2; ++var3) {
            bY var4 = var1[var3];
            if (var4 != le && var4.name().equalsIgnoreCase(var0)) {
               return var4;
            }
         }

         return le;
      }
   }

   static {
      bY[] var10000 = new bY[16535 & 9551];
      var10000[9601 & -30702] = kY;
      var10000[10241 & 21289] = kZ;
      var10000[1602 & 18451] = la;
      var10000[5123 & -24057] = lb;
      var10000[2269 & -8188] = lc;
      var10000[24837 & -26083] = ld;
      var10000[18454 & -31986] = le;
   }
}
