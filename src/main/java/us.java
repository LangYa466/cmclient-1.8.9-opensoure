import java.util.List;
import java.util.Random;

public class US extends UQ {
   public void q(Ut var1, List var2, Random var3) {
      this.e((UT)var1, var2, var3, 6, 2, false);
   }

   public US(int var1, Random var2, Ur var3, OK var4) {
      super(var1);
      this.ckO = var4;
      this.ckN = var3;
   }

   public static US q(List var0, Random var1, int var2, int var3, int var4, int var5, OK var6) {
      Ur var7 = Ur.q(var2, var3, var4, -2, 0, 0, 7, 11, 7, var6);
      return r(var7) && Ut.q(var0, var7) == null ? new US(var5, var1, var7, var6) : null;
   }

   public boolean q(QI var1, Random var2, Ur var3) {
      this.q(var1, var3, 0, 0, 0, 6, 1, 6, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 2, 0, 6, 10, 6, Ea.bjN.cx(), Ea.bjN.cx(), false);
      this.q(var1, var3, 0, 2, 0, 1, 8, 0, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 5, 2, 0, 6, 8, 0, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 2, 1, 0, 8, 6, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 6, 2, 1, 6, 8, 6, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 1, 2, 6, 5, 8, 6, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 3, 2, 0, 5, 4, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 6, 3, 2, 6, 5, 2, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 6, 3, 4, 6, 5, 4, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.w(var1, Ea.bkl.cx(), 5, 2, 5, var3);
      this.q(var1, var3, 4, 2, 5, 4, 3, 5, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 3, 2, 5, 3, 4, 5, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 2, 2, 5, 2, 5, 5, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 1, 2, 5, 1, 6, 5, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 1, 7, 1, 5, 7, 4, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 6, 8, 2, 6, 8, 4, Ea.bjN.cx(), Ea.bjN.cx(), false);
      this.q(var1, var3, 2, 6, 0, 4, 8, 0, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 2, 5, 0, 4, 5, 0, Ea.bhZ.cx(), Ea.bhZ.cx(), false);

      for(int var4 = 0; var4 <= 6; ++var4) {
         for(int var5 = 0; var5 <= 6; ++var5) {
            this.q(var1, Ea.bkl.cx(), var4, -1, var5, var3);
         }
      }

      return true;
   }

   public US() {
   }
}
