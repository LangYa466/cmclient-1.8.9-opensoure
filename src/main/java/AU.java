import com.google.common.collect.Lists;
import java.util.List;

public class Au extends zW {
   private boolean aUq;
   private Qk aUn;
   private Lz aUr;
   private zr aSA;
   private List aUs = Lists.newArrayList();
   private double aTz;

   private Qk q(Qh var1) {
      Qk var2 = null;
      int var3 = Integer.MAX_VALUE;

      for(Qk var5 : var1.Yo()) {
         int var6 = var5.H(Pq.D(this.aSA.aNZ), Pq.D(this.aSA.aNK), Pq.D(this.aSA.aOt));
         if (var6 < var3 && !this.q(var5)) {
            var2 = var5;
            var3 = var6;
         }
      }

      return var2;
   }

   public Au(zr var1, double var2, boolean var4) {
      this.aSA = var1;
      this.aTz = var2;
      this.aUq = var4;
      this.dX(1);
      if (!(var1.yM() instanceof LD)) {
         throw new IllegalArgumentException(i.q[8889 & -32197]);
      }
   }

   public boolean Av() {
      this.AL();
      if (this.aUq && this.aSA.vR.ZH()) {
         return false;
      } else {
         Qh var1 = this.aSA.vR.Zw().r(new NW(this.aSA), 0);
         if (var1 == null) {
            return false;
         } else {
            this.aUn = this.q(var1);
            if (this.aUn == null) {
               return false;
            } else {
               LD var2 = (LD)this.aSA.yM();
               boolean var3 = var2.NS();
               var2.bu(false);
               this.aUr = var2.O(this.aUn.YL());
               var2.bu(var3);
               if (this.aUr != null) {
                  return true;
               } else {
                  PX var4 = Be.w(this.aSA, 10, 7, new PX((double)this.aUn.YL().aY(), (double)this.aUn.YL().aX(), (double)this.aUn.YL().KO()));
                  if (var4 == null) {
                     return false;
                  } else {
                     var2.bu(false);
                     this.aUr = this.aSA.yM().A(var4.bUV, var4.bUW, var4.bUX);
                     var2.bu(var3);
                     return this.aUr != null;
                  }
               }
            }
         }
      }
   }

   public boolean Ay() {
      if (this.aSA.yM().NE()) {
         return false;
      } else {
         float var1 = this.aSA.gK + 4.0F;
         return this.aSA.F(this.aUn.YL()) > (double)(var1 * var1);
      }
   }

   public void Aw() {
      if (this.aSA.yM().NE() || this.aSA.F(this.aUn.YL()) < 16.0D) {
         this.aUs.add(this.aUn);
      }

   }

   private void AL() {
      if (this.aUs.size() > 15) {
         this.aUs.remove(0);
      }

   }

   public void Az() {
      this.aSA.yM().q(this.aUr, this.aTz);
   }

   private boolean q(Qk var1) {
      for(Qk var3 : this.aUs) {
         if (var1.YL().equals(var3.YL())) {
            return true;
         }
      }

      return false;
   }
}
