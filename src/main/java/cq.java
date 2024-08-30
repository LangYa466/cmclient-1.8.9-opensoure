import com.google.common.base.Predicate;

class Cq implements Predicate {
   // $FF: synthetic field
   final zr bak;
   // $FF: synthetic field
   final Predicate bal;
   // $FF: synthetic field
   final Cp bam;

   Cq(Cp var1, Predicate var2, zr var3) {
      this.bam = var1;
      this.bal = var2;
      this.bak = var3;
   }

   // $FF: synthetic method
   public boolean apply(Object var1) {
      return this.k((zz)var1);
   }

   public boolean k(zz var1) {
      if (this.bal != null && !this.bal.apply(var1)) {
         return false;
      } else if (var1 instanceof BV) {
         return false;
      } else {
         if (var1 instanceof DD) {
            double var2 = Cp.q(this.bam);
            if (var1.hI()) {
               var2 *= 0.800000011920929D;
            }

            if (var1.xZ()) {
               float var4 = ((DD)var1).FY();
               if (var4 < 0.1F) {
                  var4 = 0.1F;
               }

               var2 *= (double)(0.7F * var4);
            }

            if ((double)var1.c(this.bak) > var2) {
               return false;
            }
         }

         return Cp.q(this.bam, var1, false);
      }
   }
}
