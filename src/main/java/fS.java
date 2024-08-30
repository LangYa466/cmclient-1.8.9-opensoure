public class FS extends Fm {
   private final cv brF;

   public FS(cv var1) {
      this.bqQ = 1;
      this.brF = var1;
      this.r(yl.aLL);
   }

   public boolean ac(QI var1, NW var2) {
      if (this.brF == Ea.bjN) {
         return false;
      } else {
         hn var3 = var1.g(var2).ds().cB();
         boolean var4 = !var3.ec();
         if (!var1.aj(var2) && !var4) {
            return false;
         } else {
            if (var1.bXI.ZX() && this.brF == Ea.bjc) {
               int var5 = var2.aY();
               int var6 = var2.aX();
               int var7 = var2.KO();
               var1.q((double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), (double)((float)var7 + 0.5F), w.q[4394 & -15572], 0.5F, 2.6F + (var1.bXs.nextFloat() - var1.bXs.nextFloat()) * 0.8F);

               for(int var8 = 0; var8 < 8; ++var8) {
                  var1.q(OP.bRw, (double)var5 + Math.random(), (double)var6 + Math.random(), (double)var7 + Math.random(), 0.0D, 0.0D, 0.0D);
               }
            } else {
               if (!var1.bXF && var4 && !var3.eo()) {
                  var1.y(var2, true);
               }

               var1.q(var2, this.brF.cx(), 3);
            }

            return true;
         }
      }
   }

   private GX q(GX var1, DD var2, Fm var3) {
      if (var2.bdO.bfz) {
         return var1;
      } else if (--var1.bsH <= 0) {
         return new GX(var3);
      } else {
         if (!var2.bdM.G(new GX(var3))) {
            var2.w(new GX(var3, 1, 0), false);
         }

         return var1;
      }
   }

   public GX e(GX var1, QI var2, DD var3) {
      boolean var4 = this.brF == Ea.bjN;
      PB var5 = this.q(var2, var3, var4);
      if (var5 == null) {
         return var1;
      } else {
         if (var5.bTH == PC.bTK) {
            NW var6 = var5.dU();
            if (!var2.q(var3, var6)) {
               return var1;
            }

            if (var4) {
               if (!var3.q(var6.v(var5.bTI), var5.bTI, var1)) {
                  return var1;
               }

               hI var7 = var2.g(var6);
               hn var8 = var7.ds().cB();
               if (var8 == hn.zS && ((Integer)var7.w(ey.rN)).intValue() == 0) {
                  var2.am(var6);
                  var3.w(Nj.bKl[Fm.s(this)]);
                  return this.q(var1, var3, Et.bou);
               }

               if (var8 == hn.zY && ((Integer)var7.w(ey.rN)).intValue() == 0) {
                  var2.am(var6);
                  var3.w(Nj.bKl[Fm.s(this)]);
                  return this.q(var1, var3, Et.bnE);
               }
            } else {
               if (this.brF == Ea.bjN) {
                  return new GX(Et.bmP);
               }

               NW var9 = var6.v(var5.bTI);
               if (!var3.q(var9, var5.bTI, var1)) {
                  return var1;
               }

               if (this.ac(var2, var9) && !var3.bdO.bfz) {
                  var3.w(Nj.bKl[Fm.s(this)]);
                  return new GX(Et.bmP);
               }
            }
         }

         return var1;
      }
   }
}
