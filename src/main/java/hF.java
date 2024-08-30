public class Hf implements He {
   public GX Iv() {
      return null;
   }

   public int Iu() {
      return 9;
   }

   public GX q(EZ var1) {
      int var2 = 0;
      GX var3 = null;

      for(int var4 = 0; var4 < var1.CB(); ++var4) {
         GX var5 = var1.er(var4);
         if (var5 != null) {
            if (var5.do1() == Et.bop) {
               if (var3 != null) {
                  return null;
               }

               var3 = var5;
            } else {
               if (var5.do1() != Et.bmU) {
                  return null;
               }

               ++var2;
            }
         }
      }

      if (var3 != null && var2 >= 1 && Gb.ac(var3) < 2) {
         GX var6 = new GX(Et.bop, var2);
         var6.l((HL)var3.Ie().IA());
         var6.Ie().a(w.q[2809 & 28879], Gb.ac(var3) + 1);
         if (var3.HS()) {
            var6.bD(var3.tg());
         }

         return var6;
      } else {
         return null;
      }
   }

   public boolean e(EZ var1, QI var2) {
      int var3 = 0;
      GX var4 = null;

      for(int var5 = 0; var5 < var1.CB(); ++var5) {
         GX var6 = var1.er(var5);
         if (var6 != null) {
            if (var6.do1() == Et.bop) {
               if (var4 != null) {
                  return false;
               }

               var4 = var6;
            } else {
               if (var6.do1() != Et.bmU) {
                  return false;
               }

               ++var3;
            }
         }
      }

      return var4 != null && var3 > 0;
   }

   public GX[] w(EZ var1) {
      GX[] var2 = new GX[var1.CB()];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         GX var4 = var1.er(var3);
         if (var4 != null && var4.do1() instanceof Gb) {
            var2[var3] = var4;
            break;
         }
      }

      return var2;
   }
}
