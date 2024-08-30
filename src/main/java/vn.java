import java.util.List;
import java.util.Random;

public class VN extends VQ {
   public void q(Ut var1, List var2, Random var3) {
      this.w((VM)var1, var2, var3, 1, 1);
   }

   public boolean q(QI var1, Random var2, Ur var3) {
      if (this.q(var1, var3)) {
         return false;
      } else {
         this.q(var1, var3, 0, 0, 0, 4, 10, 7, true, var2, Vx.adl());
         this.q(var1, var2, var3, this.cmy, 1, 7, 0);
         this.q(var1, var2, var3, VR.cmz, 1, 1, 7);
         int var4 = this.r(Ea.bht, 2);

         for(int var5 = 0; var5 < 6; ++var5) {
            this.w(var1, Ea.bht.J(var4), 1, 6 - var5, 1 + var5, var3);
            this.w(var1, Ea.bht.J(var4), 2, 6 - var5, 1 + var5, var3);
            this.w(var1, Ea.bht.J(var4), 3, 6 - var5, 1 + var5, var3);
            if (var5 < 5) {
               this.w(var1, Ea.bkz.cx(), 1, 5 - var5, 1 + var5, var3);
               this.w(var1, Ea.bkz.cx(), 2, 5 - var5, 1 + var5, var3);
               this.w(var1, Ea.bkz.cx(), 3, 5 - var5, 1 + var5, var3);
            }
         }

         return true;
      }
   }

   public VN() {
   }

   public VN(int var1, Random var2, Ur var3, OK var4) {
      super(var1);
      this.ckO = var4;
      this.cmy = this.g(var2);
      this.ckN = var3;
   }

   public static VN c(List var0, Random var1, int var2, int var3, int var4, OK var5, int var6) {
      Ur var7 = Ur.q(var2, var3, var4, -1, -7, 0, 5, 11, 8, var5);
      return t(var7) && Ut.q(var0, var7) == null ? new VN(var6, var1, var7, var5) : null;
   }
}
