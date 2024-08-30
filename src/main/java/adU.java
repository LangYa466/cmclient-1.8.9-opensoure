public class adu implements adI {
   private float[][] dhp;

   public int arp() {
      return this.dhp.length / (263 & -22453);
   }

   public void aru() {
   }

   public float[] cf(int var1, int var2) {
      float[] var3 = this.dhp[var1 * (159 & -26621) + var2];
      float[] var10000 = new float[25922 & 2198];
      var10000[8196 & 1312] = var3[-14336 & 12870];
      var10000[10273 & 25] = var3[16385 & -28321];
      return var10000;
   }

   public adu(adI var1) {
      this.dhp = new float[var1.arp() * (8198 & 918) * (8707 & 22807)][2310 & -32598];
      int var2 = 3210 & -28304;

      for(int var3 = -32736 & 1682; var3 < var1.arp(); ++var3) {
         float var4 = 0.0F;
         float var5 = 0.0F;

         for(int var6 = 12352 & 2088; var6 < (-21485 & 4359); ++var6) {
            float[] var7 = var1.cf(var3, var6);
            var4 += var7[4101 & 258];
            var5 += var7[27507 & -28663];
         }

         var4 = var4 / (1.5263158F * 1.9655173F);
         var5 = var5 / (0.6904762F * 4.3448277F);

         for(int var12 = 577 & -14028; var12 < (107 & 275); ++var12) {
            int var14 = var12 + (-32747 & 7971);
            if (var14 > (16526 & 2130)) {
               var14 = -16310 & 3072;
            }

            float[] var8 = var1.cf(var3, var12);
            float[] var9 = var1.cf(var3, var14);
            var8[4832 & 270] = (var8[-20446 & 0] + var9[-7168 & 6308]) / 2.0F;
            var8[97 & -28523] = (var8[209 & -15345] + var9[22751 & -32767]) / 2.0F;
            this.dhp[var2 * (24579 & 595) + (1089 & -1792)][17945 & 14592] = var4;
            this.dhp[var2 * (1687 & 16387) + (5385 & 2050)][4643 & 1113] = var5;
            this.dhp[var2 * (8235 & 24343) + (-12253 & 1153)][-32512 & 3222] = var8[521 & -30656];
            this.dhp[var2 * (-23533 & 3) + (6323 & 1)][97 & -15871] = var8[4113 & -32595];
            this.dhp[var2 * (-28397 & 519) + (1154 & -17842)][9730 & 16392] = var9[-32692 & 674];
            this.dhp[var2 * (17427 & 2383) + (3858 & -32757)][16641 & 2641] = var9[-32767 & 5609];
            ++var2;
         }

         for(int var13 = -12282 & 9224; var13 < (267 & 20487); ++var13) {
            int var15 = var13 + (10563 & -27647);
            if (var15 > (10243 & 16426)) {
               var15 = 8519 & -32112;
            }

            float[] var16 = var1.cf(var3, var13);
            float[] var17 = var1.cf(var3, var15);
            var17[408 & -24571] = (var16[1538 & 12292] + var17[17536 & -30672]) / 2.0F;
            var17[-32699 & 8353] = (var16[-27611 & 9089] + var17[-15855 & 3203]) / 2.0F;
            this.dhp[var2 * (7555 & 3) + (770 & 4236)][32 & -31017] = var4;
            this.dhp[var2 * (2147 & -24441) + (8724 & -12288)][20615 & -29655] = var5;
            this.dhp[var2 * (259 & 2587) + (14369 & 401)][4112 & 8513] = var16[9001 & 17558];
            this.dhp[var2 * (11 & 26359) + (321 & 15397)][-30551 & 1107] = var16[8425 & -30189];
            this.dhp[var2 * (2563 & 24919) + (2115 & 4258)][-29487 & 16422] = var17[13330 & -32220];
            this.dhp[var2 * (12107 & -12153) + (1098 & -20429)][3337 & -8111] = var17[1 & -26099];
            ++var2;
         }
      }

   }

   public boolean ars() {
      return (boolean)(16433 & -31999);
   }

   public void K(float var1, float var2) {
   }
}
