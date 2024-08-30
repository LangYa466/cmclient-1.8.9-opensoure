import java.util.Comparator;

class kV implements Comparator {
   // $FF: synthetic field
   final kS QU;
   // $FF: synthetic field
   final kU QV;

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.q((Nh)var1, (Nh)var2);
   }

   kV(kU var1, kS var2) {
      this.QV = var1;
      this.QU = var2;
   }

   public int q(Nh var1, Nh var2) {
      int var3 = Fm.s(var1.TA());
      int var4 = Fm.s(var2.TA());
      Nb var5 = null;
      Nb var6 = null;
      if (this.QV.QR == 2) {
         var5 = Nj.bKr[var3];
         var6 = Nj.bKr[var4];
      } else if (this.QV.QR == 0) {
         var5 = Nj.bKp[var3];
         var6 = Nj.bKp[var4];
      } else if (this.QV.QR == 1) {
         var5 = Nj.bKl[var3];
         var6 = Nj.bKl[var4];
      }

      if (var5 != null || var6 != null) {
         if (var5 == null) {
            return 1;
         }

         if (var6 == null) {
            return -1;
         }

         int var7 = kS.s(this.QV.QT).e(var5);
         int var8 = kS.s(this.QV.QT).e(var6);
         if (var7 != var8) {
            return (var7 - var8) * this.QV.QN;
         }
      }

      return var3 - var4;
   }
}
