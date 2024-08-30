public enum aap implements net.optifine.expr.f {
   cRB(y.q[5095 & 18094]),
   cRC(y.q[-23880 & 5034]),
   cRD(y.q[-9554 & 746]),
   cRE(y.q[5036 & 1772]),
   cRF(y.q[25278 & 2734]),
   cRG(y.q[23480 & -22794]),
   cRH(y.q[-15630 & 6842]),
   cRI(y.q[701 & 692]),
   cRJ(y.q[-30025 & 694]),
   cRK(y.q[8890 & 700]),
   cRL(y.q[5051 & 698]),
   cRM(y.q[20220 & 13246]),
   cRN(y.q[6910 & 1726]),
   cRO(y.q[8931 & -25920]);

   private String av;
   private sx CG;
   private static final aap[] cRP = values();

   private aap(String var3) {
      this.av = var3;
      this.CG = hS.eV().eX();
   }

   public String bY() {
      return this.av;
   }

   public net.optifine.expr.y agh() {
      return net.optifine.expr.y.cwV;
   }

   public boolean agj() {
      // $FF: Couldn't be decompiled
   }

   public static aap gC(String var0) {
      if (var0 == null) {
         return null;
      } else {
         for(int var1 = 0; var1 < cRP.length; ++var1) {
            aap var2 = cRP[var1];
            if (var2.bY().equals(var0)) {
               return var2;
            }
         }

         return null;
      }
   }
}
