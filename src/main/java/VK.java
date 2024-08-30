import com.google.common.collect.ComparisonChain;

class vK extends Qc implements Comparable {
   protected final vz aCf;

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.q((vK)var1);
   }

   public int q(vK var1) {
      return ComparisonChain.start().compare(var1.bVg, this.bVg).compare(this.ux(), var1.ux()).result();
   }

   public String toString() {
      return o.q[-30748 & 1005] + this.bVg + o.q[3053 & 1013] + this.aCf + '}';
   }

   public vK(vz var1, int var2) {
      super(var2);
      this.aCf = var1;
   }

   protected int ux() {
      int var1 = this.aCf.ud().size();

      for(OK var5 : OK.values()) {
         var1 += this.aCf.g(var5).size();
      }

      return var1;
   }
}
