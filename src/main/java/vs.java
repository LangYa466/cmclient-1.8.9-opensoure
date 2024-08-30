import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class VS {
   // $FF: synthetic method
   static Ut q(Wf var0, List var1, Random var2, int var3, int var4, int var5, OK var6, int var7) {
      return r(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   private static Wh q(Wf var0, Wd var1, List var2, Random var3, int var4, int var5, int var6, OK var7, int var8) {
      Class var9 = var1.cmM;
      Object var10 = null;
      if (var9 == Wb.class) {
         var10 = Wb.d(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == VU.class) {
         var10 = VU.y(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == VY.class) {
         var10 = VY.p(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == Wj.class) {
         var10 = Wj.f(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == VX.class) {
         var10 = VX.o(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == VV.class) {
         var10 = VV.u(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == VW.class) {
         var10 = VW.i(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == VZ.class) {
         var10 = VZ.a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if (var9 == Wa.class) {
         var10 = Wa.s(var0, var2, var3, var4, var5, var6, var7, var8);
      }

      return (Wh)var10;
   }

   private static Ut w(Wf var0, List var1, Random var2, int var3, int var4, int var5, OK var6, int var7) {
      if (var7 > 3 + var0.ckA) {
         return null;
      } else if (Math.abs(var3 - var0.acV().ckF) <= 112 && Math.abs(var5 - var0.acV().ckJ) <= 112) {
         Ur var8 = Wc.q(var0, var1, var2, var3, var4, var5, var6);
         if (var8 != null && var8.ckH > 10) {
            Wc var9 = new Wc(var0, var7, var2, var8, var6);
            int var10 = (var9.ckN.ckF + var9.ckN.ckG) / 2;
            int var11 = (var9.ckN.ckJ + var9.ckN.ckI) / 2;
            int var12 = var9.ckN.ckG - var9.ckN.ckF;
            int var13 = var9.ckN.ckI - var9.ckN.ckJ;
            int var14 = var12 > var13 ? var12 : var13;
            if (var0.ZB().q(var10, var11, var14 / 2 + 4, Up.ckB)) {
               var1.add(var9);
               var0.cmS.add(var9);
               return var9;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static int c(List var0) {
      boolean var1 = false;
      int var2 = 0;

      for(Wd var4 : var0) {
         if (var4.cmN > 0 && var4.cmP < var4.cmN) {
            var1 = true;
         }

         var2 += var4.cmO;
      }

      return var1 ? var2 : -1;
   }

   // $FF: synthetic method
   static Ut e(Wf var0, List var1, Random var2, int var3, int var4, int var5, OK var6, int var7) {
      return w(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static List q(Random var0, int var1) {
      ArrayList var2 = Lists.newArrayList();
      var2.add(new Wd(Wb.class, 4, Pq.q(var0, 2 + var1, 4 + var1 * 2)));
      var2.add(new Wd(VU.class, 20, Pq.q(var0, 0 + var1, 1 + var1)));
      var2.add(new Wd(VY.class, 20, Pq.q(var0, 0 + var1, 2 + var1)));
      var2.add(new Wd(Wj.class, 3, Pq.q(var0, 2 + var1, 5 + var1 * 3)));
      var2.add(new Wd(VX.class, 15, Pq.q(var0, 0 + var1, 2 + var1)));
      var2.add(new Wd(VV.class, 3, Pq.q(var0, 1 + var1, 4 + var1)));
      var2.add(new Wd(VW.class, 3, Pq.q(var0, 2 + var1, 4 + var1 * 2)));
      var2.add(new Wd(VZ.class, 15, Pq.q(var0, 0, 1 + var1)));
      var2.add(new Wd(Wa.class, 8, Pq.q(var0, 0 + var1, 3 + var1 * 2)));
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         if (((Wd)var3.next()).cmN == 0) {
            var3.remove();
         }
      }

      return var2;
   }

   private static Ut r(Wf var0, List var1, Random var2, int var3, int var4, int var5, OK var6, int var7) {
      if (var7 > 50) {
         return null;
      } else if (Math.abs(var3 - var0.acV().ckF) <= 112 && Math.abs(var5 - var0.acV().ckJ) <= 112) {
         Wh var8 = t(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         if (var8 != null) {
            int var9 = (var8.ckN.ckF + var8.ckN.ckG) / 2;
            int var10 = (var8.ckN.ckJ + var8.ckN.ckI) / 2;
            int var11 = var8.ckN.ckG - var8.ckN.ckF;
            int var12 = var8.ckN.ckI - var8.ckN.ckJ;
            int var13 = var11 > var12 ? var11 : var12;
            if (var0.ZB().q(var9, var10, var13 / 2 + 4, Up.ckB)) {
               var1.add(var8);
               var0.cmT.add(var8);
               return var8;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static Wh t(Wf var0, List var1, Random var2, int var3, int var4, int var5, OK var6, int var7) {
      int var8 = c(var0.cmV);
      if (var8 <= 0) {
         return null;
      } else {
         int var9 = 0;

         while(var9 < 5) {
            ++var9;
            int var10 = var2.nextInt(var8);

            for(Wd var12 : var0.cmV) {
               var10 -= var12.cmO;
               if (var10 < 0) {
                  if (!var12.hR(var7) || var12 == var0.cmQ && var0.cmV.size() > 1) {
                     break;
                  }

                  Wh var13 = q(var0, var12, var1, var2, var3, var4, var5, var6, var7);
                  if (var13 != null) {
                     ++var12.cmP;
                     var0.cmQ = var12;
                     if (!var12.adq()) {
                        var0.cmV.remove(var12);
                     }

                     return var13;
                  }
               }
            }
         }

         Ur var14 = Wg.w(var0, var1, var2, var3, var4, var5, var6);
         if (var14 != null) {
            return new Wg(var0, var7, var2, var14, var6);
         } else {
            return null;
         }
      }
   }

   public static void adp() {
      Uo.e(VY.class, y.q[-28137 & 17958]);
      Uo.e(VV.class, y.q[15031 & 519]);
      Uo.e(VW.class, y.q[1708 & 2632]);
      Uo.e(Wg.class, y.q[5659 & 9097]);
      Uo.e(VX.class, y.q[-1525 & 538]);
      Uo.e(Wb.class, y.q[1547 & -28149]);
      Uo.e(Wj.class, y.q[860 & 27148]);
      Uo.e(VU.class, y.q[4655 & 3725]);
      Uo.e(VZ.class, y.q[-32209 & 19358]);
      Uo.e(Wf.class, y.q[21087 & 8719]);
      Uo.e(Wc.class, y.q[656 & 26128]);
      Uo.e(Wa.class, y.q[16981 & 8977]);
      Uo.e(Wi.class, y.q[4659 & -15854]);
   }
}
