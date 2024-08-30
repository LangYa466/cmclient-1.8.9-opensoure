import java.util.Properties;

public class Xs {
   private static final int csI = 2;
   private final boolean csJ;
   private static final int csK = 0;
   private int csL = 2;
   private static final int csM = 1;
   private final PJ csN;
   private int csO = 0;
   private static final int csP = 2;

   private static int k(String var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim();
         int var2 = MV.u(var0, -1);
         if (var2 < 1) {
            Xt.cJ(a.q[1687 & 8358] + var0);
            return var1;
         } else {
            return var2;
         }
      }
   }

   public void bA(int var1, int var2) {
      pz.nx();
      pz.og();
      qk var3 = qk.pm();
      qq var4 = var3.pl();
      MV.fJ().o(this.csN);
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      double var5 = (double)(16 * this.csL);
      double var7 = (double)var1 / var5;
      double var9 = (double)var2 / var5;
      double var11 = 0.0D;
      double var13 = 0.0D;
      if (this.csJ) {
         var11 = (var5 - (double)var1) / (var5 * 2.0D);
         var13 = (var5 - (double)var2) / (var5 * 2.0D);
      }

      switch(this.csO) {
      case 1:
         var5 = (double)Math.max(var1, var2);
         var7 = (double)(this.csL * var1) / var5;
         var9 = (double)(this.csL * var2) / var5;
         if (this.csJ) {
            var11 = (double)this.csL * (var5 - (double)var1) / (var5 * 2.0D);
            var13 = (double)this.csL * (var5 - (double)var2) / (var5 * 2.0D);
         }
         break;
      case 2:
         var7 = (double)this.csL;
         var9 = (double)this.csL;
         var11 = 0.0D;
         var13 = 0.0D;
      }

      var4.q(7, us.axL);
      var4.i(0.0D, (double)var2, 0.0D).e(var11, var13 + var9).v(255, 255, 255, 255).pJ();
      var4.i((double)var1, (double)var2, 0.0D).e(var11 + var7, var13 + var9).v(255, 255, 255, 255).pJ();
      var4.i((double)var1, 0.0D, 0.0D).e(var11 + var7, var13).v(255, 255, 255, 255).pJ();
      var4.i(0.0D, 0.0D, 0.0D).e(var11, var13).v(255, 255, 255, 255).pJ();
      var3.pn();
   }

   private static String q(String var0, int var1, Properties var2) {
      if (var2 == null) {
         return null;
      } else {
         String var3 = var2.getProperty(a.q[3238 & 17043] + var1 + q.q[579 & 6475] + var0);
         if (var3 != null) {
            return var3;
         } else {
            var3 = var2.getProperty(var0);
            return var3;
         }
      }
   }

   public Xs(PJ var1, int var2, int var3, boolean var4) {
      this.csN = var1;
      this.csO = var2;
      this.csL = var3;
      this.csJ = var4;
   }

   public static Xs w(String var0, int var1, Properties var2) {
      PJ var3 = new PJ(var0);
      int var4 = eA(q(a.q[2227 & 5517], var1, var2));
      int var5 = var4 == 0 ? 2 : 1;
      int var6 = k(q(q.q[-14977 & 12409], var1, var2), var5);
      boolean var7 = MV.d(q(t.q[-29798 & 10170], var1, var2), false);
      Xs var8 = new Xs(var3, var4, var6, var7);
      return var8;
   }

   private static int eA(String var0) {
      if (var0 == null) {
         return 0;
      } else {
         var0 = var0.toLowerCase().trim();
         if (var0.equals(q.q[8567 & 359])) {
            return 0;
         } else if (var0.equals(a.q[-32353 & 24707])) {
            return 1;
         } else if (var0.equals(a.q[133 & 1180])) {
            return 2;
         } else {
            Xt.cJ(a.q[-32635 & 4301] + var0);
            return 0;
         }
      }
   }
}
