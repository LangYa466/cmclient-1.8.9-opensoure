import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class WQ {
   private static boolean coF = true;
   private static tO coG = null;
   private static vz coH = null;
   private static boolean coI = true;
   private static boolean coJ = true;
   private static boolean coK = true;
   private static tO coL = null;
   private static vz coM = null;
   private static boolean coNN = false;
   private static vz coO = null;
   private static boolean coP = false;
   private static vz coQ = null;
   private static boolean coR = false;
   private static tO coS = null;
   private static tO coT = null;
   private static tO coU = null;
   private static boolean coV = true;
   private static boolean coW = true;

   public static void aW() {
      if (coP) {
         coM = YY.w(coS, 0);
         if (coNN) {
            vz var0 = YY.w(coT, -1);
            coM = YY.q(var0, coM);
         }

         coO = YY.w(coL, -1);
         coQ = YY.w(coG, 0);
         coH = YY.w(coU, -1);
         coR = true;
      }

   }

   public static void w(tU var0) {
      coP = false;
      coR = false;
      e(var0);
   }

   private static List q(Qx var0, hI var1, NW var2, OK var3, List var4) {
      cv var5 = q(var2, OK.bQC, var0);
      if (var1.w(dp.ot) != dq.ow) {
         return var4;
      } else {
         boolean var6 = var5 == Ea.biM || var5 == Ea.bhe;
         if (MV.Sq()) {
            if (var6) {
               if (coF && q(var2, var3, var0) == Ea.bhe) {
                  return coH.g(var3);
               }
            } else if (coV) {
               NW var7 = var2.Vj().v(var3);
               hI var8 = var0.g(var7);
               if (var8.ds() == Ea.bjj && var8.w(dp.ot) == dq.ow) {
                  return coQ.g(var3);
               }
            }
         } else if (var6) {
            if (coF) {
               return coH.g(var3);
            }
         } else if (coV) {
            return coQ.g(var3);
         }

         return var4;
      }
   }

   public static List w(Qx var0, hI var1, NW var2, OK var3, List var4) {
      if (var3 != OK.bQC && var3 != OK.bQB) {
         if (!coR) {
            return var4;
         } else {
            cv var5 = var1.ds();
            return var5 instanceof eF ? e(var0, var1, var2, var3, var4) : (var5 instanceof dp ? q(var0, var1, var2, var3, var4) : (var5 instanceof eb ? r(var0, var1, var2, var3, var4) : var4));
         }
      } else {
         return var4;
      }
   }

   private static tO q(Properties var0, String var1, String var2, tU var3) {
      String var4 = var0.getProperty(var1);
      if (var4 == null) {
         var4 = var2;
      }

      PJ var5 = new PJ(q.q[-31409 & 26959] + var4 + q.q[17196 & 4189]);
      if (!MV.H(var5)) {
         MV.cJ(a.q[-32749 & 10643] + var5);
         var4 = var2;
      }

      PJ var6 = new PJ(var4);
      tO var7 = var3.j(var6);
      return var7;
   }

   private static boolean q(Properties var0, String var1, boolean var2) {
      String var3 = var0.getProperty(var1);
      return var3 == null ? var2 : Boolean.parseBoolean(var3);
   }

   private static List e(Qx var0, hI var1, NW var2, OK var3, List var4) {
      cv var5 = var0.g(var2.Vi()).ds();
      boolean var6 = var5 == Ea.biM || var5 == Ea.bhe;
      if (MV.Sq()) {
         if (var6) {
            if (coW && q(var2, var3, var0) == Ea.bhe) {
               return coH.g(var3);
            }
         } else if (coK && q(var2.Vj(), var3, var0) == Ea.bjD) {
            return coO.g(var3);
         }
      } else if (var6) {
         if (coW) {
            return coH.g(var3);
         }
      } else if (coK) {
         return coO.g(var3);
      }

      return var4;
   }

   private static cv q(NW var0, OK var1, Qx var2) {
      NW var3 = var0.v(var1);
      cv var4 = var2.g(var3).ds();
      return var4;
   }

   private static void e(tU var0) {
      coJ = true;
      coK = true;
      coV = true;
      coI = true;
      coW = true;
      coF = true;
      coS = var0.j(new PJ(a.q[265 & 21553]));
      coT = var0.j(new PJ(a.q[-31482 & 25162]));
      coL = var0.j(new PJ(a.q[2247 & 5123]));
      coG = var0.j(new PJ(a.q[199 & 28]));
      coU = var0.j(new PJ(a.q[15749 & -16377]));
      coP = true;
      String var1 = a.q[6 & 486];

      try {
         PJ var2 = new PJ(var1);
         if (!MV.H(var2)) {
            return;
         }

         InputStream var3 = MV.b(var2);
         if (var3 == null) {
            return;
         }

         boolean var4 = MV.J(var2);
         if (var4) {
            MV.cM(a.q[21095 & 143] + var1);
         } else {
            MV.cM(a.q[4105 & -15096] + var1);
         }

         net.optifine.util.F var5 = new net.optifine.util.F();
         var5.load(var3);
         var3.close();
         coJ = q(var5, w.q[1782 & 2610], true);
         coK = q(var5, e.q[925 & -31851], true);
         coV = q(var5, q.q[750 & 18358], true);
         coI = q(var5, a.q[-23761 & 20489], true);
         coW = q(var5, a.q[-27637 & 10], true);
         coF = q(var5, a.q[16395 & -30773], true);
         coNN = q(var5, a.q[17037 & 2076], false);
         coS = q(var5, a.q[12477 & 1101], a.q[13331 & 705], var0);
         coT = q(var5, a.q[398 & -19377], a.q[8323 & -12758], var0);
         coL = q(var5, a.q[10383 & 4191], a.q[215 & 23819], var0);
         coG = q(var5, a.q[-20303 & 18], a.q[4133 & 25094], var0);
         coU = q(var5, a.q[-8173 & 7997], a.q[16453 & 2349], var0);
      } catch (IOException var6) {
         MV.cJ(a.q[10258 & 20562] + var1 + q.q[622 & 25710] + var6.getClass().getName() + q.q[23172 & -22890] + var6.getMessage());
      }

   }

   private static List r(Qx var0, hI var1, NW var2, OK var3, List var4) {
      cv var5 = var0.g(var2.Vi()).ds();
      boolean var6 = var5 == Ea.biM || var5 == Ea.bhe;
      if (MV.Sq()) {
         if (var6) {
            if (coI && q(var2, var3, var0) == Ea.bhe) {
               return coH.g(var3);
            }
         } else if (coJ && q(var2.Vj(), var3, var0) == Ea.biQ) {
            return coM.g(var3);
         }
      } else if (var6) {
         if (coI) {
            return coH.g(var3);
         }
      } else if (coJ) {
         return coM.g(var3);
      }

      return var4;
   }
}
