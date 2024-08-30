public class EY implements EV {
   private GX[] bpD = new GX[1];

   public int CB() {
      return 1;
   }

   public boolean dg() {
      return false;
   }

   public boolean t(int var1, GX var2) {
      return true;
   }

   public void f(DD var1) {
   }

   public int mL() {
      return 0;
   }

   public void y(int var1, GX var2) {
      this.bpD[0] = var2;
   }

   public GX es(int var1) {
      if (this.bpD[0] != null) {
         GX var2 = this.bpD[0];
         this.bpD[0] = null;
         return var2;
      } else {
         return null;
      }
   }

   public OX dh() {
      return (OX)(this.dg() ? new Oo(this.bY()) : new Op(this.bY(), new Object[0]));
   }

   public GX er(int var1) {
      return this.bpD[0];
   }

   public void h(DD var1) {
   }

   public GX ar(int var1, int var2) {
      if (this.bpD[0] != null) {
         GX var3 = this.bpD[0];
         this.bpD[0] = null;
         return var3;
      } else {
         return null;
      }
   }

   public void K(int var1, int var2) {
   }

   public void vv() {
   }

   public boolean g(DD var1) {
      return true;
   }

   public void clear() {
      for(int var1 = 0; var1 < this.bpD.length; ++var1) {
         this.bpD[var1] = null;
      }

   }

   public int CC() {
      return 64;
   }

   public int bE(int var1) {
      return 0;
   }

   public String bY() {
      return o.q[5036 & -28787];
   }
}
