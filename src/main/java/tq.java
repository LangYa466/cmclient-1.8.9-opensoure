public class TQ extends Tw {
   public TQ(long var1, Tw var3) {
      super(var1);
      this.cjp = var3;
   }

   private boolean hK(int var1) {
      return Rl.hr(var1) != null && Rl.hr(var1).abe() == Ry.class ? true : var1 == Rl.caw.car || var1 == Rl.cbA.car || var1 == Rl.cbg.car || var1 == Rl.cao.car || var1 == Rl.cay.car || hH(var1);
   }

   public int[] F(int var1, int var2, int var3, int var4) {
      int[] var5 = this.cjp.F(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      int[] var6 = TU.hM(var3 * var4);

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            this.q((long)(var8 + var1), (long)(var7 + var2));
            int var9 = var5[var8 + 1 + (var7 + 1) * (var3 + 2)];
            Rl var10 = Rl.hr(var9);
            if (var9 == Rl.cbB.car) {
               int var17 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
               int var20 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
               int var23 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
               int var26 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
               if (var17 != Rl.cba.car && var20 != Rl.cba.car && var23 != Rl.cba.car && var26 != Rl.cba.car) {
                  var6[var8 + var7 * var3] = var9;
               } else {
                  var6[var8 + var7 * var3] = Rl.cai.car;
               }
            } else if (var10 != null && var10.abe() == Ry.class) {
               int var16 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
               int var19 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
               int var22 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
               int var25 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
               if (this.hK(var16) && this.hK(var19) && this.hK(var22) && this.hK(var25)) {
                  if (!hH(var16) && !hH(var19) && !hH(var22) && !hH(var25)) {
                     var6[var8 + var7 * var3] = var9;
                  } else {
                     var6[var8 + var7 * var3] = Rl.cah.car;
                  }
               } else {
                  var6[var8 + var7 * var3] = Rl.caw.car;
               }
            } else if (var9 != Rl.caY.car && var9 != Rl.caR.car && var9 != Rl.cbF.car) {
               if (var10 != null && var10.aaY()) {
                  this.q(var5, var6, var8, var7, var3, var9, Rl.cbn.car);
               } else if (var9 != Rl.cbt.car && var9 != Rl.cas.car) {
                  if (var9 != Rl.cba.car && var9 != Rl.cal.car && var9 != Rl.cbs.car && var9 != Rl.caM.car) {
                     int var15 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
                     int var18 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
                     int var21 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
                     int var24 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
                     if (!hH(var15) && !hH(var18) && !hH(var21) && !hH(var24)) {
                        var6[var8 + var7 * var3] = var9;
                     } else {
                        var6[var8 + var7 * var3] = Rl.cah.car;
                     }
                  } else {
                     var6[var8 + var7 * var3] = var9;
                  }
               } else {
                  int var11 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
                  int var12 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
                  int var13 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
                  int var14 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
                  if (!hH(var11) && !hH(var12) && !hH(var13) && !hH(var14)) {
                     if (this.hL(var11) && this.hL(var12) && this.hL(var13) && this.hL(var14)) {
                        var6[var8 + var7 * var3] = var9;
                     } else {
                        var6[var8 + var7 * var3] = Rl.caC.car;
                     }
                  } else {
                     var6[var8 + var7 * var3] = var9;
                  }
               }
            } else {
               this.q(var5, var6, var8, var7, var3, var9, Rl.cap.car);
            }
         }
      }

      return var6;
   }

   private boolean hL(int var1) {
      return Rl.hr(var1) instanceof Rz;
   }

   private void q(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7) {
      if (hH(var6)) {
         var2[var3 + var4 * var5] = var6;
      } else {
         int var8 = var1[var3 + 1 + (var4 + 1 - 1) * (var5 + 2)];
         int var9 = var1[var3 + 1 + 1 + (var4 + 1) * (var5 + 2)];
         int var10 = var1[var3 + 1 - 1 + (var4 + 1) * (var5 + 2)];
         int var11 = var1[var3 + 1 + (var4 + 1 + 1) * (var5 + 2)];
         if (!hH(var8) && !hH(var9) && !hH(var10) && !hH(var11)) {
            var2[var3 + var4 * var5] = var6;
         } else {
            var2[var3 + var4 * var5] = var7;
         }
      }

   }
}
