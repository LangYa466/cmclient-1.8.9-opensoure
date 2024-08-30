class Hn implements He {
   public GX q(EZ var1) {
      for(int var2 = 0; var2 < var1.CB(); ++var2) {
         GX var3 = var1.er(var2);
         if (var3 != null && Ns.ar(var3) > 0) {
            GX var4 = var3.HW();
            var4.bsH = 1;
            return var4;
         }
      }

      return null;
   }

   public boolean e(EZ var1, QI var2) {
      GX var3 = null;
      GX var4 = null;

      for(int var5 = 0; var5 < var1.CB(); ++var5) {
         GX var6 = var1.er(var5);
         if (var6 != null) {
            if (var6.do1() != Et.blK) {
               return false;
            }

            if (var3 != null && var4 != null) {
               return false;
            }

            int var7 = Ns.aq(var6);
            boolean var8 = Ns.ar(var6) > 0;
            if (var3 != null) {
               if (var8) {
                  return false;
               }

               if (var7 != Ns.aq(var3)) {
                  return false;
               }

               var4 = var6;
            } else if (var4 != null) {
               if (!var8) {
                  return false;
               }

               if (var7 != Ns.aq(var4)) {
                  return false;
               }

               var3 = var6;
            } else if (var8) {
               var3 = var6;
            } else {
               var4 = var6;
            }
         }
      }

      return var3 != null && var4 != null;
   }

   private Hn() {
   }

   public GX Iv() {
      return null;
   }

   public int Iu() {
      return 2;
   }

   public GX[] w(EZ var1) {
      GX[] var2 = new GX[var1.CB()];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         GX var4 = var1.er(var3);
         if (var4 != null) {
            if (var4.do1().Ho()) {
               var2[var3] = new GX(var4.do1().Hp());
            } else if (var4.HZ() && Ns.ar(var4) > 0) {
               var2[var3] = var4.HW();
               var2[var3].bsH = 1;
            }
         }
      }

      return var2;
   }
}
