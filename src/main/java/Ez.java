public class EZ implements EV {
   private final GX[] bpE;
   private final Ev bpF;
   private final int bpG;
   private final int bpH;

   public boolean g(DD var1) {
      return true;
   }

   public OX dh() {
      return (OX)(this.dg() ? new Oo(this.bY()) : new Op(this.bY(), new Object[0]));
   }

   public void clear() {
      for(int var1 = 0; var1 < this.bpE.length; ++var1) {
         this.bpE[var1] = null;
      }

   }

   public EZ(Ev var1, int var2, int var3) {
      int var4 = var2 * var3;
      this.bpE = new GX[var4];
      this.bpF = var1;
      this.bpG = var2;
      this.bpH = var3;
   }

   public int bE(int var1) {
      return 0;
   }

   public int ab() {
      return this.bpG;
   }

   public int mL() {
      return 0;
   }

   public void f(DD var1) {
   }

   public void K(int var1, int var2) {
   }

   public boolean t(int var1, GX var2) {
      return true;
   }

   public GX er(int var1) {
      return var1 >= this.CB() ? null : this.bpE[var1];
   }

   public int CC() {
      return 64;
   }

   public GX es(int var1) {
      if (this.bpE[var1] != null) {
         GX var2 = this.bpE[var1];
         this.bpE[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public int ac() {
      return this.bpH;
   }

   public void vv() {
   }

   public void y(int var1, GX var2) {
      this.bpE[var1] = var2;
      this.bpF.w(this);
   }

   public String bY() {
      return e.q[422 & 414];
   }

   public GX ar(int var1, int var2) {
      if (this.bpE[var1] != null) {
         if (this.bpE[var1].bsH <= var2) {
            GX var4 = this.bpE[var1];
            this.bpE[var1] = null;
            this.bpF.w(this);
            return var4;
         } else {
            GX var3 = this.bpE[var1].fp(var2);
            if (this.bpE[var1].bsH == 0) {
               this.bpE[var1] = null;
            }

            this.bpF.w(this);
            return var3;
         }
      } else {
         return null;
      }
   }

   public GX au(int var1, int var2) {
      return var1 >= 0 && var1 < this.bpG && var2 >= 0 && var2 <= this.bpH ? this.er(var1 + var2 * this.bpG) : null;
   }

   public boolean dg() {
      return false;
   }

   public int CB() {
      return this.bpE.length;
   }

   public void h(DD var1) {
   }
}
