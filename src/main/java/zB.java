import java.util.ArrayList;
import java.util.List;

public class Zb {
   public static void w(int[] var0, String var1) {
      int var2 = var0.length / 4;
      MV.cM(var1 + p.q[3549 & 16853] + var0.length + p.q[470 & 26582] + var2);

      for(int var3 = 0; var3 < 4; ++var3) {
         int var4 = var3 * var2;
         float var5 = Float.intBitsToFloat(var0[var4]);
         float var6 = Float.intBitsToFloat(var0[var4 + 1]);
         float var7 = Float.intBitsToFloat(var0[var4 + 2]);
         int var8 = var0[var4 + 3];
         float var9 = Float.intBitsToFloat(var0[var4 + 4]);
         float var10 = Float.intBitsToFloat(var0[var4 + 5]);
         MV.cM(var1 + var3 + p.q[5087 & 471] + var5 + q.q[587 & 12107] + var6 + q.q[4683 & 9835] + var7 + p.q[4568 & 476] + var8 + p.q[473 & 22013] + var9 + q.q[971 & -23973] + var10);
      }

   }

   public static void q(String var0, qw var1, String var2) {
      MV.cM(var2 + p.q[-23593 & 1491] + var1.getClass().getName() + q.q[14906 & -30916] + var0 + p.q[4052 & -15914] + var1.qb() + y.q[1278 & 750] + var1.qe() + y.q[5106 & 9460] + var1.qg());
      w(var1.pV(), r.q[1248 & 18678] + var2);
   }

   public static vz r(vz var0) {
      List var1 = m(var0.ud());
      OK[] var2 = OK.bQO;
      ArrayList var3 = new ArrayList();

      for(int var4 = 0; var4 < var2.length; ++var4) {
         OK var5 = var2[var4];
         List var6 = var0.g(var5);
         List var7 = m(var6);
         var3.add(var7);
      }

      vG var8 = new vG(var1, var3, var0.qy(), var0.qA(), var0.ua(), var0.uc());
      return var8;
   }

   public static List m(List var0) {
      ArrayList var1 = new ArrayList();

      for(Object var3 : var0) {
         qw var4 = (qw)var3;
         qw var5 = r(var4);
         var1.add(var5);
      }

      return var1;
   }

   public static qw r(qw var0) {
      qw var1 = new qw((int[])var0.pV().clone(), var0.qe(), var0.qb(), var0.qg());
      return var1;
   }

   private static void q(String var0, List var1, String var2) {
      for(Object var4 : var1) {
         qw var5 = (qw)var4;
         q(var0, var5, var2);
      }

   }

   public static void t(vz var0) {
      if (var0 != null) {
         MV.cM(p.q[2511 & 4557] + var0 + p.q[16879 & 1486] + var0.qy() + p.q[18895 & 4559] + var0.qA() + p.q[466 & -32271] + var0.ub() + p.q[977 & 10715] + var0.ua());
         OK[] var1 = OK.bQO;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            OK var3 = var1[var2];
            List var4 = var0.g(var3);
            q(var3.bY(), var4, r.q[-32288 & 20200]);
         }

         List var5 = var0.ud();
         q(p.q[474 & 11734], var5, r.q[-24096 & 16611]);
      }

   }
}
