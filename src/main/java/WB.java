import java.util.List;
import java.util.Random;

public class Wb extends Wh {
   private boolean cmK;

   public Wb(Wf var1, int var2, Random var3, Ur var4, OK var5) {
      super(var1, var2);
      this.ckO = var5;
      this.ckN = var4;
      this.cmK = var3.nextBoolean();
   }

   public static Wb d(Wf var0, List var1, Random var2, int var3, int var4, int var5, OK var6, int var7) {
      Ur var8 = Ur.q(var3, var4, var5, 0, 0, 0, 5, 6, 5, var6);
      return Ut.q(var1, var8) != null ? null : new Wb(var0, var7, var2, var8, var6);
   }

   protected void O(HL var1) {
      super.O(var1);
      var1.s(p.q[12118 & 468], this.cmK);
   }

   protected void P(HL var1) {
      super.P(var1);
      this.cmK = var1.bL(p.q[4436 & -14987]);
   }

   public Wb() {
   }

   public boolean q(QI var1, Random var2, Ur var3) {
      if (this.cmY < 0) {
         this.cmY = this.w(var1, var3);
         if (this.cmY < 0) {
            return true;
         }

         this.ckN.ac(0, this.cmY - this.ckN.ckK + 6 - 1, 0);
      }

      this.q(var1, var3, 0, 0, 0, 4, 0, 4, Ea.bks.cx(), Ea.bks.cx(), false);
      this.q(var1, var3, 0, 4, 0, 4, 4, 4, Ea.bkr.cx(), Ea.bkr.cx(), false);
      this.q(var1, var3, 1, 4, 1, 3, 4, 3, Ea.bko.cx(), Ea.bko.cx(), false);
      this.w(var1, Ea.bks.cx(), 0, 1, 0, var3);
      this.w(var1, Ea.bks.cx(), 0, 2, 0, var3);
      this.w(var1, Ea.bks.cx(), 0, 3, 0, var3);
      this.w(var1, Ea.bks.cx(), 4, 1, 0, var3);
      this.w(var1, Ea.bks.cx(), 4, 2, 0, var3);
      this.w(var1, Ea.bks.cx(), 4, 3, 0, var3);
      this.w(var1, Ea.bks.cx(), 0, 1, 4, var3);
      this.w(var1, Ea.bks.cx(), 0, 2, 4, var3);
      this.w(var1, Ea.bks.cx(), 0, 3, 4, var3);
      this.w(var1, Ea.bks.cx(), 4, 1, 4, var3);
      this.w(var1, Ea.bks.cx(), 4, 2, 4, var3);
      this.w(var1, Ea.bks.cx(), 4, 3, 4, var3);
      this.q(var1, var3, 0, 1, 1, 0, 3, 3, Ea.bko.cx(), Ea.bko.cx(), false);
      this.q(var1, var3, 4, 1, 1, 4, 3, 3, Ea.bko.cx(), Ea.bko.cx(), false);
      this.q(var1, var3, 1, 1, 4, 3, 3, 4, Ea.bko.cx(), Ea.bko.cx(), false);
      this.w(var1, Ea.bhv.cx(), 0, 2, 2, var3);
      this.w(var1, Ea.bhv.cx(), 2, 2, 4, var3);
      this.w(var1, Ea.bhv.cx(), 4, 2, 2, var3);
      this.w(var1, Ea.bko.cx(), 1, 1, 0, var3);
      this.w(var1, Ea.bko.cx(), 1, 2, 0, var3);
      this.w(var1, Ea.bko.cx(), 1, 3, 0, var3);
      this.w(var1, Ea.bko.cx(), 2, 3, 0, var3);
      this.w(var1, Ea.bko.cx(), 3, 3, 0, var3);
      this.w(var1, Ea.bko.cx(), 3, 2, 0, var3);
      this.w(var1, Ea.bko.cx(), 3, 1, 0, var3);
      if (this.q(var1, 2, 0, -1, var3).ds().cB() == hn.zp && this.q(var1, 2, -1, -1, var3).ds().cB() != hn.zp) {
         this.w(var1, Ea.bht.J(this.r(Ea.bht, 3)), 2, 0, -1, var3);
      }

      this.q(var1, var3, 1, 1, 1, 3, 3, 3, Ea.bjN.cx(), Ea.bjN.cx(), false);
      if (this.cmK) {
         this.w(var1, Ea.bis.cx(), 0, 5, 0, var3);
         this.w(var1, Ea.bis.cx(), 1, 5, 0, var3);
         this.w(var1, Ea.bis.cx(), 2, 5, 0, var3);
         this.w(var1, Ea.bis.cx(), 3, 5, 0, var3);
         this.w(var1, Ea.bis.cx(), 4, 5, 0, var3);
         this.w(var1, Ea.bis.cx(), 0, 5, 4, var3);
         this.w(var1, Ea.bis.cx(), 1, 5, 4, var3);
         this.w(var1, Ea.bis.cx(), 2, 5, 4, var3);
         this.w(var1, Ea.bis.cx(), 3, 5, 4, var3);
         this.w(var1, Ea.bis.cx(), 4, 5, 4, var3);
         this.w(var1, Ea.bis.cx(), 4, 5, 1, var3);
         this.w(var1, Ea.bis.cx(), 4, 5, 2, var3);
         this.w(var1, Ea.bis.cx(), 4, 5, 3, var3);
         this.w(var1, Ea.bis.cx(), 0, 5, 1, var3);
         this.w(var1, Ea.bis.cx(), 0, 5, 2, var3);
         this.w(var1, Ea.bis.cx(), 0, 5, 3, var3);
      }

      if (this.cmK) {
         int var4 = this.r(Ea.bjK, 3);
         this.w(var1, Ea.bjK.J(var4), 3, 1, 3, var3);
         this.w(var1, Ea.bjK.J(var4), 3, 2, 3, var3);
         this.w(var1, Ea.bjK.J(var4), 3, 3, 3, var3);
         this.w(var1, Ea.bjK.J(var4), 3, 4, 3, var3);
      }

      this.w(var1, Ea.bjq.cx().q(gQ.xC, this.ckO), 2, 3, 1, var3);

      for(int var6 = 0; var6 < 5; ++var6) {
         for(int var5 = 0; var5 < 5; ++var5) {
            this.w(var1, var5, 6, var6, var3);
            this.q(var1, Ea.bks.cx(), var5, -1, var6, var3);
         }
      }

      this.q(var1, var3, 1, 1, 2, 1);
      return true;
   }
}
