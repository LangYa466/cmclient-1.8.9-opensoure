import java.util.List;
import java.util.Random;

public class UK extends UQ {
   public UK(int var1, Random var2, Ur var3, OK var4) {
      super(var1);
      this.ckO = var4;
      this.ckN = var3;
   }

   public void q(Ut var1, List var2, Random var3) {
      this.w((UT)var1, var2, var3, 2, 0, false);
      this.q((UT)var1, var2, var3, 0, 2, false);
      this.e((UT)var1, var2, var3, 0, 2, false);
   }

   public UK() {
   }

   public static UK u(List var0, Random var1, int var2, int var3, int var4, OK var5, int var6) {
      Ur var7 = Ur.q(var2, var3, var4, -2, 0, 0, 7, 9, 7, var5);
      return r(var7) && Ut.q(var0, var7) == null ? new UK(var6, var1, var7, var5) : null;
   }

   public boolean q(QI var1, Random var2, Ur var3) {
      this.q(var1, var3, 0, 0, 0, 6, 1, 6, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 2, 0, 6, 7, 6, Ea.bjN.cx(), Ea.bjN.cx(), false);
      this.q(var1, var3, 0, 2, 0, 1, 6, 0, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 2, 6, 1, 6, 6, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 5, 2, 0, 6, 6, 0, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 5, 2, 6, 6, 6, 6, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 2, 0, 0, 6, 1, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 2, 5, 0, 6, 6, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 6, 2, 0, 6, 6, 1, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 6, 2, 5, 6, 6, 6, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 2, 6, 0, 4, 6, 0, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 2, 5, 0, 4, 5, 0, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 2, 6, 6, 4, 6, 6, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 2, 5, 6, 4, 5, 6, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 0, 6, 2, 0, 6, 4, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 5, 2, 0, 5, 4, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 6, 6, 2, 6, 6, 4, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 6, 5, 2, 6, 5, 4, Ea.bhZ.cx(), Ea.bhZ.cx(), false);

      for(int var4 = 0; var4 <= 6; ++var4) {
         for(int var5 = 0; var5 <= 6; ++var5) {
            this.q(var1, Ea.bkl.cx(), var4, -1, var5, var3);
         }
      }

      return true;
   }
}
