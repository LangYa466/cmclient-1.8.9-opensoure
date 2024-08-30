import com.google.common.collect.Lists;
import java.util.ArrayList;

public class Hg implements He {
   private GX btb;

   public GX Iv() {
      return this.btb;
   }

   public int Iu() {
      return 10;
   }

   public GX[] w(EZ var1) {
      GX[] var2 = new GX[var1.CB()];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         GX var4 = var1.er(var3);
         if (var4 != null && var4.do1().Ho()) {
            var2[var3] = new GX(var4.do1().Hp());
         }
      }

      return var2;
   }

   public GX q(EZ var1) {
      return this.btb.HW();
   }

   public boolean e(EZ var1, QI var2) {
      this.btb = null;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.CB(); ++var9) {
         GX var10 = var1.er(var9);
         if (var10 != null) {
            if (var10.do1() == Et.bmZ) {
               ++var4;
            } else if (var10.do1() == Et.bmi) {
               ++var6;
            } else if (var10.do1() == Et.boc) {
               ++var5;
            } else if (var10.do1() == Et.bnZ) {
               ++var3;
            } else if (var10.do1() == Et.blo) {
               ++var7;
            } else if (var10.do1() == Et.bnC) {
               ++var7;
            } else if (var10.do1() == Et.bnw) {
               ++var8;
            } else if (var10.do1() == Et.bmh) {
               ++var8;
            } else if (var10.do1() == Et.bln) {
               ++var8;
            } else {
               if (var10.do1() != Et.bll) {
                  return false;
               }

               ++var8;
            }
         }
      }

      var7 = var7 + var5 + var8;
      if (var4 <= 3 && var3 <= 1) {
         if (var4 >= 1 && var3 == 1 && var7 == 0) {
            this.btb = new GX(Et.blV);
            if (var6 > 0) {
               HL var18 = new HL();
               HL var22 = new HL();
               HT var26 = new HT();

               for(int var27 = 0; var27 < var1.CB(); ++var27) {
                  GX var29 = var1.er(var27);
                  if (var29 != null && var29.do1() == Et.bmi && var29.HZ() && var29.Ie().d(r.q[883 & 895], 10)) {
                     var26.q(var29.Ie().bO(r.q[9083 & 8179]));
                  }
               }

               var22.w(e.q[5655 & 2055], var26);
               var22.q(r.q[19934 & -20225], (byte)var4);
               var18.w(r.q[8413 & 479], var22);
               this.btb.l(var18);
            }

            return true;
         } else if (var4 == 1 && var3 == 0 && var6 == 0 && var5 > 0 && var8 <= 1) {
            this.btb = new GX(Et.bmi);
            HL var17 = new HL();
            HL var21 = new HL();
            byte var25 = 0;
            ArrayList var12 = Lists.newArrayList();

            for(int var13 = 0; var13 < var1.CB(); ++var13) {
               GX var14 = var1.er(var13);
               if (var14 != null) {
                  if (var14.do1() == Et.boc) {
                     var12.add(Integer.valueOf(Ga.brJ[var14.dm() & 15]));
                  } else if (var14.do1() == Et.blo) {
                     var21.s(e.q[204 & -9959], true);
                  } else if (var14.do1() == Et.bnC) {
                     var21.s(e.q[9661 & 13], true);
                  } else if (var14.do1() == Et.bnw) {
                     var25 = 1;
                  } else if (var14.do1() == Et.bmh) {
                     var25 = 4;
                  } else if (var14.do1() == Et.bln) {
                     var25 = 2;
                  } else if (var14.do1() == Et.bll) {
                     var25 = 3;
                  }
               }
            }

            int[] var28 = new int[var12.size()];

            for(int var30 = 0; var30 < var28.length; ++var30) {
               var28[var30] = ((Integer)var12.get(var30)).intValue();
            }

            var21.q(e.q[271 & 2590], var28);
            var21.q(q.q[-32312 & 10692], var25);
            var17.w(r.q[4983 & 3963], var21);
            this.btb.l(var17);
            return true;
         } else if (var4 == 0 && var3 == 0 && var6 == 1 && var5 > 0 && var5 == var7) {
            ArrayList var16 = Lists.newArrayList();

            for(int var19 = 0; var19 < var1.CB(); ++var19) {
               GX var11 = var1.er(var19);
               if (var11 != null) {
                  if (var11.do1() == Et.boc) {
                     var16.add(Integer.valueOf(Ga.brJ[var11.dm() & 15]));
                  } else if (var11.do1() == Et.bmi) {
                     this.btb = var11.HW();
                     this.btb.bsH = 1;
                  }
               }
            }

            int[] var20 = new int[var16.size()];

            for(int var23 = 0; var23 < var20.length; ++var23) {
               var20[var23] = ((Integer)var16.get(var23)).intValue();
            }

            if (this.btb != null && this.btb.HZ()) {
               HL var24 = this.btb.Ie().bO(r.q[13171 & -31877]);
               if (var24 == null) {
                  return false;
               } else {
                  var24.q(e.q[12463 & 2319], var20);
                  return true;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
