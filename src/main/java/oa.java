import java.util.Random;

public class OA {
   private static final OA bPN = new OA();
   private Random oF = new Random();
   private String[] bPO = o.q[192 & -23228].split(q.q[16715 & -25766]);

   public String WB() {
      int var1 = this.oF.nextInt(2) + 3;
      String var2 = q.q[-32244 & 19745];

      for(int var3 = 0; var3 < var1; ++var3) {
         if (var3 > 0) {
            var2 = var2 + q.q[9675 & 366];
         }

         var2 = var2 + this.bPO[this.oF.nextInt(this.bPO.length)];
      }

      return var2;
   }

   public void j(long var1) {
      this.oF.setSeed(var1);
   }

   public static OA WC() {
      return bPN;
   }
}
