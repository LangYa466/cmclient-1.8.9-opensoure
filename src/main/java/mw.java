public class MW extends Nb {
   public final int bII;
   private MY bIJ;
   private final String bIK;
   public final MW bIL;
   public final int bIM;
   private boolean bIN;
   public final GX bIO;

   public MW q(MY var1) {
      this.bIJ = var1;
      return this;
   }

   public MW(String var1, String var2, int var3, int var4, cv var5, MW var6) {
      this(var1, var2, var3, var4, new GX(var5), var6);
   }

   // $FF: synthetic method
   public Nb To() {
      return this.Tu();
   }

   public MW(String var1, String var2, int var3, int var4, GX var5, MW var6) {
      super(var1, new Op(r.q[17137 & -32535] + var2, new Object[0]));
      this.bIO = var5;
      this.bIK = r.q[8417 & -9227] + var2 + w.q[9645 & -15985];
      this.bIM = var3;
      this.bII = var4;
      if (var3 < MX.bJz) {
         MX.bJz = var3;
      }

      if (var4 < MX.bJq) {
         MX.bJq = var4;
      }

      if (var3 > MX.bIU) {
         MX.bIU = var3;
      }

      if (var4 > MX.bIT) {
         MX.bIT = var4;
      }

      this.bIL = var6;
   }

   // $FF: synthetic method
   public Nb i(Class var1) {
      return this.o(var1);
   }

   public boolean Tp() {
      return this.bIN;
   }

   public MW Tq() {
      this.bJN = true;
      return this;
   }

   public String bp() {
      return this.bIJ != null ? this.bIJ.B(PO.dn(this.bIK)) : PO.dn(this.bIK);
   }

   public MW(String var1, String var2, int var3, int var4, Fm var5, MW var6) {
      this(var1, var2, var3, var4, new GX(var5), var6);
   }

   public boolean Tr() {
      return true;
   }

   public OX Ts() {
      OX var1 = super.Ts();
      var1.Vw().w(this.Tp() ? OJ.bQc : OJ.bQh);
      return var1;
   }

   // $FF: synthetic method
   public Nb Tt() {
      return this.Tq();
   }

   public MW Tu() {
      super.To();
      MX.bJn.add(this);
      return this;
   }

   public MW o(Class var1) {
      return (MW)super.i(var1);
   }

   public MW Tv() {
      this.bIN = true;
      return this;
   }
}
