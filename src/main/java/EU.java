public class eu extends cv {
   public static final hu rv = hu.x(w.q[13951 & 622]);
   public static final hw rw = hw.q(q.q[-31131 & 367], ew.class);

   public static int w(OK var0) {
      // $FF: Couldn't be decompiled
   }

   public hI q(QI var1, NW var2, OK var3, float var4, float var5, float var6, int var7, zz var8) {
      hI var9 = this.cx().q(rv, Boolean.valueOf(false));
      if (y(var1, var2, var3.WK())) {
         return var9.q(rw, ew.q(var3, var8.xT()));
      } else {
         for(OK var11 : OO.bRh) {
            if (var11 != var3 && y(var1, var2, var11.WK())) {
               return var9.q(rw, ew.q(var11, var8.xT()));
            }
         }

         if (QI.c(var1, var2.Vj())) {
            return var9.q(rw, ew.q(OK.bQC, var8.xT()));
         } else {
            return var9;
         }
      }
   }

   protected hA cY() {
      return new hA(this, new ht[]{rw, rv});
   }

   public boolean cr() {
      return false;
   }

   public void q(QI var1, NW var2, hI var3, cv var4) {
      if (this.z(var1, var2, var3) && !y(var1, var2, ((ew)var3.w(rw)).dz().WK())) {
         this.q(var1, var2, var3, 0);
         var1.am(var2);
      }

   }

   public boolean cw() {
      return false;
   }

   public boolean q(QI var1, NW var2, hI var3, DD var4, OK var5, float var6, float var7, float var8) {
      if (var1.bXF) {
         return true;
      } else {
         var3 = var3.e(rv);
         var1.q(var2, var3, 3);
         var1.q((double)var2.aY() + 0.5D, (double)var2.aX() + 0.5D, (double)var2.KO() + 0.5D, r.q[10679 & -10774], 0.3F, ((Boolean)var3.w(rv)).booleanValue() ? 0.6F : 0.5F);
         var1.e(var2, this);
         OK var9 = ((ew)var3.w(rw)).dz();
         var1.e(var2.v(var9.WK()), this);
         return true;
      }
   }

   public boolean q(QI var1, NW var2, OK var3) {
      return y(var1, var2, var3.WK());
   }

   public void r(QI var1, NW var2, hI var3) {
      if (((Boolean)var3.w(rv)).booleanValue()) {
         var1.e(var2, this);
         OK var4 = ((ew)var3.w(rw)).dz();
         var1.e(var2.v(var4.WK()), this);
      }

      super.r(var1, var2, var3);
   }

   public int q(Qx var1, NW var2, hI var3, OK var4) {
      return !((Boolean)var3.w(rv)).booleanValue() ? 0 : (((ew)var3.w(rw)).dz() == var4 ? 15 : 0);
   }

   public boolean e(QI var1, NW var2) {
      for(OK var6 : OK.values()) {
         if (y(var1, var2, var6)) {
            return true;
         }
      }

      return false;
   }

   public int e(hI var1) {
      int var2 = 0;
      var2 = var2 | ((ew)var1.w(rw)).dm();
      if (((Boolean)var1.w(rv)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   private boolean z(QI var1, NW var2, hI var3) {
      if (this.e(var1, var2)) {
         return true;
      } else {
         this.q(var1, var2, var3, 0);
         var1.am(var2);
         return false;
      }
   }

   public hI J(int var1) {
      return this.cx().q(rw, ew.X(var1 & 7)).q(rv, Boolean.valueOf((var1 & 8) > 0));
   }

   protected eu() {
      super(hn.zF);
      this.q(this.nr.ez().q(rw, ew.rE).q(rv, Boolean.valueOf(false)));
      this.q(yl.aLN);
   }

   public int w(Qx var1, NW var2, hI var3, OK var4) {
      return ((Boolean)var3.w(rv)).booleanValue() ? 15 : 0;
   }

   protected static boolean y(QI var0, NW var1, OK var2) {
      return cU.e(var0, var1, var2);
   }

   public void e(Qx var1, NW var2) {
      // $FF: Couldn't be decompiled
   }

   public NV e(QI var1, NW var2, hI var3) {
      return null;
   }

   public boolean cJ() {
      return true;
   }
}
