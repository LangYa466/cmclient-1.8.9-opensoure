public enum WS {
   coY(OK.bQB),
   coZ(OK.bQC),
   cpa(OK.bQD),
   cpb(OK.bQE),
   cpc(OK.bQF),
   cpd(OK.bQG),
   cpe(OK.bQD, OK.bQF),
   cpf(OK.bQD, OK.bQG),
   cpg(OK.bQE, OK.bQF),
   cph(OK.bQE, OK.bQG),
   cpi(OK.bQB, OK.bQD),
   cpj(OK.bQB, OK.bQE),
   cpk(OK.bQC, OK.bQD),
   cpl(OK.bQC, OK.bQE),
   cpm(OK.bQB, OK.bQF),
   cpn(OK.bQB, OK.bQG),
   cpo(OK.bQC, OK.bQF),
   cpp(OK.bQC, OK.bQG);

   private final OK cpq;
   private OK cpr;

   private WS(OK var3) {
      this.cpq = var3;
   }

   private WS(OK var3, OK var4) {
      this.cpq = var3;
      this.cpr = var4;
   }

   NW bb(NW var1) {
      var1 = var1.r(this.cpq, 1);
      if (this.cpr != null) {
         var1 = var1.r(this.cpr, 1);
      }

      return var1;
   }

   public int aei() {
      int var1 = this.cpq.WP();
      if (this.cpr != null) {
         var1 += this.cpr.WP();
      }

      return var1;
   }

   public int aej() {
      int var1 = this.cpq.WQ();
      if (this.cpr != null) {
         var1 += this.cpr.WQ();
      }

      return var1;
   }

   public boolean dq() {
      return this.cpr != null;
   }
}
