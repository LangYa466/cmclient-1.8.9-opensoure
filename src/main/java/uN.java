import java.util.List;
import java.util.Random;

public class UN extends UQ {
   private int clf;

   public static UN p(List var0, Random var1, int var2, int var3, int var4, OK var5, int var6) {
      Ur var7 = Ur.q(var2, var3, var4, -1, -3, 0, 5, 10, 8, var5);
      return r(var7) && Ut.q(var0, var7) == null ? new UN(var6, var1, var7, var5) : null;
   }

   public UN(int var1, Random var2, Ur var3, OK var4) {
      super(var1);
      this.ckO = var4;
      this.ckN = var3;
      this.clf = var2.nextInt();
   }

   protected void P(HL var1) {
      super.P(var1);
      this.clf = var1.bQ(o.q[8551 & 3300]);
   }

   protected void O(HL var1) {
      super.O(var1);
      var1.a(o.q[8933 & 372], this.clf);
   }

   public boolean q(QI var1, Random var2, Ur var3) {
      Random var4 = new Random((long)this.clf);

      for(int var5 = 0; var5 <= 4; ++var5) {
         for(int var6 = 3; var6 <= 4; ++var6) {
            int var7 = var4.nextInt(8);
            this.q(var1, var3, var5, var6, 0, var5, var6, var7, Ea.bkl.cx(), Ea.bkl.cx(), false);
         }
      }

      int var8 = var4.nextInt(8);
      this.q(var1, var3, 0, 5, 0, 0, 5, var8, Ea.bkl.cx(), Ea.bkl.cx(), false);
      var8 = var4.nextInt(8);
      this.q(var1, var3, 4, 5, 0, 4, 5, var8, Ea.bkl.cx(), Ea.bkl.cx(), false);

      for(int var10 = 0; var10 <= 4; ++var10) {
         int var12 = var4.nextInt(5);
         this.q(var1, var3, var10, 2, 0, var10, 2, var12, Ea.bkl.cx(), Ea.bkl.cx(), false);
      }

      for(int var11 = 0; var11 <= 4; ++var11) {
         for(int var13 = 0; var13 <= 1; ++var13) {
            int var14 = var4.nextInt(3);
            this.q(var1, var3, var11, var13, 0, var11, var13, var14, Ea.bkl.cx(), Ea.bkl.cx(), false);
         }
      }

      return true;
   }

   public UN() {
   }
}
