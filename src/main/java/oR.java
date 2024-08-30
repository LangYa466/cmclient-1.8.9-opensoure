public class Or {
   private DW bOH;
   private Boolean bOI;
   private OJ bOJ;
   private Boolean bOK;
   private String bOL;
   private static final Or bOM = new Os();
   private Or bON;
   private DY bOO;
   private Boolean bOP;
   private Boolean bOQ;
   private Boolean bOR;

   // $FF: synthetic method
   static OJ w(Or var0) {
      return var0.bOJ;
   }

   // $FF: synthetic method
   static Boolean q(Or var0, Boolean var1) {
      return var0.bOP = var1;
   }

   // $FF: synthetic method
   static Boolean e(Or var0) {
      return var0.bOP;
   }

   // $FF: synthetic method
   static Boolean r(Or var0) {
      return var0.bOI;
   }

   // $FF: synthetic method
   static DY t(Or var0) {
      return var0.bOO;
   }

   // $FF: synthetic method
   static Boolean w(Or var0, Boolean var1) {
      return var0.bOQ = var1;
   }

   public Or e(Boolean var1) {
      this.bOP = var1;
      return this;
   }

   public boolean VE() {
      return this.bOP == null ? this.VK().VE() : this.bOP.booleanValue();
   }

   public boolean VF() {
      return this.bOQ == null ? this.VK().VF() : this.bOQ.booleanValue();
   }

   // $FF: synthetic method
   static Boolean y(Or var0) {
      return var0.bOQ;
   }

   public DY VG() {
      return this.bOO == null ? this.VK().VG() : this.bOO;
   }

   // $FF: synthetic method
   static String q(Or var0, String var1) {
      return var0.bOL = var1;
   }

   public Or w(OJ var1) {
      this.bOJ = var1;
      return this;
   }

   public Or q(DW var1) {
      this.bOH = var1;
      return this;
   }

   public Or VH() {
      Or var1 = new Or();
      var1.u(Boolean.valueOf(this.VF()));
      var1.t(Boolean.valueOf(this.VO()));
      var1.e(Boolean.valueOf(this.VE()));
      var1.y(Boolean.valueOf(this.VJ()));
      var1.r(Boolean.valueOf(this.VP()));
      var1.w(this.VQ());
      var1.q(this.VI());
      var1.q(this.VG());
      var1.dc(this.VM());
      return var1;
   }

   // $FF: synthetic method
   static DW u(Or var0) {
      return var0.bOH;
   }

   // $FF: synthetic method
   static String i(Or var0) {
      return var0.bOL;
   }

   // $FF: synthetic method
   static Boolean e(Or var0, Boolean var1) {
      return var0.bOI = var1;
   }

   public Or dc(String var1) {
      this.bOL = var1;
      return this;
   }

   public DW VI() {
      return this.bOH == null ? this.VK().VI() : this.bOH;
   }

   public boolean VJ() {
      return this.bOK == null ? this.VK().VJ() : this.bOK.booleanValue();
   }

   public Or r(Boolean var1) {
      this.bOI = var1;
      return this;
   }

   // $FF: synthetic method
   static Boolean r(Or var0, Boolean var1) {
      return var0.bOR = var1;
   }

   public int hashCode() {
      int var1 = this.bOJ.hashCode();
      var1 = 31 * var1 + this.bOQ.hashCode();
      var1 = 31 * var1 + this.bOR.hashCode();
      var1 = 31 * var1 + this.bOK.hashCode();
      var1 = 31 * var1 + this.bOP.hashCode();
      var1 = 31 * var1 + this.bOI.hashCode();
      var1 = 31 * var1 + this.bOH.hashCode();
      var1 = 31 * var1 + this.bOO.hashCode();
      var1 = 31 * var1 + this.bOL.hashCode();
      return var1;
   }

   private Or VK() {
      return this.bON == null ? bOM : this.bON;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof Or)) {
         return false;
      } else {
         Or var3 = (Or)var1;
         if (this.VF() == var3.VF() && this.VQ() == var3.VQ() && this.VO() == var3.VO() && this.VP() == var3.VP() && this.VE() == var3.VE() && this.VJ() == var3.VJ()) {
            label71: {
               if (this.VI() != null) {
                  if (!this.VI().equals(var3.VI())) {
                     break label71;
                  }
               } else if (var3.VI() != null) {
                  break label71;
               }

               if (this.VG() != null) {
                  if (!this.VG().equals(var3.VG())) {
                     break label71;
                  }
               } else if (var3.VG() != null) {
                  break label71;
               }

               if (this.VM() != null) {
                  if (!this.VM().equals(var3.VM())) {
                     break label71;
                  }
               } else if (var3.VM() != null) {
                  break label71;
               }

               boolean var2 = true;
               return var2;
            }
         }

         boolean var4 = false;
         return var4;
      }
   }

   // $FF: synthetic method
   static DW q(Or var0, DW var1) {
      return var0.bOH = var1;
   }

   public String VL() {
      if (this.isEmpty()) {
         return this.bON != null ? this.bON.VL() : q.q[12416 & 320];
      } else {
         StringBuilder var1 = new StringBuilder();
         if (this.VQ() != null) {
            var1.append(this.VQ());
         }

         if (this.VF()) {
            var1.append(OJ.bQo);
         }

         if (this.VO()) {
            var1.append(OJ.bQr);
         }

         if (this.VJ()) {
            var1.append(OJ.bQq);
         }

         if (this.VP()) {
            var1.append(OJ.bQn);
         }

         if (this.VE()) {
            var1.append(OJ.bQp);
         }

         return var1.toString();
      }
   }

   // $FF: synthetic method
   static Boolean o(Or var0) {
      return var0.bOK;
   }

   public Or t(Boolean var1) {
      this.bOR = var1;
      return this;
   }

   // $FF: synthetic method
   static Boolean t(Or var0, Boolean var1) {
      return var0.bOK = var1;
   }

   public String VM() {
      return this.bOL == null ? this.VK().VM() : this.bOL;
   }

   public String toString() {
      return a.q[5694 & -8134] + (this.bON != null) + a.q[315 & -26885] + this.bOJ + a.q[-29250 & 12348] + this.bOQ + a.q[16447 & -31811] + this.bOR + a.q[5247 & 18622] + this.bOK + a.q[16447 & 1599] + this.bOI + a.q[20544 & 72] + this.VI() + a.q[9313 & -28345] + this.VG() + a.q[4951 & 194] + this.VM() + '}';
   }

   // $FF: synthetic method
   static DY q(Or var0, DY var1) {
      return var0.bOO = var1;
   }

   public boolean isEmpty() {
      return this.bOQ == null && this.bOR == null && this.bOP == null && this.bOK == null && this.bOI == null && this.bOJ == null && this.bOH == null && this.bOO == null;
   }

   public Or VN() {
      Or var1 = new Or();
      var1.bOQ = this.bOQ;
      var1.bOR = this.bOR;
      var1.bOP = this.bOP;
      var1.bOK = this.bOK;
      var1.bOI = this.bOI;
      var1.bOJ = this.bOJ;
      var1.bOH = this.bOH;
      var1.bOO = this.bOO;
      var1.bON = this.bON;
      var1.bOL = this.bOL;
      return var1;
   }

   public boolean VO() {
      return this.bOR == null ? this.VK().VO() : this.bOR.booleanValue();
   }

   // $FF: synthetic method
   static OJ q(Or var0, OJ var1) {
      return var0.bOJ = var1;
   }

   public Or q(DY var1) {
      this.bOO = var1;
      return this;
   }

   public Or p(Or var1) {
      this.bON = var1;
      return this;
   }

   // $FF: synthetic method
   static Boolean a(Or var0) {
      return var0.bOR;
   }

   public boolean VP() {
      return this.bOI == null ? this.VK().VP() : this.bOI.booleanValue();
   }

   public OJ VQ() {
      return this.bOJ == null ? this.VK().VQ() : this.bOJ;
   }

   public Or y(Boolean var1) {
      this.bOK = var1;
      return this;
   }

   public Or u(Boolean var1) {
      this.bOQ = var1;
      return this;
   }
}
