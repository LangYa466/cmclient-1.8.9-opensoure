import java.util.Random;

public class Va extends Vm {
   public Va() {
   }

   public boolean q(QI var1, Random var2, Ur var3) {
      Vn var4 = this.clG.clN[OK.bQG.tb()];
      Vn var5 = this.clG;
      if (this.clG.clP / 25 > 0) {
         this.q(var1, var3, 8, 0, var4.clO[OK.bQB.tb()]);
         this.q(var1, var3, 0, 0, var5.clO[OK.bQB.tb()]);
      }

      if (var5.clN[OK.bQC.tb()] == null) {
         this.q(var1, var3, 1, 4, 1, 7, 4, 6, clD);
      }

      if (var4.clN[OK.bQC.tb()] == null) {
         this.q(var1, var3, 8, 4, 1, 14, 4, 6, clD);
      }

      this.q(var1, var3, 0, 3, 0, 0, 3, 7, clE, clE, false);
      this.q(var1, var3, 15, 3, 0, 15, 3, 7, clE, clE, false);
      this.q(var1, var3, 1, 3, 0, 15, 3, 0, clE, clE, false);
      this.q(var1, var3, 1, 3, 7, 14, 3, 7, clE, clE, false);
      this.q(var1, var3, 0, 2, 0, 0, 2, 7, clD, clD, false);
      this.q(var1, var3, 15, 2, 0, 15, 2, 7, clD, clD, false);
      this.q(var1, var3, 1, 2, 0, 15, 2, 0, clD, clD, false);
      this.q(var1, var3, 1, 2, 7, 14, 2, 7, clD, clD, false);
      this.q(var1, var3, 0, 1, 0, 0, 1, 7, clE, clE, false);
      this.q(var1, var3, 15, 1, 0, 15, 1, 7, clE, clE, false);
      this.q(var1, var3, 1, 1, 0, 15, 1, 0, clE, clE, false);
      this.q(var1, var3, 1, 1, 7, 14, 1, 7, clE, clE, false);
      this.q(var1, var3, 5, 1, 0, 10, 1, 4, clE, clE, false);
      this.q(var1, var3, 6, 2, 0, 9, 2, 3, clD, clD, false);
      this.q(var1, var3, 5, 3, 0, 10, 3, 4, clE, clE, false);
      this.w(var1, clF, 6, 2, 3, var3);
      this.w(var1, clF, 9, 2, 3, var3);
      if (var5.clO[OK.bQE.tb()]) {
         this.q(var1, var3, 3, 1, 0, 4, 2, 0, false);
      }

      if (var5.clO[OK.bQD.tb()]) {
         this.q(var1, var3, 3, 1, 7, 4, 2, 7, false);
      }

      if (var5.clO[OK.bQF.tb()]) {
         this.q(var1, var3, 0, 1, 3, 0, 2, 4, false);
      }

      if (var4.clO[OK.bQE.tb()]) {
         this.q(var1, var3, 11, 1, 0, 12, 2, 0, false);
      }

      if (var4.clO[OK.bQD.tb()]) {
         this.q(var1, var3, 11, 1, 7, 12, 2, 7, false);
      }

      if (var4.clO[OK.bQG.tb()]) {
         this.q(var1, var3, 15, 1, 3, 15, 2, 4, false);
      }

      return true;
   }

   public Va(OK var1, Vn var2, Random var3) {
      super(1, var1, var2, 2, 1, 1);
   }
}
