import java.util.List;
import java.util.Random;

public class UM extends UQ {
   public boolean q(QI var1, Random var2, Ur var3) {
      this.q(var1, var3, 7, 3, 0, 11, 4, 18, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 3, 7, 18, 4, 11, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 8, 5, 0, 10, 7, 18, Ea.bjN.cx(), Ea.bjN.cx(), false);
      this.q(var1, var3, 0, 5, 8, 18, 7, 10, Ea.bjN.cx(), Ea.bjN.cx(), false);
      this.q(var1, var3, 7, 5, 0, 7, 5, 7, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 7, 5, 11, 7, 5, 18, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 11, 5, 0, 11, 5, 7, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 11, 5, 11, 11, 5, 18, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 5, 7, 7, 5, 7, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 11, 5, 7, 18, 5, 7, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 5, 11, 7, 5, 11, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 11, 5, 11, 18, 5, 11, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 7, 2, 0, 11, 2, 5, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 7, 2, 13, 11, 2, 18, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 7, 0, 0, 11, 1, 3, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 7, 0, 15, 11, 1, 18, Ea.bkl.cx(), Ea.bkl.cx(), false);

      for(int var4 = 7; var4 <= 11; ++var4) {
         for(int var5 = 0; var5 <= 2; ++var5) {
            this.q(var1, Ea.bkl.cx(), var4, -1, var5, var3);
            this.q(var1, Ea.bkl.cx(), var4, -1, 18 - var5, var3);
         }
      }

      this.q(var1, var3, 0, 2, 7, 5, 2, 11, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 13, 2, 7, 18, 2, 11, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 0, 7, 3, 1, 11, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 15, 0, 7, 18, 1, 11, Ea.bkl.cx(), Ea.bkl.cx(), false);

      for(int var6 = 0; var6 <= 2; ++var6) {
         for(int var7 = 7; var7 <= 11; ++var7) {
            this.q(var1, Ea.bkl.cx(), var6, -1, var7, var3);
            this.q(var1, Ea.bkl.cx(), 18 - var6, -1, var7, var3);
         }
      }

      return true;
   }

   public void q(Ut var1, List var2, Random var3) {
      this.w((UT)var1, var2, var3, 8, 3, false);
      this.q((UT)var1, var2, var3, 3, 8, false);
      this.e((UT)var1, var2, var3, 3, 8, false);
   }

   public UM() {
   }

   public static UM o(List var0, Random var1, int var2, int var3, int var4, OK var5, int var6) {
      Ur var7 = Ur.q(var2, var3, var4, -8, -3, 0, 19, 10, 19, var5);
      return r(var7) && Ut.q(var0, var7) == null ? new UM(var6, var1, var7, var5) : null;
   }

   public UM(int var1, Random var2, Ur var3, OK var4) {
      super(var1);
      this.ckO = var4;
      this.ckN = var3;
   }

   protected UM(Random var1, int var2, int var3) {
      // $FF: Couldn't be decompiled
   }
}
