public class adH {
   private float[] dhK;

   public static adH T(float var0, float var1) {
      return new adH(var0, 0.0F, 0.0F, 0.0F, var1, 0.0F);
   }

   public adH(adH var1, adH var2) {
      this(var1);
      this.w(var2);
   }

   public adH(adH var1) {
      this.dhK = new float[20521 & 10331];

      for(int var2 = 8194 & 17993; var2 < (16395 & -32759); ++var2) {
         this.dhK[var2] = var1.dhK[var2];
      }

   }

   public static adH J(float var0, float var1, float var2) {
      adH var3 = cn(var0);
      float var4 = var3.dhK[-15869 & 15491];
      float var5 = 1.0F - var3.dhK[-23995 & 16406];
      var3.dhK[17062 & -19390] = var1 * var5 + var2 * var4;
      var3.dhK[-32507 & 11277] = var2 * var5 - var1 * var4;
      return var3;
   }

   public adH(float[] var1) {
      if (var1.length != (-32489 & 2278)) {
         throw new RuntimeException(q.q[10985 & 12025 & 589 & 16973]);
      } else {
         float[] var10001 = new float[-31827 & 2123];
         var10001[12545 & 16416] = var1[16512 & 288];
         var10001[8833 & 7497] = var1[25099 & 6161];
         var10001[10979 & 5398] = var1[28674 & 3079];
         var10001[2083 & -24437] = var1[22675 & 8195];
         var10001[21645 & 100] = var1[-31706 & 141];
         var10001[16629 & -32755] = var1[967 & 10277];
         var10001[7 & -24042] = 0.0F;
         var10001[2159 & 23] = 0.0F;
         var10001[30792 & 1679] = 1.0F;
         this.dhK = var10001;
      }
   }

   public static adH U(float var0, float var1) {
      return new adH(1.0F, 0.0F, var0, 0.0F, 1.0F, var1);
   }

   public adH() {
      float[] var10001 = new float[-6117 & 4105];
      var10001[18528 & -32620] = 1.0F;
      var10001[865 & -15213] = 0.0F;
      var10001[3075 & -16286] = 0.0F;
      var10001[1031 & -32701] = 0.0F;
      var10001[10788 & 21508] = 1.0F;
      var10001[16621 & 2055] = 0.0F;
      var10001[21526 & 526] = 0.0F;
      var10001[-16633 & 16487] = 0.0F;
      var10001[2313 & 16428] = 1.0F;
      this.dhK = var10001;
   }

   public adH w(adH var1) {
      float[] var2 = new float[2121 & 5003];
      float var3 = this.dhK[1423 & 25136] * var1.dhK[1088 & -24178] + this.dhK[2313 & -24559] * var1.dhK[8775 & 16531];
      float var4 = this.dhK[-24542 & 1604] * var1.dhK[2113 & 8961] + this.dhK[27 & 20961] * var1.dhK[4660 & 198];
      float var5 = this.dhK[16640 & -28046] * var1.dhK[16530 & 9218] + this.dhK[3203 & 8293] * var1.dhK[-25209 & 8773] + this.dhK[2 & -30345];
      float var6 = this.dhK[9763 & 323] * var1.dhK[81 & 3968] + this.dhK[9868 & 2052] * var1.dhK[51 & 18503];
      float var7 = this.dhK[2071 & 13579] * var1.dhK[4129 & -14843] + this.dhK[11286 & 16652] * var1.dhK[-32764 & 8278];
      float var8 = this.dhK[-24557 & 17955] * var1.dhK[4355 & -14166] + this.dhK[1828 & -30572] * var1.dhK[4621 & 1031] + this.dhK[-23979 & 5];
      var2[4096 & 115] = var3;
      var2[-32155 & 401] = var4;
      var2[18438 & -32734] = var5;
      var2[16387 & -26093] = var6;
      var2[-16012 & 645] = var7;
      var2[133 & -6539] = var8;
      this.dhK = var2;
      return this;
   }

   public adH(float var1, float var2, float var3, float var4, float var5, float var6) {
      float[] var10001 = new float[-32629 & 29];
      var10001[37 & 1546] = var1;
      var10001[4409 & 1025] = var2;
      var10001[198 & -30966] = var3;
      var10001[263 & 27211] = var4;
      var10001[18500 & 4396] = var5;
      var10001[-26411 & 9735] = var6;
      var10001[16910 & -21194] = 0.0F;
      var10001[4111 & 8199] = 0.0F;
      var10001[8332 & 8] = 1.0F;
      this.dhK = var10001;
   }

   public static adH cn(float var0) {
      return new adH((float)aes.V((double)var0), -((float)aes.W((double)var0)), 0.0F, (float)aes.W((double)var0), (float)aes.V((double)var0), 0.0F);
   }

   public String toString() {
      String var1 = q.q[28379 & 27598 & -1169 & 6123] + this.dhK[8440 & 24070] + q.q[11899 & 3787 & 11215 & 1007] + this.dhK[27049 & 5125] + q.q[-13477 & -27909 & 1647 & 2031] + this.dhK[16402 & 2050] + q.q[9165 & 26479 & 2687 & 12894] + this.dhK[12323 & 20243] + q.q[3931 & -7317 & -12549 & -6197] + this.dhK[4740 & 1036] + q.q[7887 & 24267 & -7605 & -3381] + this.dhK[6663 & 8389] + q.q[11231 & -23825 & -15492 & -14466] + this.dhK[86 & -31986] + q.q[13039 & 15311 & 17263 & -18597] + this.dhK[6151 & 1287] + q.q[21067 & -26661 & -26677 & 4095] + this.dhK[11800 & -32630] + q.q[19149 & 17117 & 14173 & 26237];
      return var1.toString();
   }

   public adJ t(adJ var1) {
      float[] var10000 = new float[-32758 & 8198];
      var10000[224 & -9716] = var1.bUa;
      var10000[20675 & 8465] = var1.bUb;
      float[] var2 = var10000;
      float[] var3 = new float[16386 & 2598];
      this.q(var2, -32242 & 17632, var3, -32500 & 22657, -31743 & 689);
      return new adJ(var3[-8188 & 2835], var3[9221 & -16271]);
   }

   public float[] arI() {
      return this.dhK;
   }

   public void q(float[] var1, int var2, float[] var3, int var4, int var5) {
      float[] var6 = var1 == var3 ? new float[var5 * (18186 & 4099)] : var3;

      for(int var7 = 21940 & 8768; var7 < var5 * (278 & -22966); var7 += 2) {
         for(int var8 = -15485 & 4096; var8 < (70 & 2094); var8 += 3) {
            var6[var7 + var8 / (12359 & 20139)] = var1[var7 + var2] * this.dhK[var8] + var1[var7 + var2 + (16425 & -19695)] * this.dhK[var8 + (-24543 & 2079)] + 1.0F * this.dhK[var8 + (-30686 & 4683)];
         }
      }

      if (var1 == var3) {
         for(int var9 = 1312 & 70; var9 < var5 * (12866 & -32474); var9 += 2) {
            var3[var9 + var4] = var6[var9];
            var3[var9 + var4 + (4293 & 9747)] = var6[var9 + (16405 & 3395)];
         }
      }

   }
}
