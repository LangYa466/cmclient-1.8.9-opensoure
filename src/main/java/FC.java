public class Fc implements Qz {
   private Qz bpK;
   private String av;
   private Qz bpL;

   public Ev q(DJ var1, DD var2) {
      return new EB(var1, this, var2);
   }

   public void h(DD var1) {
      this.bpK.h(var1);
      this.bpL.h(var1);
   }

   public GX er(int var1) {
      return var1 >= this.bpK.CB() ? this.bpL.er(var1 - this.bpK.CB()) : this.bpK.er(var1);
   }

   public boolean mN() {
      return this.bpK.mN() || this.bpL.mN();
   }

   public QC mM() {
      return this.bpK.mM();
   }

   public boolean r(EV var1) {
      return this.bpK == var1 || this.bpL == var1;
   }

   public int mL() {
      return 0;
   }

   public String bY() {
      return this.bpK.dg() ? this.bpK.bY() : (this.bpL.dg() ? this.bpL.bY() : this.av);
   }

   public OX dh() {
      return (OX)(this.dg() ? new Oo(this.bY()) : new Op(this.bY(), new Object[0]));
   }

   public int bE(int var1) {
      return 0;
   }

   public void K(int var1, int var2) {
   }

   public void q(QC var1) {
      this.bpK.q(var1);
      this.bpL.q(var1);
   }

   public boolean t(int var1, GX var2) {
      return true;
   }

   public void f(DD var1) {
      this.bpK.f(var1);
      this.bpL.f(var1);
   }

   public int CC() {
      return this.bpK.CC();
   }

   public Fc(String var1, Qz var2, Qz var3) {
      this.av = var1;
      if (var2 == null) {
         var2 = var3;
      }

      if (var3 == null) {
         var3 = var2;
      }

      this.bpK = var2;
      this.bpL = var3;
      if (var2.mN()) {
         var3.q(var2.mM());
      } else if (var3.mN()) {
         var2.q(var3.mM());
      }

   }

   public String di() {
      return this.bpK.di();
   }

   public int CB() {
      return this.bpK.CB() + this.bpL.CB();
   }

   public boolean dg() {
      return this.bpK.dg() || this.bpL.dg();
   }

   public void y(int var1, GX var2) {
      if (var1 >= this.bpK.CB()) {
         this.bpL.y(var1 - this.bpK.CB(), var2);
      } else {
         this.bpK.y(var1, var2);
      }

   }

   public GX es(int var1) {
      return var1 >= this.bpK.CB() ? this.bpL.es(var1 - this.bpK.CB()) : this.bpK.es(var1);
   }

   public void vv() {
      this.bpK.vv();
      this.bpL.vv();
   }

   public boolean g(DD var1) {
      return this.bpK.g(var1) && this.bpL.g(var1);
   }

   public void clear() {
      this.bpK.clear();
      this.bpL.clear();
   }

   public GX ar(int var1, int var2) {
      return var1 >= this.bpK.CB() ? this.bpL.ar(var1 - this.bpK.CB(), var2) : this.bpK.ar(var1, var2);
   }
}
