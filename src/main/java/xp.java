import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Xp {
   private static Xo[][] csB = (Xo[][])null;
   private static final qN csC = new qN();
   private static boolean csD = true;
   private static Xo[][] csE = (Xo[][])null;
   private static final int[][] csF = new int[0][];
   private static Map csG = null;
   private static final boolean csH = false;

   public static boolean q(sj var0, GX var1, vz var2) {
      if (csB == null) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         int[][] var3 = ay(var1);
         if (var3.length <= 0) {
            return false;
         } else {
            HashSet var4 = null;
            boolean var5 = false;
            tS var6 = MV.fJ();

            for(int var7 = 0; var7 < var3.length; ++var7) {
               int var8 = var3[var7][0];
               if (var8 >= 0 && var8 < csB.length) {
                  Xo[] var9 = csB[var8];
                  if (var9 != null) {
                     for(int var10 = 0; var10 < var9.length; ++var10) {
                        Xo var11 = var9[var10];
                        if (var4 == null) {
                           var4 = new HashSet();
                        }

                        if (var4.add(Integer.valueOf(var8)) && q(var11, var1, var3) && var11.Xy != null) {
                           var6.o(var11.Xy);
                           float var12 = var11.e(var6);
                           if (!var5) {
                              var5 = true;
                              pz.O(false);
                              pz.bR(514);
                              pz.nx();
                              pz.bO(5890);
                           }

                           Zt.o(var11.crX, 1.0F);
                           pz.nE();
                           pz.u(var12 / 2.0F, var12 / 2.0F, var12 / 2.0F);
                           float var13 = var11.bck * (float)(hS.fe() % 3000L) / 3000.0F / 8.0F;
                           pz.y(var13, 0.0F, 0.0F);
                           pz.i(var11.csd, 0.0F, 0.0F, 1.0F);
                           var0.q(var2, -1);
                           pz.nF();
                        }
                     }
                  }
               }
            }

            if (var5) {
               pz.hT();
               pz.nX();
               pz.P(770, 771);
               pz.u(1.0F, 1.0F, 1.0F, 1.0F);
               pz.bO(5888);
               pz.oe();
               pz.bR(515);
               pz.O(true);
               var6.o(tU.awb);
            }

            return var5;
         }
      }
   }

   private static PJ q(GX var0, int var1, String var2) {
      Xo var3 = u(var0, 3);
      if (var3 == null) {
         return null;
      } else if (var3.csv == null) {
         return var3.Xy;
      } else {
         Fm var4 = var0.do1();
         if (!(var4 instanceof FH)) {
            return null;
         } else {
            FH var5 = (FH)var4;
            String var6 = var5.HI().bY();
            StringBuffer var7 = new StringBuffer();
            var7.append(q.q[8911 & 1806]);
            var7.append(var6);
            var7.append(p.q[613 & 9839]);
            var7.append(var1);
            if (var2 != null) {
               var7.append(q.q[575 & 30319]);
               var7.append(var2);
            }

            String var8 = var7.toString();
            PJ var9 = (PJ)var3.csv.get(var8);
            return var9 == null ? var3.Xy : var9;
         }
      }
   }

   private static void q(Xo var0, List var1) {
      if (var0.cst != null) {
         for(int var2 = 0; var2 < var0.cst.length; ++var2) {
            int var3 = var0.cst[var2];
            if (var3 <= 0) {
               MV.cJ(p.q[4716 & 25316] + var3);
            } else {
               q(var0, var1, var3);
            }
         }
      }

   }

   private static List q(Xo[][] var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null) {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            Xo[] var3 = var0[var2];
            ArrayList var4 = null;
            if (var3 != null) {
               var4 = new ArrayList(Arrays.asList(var3));
            }

            var1.add(var4);
         }
      }

      return var1;
   }

   private static Map q(uN var0, String var1, int var2) {
      HashMap var3 = new HashMap();
      String var4 = var1 + q.q[2655 & 127];
      String[] var5 = new String[]{p.q[18125 & -21923] + var4, p.q[10878 & 16974] + var4};
      String[] var6 = new String[]{q.q[4268 & 28252]};
      String[] var7 = net.optifine.util.H.q(var0, var5, var6);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         String var9 = var7[var8];
         String var10 = net.optifine.util.J.q(var9, var5, var6);
         Properties var11 = q(var10, var1, var2, var9);
         if (var11 != null) {
            String var12 = net.optifine.util.J.t(var9, var6) + w.q[21043 & 675];
            Xo var13 = new Xo(var11, var12);
            var3.put(var12, var13);
         }
      }

      return var3;
   }

   private static void ey(String var0) {
      try {
         PJ var1 = new PJ(var0);
         InputStream var2 = MV.b(var1);
         if (var2 == null) {
            return;
         }

         MV.cM(p.q[2919 & 727] + var0);
         net.optifine.util.F var3 = new net.optifine.util.F();
         var3.load(var2);
         var2.close();
         csD = MV.d(var3.getProperty(p.q[4936 & 20072]), true);
      } catch (FileNotFoundException var4) {
         ;
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   private static void w(Xo var0, List var1) {
      if (var0.Dh == 2 && var0.crZ != null) {
         for(int var2 = 0; var2 < 256; ++var2) {
            if (var0.crZ.iz(var2)) {
               q(var0, var1, var2);
            }
         }
      }

   }

   public static void aeM() {
      for(Xo var1 : aeP()) {
         if (var1.Dh == 1) {
            tU var2 = hS.eV().fA();
            var1.q(var2, csC);
            var1.aeK();
         }
      }

   }

   public static boolean q(zz var0, GX var1, lJ var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      if (csB == null) {
         return false;
      } else if (MV.Tf() && net.optifine.shaders.F.cOf) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         int[][] var10 = ay(var1);
         if (var10.length <= 0) {
            return false;
         } else {
            HashSet var11 = null;
            boolean var12 = false;
            tS var13 = MV.fJ();

            for(int var14 = 0; var14 < var10.length; ++var14) {
               int var15 = var10[var14][0];
               if (var15 >= 0 && var15 < csB.length) {
                  Xo[] var16 = csB[var15];
                  if (var16 != null) {
                     for(int var17 = 0; var17 < var16.length; ++var17) {
                        Xo var18 = var16[var17];
                        if (var11 == null) {
                           var11 = new HashSet();
                        }

                        if (var11.add(Integer.valueOf(var15)) && q(var18, var1, var10) && var18.Xy != null) {
                           var13.o(var18.Xy);
                           float var19 = var18.e(var13);
                           if (!var12) {
                              var12 = true;
                              if (MV.Tf()) {
                                 net.optifine.shaders.H.akz();
                              }

                              pz.nX();
                              pz.bR(514);
                              pz.O(false);
                           }

                           Zt.o(var18.crX, 1.0F);
                           pz.nx();
                           pz.bO(5890);
                           pz.nU();
                           pz.i(var18.csd, 0.0F, 0.0F, 1.0F);
                           float var20 = var19 / 8.0F;
                           pz.u(var20, var20 / 2.0F, var20);
                           float var21 = var18.bck * (float)(hS.fe() % 3000L) / 3000.0F / 8.0F;
                           pz.y(0.0F, var21, 0.0F);
                           pz.bO(5888);
                           var2.q(var0, var3, var4, var6, var7, var8, var9);
                        }
                     }
                  }
               }
            }

            if (var12) {
               pz.hT();
               pz.nX();
               pz.P(770, 771);
               pz.u(1.0F, 1.0F, 1.0F, 1.0F);
               pz.bO(5890);
               pz.nU();
               pz.bO(5888);
               pz.oe();
               pz.O(true);
               pz.bR(515);
               pz.nz();
               if (MV.Tf()) {
                  net.optifine.shaders.H.akx();
               }
            }

            return var12;
         }
      }
   }

   public static boolean w(GX var0, int var1, String var2) {
      if (csE == null) {
         return false;
      } else {
         PJ var3 = q(var0, var1, var2);
         if (var3 == null) {
            return false;
         } else {
            MV.fJ().o(var3);
            return true;
         }
      }
   }

   private static boolean q(Xo var0, GX var1, int[][] var2) {
      Fm var3 = var1.do1();
      if (var0.csi != null) {
         int var4 = var1.Ik();
         if (var0.csf != 0) {
            var4 &= var0.csf;
         }

         if (var0.csw) {
            int var5 = var3.Hz();
            var4 = (int)((double)(var4 * 100) / (double)var5);
         }

         if (!var0.csi.iz(var4)) {
            return false;
         }
      }

      if (var0.cso != null && !var0.cso.iz(var1.bsH)) {
         return false;
      } else {
         int[][] var8 = var2;
         if (var0.crZ != null) {
            if (var2 == null) {
               var8 = ay(var1);
            }

            boolean var9 = false;

            for(int var6 = 0; var6 < var8.length; ++var6) {
               int var7 = var8[var6][0];
               if (var0.crZ.iz(var7)) {
                  var9 = true;
                  break;
               }
            }

            if (!var9) {
               return false;
            }
         }

         if (var0.csm != null) {
            if (var8 == null) {
               var8 = ay(var1);
            }

            boolean var10 = false;

            for(int var12 = 0; var12 < var8.length; ++var12) {
               int var14 = var8[var12][1];
               if (var0.csm.iz(var14)) {
                  var10 = true;
                  break;
               }
            }

            if (!var10) {
               return false;
            }
         }

         if (var0.csq != null) {
            HL var11 = var1.Ie();

            for(int var13 = 0; var13 < var0.csq.length; ++var13) {
               Yk var15 = var0.csq[var13];
               if (!var15.R(var11)) {
                  return false;
               }
            }
         }

         if (var0.csc != 0) {
            if (var0.csc == 1) {
               ;
            }

            return var0.csc != 2;
         } else {
            return true;
         }
      }
   }

   private static Xo u(GX var0, int var1) {
      if (csE == null) {
         return null;
      } else if (var0 == null) {
         return null;
      } else {
         Fm var2 = var0.do1();
         int var3 = Fm.s(var2);
         if (var3 >= 0 && var3 < csE.length) {
            Xo[] var4 = csE[var3];
            if (var4 != null) {
               for(int var5 = 0; var5 < var4.length; ++var5) {
                  Xo var6 = var4[var5];
                  if (var6.Dh == var1 && q(var6, var0, (int[][])null)) {
                     return var6;
                  }
               }
            }
         }

         return null;
      }
   }

   private static int[][] ay(GX var0) {
      Fm var1 = var0.do1();
      HT var2 = var1 == Et.blC ? Et.blC.ad(var0) : var0.Im();
      if (var2 != null && var2.II() > 0) {
         int[][] var3 = new int[var2.II()][2];

         for(int var4 = 0; var4 < var2.II(); ++var4) {
            HL var5 = var2.fv(var4);
            short var6 = var5.bI(w.q[4221 & 1085]);
            short var7 = var5.bI(r.q[2931 & 13170]);
            var3[var4][0] = var6;
            var3[var4][1] = var7;
         }

         return var3;
      } else {
         return csF;
      }
   }

   public static void w(tU var0) {
      for(Xo var2 : aeP()) {
         var2.w(var0);
      }

   }

   public static void aW() {
      csE = (Xo[][])null;
      csB = (Xo[][])null;
      csD = true;
      if (MV.RJ()) {
         ey(p.q[-30106 & 583]);
         uN[] var0 = MV.Rv();

         for(int var1 = var0.length - 1; var1 >= 0; --var1) {
            uN var2 = var0[var1];
            t(var2);
         }

         t(MV.SS());
         if (csE.length <= 0) {
            csE = (Xo[][])null;
         }

         if (csB.length <= 0) {
            csB = (Xo[][])null;
         }
      }

   }

   private static Xo[][] n(List var0) {
      Xo[][] var1 = new Xo[var0.size()][];

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         List var3 = (List)var0.get(var2);
         if (var3 != null) {
            Xo[] var4 = (Xo[])var3.toArray(new Xo[var3.size()]);
            Arrays.sort(var4, new Xr());
            var1[var2] = var4;
         }
      }

      return var1;
   }

   private static int[] ik(int var0) {
      return new int[]{var0, var0 + 16, var0 + 32, var0 + 48};
   }

   public static boolean aeN() {
      return csD;
   }

   private static Map r(uN var0) {
      HashMap var1 = new HashMap();
      var1.putAll(q(var0, q.q[12998 & 1694], Fm.s(Et.bnp)));
      var1.putAll(q(var0, e.q[4401 & 17761], Fm.s(Et.bnp)));
      var1.putAll(q(var0, p.q[-22707 & 17022], Fm.s(Et.bnp)));
      return var1;
   }

   private static void t(uN var0) {
      String[] var1 = net.optifine.util.H.q(var0, p.q[12233 & -32183], w.q[-32157 & 2595], (String[])null);
      Map var2 = r(var0);
      if (var2.size() > 0) {
         Set var3 = var2.keySet();
         String[] var4 = (String[])var3.toArray(new String[var3.size()]);
         var1 = (String[])MV.q((Object[])var1, (Object[])var4);
      }

      Arrays.sort(var1);
      List var13 = q(csE);
      List var14 = q(csB);

      for(int var5 = 0; var5 < var1.length; ++var5) {
         String var6 = var1[var5];
         MV.cM(p.q[19403 & 1646] + var6);

         try {
            Xo var7 = null;
            if (var2.containsKey(var6)) {
               var7 = (Xo)var2.get(var6);
            }

            if (var7 == null) {
               PJ var8 = new PJ(var6);
               InputStream var9 = var0.c(var8);
               if (var9 == null) {
                  MV.cJ(p.q[-27829 & 619] + var6);
                  continue;
               }

               net.optifine.util.F var10 = new net.optifine.util.F();
               var10.load(var9);
               var9.close();
               var7 = new Xo(var10, var6);
            }

            if (var7.dT(var6)) {
               q(var7, var13);
               w(var7, var14);
            }
         } catch (FileNotFoundException var11) {
            MV.cJ(p.q[1659 & 587] + var6);
         } catch (Exception var12) {
            var12.printStackTrace();
         }
      }

      csE = n(var13);
      csB = n(var14);
      Comparator var15 = aeO();

      for(int var16 = 0; var16 < csE.length; ++var16) {
         Xo[] var18 = csE[var16];
         if (var18 != null) {
            Arrays.sort(var18, var15);
         }
      }

      for(int var17 = 0; var17 < csB.length; ++var17) {
         Xo[] var19 = csB[var17];
         if (var19 != null) {
            Arrays.sort(var19, var15);
         }
      }

   }

   public static vz q(GX var0, vz var1, PJ var2, boolean var3) {
      if (!var3 && var1.qA()) {
         return var1;
      } else if (csE == null) {
         return var1;
      } else {
         Xo var4 = u(var0, 1);
         if (var4 == null) {
            return var1;
         } else {
            vz var5 = var4.q(var2, var3);
            return var5 != null ? var5 : var1;
         }
      }
   }

   private static void q(Xo var0, List var1, int var2) {
      while(var2 >= var1.size()) {
         var1.add((Object)null);
      }

      Object var3 = (List)var1.get(var2);
      if (var3 == null) {
         var3 = new ArrayList();
         ((List)var3).set(var2, var3);
      }

      ((List)var3).add(var0);
   }

   private static Comparator aeO() {
      Xq var0 = new Xq();
      return var0;
   }

   private static int ez(String var0) {
      String var1 = w.q[21211 & 11802] + var0;
      LG[] var2 = LG.bCg;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         LG var4 = var2[var3];
         if (var4 != null) {
            String var5 = var4.bY();
            if (var1.equals(var5)) {
               return var4.B();
            }
         }
      }

      return -1;
   }

   private static Properties q(String var0, String var1, int var2, String var3) {
      if (net.optifine.util.J.w(var0, new String[]{r.q[-20017 & 1487], r.q[-28208 & 17875]})) {
         return null;
      } else if (var0.equals(w.q[4951 & -13605]) && var1.equals(q.q[-18506 & 2695])) {
         var2 = Fm.s(Et.blF);
         net.optifine.util.F var9 = new net.optifine.util.F();
         var9.put(q.q[31224 & 504], q.q[2637 & 4873]);
         var9.put(q.q[505 & 9721], q.q[80 & 20992] + var2);
         return var9;
      } else {
         int[] var4 = (int[])aeQ().get(var0);
         if (var4 == null) {
            MV.cJ(p.q[7775 & 623] + var3);
            return null;
         } else {
            StringBuffer var5 = new StringBuffer();

            for(int var6 = 0; var6 < var4.length; ++var6) {
               int var7 = var4[var6];
               if (var1.equals(e.q[29991 & -32479])) {
                  var7 |= 16384;
               }

               if (var6 > 0) {
                  var5.append(q.q[-32434 & 2922]);
               }

               var5.append(var7);
            }

            int var10 = 16447;
            if (var0.equals(w.q[25551 & 491]) || var0.equals(p.q[2645 & 16978])) {
               var10 |= 64;
            }

            net.optifine.util.F var11 = new net.optifine.util.F();
            var11.put(q.q[17405 & -31240], q.q[8747 & -13751]);
            var11.put(q.q[2553 & 25593], q.q[3216 & 4390] + var2);
            var11.put(q.q[5117 & 19965], String.valueOf(var5));
            var11.put(q.q[28159 & 511], q.q[24608 & -25792] + var10);
            if (var1.equals(e.q[1837 & 6513])) {
               var11.put(q.q[8806 & -32218], var0);
            } else {
               var11.put(q.q[2744 & -27861], var0);
            }

            return var11;
         }
      }
   }

   private static int[] bz(int var0, int var1) {
      return new int[]{var0 + var1 * 16};
   }

   private static List aeP() {
      ArrayList var0 = new ArrayList();
      q(csE, var0);
      q(csB, var0);
      return var0;
   }

   private static Map aeQ() {
      if (csG == null) {
         csG = new LinkedHashMap();
         csG.put(w.q[-15397 & 3531], bz(0, 0));
         csG.put(p.q[-11563 & 2897], bz(0, 1));
         csG.put(p.q[626 & 14934], bz(0, 2));
         csG.put(p.q[1875 & 25307], bz(0, 3));
         csG.put(r.q[18231 & -28233], ik(1));
         csG.put(p.q[8788 & 5844], ik(2));
         csG.put(p.q[8791 & -25603], ik(3));
         csG.put(r.q[8522 & -28853], ik(4));
         csG.put(p.q[598 & 4959], ik(5));
         csG.put(p.q[1623 & 855], ik(6));
         csG.put(w.q[24813 & 2413], bz(7, 0));
         csG.put(p.q[5720 & -32130], bz(7, 1));
         csG.put(p.q[857 & 10973], bz(7, 2));
         csG.put(p.q[25178 & -30086], bz(7, 3));
         csG.put(r.q[2895 & 21863], ik(8));
         csG.put(p.q[-15621 & 13151], ik(9));
         csG.put(p.q[1917 & 4700], ik(10));
         csG.put(p.q[18269 & 4829], ik(11));
         csG.put(p.q[-28034 & 9054], ik(12));
         csG.put(p.q[8799 & 863], ik(13));
         csG.put(r.q[959 & 24895], ik(14));
         csG.put(p.q[4712 & 19056], bz(15, 0));
         csG.put(p.q[25187 & 757], bz(15, 1));
         csG.put(p.q[23138 & -23710], bz(15, 2));
         csG.put(p.q[18275 & -21913], bz(15, 3));
         csG.put(p.q[5072 & 8786], bz(0, 4));
         csG.put(q.q[-32227 & 8711], csG.get(p.q[-15788 & 8916]));
         csG.put(r.q[383 & -3781], csG.get(p.q[16981 & 14173]));
         csG.put(r.q[2415 & 1327], csG.get(p.q[758 & 5975]));
         csG.put(r.q[-15933 & 1367], csG.get(p.q[23287 & -32161]));
         csG.put(r.q[1324 & 6590], csG.get(p.q[18047 & -29989]));
         csG.put(r.q[301 & -31387], csG.get(p.q[605 & 17022]));
         csG.put(r.q[945 & 315], csG.get(p.q[5726 & 9054]));
         csG.put(r.q[-16067 & 5503], csG.get(p.q[639 & -31905]));
      }

      return csG;
   }

   public static void w(vA var0) {
      for(Xo var2 : aeP()) {
         var2.w(var0);
      }

   }

   private static void q(Xo[][] var0, List var1) {
      if (var0 != null) {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            Xo[] var3 = var0[var2];
            if (var3 != null) {
               for(int var4 = 0; var4 < var3.length; ++var4) {
                  Xo var5 = var3[var4];
                  if (var5 != null) {
                     var1.add(var5);
                  }
               }
            }
         }
      }

   }
}
