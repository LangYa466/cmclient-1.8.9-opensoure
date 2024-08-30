public class gT extends cv {
   public static final hu xE = hu.x(w.q[-14740 & 15231]);
   public static final hw xF = hw.q(w.q[1903 & -19857], gV.class);
   public static final hv xG = hv.q(q.q[11621 & -32529], OO.bRh);

   public boolean cr() {
      return false;
   }

   private static boolean f(cv var0) {
      return var0.mS.eh() && var0.cw() || var0 == Ea.bib || var0 instanceof go || var0 instanceof gy;
   }

   public void cZ() {
      float var1 = 0.1875F;
      this.w(0.0F, 0.40625F, 0.0F, 1.0F, 0.59375F, 1.0F);
   }

   public NV e(QI var1, NW var2, hI var3) {
      this.e(var1, var2);
      return super.e(var1, var2, var3);
   }

   public void q(QI var1, NW var2, hI var3, cv var4) {
      if (!var1.bXF) {
         NW var5 = var2.v(((OK)var3.w(xG)).WK());
         if (!f(var1.g(var5).ds())) {
            var1.am(var2);
            this.q(var1, var2, var3, 0);
         } else {
            boolean var6 = var1.aA(var2);
            if (var6 || var4.cJ()) {
               boolean var7 = ((Boolean)var3.w(xE)).booleanValue();
               if (var7 != var6) {
                  var1.q(var2, var3.q(xE, Boolean.valueOf(var6)), 2);
                  var1.w((DD)null, var6 ? 1003 : 1006, var2, 0);
               }
            }
         }
      }

   }

   protected static OK N(int var0) {
      switch(var0 & 3) {
      case 0:
         return OK.bQD;
      case 1:
         return OK.bQE;
      case 2:
         return OK.bQF;
      case 3:
      default:
         return OK.bQG;
      }
   }

   protected hA cY() {
      return new hA(this, new ht[]{xG, xE, xF});
   }

   public void e(Qx var1, NW var2) {
      this.n(var1.g(var2));
   }

   public hI J(int var1) {
      return this.cx().q(xG, N(var1)).q(xE, Boolean.valueOf((var1 & 4) != 0)).q(xF, (var1 & 8) == 0 ? gV.xJ : gV.xI);
   }

   protected static int e(OK var0) {
      // $FF: Couldn't be decompiled
   }

   public hI q(QI var1, NW var2, OK var3, float var4, float var5, float var6, int var7, zz var8) {
      hI var9 = this.cx();
      if (var3.WT().WW()) {
         var9 = var9.q(xG, var3).q(xE, Boolean.valueOf(false));
         var9 = var9.q(xF, var5 > 0.5F ? gV.xI : gV.xJ);
      }

      return var9;
   }

   public boolean cw() {
      return false;
   }

   public boolean q(QI var1, NW var2, hI var3, DD var4, OK var5, float var6, float var7, float var8) {
      if (this.mS == hn.zl) {
         return true;
      } else {
         var3 = var3.e(xE);
         var1.q(var2, var3, 2);
         var1.w(var4, ((Boolean)var3.w(xE)).booleanValue() ? 1003 : 1006, var2, 0);
         return true;
      }
   }

   public void n(hI var1) {
      if (var1.ds() == this) {
         boolean var2 = var1.w(xF) == gV.xI;
         Boolean var3 = (Boolean)var1.w(xE);
         OK var4 = (OK)var1.w(xG);
         float var5 = 0.1875F;
         if (var2) {
            this.w(0.0F, 0.8125F, 0.0F, 1.0F, 1.0F, 1.0F);
         } else {
            this.w(0.0F, 0.0F, 0.0F, 1.0F, 0.1875F, 1.0F);
         }

         if (var3.booleanValue()) {
            if (var4 == OK.bQD) {
               this.w(0.0F, 0.0F, 0.8125F, 1.0F, 1.0F, 1.0F);
            }

            if (var4 == OK.bQE) {
               this.w(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.1875F);
            }

            if (var4 == OK.bQF) {
               this.w(0.8125F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            }

            if (var4 == OK.bQG) {
               this.w(0.0F, 0.0F, 0.0F, 0.1875F, 1.0F, 1.0F);
            }
         }
      }

   }

   public int e(hI var1) {
      int var2 = 0;
      var2 = var2 | e((OK)var1.w(xG));
      if (((Boolean)var1.w(xE)).booleanValue()) {
         var2 |= 4;
      }

      if (var1.w(xF) == gV.xI) {
         var2 |= 8;
      }

      return var2;
   }

   public NV q(QI var1, NW var2) {
      this.e(var1, var2);
      return super.q(var1, var2);
   }

   public boolean r(Qx var1, NW var2) {
      return !((Boolean)var1.g(var2).w(xE)).booleanValue();
   }

   public boolean q(QI var1, NW var2, OK var3) {
      return !var3.WT().WV() && f(var1.g(var2.v(var3.WK())).ds());
   }

   public OS cn() {
      return OS.bSl;
   }

   protected gT(hn var1) {
      super(var1);
      this.q(this.nr.ez().q(xG, OK.bQD).q(xE, Boolean.valueOf(false)).q(xF, gV.xJ));
      float var2 = 0.5F;
      float var3 = 1.0F;
      this.w(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.q(yl.aLN);
   }

   public PB q(QI var1, NW var2, PX var3, PX var4) {
      this.e(var1, var2);
      return super.q(var1, var2, var3, var4);
   }
}
