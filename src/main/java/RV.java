import com.google.common.collect.Lists;
import java.util.BitSet;
import java.util.List;

public class rv {
   private final boolean[] apb = new boolean[rA.apm.length];
   private boolean apc = true;
   private rB apd = new rB();
   private qt ape;
   private BitSet[] apf = new BitSet[rA.apm.length];
   private final List apg = Lists.newArrayList();
   public static final rv aph = new rw();
   private final boolean[] api = new boolean[rA.apm.length];

   public BitSet t(OS var1) {
      return this.apf[var1.ordinal()];
   }

   public boolean isEmpty() {
      return this.apc;
   }

   public qt qV() {
      return this.ape;
   }

   public boolean y(OS var1) {
      return this.apb[var1.ordinal()];
   }

   public List qW() {
      return this.apg;
   }

   public boolean w(OK var1, OK var2) {
      return this.apd.w(var1, var2);
   }

   public void q(No var1) {
      this.apg.add(var1);
   }

   public void u(OS var1) {
      this.apb[var1.ordinal()] = true;
   }

   public void q(rB var1) {
      this.apd = var1;
   }

   protected void i(OS var1) {
      this.apc = false;
      this.api[var1.ordinal()] = true;
   }

   public void q(OS var1, BitSet var2) {
      this.apf[var1.ordinal()] = var2;
   }

   public boolean o(OS var1) {
      return !this.api[var1.ordinal()];
   }

   public void e(qt var1) {
      this.ape = var1;
   }
}
