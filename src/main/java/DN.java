import java.util.Random;

public class dn extends cT {
   protected dn() {
      super(hn.zI);
      float var1 = 0.4F;
      this.w(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.8F, 0.5F + var1);
   }

   protected boolean r(cv var1) {
      return var1 == Ea.bjg || var1 == Ea.bjy || var1 == Ea.bir || var1 == Ea.bjj;
   }

   public Fm q(hI var1, Random var2, int var3) {
      return null;
   }

   public boolean u(QI var1, NW var2) {
      return true;
   }

   public hm w(hI var1) {
      return hm.yA;
   }

   public void q(QI var1, DD var2, NW var3, hI var4, No var5) {
      if (!var1.bXF && var2.FD() != null && var2.FD().do1() == Et.bnF) {
         var2.w(Nj.bKr[cv.w(this)]);
         q(var1, var3, new GX(Ea.bjV, 1, 0));
      } else {
         super.q(var1, var2, var3, var4, var5);
      }

   }
}
