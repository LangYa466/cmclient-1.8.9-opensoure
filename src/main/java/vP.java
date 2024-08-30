import java.util.Random;

public class Vp extends Vm {
   public Vp() {
   }

   public Vp(OK var1, Vn var2, Random var3) {
      super(1, var1, var2, 1, 1, 1);
   }

   public boolean q(QI var1, Random var2, Ur var3) {
      if (this.clG.clP / 25 > 0) {
         this.q(var1, var3, 0, 0, this.clG.clO[OK.bQB.tb()]);
      }

      if (this.clG.clN[OK.bQC.tb()] == null) {
         this.q(var1, var3, 1, 4, 1, 6, 4, 6, clD);
      }

      for(int var4 = 1; var4 <= 6; ++var4) {
         for(int var5 = 1; var5 <= 6; ++var5) {
            if (var2.nextInt(3) != 0) {
               int var6 = 2 + (var2.nextInt(4) == 0 ? 0 : 1);
               this.q(var1, var3, var4, var6, var5, var4, 3, var5, Ea.bip.J(1), Ea.bip.J(1), false);
            }
         }
      }

      this.q(var1, var3, 0, 1, 0, 0, 1, 7, clE, clE, false);
      this.q(var1, var3, 7, 1, 0, 7, 1, 7, clE, clE, false);
      this.q(var1, var3, 1, 1, 0, 6, 1, 0, clE, clE, false);
      this.q(var1, var3, 1, 1, 7, 6, 1, 7, clE, clE, false);
      this.q(var1, var3, 0, 2, 0, 0, 2, 7, clK, clK, false);
      this.q(var1, var3, 7, 2, 0, 7, 2, 7, clK, clK, false);
      this.q(var1, var3, 1, 2, 0, 6, 2, 0, clK, clK, false);
      this.q(var1, var3, 1, 2, 7, 6, 2, 7, clK, clK, false);
      this.q(var1, var3, 0, 3, 0, 0, 3, 7, clE, clE, false);
      this.q(var1, var3, 7, 3, 0, 7, 3, 7, clE, clE, false);
      this.q(var1, var3, 1, 3, 0, 6, 3, 0, clE, clE, false);
      this.q(var1, var3, 1, 3, 7, 6, 3, 7, clE, clE, false);
      this.q(var1, var3, 0, 1, 3, 0, 2, 4, clK, clK, false);
      this.q(var1, var3, 7, 1, 3, 7, 2, 4, clK, clK, false);
      this.q(var1, var3, 3, 1, 0, 4, 2, 0, clK, clK, false);
      this.q(var1, var3, 3, 1, 7, 4, 2, 7, clK, clK, false);
      if (this.clG.clO[OK.bQE.tb()]) {
         this.q(var1, var3, 3, 1, 0, 4, 2, 0, false);
      }

      return true;
   }
}
