public class TC extends Tw {
   private Rl[] cjs = new Rl[]{Rl.cao, Rl.caY, Rl.cay, Rl.caT};
   private final Sq cjt;
   private Rl[] cju = new Rl[]{Rl.cao, Rl.cbk, Rl.caY, Rl.caT, Rl.caN, Rl.caM};
   private Rl[] cjv = new Rl[]{Rl.caC, Rl.caC, Rl.caC, Rl.cbD, Rl.cbD, Rl.caT};
   private Rl[] cjw = new Rl[]{Rl.caS, Rl.caS, Rl.caS, Rl.cag};

   public int[] F(int var1, int var2, int var3, int var4) {
      int[] var5 = this.cjp.F(var1, var2, var3, var4);
      int[] var6 = TU.hM(var3 * var4);

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            this.q((long)(var8 + var1), (long)(var7 + var2));
            int var9 = var5[var8 + var7 * var3];
            int var10 = (var9 & 3840) >> 8;
            var9 = var9 & -3841;
            if (this.cjt != null && this.cjt.cgD >= 0) {
               var6[var8 + var7 * var3] = this.cjt.cgD;
            } else if (hH(var9)) {
               var6[var8 + var7 * var3] = var9;
            } else if (var9 == Rl.cbB.car) {
               var6[var8 + var7 * var3] = var9;
            } else if (var9 == 1) {
               if (var10 > 0) {
                  if (this.hI(3) == 0) {
                     var6[var8 + var7 * var3] = Rl.caJ.car;
                  } else {
                     var6[var8 + var7 * var3] = Rl.cas.car;
                  }
               } else {
                  var6[var8 + var7 * var3] = this.cjv[this.hI(this.cjv.length)].car;
               }
            } else if (var9 == 2) {
               if (var10 > 0) {
                  var6[var8 + var7 * var3] = Rl.cbA.car;
               } else {
                  var6[var8 + var7 * var3] = this.cju[this.hI(this.cju.length)].car;
               }
            } else if (var9 == 3) {
               if (var10 > 0) {
                  var6[var8 + var7 * var3] = Rl.caA.car;
               } else {
                  var6[var8 + var7 * var3] = this.cjs[this.hI(this.cjs.length)].car;
               }
            } else if (var9 == 4) {
               var6[var8 + var7 * var3] = this.cjw[this.hI(this.cjw.length)].car;
            } else {
               var6[var8 + var7 * var3] = Rl.cbB.car;
            }
         }
      }

      return var6;
   }

   public TC(long var1, Tw var3, Rb var4, String var5) {
      super(var1);
      this.cjp = var3;
      if (var4 == Rb.bZa) {
         this.cjv = new Rl[]{Rl.caC, Rl.cao, Rl.caY, Rl.caM, Rl.caT, Rl.cay};
         this.cjt = null;
      } else if (var4 == Rb.bZb) {
         this.cjt = Ss.dG(var5).acl();
      } else {
         this.cjt = null;
      }

   }
}
