import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class zv {
   private static final Map aPm = Maps.newHashMap();
   private static final Logger aPn = LogManager.getLogger();
   private static final Map aPo = Maps.newHashMap();
   private static final Map aPp = Maps.newHashMap();
   private static final Map aPq = Maps.newHashMap();
   private static final Map aPr = Maps.newHashMap();
   public static final Map aPs = Maps.newLinkedHashMap();

   public static int bi(String var0) {
      Integer var1 = (Integer)aPm.get(var0);
      return var1 == null ? 90 : var1.intValue();
   }

   public static boolean q(zk var0, String var1) {
      String var2 = D(var0);
      if (var2 == null && var0 instanceof DD) {
         var2 = r.q[6070 & -32602];
      } else if (var2 == null && var0 instanceof Bt) {
         var2 = y.q[19407 & 4813];
      }

      return var1.equals(var2);
   }

   public static zk q(int var0, QI var1) {
      zk var2 = null;

      try {
         Class var3 = dO(var0);
         if (var3 != null) {
            var2 = (zk)var3.getConstructor(QI.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if (var2 == null) {
         aPn.warn(i.q[6656 & -31216] + var0);
      }

      return var2;
   }

   public static String D(zk var0) {
      return (String)aPo.get(var0.getClass());
   }

   public static void yH() {
   }

   public static zk q(HL var0, QI var1) {
      zk var2 = null;
      if (w.q[5063 & 972].equals(var0.bG(w.q[-19905 & 253]))) {
         var0.a(w.q[637 & 16447], BH.eq(var0.bQ(q.q[-30247 & 4544])).bY());
         var0.bU(q.q[-20004 & 18400]);
      }

      try {
         Class var3 = (Class)aPp.get(var0.bG(w.q[445 & 30269]));
         if (var3 != null) {
            var2 = (zk)var3.getConstructor(QI.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if (var2 != null) {
         var2.w(var0);
      } else {
         aPn.warn(i.q[-23807 & 17058] + var0.bG(w.q[-30017 & 8253]));
      }

      return var2;
   }

   public static boolean bj(String var0) {
      return r.q[166 & 5886].equals(var0) || yI().contains(var0);
   }

   private static void q(Class var0, String var1, int var2) {
      if (aPp.containsKey(var1)) {
         throw new IllegalArgumentException(i.q[509 & 9215] + var1);
      } else if (aPr.containsKey(Integer.valueOf(var2))) {
         throw new IllegalArgumentException(i.q[-29187 & 25087] + var2);
      } else if (var2 == 0) {
         throw new IllegalArgumentException(i.q[17919 & -32258] + var2);
      } else if (var0 == null) {
         throw new IllegalArgumentException(i.q[-31233 & 9215] + var2);
      } else {
         aPp.put(var1, var0);
         aPo.put(var0, var1);
         aPr.put(Integer.valueOf(var2), var0);
         aPq.put(var0, Integer.valueOf(var2));
         aPm.put(var1, Integer.valueOf(var2));
      }
   }

   private static void q(Class var0, String var1, int var2, int var3, int var4) {
      q(var0, var1, var2);
      aPs.put(Integer.valueOf(var2), new zw(var2, var3, var4));
   }

   static {
      q(BD.class, w.q[4767 & 935], 1);
      q(BR.class, i.q[595 & 24065], 2);
      q(DN.class, i.q[2574 & -31229], 7);
      q(zu.class, i.q[27139 & 955], 8);
      q(BO.class, i.q[774 & -32100], 9);
      q(DM.class, i.q[525 & -32249], 10);
      q(DT.class, i.q[622 & 20999], 11);
      q(DQ.class, i.q[-17657 & 1599], 12);
      q(DS.class, i.q[792 & -23030], 13);
      q(Bz.class, i.q[8719 & 873], 14);
      q(By.class, i.q[523 & 17978], 15);
      q(DR.class, i.q[-30133 & 5935], 16);
      q(BA.class, i.q[-32180 & 10924], 17);
      q(BE.class, i.q[-28147 & 8877], 18);
      q(DV.class, i.q[19054 & 542], 19);
      q(BQ.class, i.q[1551 & 8735], 20);
      q(BB.class, i.q[2618 & -24043], 21);
      q(BC.class, i.q[32403 & 793], 22);
      q(Bv.class, i.q[2898 & -27982], 30);
      q(Bw.class, i.q[10011 & -30189], 41);
      q(BK.class, BH.aYo.bY(), 42);
      q(BI.class, BH.aYp.bY(), 43);
      q(BL.class, BH.aYq.bY(), 44);
      q(BN.class, BH.aYr.bY(), 45);
      q(BM.class, BH.aYt.bY(), 46);
      q(Ba.class, BH.aYs.bY(), 47);
      q(zB.class, BH.aYu.bY(), 40);
      q(zx.class, e.q[847 & 11087], 48);
      q(Cs.class, i.q[566 & 3996], 49);
      q(BV.class, i.q[-1419 & 541], 50, 894731, 0);
      q(Cz.class, u.q[5029 & -23757], 51, 12698049, 4802889);
      q(CH.class, u.q[803 & -2253], 52, 3419431, 11013646);
      q(Ch.class, i.q[17174 & 9918], 53);
      q(CM.class, u.q[8999 & 874], 54, 44975, 7969893);
      q(CA.class, i.q[-32105 & 4927], 55, 5349438, 8306542);
      q(Cc.class, i.q[12952 & -14568], 56, 16382457, 12369084);
      q(Ct.class, i.q[2747 & -31975], 57, 15373203, 5009705);
      q(BW.class, i.q[1819 & -26022], 58, 1447446, 0);
      q(BU.class, w.q[3572 & 12980], 59, 803406, 11013646);
      q(Cw.class, r.q[5034 & 18214], 60, 7237230, 3158064);
      q(BS.class, e.q[25556 & -28848], 61, 16167425, 16775294);
      q(Cr.class, i.q[5723 & -7365], 62, 3407872, 16579584);
      q(Bo.class, i.q[1565 & 16924], 63);
      q(Bq.class, i.q[893 & 21149], 64);
      q(CU.class, i.q[18142 & 2846], 65, 4996656, 986895);
      q(CL.class, u.q[910 & 27623], 66, 3407872, 5349438);
      q(Cb.class, i.q[9119 & -32225], 67, 1447446, 7237230);
      q(Cj.class, i.q[4769 & 562], 68, 5931634, 15826224);
      q(Dc.class, r.q[878 & -5394], 90, 15771042, 14377823);
      q(Dm.class, w.q[19413 & -28137], 91, 15198183, 16758197);
      q(CW.class, i.q[4709 & -31943], 92, 4470310, 10592673);
      q(CV.class, y.q[-5713 & 4535], 93, 10592673, 16711680);
      q(Do.class, i.q[562 & -13789], 94, 2243405, 7375001);
      q(DA.class, i.q[995 & -30173], 95, 14144467, 13545366);
      q(Da.class, i.q[-11740 & 1972], 96, 10489616, 12040119);
      q(CG.class, i.q[-32219 & 9189], 97);
      q(Db.class, i.q[-28049 & 8742], 98, 15720061, 5653556);
      q(Co.class, i.q[567 & -31897], 99);
      q(CX.class, e.q[21391 & 731], 100, 12623485, 15656192);
      q(Dd.class, i.q[680 & 15932], 101, 10051392, 7555121);
      q(Dr.class, i.q[3689 & 555], 120, 5651507, 12422002);
      q(Bx.class, i.q[3642 & 21035], 200);
   }

   public static zk q(String var0, QI var1) {
      zk var2 = null;

      try {
         Class var3 = (Class)aPp.get(var0);
         if (var3 != null) {
            var2 = (zk)var3.getConstructor(QI.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static int E(zk var0) {
      Integer var1 = (Integer)aPq.get(var0.getClass());
      return var1 == null ? 0 : var1.intValue();
   }

   public static String dN(int var0) {
      return (String)aPo.get(dO(var0));
   }

   public static Class dO(int var0) {
      return (Class)aPr.get(Integer.valueOf(var0));
   }

   public static List yI() {
      Set var0 = aPp.keySet();
      ArrayList var1 = Lists.newArrayList();

      for(String var3 : var0) {
         Class var4 = (Class)aPp.get(var3);
         if ((var4.getModifiers() & 1024) != 1024) {
            var1.add(var3);
         }
      }

      var1.add(y.q[1997 & -29971]);
      return var1;
   }
}
