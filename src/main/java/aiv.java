public class aiv extends Thread {
   private final kf dAM;
   private final hS dAN;

   public void run() {
      if (this.dAN.fs() != null && this.dAN.fs().El != null) {
         hS var3 = this.dAN;
         kf var6 = this.dAM;
         int var9 = 1312 & -13803;
         int var12 = 43 & 593;
         String[] var15 = new String[-16321 & 12289];
         var15[1104 & -28668] = uI.q(t.q[-13893 & -5737 & -775 & 13781]);
         var3.r(new agH(var6, (boolean)var9, (boolean)var12, var15));

         try {
            this.dAN.fs().El.gY();
            Thread.sleep(-1593301127195990059L & 1376589784L);
            this.dAN.fs().El.ha();
            Thread.sleep(-8708482872701745159L & 537167828L);
            var3 = this.dAN;
            var6 = this.dAM;
            var9 = 28929 & -31183;
            var12 = 228 & -19455;
            var15 = new String[3586 & 8634];
            var15[746 & -24320] = t.q[-26445 & -12581 & 8954 & -23558];
            var15[20549 & 1313] = t.q[14579 & -3373 & 1727 & 3263] + (this.dAN.fs().El.EF ? t.q[444 & 24766 & 18909 & 17876] : t.q[26551 & -5897 & 20405 & -29227]);
            var3.r(new agH(var6, (boolean)var9, (boolean)var12, var15));
         } catch (Throwable var2) {
            var3 = this.dAN;
            var6 = this.dAM;
            var9 = 449 & 1047;
            var12 = 11424 & -32438;
            var15 = new String[9585 & 2177];
            var15[4647 & 9480] = t.q[17873 & 18900 & 3801 & 6040];
            var3.r(new agH(var6, (boolean)var9, (boolean)var12, var15));
         }

      } else {
         hS var10000 = this.dAN;
         kf var10003 = this.dAM;
         int var10004 = -32765 & 8237;
         int var10005 = 568 & 5123;
         String[] var10006 = new String[145 & -6071];
         var10006[25681 & -32766] = t.q[9976 & 6905 & 24024 & 22192];
         var10000.r(new agH(var10003, (boolean)var10004, (boolean)var10005, var10006));
      }
   }

   public aiv(hS var1, kf var2) {
      super(t.q[16783 & -13409 & 21199 & 12463]);
      this.dAN = var1;
      this.dAM = var2;
   }
}
