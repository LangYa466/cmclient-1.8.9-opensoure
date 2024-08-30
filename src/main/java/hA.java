public class Ha extends Fm {
   public static boolean c(HL var0) {
      if (var0 == null) {
         return false;
      } else if (!var0.d(w.q[205 & -31537], 9)) {
         return false;
      } else {
         HT var1 = var0.s(w.q[9677 & -25889], 8);

         for(int var2 = 0; var2 < var1.II(); ++var2) {
            String var3 = var1.fy(var2);
            if (var3 == null) {
               return false;
            }

            if (var3.length() > 32767) {
               return false;
            }
         }

         return true;
      }
   }

   public Ha() {
      this.fh(1);
   }

   public GX e(GX var1, QI var2, DD var3) {
      var3.i(var1);
      var3.w(Nj.bKl[Fm.s(this)]);
      return var1;
   }
}
