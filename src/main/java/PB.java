enum pb {
   private static final pb[] adF = new pb[6];
   adG(1, 2, 3, 0),
   adH(0, 1, 2, 3);

   private final int adI;
   adJ(3, 0, 1, 2);

   private final int adK;
   private final int adL;
   adM(3, 0, 1, 2);

   private final int adO;
   adP(0, 1, 2, 3),
   adQ(2, 3, 0, 1);

   static {
      adF[OK.bQB.tb()] = adH;
      adF[OK.bQC.tb()] = adQ;
      adF[OK.bQD.tb()] = adM;
      adF[OK.bQE.tb()] = adP;
      adF[OK.bQF.tb()] = adJ;
      adF[OK.bQG.tb()] = adG;
   }

   public static pb y(OK var0) {
      return adF[var0.tb()];
   }

   private pb(int var3, int var4, int var5, int var6) {
      this.adO = var3;
      this.adI = var4;
      this.adK = var5;
      this.adL = var6;
   }

   // $FF: synthetic method
   static int q(pb var0) {
      return var0.adK;
   }

   // $FF: synthetic method
   static int w(pb var0) {
      return var0.adI;
   }

   // $FF: synthetic method
   static int e(pb var0) {
      return var0.adO;
   }

   // $FF: synthetic method
   static int r(pb var0) {
      return var0.adL;
   }
}
