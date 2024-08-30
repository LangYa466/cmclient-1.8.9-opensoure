import java.util.Random;

public abstract class es extends et {
   public static final hu rp = hu.x(r.q[879 & 15351]);
   public static final hu rq = hu.x(r.q[9062 & -29850]);
   int[] rr;
   protected int rs;
   protected boolean rt;

   public int q(Random var1) {
      return var1.nextInt(20) == 0 ? 1 : 0;
   }

   protected int s(hI var1) {
      return 20;
   }

   public void f(boolean var1) {
      this.rt = var1;
      this.ru = var1;
      this.rs = var1 ? 0 : 1;
   }

   public int cL() {
      return Qo.i(0.5D, 1.0D);
   }

   public void q(QI var1, NW var2, hI var3, Random var4) {
      if (var1.aG(var2.Vi()) && !QI.c(var1, var2.Vj()) && var4.nextInt(15) == 1) {
         double var5 = (double)((float)var2.aY() + var4.nextFloat());
         double var7 = (double)var2.aX() - 0.05D;
         double var9 = (double)((float)var2.KO() + var4.nextFloat());
         var1.q(OP.bRC, var5, var7, var9, 0.0D, 0.0D, 0.0D);
      }

   }

   public boolean ct() {
      return false;
   }

   protected void t(QI var1, NW var2, hI var3, int var4) {
   }

   public int q(Qx var1, NW var2, int var3) {
      return Re.v(var1, var2);
   }

   public int t(hI var1) {
      return Qo.YY();
   }

   private void J(QI var1, NW var2) {
      this.q(var1, var2, var1.g(var2), 0);
      var1.am(var2);
   }

   public abstract ff W(int var1);

   public Fm q(hI var1, Random var2, int var3) {
      return Fm.C(Ea.bjs);
   }

   public void e(QI var1, NW var2, hI var3, Random var4) {
      if (!var1.bXF && ((Boolean)var3.w(rp)).booleanValue() && ((Boolean)var3.w(rq)).booleanValue()) {
         byte var5 = 4;
         int var6 = var5 + 1;
         int var7 = var2.aY();
         int var8 = var2.aX();
         int var9 = var2.KO();
         byte var10 = 32;
         int var11 = var10 * var10;
         int var12 = var10 / 2;
         if (this.rr == null) {
            this.rr = new int[var10 * var10 * var10];
         }

         if (var1.r(new NW(var7 - var6, var8 - var6, var9 - var6), new NW(var7 + var6, var8 + var6, var9 + var6))) {
            Ob var13 = new Ob();

            for(int var14 = -var5; var14 <= var5; ++var14) {
               for(int var15 = -var5; var15 <= var5; ++var15) {
                  for(int var16 = -var5; var16 <= var5; ++var16) {
                     cv var17 = var1.g(var13.D(var7 + var14, var8 + var15, var9 + var16)).ds();
                     if (var17 != Ea.bkr && var17 != Ea.bjn) {
                        if (var17.cB() == hn.zK) {
                           this.rr[(var14 + var12) * var11 + (var15 + var12) * var10 + var16 + var12] = -2;
                        } else {
                           this.rr[(var14 + var12) * var11 + (var15 + var12) * var10 + var16 + var12] = -1;
                        }
                     } else {
                        this.rr[(var14 + var12) * var11 + (var15 + var12) * var10 + var16 + var12] = 0;
                     }
                  }
               }
            }

            for(int var19 = 1; var19 <= 4; ++var19) {
               for(int var20 = -var5; var20 <= var5; ++var20) {
                  for(int var21 = -var5; var21 <= var5; ++var21) {
                     for(int var22 = -var5; var22 <= var5; ++var22) {
                        if (this.rr[(var20 + var12) * var11 + (var21 + var12) * var10 + var22 + var12] == var19 - 1) {
                           if (this.rr[(var20 + var12 - 1) * var11 + (var21 + var12) * var10 + var22 + var12] == -2) {
                              this.rr[(var20 + var12 - 1) * var11 + (var21 + var12) * var10 + var22 + var12] = var19;
                           }

                           if (this.rr[(var20 + var12 + 1) * var11 + (var21 + var12) * var10 + var22 + var12] == -2) {
                              this.rr[(var20 + var12 + 1) * var11 + (var21 + var12) * var10 + var22 + var12] = var19;
                           }

                           if (this.rr[(var20 + var12) * var11 + (var21 + var12 - 1) * var10 + var22 + var12] == -2) {
                              this.rr[(var20 + var12) * var11 + (var21 + var12 - 1) * var10 + var22 + var12] = var19;
                           }

                           if (this.rr[(var20 + var12) * var11 + (var21 + var12 + 1) * var10 + var22 + var12] == -2) {
                              this.rr[(var20 + var12) * var11 + (var21 + var12 + 1) * var10 + var22 + var12] = var19;
                           }

                           if (this.rr[(var20 + var12) * var11 + (var21 + var12) * var10 + (var22 + var12 - 1)] == -2) {
                              this.rr[(var20 + var12) * var11 + (var21 + var12) * var10 + (var22 + var12 - 1)] = var19;
                           }

                           if (this.rr[(var20 + var12) * var11 + (var21 + var12) * var10 + var22 + var12 + 1] == -2) {
                              this.rr[(var20 + var12) * var11 + (var21 + var12) * var10 + var22 + var12 + 1] = var19;
                           }
                        }
                     }
                  }
               }
            }
         }

         int var18 = this.rr[var12 * var11 + var12 * var10 + var12];
         if (var18 >= 0) {
            var1.q(var2, var3.q(rp, Boolean.valueOf(false)), 4);
         } else {
            this.J(var1, var2);
         }
      }

   }

   public void q(QI var1, NW var2, hI var3, float var4, int var5) {
      if (!var1.bXF) {
         int var6 = this.s(var3);
         if (var5 > 0) {
            var6 -= 2 << var5;
            if (var6 < 10) {
               var6 = 10;
            }
         }

         if (var1.bXs.nextInt(var6) == 0) {
            Fm var7 = this.q(var3, var1.bXs, var5);
            q(var1, var2, new GX(var7, 1, this.u(var3)));
         }

         var6 = 200;
         if (var5 > 0) {
            var6 -= 10 << var5;
            if (var6 < 40) {
               var6 = 40;
            }
         }

         this.t(var1, var2, var3, var6);
      }

   }

   public es() {
      super(hn.zK, false);
      this.d(true);
      this.q(yl.aLF);
      this.h(0.2F);
      this.H(1);
      this.q(nc);
   }

   public boolean cr() {
      return !this.ru;
   }

   public OS cn() {
      return this.rt ? OS.bSk : OS.bSj;
   }

   public void r(QI var1, NW var2, hI var3) {
      byte var4 = 1;
      int var5 = var4 + 1;
      int var6 = var2.aY();
      int var7 = var2.aX();
      int var8 = var2.KO();
      if (var1.r(new NW(var6 - var5, var7 - var5, var8 - var5), new NW(var6 + var5, var7 + var5, var8 + var5))) {
         for(int var9 = -var4; var9 <= var4; ++var9) {
            for(int var10 = -var4; var10 <= var4; ++var10) {
               for(int var11 = -var4; var11 <= var4; ++var11) {
                  NW var12 = var2.C(var9, var10, var11);
                  hI var13 = var1.g(var12);
                  if (var13.ds().cB() == hn.zK && !((Boolean)var13.w(rp)).booleanValue()) {
                     var1.q(var12, var13.q(rp, Boolean.valueOf(true)), 4);
                  }
               }
            }
         }
      }

   }
}
