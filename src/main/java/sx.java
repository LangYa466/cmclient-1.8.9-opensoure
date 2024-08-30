import java.util.Random;

public class Sx {
   protected Random oF = new Random();
   protected QI vR;
   protected int chD = 8;

   protected void q(QI var1, int var2, int var3, int var4, int var5, RU var6) {
   }

   public void q(RW var1, QI var2, int var3, int var4, RU var5) {
      int var6 = this.chD;
      this.vR = var2;
      this.oF.setSeed(var2.Zn());
      long var7 = this.oF.nextLong();
      long var9 = this.oF.nextLong();

      for(int var11 = var3 - var6; var11 <= var3 + var6; ++var11) {
         for(int var12 = var4 - var6; var12 <= var4 + var6; ++var12) {
            long var13 = (long)var11 * var7;
            long var15 = (long)var12 * var9;
            this.oF.setSeed(var13 ^ var15 ^ var2.Zn());
            this.q(var2, var11, var12, var3, var4, var5);
         }
      }

   }
}
