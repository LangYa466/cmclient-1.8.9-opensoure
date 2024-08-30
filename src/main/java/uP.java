import java.util.List;
import java.util.Random;

public class UP extends UQ {
   public UP() {
   }

   public UP(int var1, Random var2, Ur var3, OK var4) {
      super(var1);
      this.ckO = var4;
      this.ckN = var3;
   }

   public void q(Ut var1, List var2, Random var3) {
      this.w((UT)var1, var2, var3, 5, 3, true);
      this.w((UT)var1, var2, var3, 5, 11, true);
   }

   public boolean q(QI var1, Random var2, Ur var3) {
      this.q(var1, var3, 0, 3, 0, 12, 4, 12, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 5, 0, 12, 13, 12, Ea.bjN.cx(), Ea.bjN.cx(), false);
      this.q(var1, var3, 0, 5, 0, 1, 12, 12, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 11, 5, 0, 12, 12, 12, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 2, 5, 11, 4, 12, 12, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 8, 5, 11, 10, 12, 12, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 5, 9, 11, 7, 12, 12, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 2, 5, 0, 4, 12, 1, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 8, 5, 0, 10, 12, 1, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 5, 9, 0, 7, 12, 1, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 2, 11, 2, 10, 12, 10, Ea.bkl.cx(), Ea.bkl.cx(), false);

      for(int var4 = 1; var4 <= 11; var4 += 2) {
         this.q(var1, var3, var4, 10, 0, var4, 11, 0, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
         this.q(var1, var3, var4, 10, 12, var4, 11, 12, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
         this.q(var1, var3, 0, 10, var4, 0, 11, var4, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
         this.q(var1, var3, 12, 10, var4, 12, 11, var4, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
         this.w(var1, Ea.bkl.cx(), var4, 13, 0, var3);
         this.w(var1, Ea.bkl.cx(), var4, 13, 12, var3);
         this.w(var1, Ea.bkl.cx(), 0, 13, var4, var3);
         this.w(var1, Ea.bkl.cx(), 12, 13, var4, var3);
         this.w(var1, Ea.bhZ.cx(), var4 + 1, 13, 0, var3);
         this.w(var1, Ea.bhZ.cx(), var4 + 1, 13, 12, var3);
         this.w(var1, Ea.bhZ.cx(), 0, 13, var4 + 1, var3);
         this.w(var1, Ea.bhZ.cx(), 12, 13, var4 + 1, var3);
      }

      this.w(var1, Ea.bhZ.cx(), 0, 13, 0, var3);
      this.w(var1, Ea.bhZ.cx(), 0, 13, 12, var3);
      this.w(var1, Ea.bhZ.cx(), 0, 13, 0, var3);
      this.w(var1, Ea.bhZ.cx(), 12, 13, 0, var3);

      for(int var9 = 3; var9 <= 9; var9 += 2) {
         this.q(var1, var3, 1, 7, var9, 1, 8, var9, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
         this.q(var1, var3, 11, 7, var9, 11, 8, var9, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      }

      int var10 = this.r(Ea.bii, 3);

      for(int var5 = 0; var5 <= 6; ++var5) {
         int var6 = var5 + 4;

         for(int var7 = 5; var7 <= 7; ++var7) {
            this.w(var1, Ea.bii.J(var10), var7, 5 + var5, var6, var3);
         }

         if (var6 >= 5 && var6 <= 8) {
            this.q(var1, var3, 5, 5, var6, 7, var5 + 4, var6, Ea.bkl.cx(), Ea.bkl.cx(), false);
         } else if (var6 >= 9 && var6 <= 10) {
            this.q(var1, var3, 5, 8, var6, 7, var5 + 4, var6, Ea.bkl.cx(), Ea.bkl.cx(), false);
         }

         if (var5 >= 1) {
            this.q(var1, var3, 5, 6 + var5, var6, 7, 9 + var5, var6, Ea.bjN.cx(), Ea.bjN.cx(), false);
         }
      }

      for(int var11 = 5; var11 <= 7; ++var11) {
         this.w(var1, Ea.bii.J(var10), var11, 12, 11, var3);
      }

      this.q(var1, var3, 5, 6, 7, 5, 7, 7, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 7, 6, 7, 7, 7, 7, Ea.bhZ.cx(), Ea.bhZ.cx(), false);
      this.q(var1, var3, 5, 13, 12, 7, 13, 12, Ea.bjN.cx(), Ea.bjN.cx(), false);
      this.q(var1, var3, 2, 5, 2, 3, 5, 3, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 2, 5, 9, 3, 5, 10, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 2, 5, 4, 2, 5, 8, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 9, 5, 2, 10, 5, 3, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 9, 5, 9, 10, 5, 10, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 10, 5, 4, 10, 5, 8, Ea.bkl.cx(), Ea.bkl.cx(), false);
      int var12 = this.r(Ea.bii, 0);
      int var13 = this.r(Ea.bii, 1);
      this.w(var1, Ea.bii.J(var13), 4, 5, 2, var3);
      this.w(var1, Ea.bii.J(var13), 4, 5, 3, var3);
      this.w(var1, Ea.bii.J(var13), 4, 5, 9, var3);
      this.w(var1, Ea.bii.J(var13), 4, 5, 10, var3);
      this.w(var1, Ea.bii.J(var12), 8, 5, 2, var3);
      this.w(var1, Ea.bii.J(var12), 8, 5, 3, var3);
      this.w(var1, Ea.bii.J(var12), 8, 5, 9, var3);
      this.w(var1, Ea.bii.J(var12), 8, 5, 10, var3);
      this.q(var1, var3, 3, 4, 4, 4, 4, 8, Ea.bhX.cx(), Ea.bhX.cx(), false);
      this.q(var1, var3, 8, 4, 4, 9, 4, 8, Ea.bhX.cx(), Ea.bhX.cx(), false);
      this.q(var1, var3, 3, 5, 4, 4, 5, 8, Ea.bjo.cx(), Ea.bjo.cx(), false);
      this.q(var1, var3, 8, 5, 4, 9, 5, 8, Ea.bjo.cx(), Ea.bjo.cx(), false);
      this.q(var1, var3, 4, 2, 0, 8, 2, 12, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 2, 4, 12, 2, 8, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 4, 0, 0, 8, 1, 3, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 4, 0, 9, 8, 1, 12, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 0, 0, 4, 3, 1, 8, Ea.bkl.cx(), Ea.bkl.cx(), false);
      this.q(var1, var3, 9, 0, 4, 12, 1, 8, Ea.bkl.cx(), Ea.bkl.cx(), false);

      for(int var14 = 4; var14 <= 8; ++var14) {
         for(int var8 = 0; var8 <= 2; ++var8) {
            this.q(var1, Ea.bkl.cx(), var14, -1, var8, var3);
            this.q(var1, Ea.bkl.cx(), var14, -1, 12 - var8, var3);
         }
      }

      for(int var15 = 0; var15 <= 2; ++var15) {
         for(int var16 = 4; var16 <= 8; ++var16) {
            this.q(var1, Ea.bkl.cx(), var15, -1, var16, var3);
            this.q(var1, Ea.bkl.cx(), 12 - var15, -1, var16, var3);
         }
      }

      return true;
   }

   public static UP s(List var0, Random var1, int var2, int var3, int var4, OK var5, int var6) {
      Ur var7 = Ur.q(var2, var3, var4, -5, -3, 0, 13, 14, 13, var5);
      return r(var7) && Ut.q(var0, var7) == null ? new UP(var6, var1, var7, var5) : null;
   }
}
