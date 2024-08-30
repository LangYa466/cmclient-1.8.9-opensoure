import java.util.Random;

public class Tn extends SG {
   private static final hI ciW = Ea.bkg.cx().q(eQ.sd, ff.sB).q(eQ.rp, Boolean.valueOf(false));
   private static final hI ciX = Ea.bkr.cx().q(eS.se, ff.sB);

   public Tn() {
      super(false);
   }

   public boolean w(QI var1, Random var2, NW var3) {
      int var4;
      for(var4 = var2.nextInt(4) + 5; var1.g(var3.Vj()).ds().cB() == hn.zS; var3 = var3.Vj()) {
         ;
      }

      boolean var5 = true;
      if (var3.aX() >= 1 && var3.aX() + var4 + 1 <= 256) {
         for(int var6 = var3.aX(); var6 <= var3.aX() + 1 + var4; ++var6) {
            byte var7 = 1;
            if (var6 == var3.aX()) {
               var7 = 0;
            }

            if (var6 >= var3.aX() + 1 + var4 - 2) {
               var7 = 3;
            }

            Ob var8 = new Ob();

            for(int var9 = var3.aY() - var7; var9 <= var3.aY() + var7 && var5; ++var9) {
               for(int var10 = var3.KO() - var7; var10 <= var3.KO() + var7 && var5; ++var10) {
                  if (var6 >= 0 && var6 < 256) {
                     cv var11 = var1.g(var8.D(var9, var6, var10)).ds();
                     if (var11.cB() != hn.zp && var11.cB() != hn.zK) {
                        if (var11 != Ea.bgT && var11 != Ea.bjc) {
                           var5 = false;
                        } else if (var6 > var3.aX()) {
                           var5 = false;
                        }
                     }
                  } else {
                     var5 = false;
                  }
               }
            }
         }

         if (!var5) {
            return false;
         } else {
            cv var17 = var1.g(var3.Vj()).ds();
            if ((var17 == Ea.biQ || var17 == Ea.bjj) && var3.aX() < 256 - var4 - 1) {
               this.af(var1, var3.Vj());

               for(int var18 = var3.aX() - 3 + var4; var18 <= var3.aX() + var4; ++var18) {
                  int var21 = var18 - (var3.aX() + var4);
                  int var24 = 2 - var21 / 2;

                  for(int var26 = var3.aY() - var24; var26 <= var3.aY() + var24; ++var26) {
                     int var28 = var26 - var3.aY();

                     for(int var12 = var3.KO() - var24; var12 <= var3.KO() + var24; ++var12) {
                        int var13 = var12 - var3.KO();
                        if (Math.abs(var28) != var24 || Math.abs(var13) != var24 || var2.nextInt(2) != 0 && var21 != 0) {
                           NW var14 = new NW(var26, var18, var12);
                           if (!var1.g(var14).ds().cE()) {
                              this.N(var1, var14, ciW);
                           }
                        }
                     }
                  }
               }

               for(int var19 = 0; var19 < var4; ++var19) {
                  cv var22 = var1.g(var3.gx(var19)).ds();
                  if (var22.cB() == hn.zp || var22.cB() == hn.zK || var22 == Ea.bjc || var22 == Ea.bgT) {
                     this.N(var1, var3.gx(var19), ciX);
                  }
               }

               for(int var20 = var3.aX() - 3 + var4; var20 <= var3.aX() + var4; ++var20) {
                  int var23 = var20 - (var3.aX() + var4);
                  int var25 = 2 - var23 / 2;
                  Ob var27 = new Ob();

                  for(int var29 = var3.aY() - var25; var29 <= var3.aY() + var25; ++var29) {
                     for(int var30 = var3.KO() - var25; var30 <= var3.KO() + var25; ++var30) {
                        var27.D(var29, var20, var30);
                        if (var1.g(var27).ds().cB() == hn.zK) {
                           NW var31 = var27.Vh();
                           NW var32 = var27.Ve();
                           NW var15 = var27.Vg();
                           NW var16 = var27.Vk();
                           if (var2.nextInt(4) == 0 && var1.g(var31).ds().cB() == hn.zp) {
                              this.q(var1, var31, gZ.yc);
                           }

                           if (var2.nextInt(4) == 0 && var1.g(var32).ds().cB() == hn.zp) {
                              this.q(var1, var32, gZ.yb);
                           }

                           if (var2.nextInt(4) == 0 && var1.g(var15).ds().cB() == hn.zp) {
                              this.q(var1, var15, gZ.ye);
                           }

                           if (var2.nextInt(4) == 0 && var1.g(var16).ds().cB() == hn.zp) {
                              this.q(var1, var16, gZ.yd);
                           }
                        }
                     }
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private void q(QI var1, NW var2, hu var3) {
      hI var4 = Ea.bhV.cx().q(var3, Boolean.valueOf(true));
      this.N(var1, var2, var4);
      int var5 = 4;

      for(NW var6 = var2.Vj(); var1.g(var6).ds().cB() == hn.zp && var5 > 0; --var5) {
         this.N(var1, var6, var4);
         var6 = var6.Vj();
      }

   }
}
