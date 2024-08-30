import java.util.Random;

public class Rt extends Rl {
   protected static final SU cbT = new SU(false, true);
   protected static final SM cbU = new SM(false);
   protected static final SU cbV = new SU(false, false);
   private int cbW;

   protected Rl hu(int var1) {
      if (this.car == Rl.cao.car) {
         Rt var2 = new Rt(var1, 1);
         var2.q(new Rn(this.cbh, this.cae + 0.2F));
         var2.dC(r.q[3518 & 422]);
         var2.s(6976549, true);
         var2.hq(8233509);
         return var2;
      } else {
         return (Rl)(this.car != Rl.caN.car && this.car != Rl.cam.car ? new Ru(this, var1, this) : new Rv(this, var1, this));
      }
   }

   public dS q(Random var1, NW var2) {
      if (this.cbW == 1) {
         double var3 = Pq.J((1.0D + caB.s((double)var2.aY() / 48.0D, (double)var2.KO() / 48.0D)) / 2.0D, 0.0D, 0.9999D);
         dS var5 = dS.values()[(int)(var3 * (double)dS.values().length)];
         return var5 == dS.pT ? dS.pS : var5;
      } else {
         return super.q(var1, var2);
      }
   }

   public SG p(Random var1) {
      return (SG)(this.cbW == 3 && var1.nextInt(3) > 0 ? cbU : (this.cbW != 2 && var1.nextInt(5) != 0 ? this.can : cbV));
   }

   protected Rl s(int var1, boolean var2) {
      if (this.cbW == 2) {
         this.cbo = 353825;
         this.jr = var1;
         if (var2) {
            this.cbo = (this.cbo & 16711422) >> 1;
         }

         return this;
      } else {
         return super.s(var1, var2);
      }
   }

   public Rt(int var1, int var2) {
      super(var1);
      this.cbW = var2;
      this.cbp.bZG = 10;
      this.cbp.bZC = 2;
      if (this.cbW == 1) {
         this.cbp.bZG = 6;
         this.cbp.bZz = 100;
         this.cbp.bZC = 1;
      }

      this.hq(5159473);
      this.m(0.7F, 0.8F);
      if (this.cbW == 2) {
         this.cbo = 353825;
         this.jr = 3175492;
         this.m(0.6F, 0.6F);
      }

      if (this.cbW == 0) {
         this.caz.add(new Ro(DA.class, 5, 4, 4));
      }

      if (this.cbW == 3) {
         this.cbp.bZG = -999;
      }

   }

   public void q(QI var1, Random var2, NW var3) {
      if (this.cbW == 3) {
         for(int var4 = 0; var4 < 4; ++var4) {
            for(int var5 = 0; var5 < 4; ++var5) {
               int var6 = var4 * 4 + 1 + 8 + var2.nextInt(3);
               int var7 = var5 * 4 + 1 + 8 + var2.nextInt(3);
               NW var8 = var1.aq(var3.C(var6, 0, var7));
               if (var2.nextInt(20) == 0) {
                  SH var9 = new SH();
                  var9.w(var1, var2, var8);
               } else {
                  SG var16 = this.p(var2);
                  var16.acx();
                  if (var16.w(var1, var2, var8)) {
                     var16.e(var1, var2, var8);
                  }
               }
            }
         }
      }

      int var11 = var2.nextInt(5) - 3;
      if (this.cbW == 1) {
         var11 += 2;
      }

      for(int var12 = 0; var12 < var11; ++var12) {
         int var13 = var2.nextInt(3);
         if (var13 == 0) {
            caF.q(dx.oZ);
         } else if (var13 == 1) {
            caF.q(dx.pc);
         } else if (var13 == 2) {
            caF.q(dx.pd);
         }

         for(int var14 = 0; var14 < 5; ++var14) {
            int var15 = var2.nextInt(16) + 8;
            int var17 = var2.nextInt(16) + 8;
            int var10 = var2.nextInt(var1.aq(var3.C(var15, 0, var17)).aX() + 32);
            if (caF.w(var1, var2, new NW(var3.aY() + var15, var10, var3.KO() + var17))) {
               break;
            }
         }
      }

      super.q(var1, var2, var3);
   }

   public int aM(NW var1) {
      int var2 = super.aM(var1);
      return this.cbW == 3 ? (var2 & 16711422) + 2634762 >> 1 : var2;
   }
}
