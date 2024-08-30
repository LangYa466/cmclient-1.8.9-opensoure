import java.util.Random;

public class SK extends Tu {
   private final int cij;
   private final cv cik;

   public boolean w(QI var1, Random var2, NW var3) {
      while(true) {
         label51: {
            if (var3.aX() > 3) {
               if (var1.aj(var3.Vj())) {
                  break label51;
               }

               cv var4 = var1.g(var3.Vj()).ds();
               if (var4 != Ea.biQ && var4 != Ea.bjj && var4 != Ea.biP) {
                  break label51;
               }
            }

            if (var3.aX() <= 3) {
               return false;
            }

            int var12 = this.cij;

            for(int var5 = 0; var12 >= 0 && var5 < 3; ++var5) {
               int var6 = var12 + var2.nextInt(2);
               int var7 = var12 + var2.nextInt(2);
               int var8 = var12 + var2.nextInt(2);
               float var9 = (float)(var6 + var7 + var8) * 0.333F + 0.5F;

               for(NW var11 : NW.w(var3.C(-var6, -var7, -var8), var3.C(var6, var7, var8))) {
                  if (var11.y(var3) <= (double)(var9 * var9)) {
                     var1.q(var11, this.cik.cx(), 4);
                  }
               }

               var3 = var3.C(-(var12 + 1) + var2.nextInt(2 + var12 * 2), 0 - var2.nextInt(2), -(var12 + 1) + var2.nextInt(2 + var12 * 2));
            }

            return true;
         }

         var3 = var3.Vj();
      }
   }

   public SK(cv var1, int var2) {
      super(false);
      this.cik = var1;
      this.cij = var2;
   }
}
