import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class wD extends wd {
   private static final Map aJS = Maps.newHashMap();

   private int aV(String var1) {
      if (!aJS.containsKey(var1)) {
         throw new wq(o.q[7119 & -32049], new Object[]{var1});
      } else {
         return ((Integer)aJS.get(var1)).intValue();
      }
   }

   public boolean w(String[] var1, int var2) {
      return var1.length > 0 && var1[0].equals(y.q[79 & -22034]) && var2 == 1;
   }

   public List q(wZ var1, String[] var2, NW var3) {
      return var2.length == 1 ? q(var2, new String[]{y.q[2174 & 1230], q.q[-32293 & 10587]}) : (var2.length == 2 && var2[0].equals(y.q[9806 & 20734]) ? q(var2, this.vX()) : (var2.length >= 2 && var2.length <= 4 && var2[0].equals(q.q[-15905 & 1371]) ? w(var2, 1, var3) : ((var2.length != 3 || !var2[0].equals(y.q[-24466 & 17742])) && (var2.length != 5 || !var2[0].equals(q.q[-32421 & 2395])) ? (var2.length == 4 && var2[0].equals(y.q[4718 & 350]) || var2.length == 6 && var2[0].equals(q.q[511 & 2395]) ? q(var2, Fm.bqX.Xx()) : null) : q(var2, aJS.keySet()))));
   }

   public int vE() {
      return 2;
   }

   public void q(wZ var1, String[] var2) {
      if (var2.length < 1) {
         throw new xr(o.q[2796 & 969], new Object[0]);
      } else {
         boolean var3;
         if (var2[0].equals(y.q[-32530 & 18254])) {
            var3 = false;
         } else {
            if (!var2[0].equals(q.q[8667 & 2943])) {
               throw new xr(o.q[-19512 & 18136], new Object[0]);
            }

            var3 = true;
         }

         int var4;
         if (var3) {
            if (var2.length < 6) {
               throw new xr(o.q[745 & 21211], new Object[0]);
            }

            var4 = 4;
         } else {
            if (var2.length < 4) {
               throw new xr(o.q[13023 & -13366], new Object[0]);
            }

            var4 = 2;
         }

         int var5 = this.aV(var2[var4++]);

         Fm var6;
         try {
            var6 = e(var1, var2[var4]);
         } catch (xa var15) {
            if (cv.z(var2[var4]) != Ea.bjN) {
               throw var15;
            }

            var6 = null;
         }

         ++var4;
         int var7 = var2.length > var4 ? y(var2[var4++], 1, 64) : 1;
         int var8 = var2.length > var4 ? aR(var2[var4++]) : 0;
         GX var9 = new GX(var6, var7, var8);
         if (var2.length > var4) {
            String var10 = q(var1, var2, var4).Vv();

            try {
               var9.l(Hz.bE(var10));
            } catch (HG var14) {
               throw new wq(o.q[21195 & 8911], new Object[]{var14.getMessage()});
            }
         }

         if (var9.do1() == null) {
            var9 = null;
         }

         if (var3) {
            var1.q(wG.aKc, 0);
            NW var18 = q(var1, var2, 1, false);
            QI var11 = var1.vQ();
            No var12 = var11.h(var18);
            if (var12 == null || !(var12 instanceof EV)) {
               throw new wq(o.q[-31026 & 25308], new Object[]{var18.aY(), var18.aX(), var18.KO()});
            }

            EV var13 = (EV)var12;
            if (var5 >= 0 && var5 < var13.CB()) {
               var13.y(var5, var9);
            }
         } else {
            zk var19 = y(var1, var2[1]);
            var1.q(wG.aKc, 0);
            if (var19 instanceof DD) {
               ((DD)var19).bdW.Ha();
            }

            if (!var19.r(var5, var9)) {
               throw new wq(o.q[2767 & 749], new Object[]{var5, var7, var9 == null ? q.q[-22374 & 1146] : var9.hN()});
            }

            if (var19 instanceof DD) {
               ((DD)var19).bdW.Ha();
            }
         }

         var1.q(wG.aKc, var7);
         q(var1, this, o.q[718 & 974], new Object[]{var5, var7, var9 == null ? q.q[9530 & 158] : var9.hN()});
      }
   }

   public String vJ() {
      return o.q[5063 & 1743];
   }

   static {
      for(int var0 = 0; var0 < 54; ++var0) {
         aJS.put(o.q[17106 & 11257] + var0, Integer.valueOf(var0));
      }

      for(int var1 = 0; var1 < 9; ++var1) {
         aJS.put(o.q[21201 & 2777] + var1, Integer.valueOf(var1));
      }

      for(int var2 = 0; var2 < 27; ++var2) {
         aJS.put(o.q[982 & -19726] + var2, Integer.valueOf(9 + var2));
      }

      for(int var3 = 0; var3 < 27; ++var3) {
         aJS.put(o.q[-31789 & 27347] + var3, Integer.valueOf(200 + var3));
      }

      for(int var4 = 0; var4 < 8; ++var4) {
         aJS.put(o.q[8148 & 8926] + var4, Integer.valueOf(300 + var4));
      }

      for(int var5 = 0; var5 < 15; ++var5) {
         aJS.put(o.q[4853 & 3797] + var5, Integer.valueOf(500 + var5));
      }

      aJS.put(o.q[27359 & -32042], Integer.valueOf(99));
      aJS.put(o.q[3799 & -23849], Integer.valueOf(103));
      aJS.put(o.q[735 & 19192], Integer.valueOf(102));
      aJS.put(o.q[17117 & 2777], Integer.valueOf(101));
      aJS.put(o.q[31482 & 987], Integer.valueOf(100));
      aJS.put(o.q[17115 & 3803], Integer.valueOf(400));
      aJS.put(o.q[-32033 & 4092], Integer.valueOf(401));
      aJS.put(o.q[21213 & 8927], Integer.valueOf(499));
   }

   protected String[] vX() {
      return Md.Jc().vM();
   }

   public String e(wZ var1) {
      return o.q[3064 & -32052];
   }
}
