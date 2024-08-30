import java.util.List;
import java.util.Random;

public class UF extends UQ {
   private boolean cld;

   protected void O(HL var1) {
      super.O(var1);
      var1.s(t.q[713 & 12491], this.cld);
   }

   public boolean q(QI var1, Random var2, Ur var3) {
      this.q(var1, var3, 0, 0, 0, 4, 1, 4, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 2, 0, 4, 5, 4, Ea.bjN.cx(), Ea.bjN.cx(), false);
      this.q(var1, var3, 4, 2, 0, 4, 5, 4, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 4, 3, 1, 4, 4, 1, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 4, 3, 3, 4, 4, 3, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 0, 2, 0, 0, 5, 0, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 2, 4, 3, 5, 4, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 1, 3, 4, 1, 4, 4, Ea.bhZ.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 3, 3, 4, 3, 4, 4, Ea.bhZ.cx(), Ea.bkl.cx(), false);
      if (this.cld && var3.i(new NW(this.bm(3, 3), this.hN(2), this.bn(3, 3)))) {
         this.cld = false;
         this.q(var1, var3, var2, 3, 2, 3, clg, 2 + var2.nextInt(4));
      }

      this.q(var1, var3, 0, 6, 0, 4, 6, 4, Ea.bkl.cx(), Ea.bkl.cx(), false);

      for(int var4 = 0; var4 <= 4; ++var4) {
         for(int var5 = 0; var5 <= 4; ++var5) {
            this.q(var1, Ea.bkl.cx(), var4, -1, var5, var3);
         }
      }

      return true;
   }

   public static UF w(List var0, Random var1, int var2, int var3, int var4, OK var5, int var6) {
      Ur var7 = Ur.q(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
      return r(var7) && Ut.q(var0, var7) == null ? new UF(var6, var1, var7, var5) : null;
   }

   public UF(int var1, Random var2, Ur var3, OK var4) {
      super(var1);
      this.ckO = var4;
      this.ckN = var3;
      this.cld = var2.nextInt(3) == 0;
   }

   protected void P(HL var1) {
      super.P(var1);
      this.cld = var1.bL(t.q[20459 & -32551]);
   }

   public void q(Ut var1, List var2, Random var3) {
      this.q((UT)var1, var2, var3, 0, 1, true);
   }

   public UF() {
   }
}
