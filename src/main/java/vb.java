import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class VB extends VQ {
   private boolean cmd;
   private static final List cme = Lists.newArrayList(new Qd[]{new Qd(Et.blp, 0, 1, 1, 10), new Qd(Et.bnC, 0, 1, 3, 3), new Qd(Et.bmQ, 0, 1, 5, 10), new Qd(Et.blD, 0, 1, 3, 5), new Qd(Et.blP, 0, 4, 9, 5), new Qd(Et.bnl, 0, 1, 3, 15), new Qd(Et.bnj, 0, 1, 3, 15), new Qd(Et.bnz, 0, 1, 1, 5), new Qd(Et.bmG, 0, 1, 1, 5), new Qd(Et.bnf, 0, 1, 1, 5), new Qd(Et.bmN, 0, 1, 1, 5), new Qd(Et.blI, 0, 1, 1, 5), new Qd(Et.blB, 0, 1, 1, 5), new Qd(Et.blf, 0, 1, 1, 1), new Qd(Et.bol, 0, 1, 1, 1), new Qd(Et.blw, 0, 1, 1, 1), new Qd(Et.bnH, 0, 1, 1, 1), new Qd(Et.bnS, 0, 1, 1, 1)});

   public VB(int var1, Random var2, Ur var3, OK var4) {
      super(var1);
      this.ckO = var4;
      this.cmy = this.g(var2);
      this.ckN = var3;
   }

   public static VB f(List var0, Random var1, int var2, int var3, int var4, OK var5, int var6) {
      Ur var7 = Ur.q(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return t(var7) && Ut.q(var0, var7) == null ? new VB(var6, var1, var7, var5) : null;
   }

   protected void P(HL var1) {
      super.P(var1);
      this.cmd = var1.bL(t.q[-32567 & 15067]);
   }

   public void q(Ut var1, List var2, Random var3) {
      this.w((VM)var1, var2, var3, 1, 1);
   }

   public VB() {
   }

   public boolean q(QI var1, Random var2, Ur var3) {
      if (this.q(var1, var3)) {
         return false;
      } else {
         this.q(var1, var3, 0, 0, 0, 4, 4, 6, true, var2, Vx.adl());
         this.q(var1, var2, var3, this.cmy, 1, 1, 0);
         this.q(var1, var2, var3, VR.cmz, 1, 1, 6);
         this.q(var1, var3, 3, 1, 2, 3, 1, 4, Ea.bkz.cx(), Ea.bkz.cx(), false);
         this.w(var1, Ea.bin.J(gK.xc.dm()), 3, 1, 1, var3);
         this.w(var1, Ea.bin.J(gK.xc.dm()), 3, 1, 5, var3);
         this.w(var1, Ea.bin.J(gK.xc.dm()), 3, 2, 2, var3);
         this.w(var1, Ea.bin.J(gK.xc.dm()), 3, 2, 4, var3);

         for(int var4 = 2; var4 <= 4; ++var4) {
            this.w(var1, Ea.bin.J(gK.xc.dm()), 2, 1, var4, var3);
         }

         if (!this.cmd && var3.i(new NW(this.bm(3, 3), this.hN(2), this.bn(3, 3)))) {
            this.cmd = true;
            this.q(var1, var3, var2, 3, 2, 3, Qd.q(cme, Et.blC.y(var2)), 2 + var2.nextInt(2));
         }

         return true;
      }
   }

   protected void O(HL var1) {
      super.O(var1);
      var1.s(t.q[-30003 & 4299], this.cmd);
   }
}
