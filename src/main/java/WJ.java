import java.util.List;
import java.util.Random;

public class Wj extends Wh {
   private boolean cmZ;
   private int cna;

   public Wj(Wf var1, int var2, Random var3, Ur var4, OK var5) {
      super(var1, var2);
      this.ckO = var5;
      this.ckN = var4;
      this.cmZ = var3.nextBoolean();
      this.cna = var3.nextInt(3);
   }

   protected void O(HL var1) {
      super.O(var1);
      var1.a(r.q[5018 & -28742], this.cna);
      var1.s(r.q[17307 & 2043], this.cmZ);
   }

   protected void P(HL var1) {
      super.P(var1);
      this.cna = var1.bQ(r.q[7070 & -30821]);
      this.cmZ = var1.bL(r.q[3035 & 13211]);
   }

   public Wj() {
   }

   public boolean q(QI var1, Random var2, Ur var3) {
      if (this.cmY < 0) {
         this.cmY = this.w(var1, var3);
         if (this.cmY < 0) {
            return true;
         }

         this.ckN.ac(0, this.cmY - this.ckN.ckK + 6 - 1, 0);
      }

      this.q(var1, var3, 1, 1, 1, 3, 5, 4, Ea.bjN.cx(), Ea.bjN.cx(), false);
      this.q(var1, var3, 0, 0, 0, 3, 0, 4, Ea.bks.cx(), Ea.bks.cx(), false);
      this.q(var1, var3, 1, 0, 1, 2, 0, 3, Ea.bjj.cx(), Ea.bjj.cx(), false);
      if (this.cmZ) {
         this.q(var1, var3, 1, 4, 1, 2, 4, 3, Ea.bkr.cx(), Ea.bkr.cx(), false);
      } else {
         this.q(var1, var3, 1, 5, 1, 2, 5, 3, Ea.bkr.cx(), Ea.bkr.cx(), false);
      }

      this.w(var1, Ea.bkr.cx(), 1, 4, 0, var3);
      this.w(var1, Ea.bkr.cx(), 2, 4, 0, var3);
      this.w(var1, Ea.bkr.cx(), 1, 4, 4, var3);
      this.w(var1, Ea.bkr.cx(), 2, 4, 4, var3);
      this.w(var1, Ea.bkr.cx(), 0, 4, 1, var3);
      this.w(var1, Ea.bkr.cx(), 0, 4, 2, var3);
      this.w(var1, Ea.bkr.cx(), 0, 4, 3, var3);
      this.w(var1, Ea.bkr.cx(), 3, 4, 1, var3);
      this.w(var1, Ea.bkr.cx(), 3, 4, 2, var3);
      this.w(var1, Ea.bkr.cx(), 3, 4, 3, var3);
      this.q(var1, var3, 0, 1, 0, 0, 3, 0, Ea.bkr.cx(), Ea.bkr.cx(), false);
      this.q(var1, var3, 3, 1, 0, 3, 3, 0, Ea.bkr.cx(), Ea.bkr.cx(), false);
      this.q(var1, var3, 0, 1, 4, 0, 3, 4, Ea.bkr.cx(), Ea.bkr.cx(), false);
      this.q(var1, var3, 3, 1, 4, 3, 3, 4, Ea.bkr.cx(), Ea.bkr.cx(), false);
      this.q(var1, var3, 0, 1, 1, 0, 3, 3, Ea.bko.cx(), Ea.bko.cx(), false);
      this.q(var1, var3, 3, 1, 1, 3, 3, 3, Ea.bko.cx(), Ea.bko.cx(), false);
      this.q(var1, var3, 1, 1, 0, 2, 3, 0, Ea.bko.cx(), Ea.bko.cx(), false);
      this.q(var1, var3, 1, 1, 4, 2, 3, 4, Ea.bko.cx(), Ea.bko.cx(), false);
      this.w(var1, Ea.bhv.cx(), 0, 2, 2, var3);
      this.w(var1, Ea.bhv.cx(), 3, 2, 2, var3);
      if (this.cna > 0) {
         this.w(var1, Ea.bis.cx(), this.cna, 1, 3, var3);
         this.w(var1, Ea.bhb.cx(), this.cna, 2, 3, var3);
      }

      this.w(var1, Ea.bjN.cx(), 1, 1, 0, var3);
      this.w(var1, Ea.bjN.cx(), 1, 2, 0, var3);
      this.q(var1, var3, var2, 1, 1, 0, OK.gE(this.r(Ea.bhc, 1)));
      if (this.q(var1, 1, 0, -1, var3).ds().cB() == hn.zp && this.q(var1, 1, -1, -1, var3).ds().cB() != hn.zp) {
         this.w(var1, Ea.bht.J(this.r(Ea.bht, 3)), 1, 0, -1, var3);
      }

      for(int var4 = 0; var4 < 5; ++var4) {
         for(int var5 = 0; var5 < 4; ++var5) {
            this.w(var1, var5, 6, var4, var3);
            this.q(var1, Ea.bks.cx(), var5, -1, var4, var3);
         }
      }

      this.q(var1, var3, 1, 1, 2, 1);
      return true;
   }

   public static Wj f(Wf var0, List var1, Random var2, int var3, int var4, int var5, OK var6, int var7) {
      Ur var8 = Ur.q(var3, var4, var5, 0, 0, 0, 4, 6, 5, var6);
      return y(var8) && Ut.q(var1, var8) == null ? new Wj(var0, var7, var2, var8, var6) : null;
   }
}
