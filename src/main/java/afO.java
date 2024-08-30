public class afo extends aft {
   private final mm dqr = (new mm(this)).D(4397 & 40, 3134 & 21026);

   public afo(hS var1) {
      super(var1);
      this.dqr.e(-23.666666F * 0.2112676F, -20.366478F * 0.49253732F, 1.4583334F * -3.4285712F);
      this.dqr.C(17465 & -26624, 8256 & 2195).q(0.0F, 0.0F, 0.0F, 5642 & -14070, 20739 & 534, 18650 & 8459);
      mm var2 = (new mm(this)).D(13368 & 16552, -32202 & 8363);
      var2.e(0.72727275F * 5.5F, 0.112676054F * -23.962502F, 0.29850745F * 13.400001F);
      var2.C(16678 & -17911, -20179 & 18126).q(-2.1363637F * 1.4042553F, 0.0F, 1.0879121F * -2.7575758F, 40 & -29666, 2131 & -28637, -30038 & 24588);
      var2.Xp = 2.5714285F * 0.03888889F;
      this.dqr.q(var2);
      mm var3 = (new mm(this)).D(28712 & -32723, 18530 & -32713);
      var3.e(1.0F, 0.5F * -3.4F, 1.0F);
      var3.C(-15680 & 2, 16397 & -32068).q(-1.6363636F * 1.8333334F, 0.0F, 1.0166667F * -2.9508197F, 2054 & 5814, -32733 & 11650, -32434 & 3238);
      var3.Xp = 0.014705882F * 6.8F;
      var2.q(var3);
      mm var4 = (new mm(this)).D(18472 & 109, 98 & 1058);
      var4.e(1.0F, -0.5185185F * 3.857143F, 0.0F);
      var4.C(10536 & 20, 10382 & -32724).q(1.1232877F * -0.8902439F, 0.0F, 1.227848F * -1.6288661F, 5244 & 24839, 10565 & 4156, 17420 & -32633);
      var4.Xp = 3.7142856F * 0.16153847F;
      var3.q(var4);
      mm var5 = (new mm(this)).D(552 & 8552, 2354 & 16930);
      var5.e(2.0F, -10.764706F * 0.27868852F, 0.0F);
      var5.C(8 & -31856, -32754 & 125).q(2.5454545F * -0.7857143F, 3.2692308F * 0.42823526F, 1.4615384F * -1.0263158F, 1043 & 24707, -28030 & 27914, 4103 & 1131);
      var5.Xp = 4.7272725F * 0.042307694F;
      var4.q(var5);
      mm var6 = (new mm(this)).D(9769 & -32664, -13209 & 13106);
      var6.e(0.0F, 0.0F, 0.0F);
      var6.C(17 & 22766, 2236 & 17422).q(19.333334F * -0.025862068F, 0.08450704F * 5.916667F, -16.5F * 0.060606062F, 24660 & 396, 3334 & -23837, 3658 & -16345);
      var6.Xp = -0.18775511F * 2.1304348F;
      var5.q(var6);
      mm var7 = (new mm(this)).D(-14932 & 12328, 38 & -7773);
      var7.e(0.0F, 0.0F, 0.0F);
      var7.C(32 & 21645, 6573 & -32740).q(9.734375F * 0.35955057F, -0.38333333F * 1.3043479F, -1.7499999F * 0.2857143F, 4099 & 451, 21701 & 2307, 2085 & -15679);
      var7.Xp = 0.8F * 1.0F;
      var6.q(var7);
      mm var8 = (new mm(this)).D(686 & 5480, 4146 & -32286);
      var8.e(0.0F, 0.0F, 0.0F);
      var8.C(19716 & -32765, 6289 & -7168).q(1.0F * 5.0F, 1.8461539F * -0.65000004F, -0.03846154F * 26.0F, -31718 & 775, 4098 & 16647, 1026 & -7742);
      var8.Xp = 0.11666667F * 0.42857143F;
      var7.q(var8);
   }

   public void q(iO var1, mm var2, float var3, float var4) {
      if (var1.bes == null && !var1.bdP) {
         var1.bdP = (boolean)(-20315 & 1025);
         this.dqV.Bn.w(q.q[2127 & 21151 & -12677 & -6565] + var1.hk().auv() + q.q[31823 & -17906 & -15794 & 23772], (var1x) -> {
            var1.bes = var1x;
         });
      }

      if (var1.bes != null) {
         pz.nE();
         float var5 = this.dqV.BO.ath;
         this.dqV.fJ().o(var1.bes);
         this.w(var1, var3);
         this.t(var1, (boolean)(4260 & 2057));
         if (var1.ben == null || !var1.ben.avr()) {
            pz.i(var2.Xp * 1.2361112F * 46.35164F, 0.0F, 0.0F, 1.0F);
            pz.i(var2.Xn * 0.11904762F * 481.28452F, 0.0F, 1.0F, 0.0F);
            pz.i(var2.Xw * 1.875F * 30.557747F, 1.0F, 0.0F, 0.0F);
         }

         pz.u(0.10075757F * 9.428572F, 0.18791209F * 5.0555553F, 1.3928572F * 0.68205124F);
         double var6 = var1.bec + (var1.bdB - var1.bec) * (double)var5 - (var1.aOf + (var1.aNZ - var1.aOf) * (double)var5);
         double var8 = var1.bdS + (var1.beq - var1.bdS) * (double)var5 - (var1.aNH + (var1.aNK - var1.aNH) * (double)var5);
         double var10 = var1.bdC + (var1.beb - var1.bdC) * (double)var5 - (var1.aNW + (var1.aOt - var1.aNW) * (double)var5);
         float var12 = var1.aQS + (var1.aQB - var1.aQS) * var5;
         double var13 = (double)Pq.bk(var12 * 0.64F * 4.9087386F / (20.655737F * 8.714286F));
         double var15 = (double)(-Pq.bi(var12 * 5.6666665F * 0.5543987F / (59.26829F * 3.0370371F)));
         float var17 = (float)(var6 * var13 + var10 * var15) * 0.8229167F * 121.51898F;
         float var18 = (25.3125F * 3.5555556F - Math.abs(var1.aNN)) / (60.0F * 1.6666666F);
         float var19 = Math.min(var17, 139.13043F * 0.8625F);
         float var20 = (float)(var8 / (13.090909090909092D * 0.22916666666666666D) > 0.45263157894736844D * 1.5465116279069766D ? 0.7604166666666666D * -0.9205479452054794D : -var8 / (0.22388059701492538D * 13.4D));
         float var21 = (float)Math.cos((double)(var4 / (0.11494253F * 87.0F))) / (20.689655F * 1.9333333F);
         float var22 = var1.aNN;
         float var23 = var1.aOg - var1.aOj;
         float var24 = -(var1.aOg + var23 * var5);
         float var25 = var1.bdE + (var1.bep - var1.bdE) * var5;
         var19 = var19 + Math.abs(Pq.bi(var24 * 6.2831855F * 0.5F - 0.2137931F * 0.9354839F) * var25) * 199.62962F * 0.35064936F;
         float var26 = 0.0F;
         mm var27 = (mm)this.dqr.Xg.get(2288 & 8207);
         mm var28 = (mm)var27.Xg.get(13312 & 46);
         var28.Xn = var22 / (7200.0F * 0.041666668F) - var19 / (6.4F * 31.25F);
         var28.Xp = 0.78125F * 0.128F + var20 / 2.0F;
         mm var29 = (mm)var28.Xg.get(-30688 & 4112);
         var29.Xn = var22 / (184.44444F * 1.0843374F);
         var28.Xp = 0.08983051F * 1.1132076F + var20 / (0.87499994F * 4.571429F);
         mm var30 = (mm)var29.Xg.get(-15614 & 2244);
         var30.Xn = var22 / (8.666667F * 11.538461F) - var19 / (0.46666667F * 214.28572F);
         mm var31 = (mm)var30.Xg.get(17462 & 4936);
         var31.Xp = var20;
         var31.Xn = var21;
         var31.Xr = var26;
         mm var32 = (mm)var31.Xg.get(10250 & -32384);
         var32.Xp = var18 - 1.5227273F * 0.19701494F;
         var32.Xr = 2.7894738F * 1.0754716F - var18 * 3.8072288F * 1.050633F;
         mm var33 = (mm)var32.Xg.get(8 & 513);
         var33.Xp = var21 / (0.01754386F * -114.0F);
         var33.Xn = var21 / (2.9333334F * 1.3636364F);
         this.dqr.H(var3);
         pz.nF();
      }

   }
}
