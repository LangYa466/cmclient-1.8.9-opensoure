import java.util.List;
import java.util.Random;

public class UU extends UQ {
   public UU() {
   }

   public UU(int var1, Random var2, Ur var3, OK var4) {
      super(var1);
      this.ckO = var4;
      this.ckN = var3;
   }

   public static UU d(List var0, Random var1, int var2, int var3, int var4, OK var5, int var6) {
      Ur var7 = Ur.q(var2, var3, var4, -1, -3, 0, 5, 10, 19, var5);
      return r(var7) && Ut.q(var0, var7) == null ? new UU(var6, var1, var7, var5) : null;
   }

   public void q(Ut var1, List var2, Random var3) {
      this.w((UT)var1, var2, var3, 1, 3, false);
   }

   public boolean q(QI var1, Random var2, Ur var3) {
      this.q(var1, var3, 0, 3, 0, 4, 4, 18, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 1, 5, 0, 3, 7, 18, Ea.bjN.cx(), Ea.bjN.cx(), false);
      this.q(var1, var3, 0, 5, 0, 0, 5, 18, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 4, 5, 0, 4, 5, 18, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 2, 0, 4, 2, 5, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 2, 13, 4, 2, 18, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 0, 0, 4, 1, 3, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 0, 15, 4, 1, 18, Ea.bkl.cx(), Ea.bkl.cx(), false);

      for(int var4 = 0; var4 <= 4; ++var4) {
         for(int var5 = 0; var5 <= 2; ++var5) {
            this.q(var1, Ea.bkl.cx(), var4, -1, var5, var3);
            this.q(var1, Ea.bkl.cx(), var4, -1, 18 - var5, var3);
         }
      }

      this.q(var1, var3, 0, 1, 1, 0, 4, 1, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 0, 3, 4, 0, 4, 4, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 0, 3, 14, 0, 4, 14, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 0, 1, 17, 0, 4, 17, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 4, 1, 1, 4, 4, 1, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 4, 3, 4, 4, 4, 4, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 4, 3, 14, 4, 4, 14, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 4, 1, 17, 4, 4, 17, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      return true;
   }
}
