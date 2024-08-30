public abstract class NL extends No implements Qy, Qz {
   private QC bNw = QC.bWM;

   public void q(HL var1) {
      super.q(var1);
      if (this.bNw != null) {
         this.bNw.L(var1);
      }

   }

   public void w(HL var1) {
      super.w(var1);
      this.bNw = QC.M(var1);
   }

   public OX dh() {
      return (OX)(this.dg() ? new Oo(this.bY()) : new Op(this.bY(), new Object[0]));
   }

   public void q(QC var1) {
      this.bNw = var1;
   }

   public QC mM() {
      return this.bNw;
   }

   public boolean mN() {
      return this.bNw != null && !this.bNw.isEmpty();
   }
}
