import java.util.Random;

public class gQ extends cv {
   public static final hv xC = hv.q(q.q[109 & 1125], new gR());

   protected hA cY() {
      return new hA(this, new ht[]{xC});
   }

   private boolean i(QI var1, NW var2, OK var3) {
      NW var4 = var2.v(var3.WK());
      boolean var5 = var3.WT().WW();
      return var5 && var1.r(var4, true) || var3.equals(OK.bQC) && this.W(var1, var4);
   }

   public boolean cw() {
      return false;
   }

   public OS cn() {
      return OS.bSl;
   }

   public hI q(QI var1, NW var2, OK var3, float var4, float var5, float var6, int var7, zz var8) {
      if (this.i(var1, var2, var3)) {
         return this.cx().q(xC, var3);
      } else {
         for(OK var10 : OO.bRh) {
            if (var1.r(var2.v(var10.WK()), true)) {
               return this.cx().q(xC, var10);
            }
         }

         return this.cx();
      }
   }

   public void w(QI var1, NW var2, hI var3) {
      this.u(var1, var2, var3);
   }

   public NV e(QI var1, NW var2, hI var3) {
      return null;
   }

   public void q(QI var1, NW var2, hI var3, cv var4) {
      this.K(var1, var2, var3);
   }

   protected boolean u(QI var1, NW var2, hI var3) {
      if (var3.ds() == this && this.i(var1, var2, (OK)var3.w(xC))) {
         return true;
      } else {
         if (var1.g(var2).ds() == this) {
            this.q(var1, var2, var3, 0);
            var1.am(var2);
         }

         return false;
      }
   }

   public int e(hI var1) {
      // $FF: Couldn't be decompiled
   }

   protected gQ() {
      super(hn.zF);
      this.q(this.nr.ez().q(xC, OK.bQC));
      this.d(true);
      this.q(yl.aLF);
   }

   protected boolean K(QI var1, NW var2, hI var3) {
      if (!this.u(var1, var2, var3)) {
         return true;
      } else {
         OK var4 = (OK)var3.w(xC);
         OM var5 = var4.WT();
         OK var6 = var4.WK();
         boolean var7 = false;
         if (var5.WW() && !var1.r(var2.v(var6), true)) {
            var7 = true;
         } else if (var5.WV() && !this.W(var1, var2.v(var6))) {
            var7 = true;
         }

         if (var7) {
            this.q(var1, var2, var3, 0);
            var1.am(var2);
            return true;
         } else {
            return false;
         }
      }
   }

   public void q(QI var1, NW var2, hI var3, Random var4) {
      OK var5 = (OK)var3.w(xC);
      double var6 = (double)var2.aY() + 0.5D;
      double var8 = (double)var2.aX() + 0.7D;
      double var10 = (double)var2.KO() + 0.5D;
      double var12 = 0.22D;
      double var14 = 0.27D;
      if (var5.WT().WW()) {
         OK var16 = var5.WK();
         var1.q(OP.bRv, var6 + var14 * (double)var16.WP(), var8 + var12, var10 + var14 * (double)var16.WR(), 0.0D, 0.0D, 0.0D);
         var1.q(OP.bRK, var6 + var14 * (double)var16.WP(), var8 + var12, var10 + var14 * (double)var16.WR(), 0.0D, 0.0D, 0.0D);
      } else {
         var1.q(OP.bRv, var6, var8, var10, 0.0D, 0.0D, 0.0D);
         var1.q(OP.bRK, var6, var8, var10, 0.0D, 0.0D, 0.0D);
      }

   }

   public boolean e(QI var1, NW var2) {
      for(OK var4 : xC.et()) {
         if (this.i(var1, var2, var4)) {
            return true;
         }
      }

      return false;
   }

   public hI J(int var1) {
      hI var2 = this.cx();
      switch(var1) {
      case 1:
         var2 = var2.q(xC, OK.bQG);
         break;
      case 2:
         var2 = var2.q(xC, OK.bQF);
         break;
      case 3:
         var2 = var2.q(xC, OK.bQE);
         break;
      case 4:
         var2 = var2.q(xC, OK.bQD);
         break;
      case 5:
      default:
         var2 = var2.q(xC, OK.bQC);
      }

      return var2;
   }

   public boolean cr() {
      return false;
   }

   private boolean W(QI var1, NW var2) {
      if (QI.c(var1, var2)) {
         return true;
      } else {
         cv var3 = var1.g(var2).ds();
         return var3 instanceof dM || var3 == Ea.bif || var3 == Ea.bhp || var3 == Ea.bjH;
      }
   }

   public PB q(QI var1, NW var2, PX var3, PX var4) {
      OK var5 = (OK)var1.g(var2).w(xC);
      float var6 = 0.15F;
      if (var5 == OK.bQG) {
         this.w(0.0F, 0.2F, 0.5F - var6, var6 * 2.0F, 0.8F, 0.5F + var6);
      } else if (var5 == OK.bQF) {
         this.w(1.0F - var6 * 2.0F, 0.2F, 0.5F - var6, 1.0F, 0.8F, 0.5F + var6);
      } else if (var5 == OK.bQE) {
         this.w(0.5F - var6, 0.2F, 0.0F, 0.5F + var6, 0.8F, var6 * 2.0F);
      } else if (var5 == OK.bQD) {
         this.w(0.5F - var6, 0.2F, 1.0F - var6 * 2.0F, 0.5F + var6, 0.8F, 1.0F);
      } else {
         var6 = 0.1F;
         this.w(0.5F - var6, 0.0F, 0.5F - var6, 0.5F + var6, 0.6F, 0.5F + var6);
      }

      return super.q(var1, var2, var3, var4);
   }
}
