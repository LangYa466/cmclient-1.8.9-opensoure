import java.util.ArrayList;
import java.util.List;

public class XV {
   private static vz cvy = null;
   private static List cvz = null;
   private static List cvA = null;
   private static vz cvB = null;
   private static vz cvC = null;
   private static vz cvD = null;
   private static vz cvE = null;
   private static vz cvF = null;
   private static vz cvG = null;
   private static List cvH = null;
   private static vz cvI = null;
   private static List cvJ = null;
   private static vz cvK = null;
   private static List cvL = null;
   private static vz cvM = null;
   private static List cvN = null;
   private static vz cvO = null;
   private static vz cvP = null;

   public static void afQ() {
      ArrayList var0 = new ArrayList();
      cvB = q(w.q[-27810 & 791], var0);
      cvF = q(w.q[-20682 & 21331], var0);
      cvO = q(w.q[856 & -7270], var0);
      cvM = q(w.q[-30916 & 21460], var0);
      cvP = q(w.q[-13554 & 799], var0);
      cvK = q(w.q[9048 & 2835], var0);
      cvH = w(cvB);
      cvN = w(cvF);
      cvJ = w(cvO);
      cvz = w(cvM);
      cvA = w(cvP);
      cvL = w(cvK);
      cvI = e(cvB);
      cvE = e(cvF);
      cvG = e(cvO);
      cvC = e(cvM);
      cvD = e(cvP);
      cvy = e(cvK);
      if (var0.size() > 0) {
         MV.cM(i.q[187 & 14507] + MV.w(var0.toArray()));
      }

   }

   public static boolean w(hI var0, hI var1) {
      if (var0 == var1) {
         return true;
      } else {
         boolean var10000;
         label33: {
            cv var2 = var0.ds();
            cv var3 = var1.ds();
            if (var2 == var3) {
               if (var2 instanceof eQ) {
                  if (((ff)var0.w(eQ.sd)).equals(var1.w(eQ.sd))) {
                     break label33;
                  }
               } else if (var2 instanceof eJ && ((ff)var0.w(eJ.rY)).equals(var1.w(eJ.rY))) {
                  break label33;
               }
            }

            var10000 = false;
            return var10000;
         }

         var10000 = true;
         return var10000;
      }
   }

   private static List w(vz var0) {
      return var0 == null ? null : var0.ud();
   }

   private static vz e(vz var0) {
      if (var0 == null) {
         return null;
      } else if (var0.ud().size() > 0) {
         MV.cJ(i.q[19951 & 4270] + var0.ud().size() + i.q[8367 & 22719] + var0);
         return var0;
      } else {
         OK[] var1 = OK.bQO;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            OK var3 = var1[var2];
            List var4 = var0.g(var3);
            if (var4.size() != 1) {
               MV.cJ(i.q[18681 & 1202] + var3 + i.q[9905 & 16823] + var4.size() + i.q[175 & 25839] + var0);
               return var0;
            }
         }

         vz var12 = Zb.r(var0);
         List[] var13 = new List[var1.length];

         for(int var14 = 0; var14 < var1.length; ++var14) {
            OK var5 = var1[var14];
            List var6 = var12.g(var5);
            qw var7 = (qw)var6.get(0);
            qw var8 = new qw((int[])var7.pV().clone(), var7.qe(), var7.qb(), var7.qg());
            int[] var9 = var8.pV();
            int[] var10 = (int[])var9.clone();
            int var11 = var9.length / 4;
            System.arraycopy(var9, 0, var10, 3 * var11, var11);
            System.arraycopy(var9, var11, var10, 2 * var11, var11);
            System.arraycopy(var9, 2 * var11, var10, var11, var11);
            System.arraycopy(var9, 3 * var11, var10, 0, var11);
            System.arraycopy(var10, 0, var9, 0, var10.length);
            var6.add(var8);
         }

         return var12;
      }
   }

   static vz q(String var0, List var1) {
      vD var2 = MV.mX();
      if (var2 == null) {
         return null;
      } else {
         PJ var3 = new PJ(q.q[1695 & 2991] + var0 + i.q[28844 & 1726]);
         if (MV.I(var3) != MV.SS()) {
            return null;
         } else {
            PJ var4 = new PJ(i.q[8367 & -31555] + var0 + i.q[2300 & 1197]);
            if (MV.I(var4) != MV.SS()) {
               return null;
            } else {
               vE var5 = new vE(var0 + e.q[4537 & 25521], q.q[-19762 & 18071]);
               vz var6 = var2.q(var5);
               if (var6 != null && var6 != var2.ur()) {
                  List var7 = var6.ud();
                  if (var7.size() == 0) {
                     return var6;
                  } else if (var7.size() != 6) {
                     return null;
                  } else {
                     for(Object var9 : var7) {
                        qw var10 = (qw)var9;
                        List var11 = var6.g(var10.qb());
                        if (var11.size() > 0) {
                           return null;
                        }

                        var11.add(var10);
                     }

                     var7.clear();
                     var1.add(var0 + e.q[2481 & -23625]);
                     return var6;
                  }
               } else {
                  return null;
               }
            }
         }
      }
   }

   public static vz q(vz var0, hI var1) {
      if (!MV.Rj()) {
         return var0;
      } else {
         List var2 = var0.ud();
         return var2 == cvH ? cvI : (var2 == cvN ? cvE : (var2 == cvJ ? cvG : (var2 == cvz ? cvC : (var2 == cvA ? cvD : (var2 == cvL ? cvy : var0)))));
      }
   }
}
