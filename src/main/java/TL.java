import java.util.Random;

public class Tl extends Tr {
   private final hI ciT;
   private final hI ciU;

   public Tl(hI var1, hI var2) {
      super(false);
      this.ciT = var1;
      this.ciU = var2;
   }

   public boolean w(QI var1, Random var2, NW var3) {
      cv var4;
      while(((var4 = var1.g(var3).ds()).cB() == hn.zp || var4.cB() == hn.zK) && var3.aX() > 0) {
         var3 = var3.Vj();
      }

      cv var5 = var1.g(var3).ds();
      if (var5 == Ea.bjj || var5 == Ea.biQ) {
         var3 = var3.Vi();
         this.N(var1, var3, this.ciT);

         for(int var6 = var3.aX(); var6 <= var3.aX() + 2; ++var6) {
            int var7 = var6 - var3.aX();
            int var8 = 2 - var7;

            for(int var9 = var3.aY() - var8; var9 <= var3.aY() + var8; ++var9) {
               int var10 = var9 - var3.aY();

               for(int var11 = var3.KO() - var8; var11 <= var3.KO() + var8; ++var11) {
                  int var12 = var11 - var3.KO();
                  if (Math.abs(var10) != var8 || Math.abs(var12) != var8 || var2.nextInt(2) != 0) {
                     NW var13 = new NW(var9, var6, var11);
                     if (!var1.g(var13).ds().cE()) {
                        this.N(var1, var13, this.ciU);
                     }
                  }
               }
            }
         }
      }

      return true;
   }
}
