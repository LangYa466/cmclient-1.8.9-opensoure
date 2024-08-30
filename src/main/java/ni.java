public class NI extends No {
   private Fm bNn;
   private int bNo;

   public void w(HL var1) {
      super.w(var1);
      if (var1.d(w.q[2951 & 4743], 8)) {
         this.bNn = Fm.bA(var1.bG(w.q[1671 & 671]));
      } else {
         this.bNn = Fm.fe(var1.bQ(w.q[647 & 943]));
      }

      this.bNo = var1.bQ(r.q[9013 & -32075]);
   }

   public Fm UE() {
      return this.bNn;
   }

   public NI() {
   }

   public int UF() {
      return this.bNo;
   }

   public IF TU() {
      HL var1 = new HL();
      this.q(var1);
      var1.bU(w.q[10887 & 21175]);
      var1.a(w.q[2727 & 8839], Fm.s(this.bNn));
      return new KN(this.uc, 5, var1);
   }

   public void y(Fm var1, int var2) {
      this.bNn = var1;
      this.bNo = var2;
   }

   public NI(Fm var1, int var2) {
      this.bNn = var1;
      this.bNo = var2;
   }

   public void q(HL var1) {
      super.q(var1);
      PJ var2 = (PJ)Fm.bqX.z(this.bNn);
      var1.a(w.q[-11593 & 3719], var2 == null ? q.q[4674 & -22520] : var2.toString());
      var1.a(r.q[637 & 8757], this.bNo);
   }
}
