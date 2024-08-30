import java.util.WeakHashMap;

public class agX {
   private final M dwh;
   public int bcn;
   private final WeakHashMap dwi;
   private final hS dwj;

   public void i(rA var1) {
      if (this.dwh.ch.af() && this.dwi.containsKey(var1)) {
         agY var2 = (agY)this.dwi.get(var1);
         long var3 = var2.uI;
         if (var3 == (-1L & -1L)) {
            var3 = System.currentTimeMillis();
            var2.uI = var3;
         }

         long var5 = System.currentTimeMillis() - var3;
         int var7 = this.dwj.Bn.dmG.bcn;
         if (var5 < (long)var7) {
            int var8 = var1.dt().aX();
            pz.y(0.0F, (float)(-var8) + this.P((float)var5, (float)var8, (float)var7), 0.0F);
         } else {
            this.dwi.remove(var1);
         }

      }
   }

   private float P(float var1, float var2, float var3) {
      float var4;
      return -var2 * (var4 = var1 / var3) * (var4 - 2.0F);
   }

   public void q(rA var1, NW var2) {
      if (this.dwj.CM != null) {
         NW var3 = this.dwj.CM.dt();
         var3 = var3.C(6151 & 17352, -var3.aX(), 20560 & 1408);
         NW var4 = var2.C(-22391 & 4108, -var2.aX(), 4622 & 9576);
         int var5 = var3.y(var4) > 7419.169811320754D * 0.5520833333333334D ? 29059 & 3089 : -8172 & 385;
         if (var5 != 0) {
            agY var6 = new agY(-1L & -1L, (OK)null);
            this.dwi.put(var1, var6);
         } else {
            this.dwi.remove(var1);
         }
      }

   }

   public agX(hS var1) {
      this.dwj = var1;
      this.dwi = new WeakHashMap();
      this.bcn = -10288 & 10226;
      this.dwh = (M)var1.Bn.h(M.class);
   }
}
