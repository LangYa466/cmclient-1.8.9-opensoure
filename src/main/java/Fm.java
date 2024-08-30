import java.util.Random;

public class fM extends cv {
   private final boolean uD;

   public void e(QI var1, NW var2, hI var3, Random var4) {
      if (this == Ea.bgZ) {
         var1.r(var2, Ea.biT.cx());
      }

   }

   public void q(QI var1, NW var2, DD var3) {
      this.Q(var1, var2);
      super.q(var1, var2, var3);
   }

   public int q(int var1, Random var2) {
      return this.q(var2) + var2.nextInt(var1 + 1);
   }

   protected GX y(hI var1) {
      return new GX(Ea.biT);
   }

   public void q(QI var1, NW var2, hI var3, float var4, int var5) {
      super.q(var1, var2, var3, var4, var5);
      if (this.q(var3, var1.bXs, var5) != Fm.C(this)) {
         int var6 = 1 + var1.bXs.nextInt(5);
         this.q(var1, var2, var6);
      }

   }

   private void Q(QI var1, NW var2) {
      this.R(var1, var2);
      if (this == Ea.biT) {
         var1.r(var2, Ea.bgZ.cx());
      }

   }

   public boolean q(QI var1, NW var2, hI var3, DD var4, OK var5, float var6, float var7, float var8) {
      this.Q(var1, var2);
      return super.q(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private void R(QI var1, NW var2) {
      Random var3 = var1.bXs;
      double var4 = 0.0625D;

      for(int var6 = 0; var6 < 6; ++var6) {
         double var7 = (double)((float)var2.aY() + var3.nextFloat());
         double var9 = (double)((float)var2.aX() + var3.nextFloat());
         double var11 = (double)((float)var2.KO() + var3.nextFloat());
         if (var6 == 0 && !var1.g(var2.Vi()).ds().cr()) {
            var9 = (double)var2.aX() + var4 + 1.0D;
         }

         if (var6 == 1 && !var1.g(var2.Vj()).ds().cr()) {
            var9 = (double)var2.aX() - var4;
         }

         if (var6 == 2 && !var1.g(var2.Vk()).ds().cr()) {
            var11 = (double)var2.KO() + var4 + 1.0D;
         }

         if (var6 == 3 && !var1.g(var2.Vg()).ds().cr()) {
            var11 = (double)var2.KO() - var4;
         }

         if (var6 == 4 && !var1.g(var2.Ve()).ds().cr()) {
            var7 = (double)var2.aY() + var4 + 1.0D;
         }

         if (var6 == 5 && !var1.g(var2.Vh()).ds().cr()) {
            var7 = (double)var2.aY() - var4;
         }

         if (var7 < (double)var2.aY() || var7 > (double)(var2.aY() + 1) || var9 < 0.0D || var9 > (double)(var2.aX() + 1) || var11 < (double)var2.KO() || var11 > (double)(var2.KO() + 1)) {
            var1.q(OP.bRO, var7, var9, var11, 0.0D, 0.0D, 0.0D);
         }
      }

   }

   public int q(Random var1) {
      return 4 + var1.nextInt(2);
   }

   public Fm q(hI var1, Random var2, int var3) {
      return Et.blP;
   }

   public void q(QI var1, NW var2, hI var3, Random var4) {
      if (this.uD) {
         this.R(var1, var2);
      }

   }

   public fM(boolean var1) {
      super(hn.zU);
      if (var1) {
         this.d(true);
      }

      this.uD = var1;
   }

   public void q(QI var1, NW var2, zk var3) {
      this.Q(var1, var2);
      super.q(var1, var2, var3);
   }

   public int q(QI var1) {
      return 30;
   }
}
