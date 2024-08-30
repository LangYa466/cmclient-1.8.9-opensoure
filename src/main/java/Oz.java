public enum oZ {
   adc(new OK[]{OK.bQF, OK.bQG, OK.bQD, OK.bQE}, 0.5F, false, new pa[0], new pa[0], new pa[0], new pa[0]),
   add(new OK[]{OK.bQG, OK.bQF, OK.bQD, OK.bQE}, 1.0F, false, new pa[0], new pa[0], new pa[0], new pa[0]),
   ade(new OK[]{OK.bQC, OK.bQB, OK.bQG, OK.bQF}, 0.8F, true, new pa[]{pa.ads, pa.adB, pa.ads, pa.adv, pa.ady, pa.adv, pa.ady, pa.adB}, new pa[]{pa.ads, pa.adC, pa.ads, pa.adw, pa.ady, pa.adw, pa.ady, pa.adC}, new pa[]{pa.adr, pa.adC, pa.adr, pa.adw, pa.adx, pa.adw, pa.adx, pa.adC}, new pa[]{pa.adr, pa.adB, pa.adr, pa.adv, pa.adx, pa.adv, pa.adx, pa.adB}),
   adf(new OK[]{OK.bQF, OK.bQG, OK.bQB, OK.bQC}, 0.8F, true, new pa[]{pa.ads, pa.adB, pa.ady, pa.adB, pa.ady, pa.adv, pa.ads, pa.adv}, new pa[]{pa.adr, pa.adB, pa.adx, pa.adB, pa.adx, pa.adv, pa.adr, pa.adv}, new pa[]{pa.adr, pa.adC, pa.adx, pa.adC, pa.adx, pa.adw, pa.adr, pa.adw}, new pa[]{pa.ads, pa.adC, pa.ady, pa.adC, pa.ady, pa.adw, pa.ads, pa.adw}),
   adg(new OK[]{OK.bQC, OK.bQB, OK.bQD, OK.bQE}, 0.6F, true, new pa[]{pa.ads, pa.adu, pa.ads, pa.adA, pa.ady, pa.adA, pa.ady, pa.adu}, new pa[]{pa.ads, pa.adt, pa.ads, pa.adz, pa.ady, pa.adz, pa.ady, pa.adt}, new pa[]{pa.adr, pa.adt, pa.adr, pa.adz, pa.adx, pa.adz, pa.adx, pa.adt}, new pa[]{pa.adr, pa.adu, pa.adr, pa.adA, pa.adx, pa.adA, pa.adx, pa.adu}),
   adh(new OK[]{OK.bQB, OK.bQC, OK.bQD, OK.bQE}, 0.6F, true, new pa[]{pa.adx, pa.adu, pa.adx, pa.adA, pa.adr, pa.adA, pa.adr, pa.adu}, new pa[]{pa.adx, pa.adt, pa.adx, pa.adz, pa.adr, pa.adz, pa.adr, pa.adt}, new pa[]{pa.ady, pa.adt, pa.ady, pa.adz, pa.ads, pa.adz, pa.ads, pa.adt}, new pa[]{pa.ady, pa.adu, pa.ady, pa.adA, pa.ads, pa.adA, pa.ads, pa.adu});

   protected final OK[] adi;
   protected final float adj;
   protected final boolean adk;
   protected final pa[] adl;
   protected final pa[] adm;
   protected final pa[] adn;
   protected final pa[] ado;
   private static final oZ[] adp = new oZ[6];

   private oZ(OK[] var3, float var4, boolean var5, pa[] var6, pa[] var7, pa[] var8, pa[] var9) {
      this.adi = var3;
      this.adj = var4;
      this.adk = var5;
      this.adl = var6;
      this.adm = var7;
      this.adn = var8;
      this.ado = var9;
   }

   public static oZ t(OK var0) {
      return adp[var0.tb()];
   }

   static {
      adp[OK.bQB.tb()] = adc;
      adp[OK.bQC.tb()] = add;
      adp[OK.bQD.tb()] = ade;
      adp[OK.bQE.tb()] = adf;
      adp[OK.bQF.tb()] = adg;
      adp[OK.bQG.tb()] = adh;
   }
}
