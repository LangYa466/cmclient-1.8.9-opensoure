import java.util.IdentityHashMap;
import java.util.Map;

public class XM {
   private final Map[] cuV = new Map[8];
   public int amr = 1;
   public boolean cuW = false;

   private int[] q(int[] var1, int var2, boolean var3) {
      int[] var4 = (int[])var1.clone();
      int var5 = 4 - var2;
      if (var3) {
         var5 += 3;
      }

      var5 = var5 % 4;
      int var6 = var4.length / 4;

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var7 * var6;
         int var9 = var5 * var6;
         var4[var9 + 4] = var1[var8 + 4];
         var4[var9 + 4 + 1] = var1[var8 + 4 + 1];
         if (var3) {
            --var5;
            if (var5 < 0) {
               var5 = 3;
            }
         } else {
            ++var5;
            if (var5 > 3) {
               var5 = 0;
            }
         }
      }

      return var4;
   }

   public boolean afK() {
      return this.amr == 2 || this.amr == 4 || this.cuW;
   }

   public XM(String var1) {
      if (var1.equals(i.q[-30471 & 5833])) {
         this.amr = 4;
      } else if (var1.equals(w.q[4543 & -14937])) {
         this.amr = 2;
      } else if (var1.equals(q.q[4207 & -24321])) {
         this.cuW = true;
      } else if (var1.equals(i.q[18635 & -32550])) {
         this.amr = 4;
         this.cuW = true;
      } else if (var1.equals(i.q[20699 & -30261])) {
         this.amr = 2;
         this.cuW = true;
      } else {
         MV.cJ(i.q[-30244 & 5325] + var1);
      }

   }

   private boolean w(qw var1) {
      tO var2 = var1.qg();
      float var3 = var2.sp();
      float var4 = var2.sj();
      float var5 = var4 - var3;
      float var6 = var5 / 256.0F;
      float var7 = var2.sd();
      float var8 = var2.sa();
      float var9 = var8 - var7;
      float var10 = var9 / 256.0F;
      int[] var11 = var1.pV();
      int var12 = var11.length / 4;

      for(int var13 = 0; var13 < 4; ++var13) {
         int var14 = var13 * var12;
         float var15 = Float.intBitsToFloat(var11[var14 + 4]);
         float var16 = Float.intBitsToFloat(var11[var14 + 4 + 1]);
         if (!this.A(var15, var3, var6) && !this.A(var15, var4, var6)) {
            return false;
         }

         if (!this.A(var16, var7, var10) && !this.A(var16, var8, var10)) {
            return false;
         }
      }

      return true;
   }

   public synchronized qw q(qw var1, int var2, boolean var3) {
      int var4 = var2;
      if (var3) {
         var4 = var2 | 4;
      }

      if (var4 > 0 && var4 < this.cuV.length) {
         Object var5 = this.cuV[var4];
         if (var5 == null) {
            var5 = new IdentityHashMap(1);
            this.cuV[var4] = (Map)var5;
         }

         qw var6 = (qw)((Map)var5).get(var1);
         if (var6 == null) {
            var6 = this.w(var1, var2, var3);
            ((Map)var5).put(var1, var6);
         }

         return var6;
      } else {
         return var1;
      }
   }

   private boolean A(float var1, float var2, float var3) {
      float var4 = Pq.bj(var1 - var2);
      return var4 < var3;
   }

   private qw w(qw var1, int var2, boolean var3) {
      int[] var4 = var1.pV();
      int var5 = var1.qe();
      OK var6 = var1.qb();
      tO var7 = var1.qg();
      if (!this.w(var1)) {
         var2 = 0;
      }

      var4 = this.q(var4, var2, var3);
      qw var8 = new qw(var4, var5, var6, var7);
      return var8;
   }
}
