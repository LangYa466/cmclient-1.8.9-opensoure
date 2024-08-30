import java.util.List;
import java.util.Random;

public class VX extends Wh {
   public VX() {
   }

   public VX(Wf var1, int var2, Random var3, Ur var4, OK var5) {
      super(var1, var2);
      this.ckO = var5;
      this.ckN = var4;
   }

   public boolean q(QI var1, Random var2, Ur var3) {
      if (this.cmY < 0) {
         this.cmY = this.w(var1, var3);
         if (this.cmY < 0) {
            return true;
         }

         this.ckN.ac(0, this.cmY - this.ckN.ckK + 7 - 1, 0);
      }

      this.q(var1, var3, 1, 1, 1, 7, 4, 4, Ea.bjN.cx(), Ea.bjN.cx(), false);
      this.q(var1, var3, 2, 1, 6, 8, 4, 10, Ea.bjN.cx(), Ea.bjN.cx(), false);
      this.q(var1, var3, 2, 0, 6, 8, 0, 10, Ea.bjj.cx(), Ea.bjj.cx(), false);
      this.w(var1, Ea.bks.cx(), 6, 0, 6, var3);
      this.q(var1, var3, 2, 1, 6, 2, 1, 10, Ea.bis.cx(), Ea.bis.cx(), false);
      this.q(var1, var3, 8, 1, 6, 8, 1, 10, Ea.bis.cx(), Ea.bis.cx(), false);
      this.q(var1, var3, 3, 1, 10, 7, 1, 10, Ea.bis.cx(), Ea.bis.cx(), false);
      this.q(var1, var3, 1, 0, 1, 7, 0, 4, Ea.bko.cx(), Ea.bko.cx(), false);
      this.q(var1, var3, 0, 0, 0, 0, 3, 5, Ea.bks.cx(), Ea.bks.cx(), false);
      this.q(var1, var3, 8, 0, 0, 8, 3, 5, Ea.bks.cx(), Ea.bks.cx(), false);
      this.q(var1, var3, 1, 0, 0, 7, 1, 0, Ea.bks.cx(), Ea.bks.cx(), false);
      this.q(var1, var3, 1, 0, 5, 7, 1, 5, Ea.bks.cx(), Ea.bks.cx(), false);
      this.q(var1, var3, 1, 2, 0, 7, 3, 0, Ea.bko.cx(), Ea.bko.cx(), false);
      this.q(var1, var3, 1, 2, 5, 7, 3, 5, Ea.bko.cx(), Ea.bko.cx(), false);
      this.q(var1, var3, 0, 4, 1, 8, 4, 1, Ea.bko.cx(), Ea.bko.cx(), false);
      this.q(var1, var3, 0, 4, 4, 8, 4, 4, Ea.bko.cx(), Ea.bko.cx(), false);
      this.q(var1, var3, 0, 5, 2, 8, 5, 3, Ea.bko.cx(), Ea.bko.cx(), false);
      this.w(var1, Ea.bko.cx(), 0, 4, 2, var3);
      this.w(var1, Ea.bko.cx(), 0, 4, 3, var3);
      this.w(var1, Ea.bko.cx(), 8, 4, 2, var3);
      this.w(var1, Ea.bko.cx(), 8, 4, 3, var3);
      int var4 = this.r(Ea.bih, 3);
      int var5 = this.r(Ea.bih, 2);

      for(int var6 = -1; var6 <= 2; ++var6) {
         for(int var7 = 0; var7 <= 8; ++var7) {
            this.w(var1, Ea.bih.J(var4), var7, 4 + var6, var6, var3);
            this.w(var1, Ea.bih.J(var5), var7, 4 + var6, 5 - var6, var3);
         }
      }

      this.w(var1, Ea.bkr.cx(), 0, 2, 1, var3);
      this.w(var1, Ea.bkr.cx(), 0, 2, 4, var3);
      this.w(var1, Ea.bkr.cx(), 8, 2, 1, var3);
      this.w(var1, Ea.bkr.cx(), 8, 2, 4, var3);
      this.w(var1, Ea.bhv.cx(), 0, 2, 2, var3);
      this.w(var1, Ea.bhv.cx(), 0, 2, 3, var3);
      this.w(var1, Ea.bhv.cx(), 8, 2, 2, var3);
      this.w(var1, Ea.bhv.cx(), 8, 2, 3, var3);
      this.w(var1, Ea.bhv.cx(), 2, 2, 5, var3);
      this.w(var1, Ea.bhv.cx(), 3, 2, 5, var3);
      this.w(var1, Ea.bhv.cx(), 5, 2, 0, var3);
      this.w(var1, Ea.bhv.cx(), 6, 2, 5, var3);
      this.w(var1, Ea.bis.cx(), 2, 1, 3, var3);
      this.w(var1, Ea.bhb.cx(), 2, 2, 3, var3);
      this.w(var1, Ea.bko.cx(), 1, 1, 4, var3);
      this.w(var1, Ea.bih.J(this.r(Ea.bih, 3)), 2, 1, 4, var3);
      this.w(var1, Ea.bih.J(this.r(Ea.bih, 1)), 1, 1, 3, var3);
      this.q(var1, var3, 5, 0, 1, 7, 0, 3, Ea.bjF.cx(), Ea.bjF.cx(), false);
      this.w(var1, Ea.bjF.cx(), 6, 1, 1, var3);
      this.w(var1, Ea.bjF.cx(), 6, 1, 2, var3);
      this.w(var1, Ea.bjN.cx(), 2, 1, 0, var3);
      this.w(var1, Ea.bjN.cx(), 2, 2, 0, var3);
      this.w(var1, Ea.bjq.cx().q(gQ.xC, this.ckO), 2, 3, 1, var3);
      this.q(var1, var3, var2, 2, 1, 0, OK.gE(this.r(Ea.bhc, 1)));
      if (this.q(var1, 2, 0, -1, var3).ds().cB() == hn.zp && this.q(var1, 2, -1, -1, var3).ds().cB() != hn.zp) {
         this.w(var1, Ea.bht.J(this.r(Ea.bht, 3)), 2, 0, -1, var3);
      }

      this.w(var1, Ea.bjN.cx(), 6, 1, 5, var3);
      this.w(var1, Ea.bjN.cx(), 6, 2, 5, var3);
      this.w(var1, Ea.bjq.cx().q(gQ.xC, this.ckO.WK()), 6, 3, 4, var3);
      this.q(var1, var3, var2, 6, 1, 5, OK.gE(this.r(Ea.bhc, 1)));

      for(int var8 = 0; var8 < 5; ++var8) {
         for(int var9 = 0; var9 < 9; ++var9) {
            this.w(var1, var9, 7, var8, var3);
            this.q(var1, Ea.bks.cx(), var9, -1, var8, var3);
         }
      }

      this.q(var1, var3, 4, 1, 2, 2);
      return true;
   }

   public static VX o(Wf var0, List var1, Random var2, int var3, int var4, int var5, OK var6, int var7) {
      Ur var8 = Ur.q(var3, var4, var5, 0, 0, 0, 9, 7, 11, var6);
      return y(var8) && Ut.q(var1, var8) == null ? new VX(var0, var7, var2, var8, var6) : null;
   }

   protected int bp(int var1, int var2) {
      return var1 == 0 ? 4 : super.bp(var1, var2);
   }
}
