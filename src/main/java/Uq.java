import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

abstract class UQ extends Ut {
   protected static final List clg = Lists.newArrayList(new Qd[]{new Qd(Et.bnC, 0, 1, 3, 5), new Qd(Et.bmQ, 0, 1, 5, 5), new Qd(Et.blD, 0, 1, 3, 15), new Qd(Et.blG, 0, 1, 1, 5), new Qd(Et.bkS, 0, 1, 1, 5), new Qd(Et.bna, 0, 1, 1, 5), new Qd(Et.bly, 0, 3, 7, 5), new Qd(Et.bol, 0, 1, 1, 10), new Qd(Et.bnH, 0, 1, 1, 8), new Qd(Et.blw, 0, 1, 1, 5), new Qd(Et.bnS, 0, 1, 1, 3), new Qd(Fm.C(Ea.bit), 0, 2, 4, 2)});

   protected Ut q(UT var1, List var2, Random var3, int var4, int var5, boolean var6) {
      // $FF: Couldn't be decompiled
   }

   private UQ q(UT var1, List var2, List var3, Random var4, int var5, int var6, int var7, OK var8, int var9) {
      int var10 = this.x(var2);
      boolean var11 = var10 > 0 && var9 <= 30;
      int var12 = 0;

      while(var12 < 5 && var11) {
         ++var12;
         int var13 = var4.nextInt(var10);

         for(UR var15 : var2) {
            var13 -= var15.clj;
            if (var13 < 0) {
               if (!var15.hO(var9) || var15 == var1.clo && !var15.clk) {
                  break;
               }

               UQ var16 = UD.w(var15, var3, var4, var5, var6, var7, var8, var9);
               if (var16 != null) {
                  ++var15.cli;
                  var1.clo = var15;
                  if (!var15.adc()) {
                     var2.remove(var15);
                  }

                  return var16;
               }
            }
         }
      }

      return UN.p(var3, var4, var5, var6, var7, var8, var9);
   }

   protected void P(HL var1) {
   }

   protected void O(HL var1) {
   }

   protected UQ(int var1) {
      super(var1);
   }

   public UQ() {
   }

   private Ut q(UT var1, List var2, Random var3, int var4, int var5, int var6, OK var7, int var8, boolean var9) {
      if (Math.abs(var4 - var1.acV().ckF) <= 112 && Math.abs(var6 - var1.acV().ckJ) <= 112) {
         List var10 = var1.cln;
         if (var9) {
            var10 = var1.clm;
         }

         UQ var11 = this.q(var1, var10, var2, var3, var4, var5, var6, var7, var8 + 1);
         if (var11 != null) {
            var2.add(var11);
            var1.clp.add(var11);
         }

         return var11;
      } else {
         return UN.p(var2, var3, var4, var5, var6, var7, var8);
      }
   }

   protected Ut w(UT var1, List var2, Random var3, int var4, int var5, boolean var6) {
      // $FF: Couldn't be decompiled
   }

   protected static boolean r(Ur var0) {
      return var0 != null && var0.ckH > 10;
   }

   private int x(List var1) {
      boolean var2 = false;
      int var3 = 0;

      for(UR var5 : var1) {
         if (var5.clh > 0 && var5.cli < var5.clh) {
            var2 = true;
         }

         var3 += var5.clj;
      }

      return var2 ? var3 : -1;
   }

   protected Ut e(UT var1, List var2, Random var3, int var4, int var5, boolean var6) {
      // $FF: Couldn't be decompiled
   }
}
