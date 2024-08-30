public class af extends E {
   private ag dy;
   private ag dz;
   private ag dA;
   private ag dB;
   private ah[] dC;
   private bI dD;
   private ag dE;

   protected void w(E var1) {
      new bI(var1, y.q[19325 & -10883 & -30217 & -23561]);
      bI var10001 = (new bI(this, u.q[9063 & -30903 & -6393 & 16253])).q(Integer.valueOf(8490 & 1169));
      String[] var10002 = new String[-32757 & 5187];
      var10002[8197 & 2336] = u.q[4002 & -28726 & -16542 & -3258];
      var10002[673 & 17737] = u.q[-2261 & 931 & 26443 & -23581];
      var10002[1506 & 25090] = u.q[-22706 & 15236 & -21515 & -29707];
      this.dD = var10001.q(var10002);
      ah[] var2 = new ah[5323 & 16903];
      var2[26720 & 904] = ah.dL;
      var2[521 & 4097] = ah.dM;
      var2[-30706 & 66] = ah.dO;
      this.dC = var2;
      this.dy = new ag(var1, r.q[3558 & 3502 & -20249 & -2841]);
      this.dz = new ag(var1, w.q[15279 & -9313 & 21239 & -4385]);
      this.dA = new ag(var1, u.q[-11363 & -23649 & 23527 & -24721]);
      this.dE = new ag(var1, e.q[10063 & -21681 & -31905 & -30721]);
      this.dB = new ag(var1, u.q[-23609 & 16334 & -17521 & -24762]);
   }

   public void O() {
      boolean var1 = this.aK.eX().rz();
      if (this.J() && !var1) {
         super.w((boolean)(-12279 & 8258));
      } else if (!this.J() && var1) {
         super.w((boolean)(16395 & 8325));
      }

   }

   public ag q(zk var1) {
      if (var1 instanceof DD) {
         return this.dy;
      } else if (var1 instanceof BD) {
         return this.dz;
      } else if (var1 instanceof zO) {
         return this.dA;
      } else {
         return var1 instanceof BR ? this.dB : this.dE;
      }
   }

   public ah ah() {
      return this.dC[this.dD.bk()];
   }

   public af() {
      super(u.q[-1271 & 4873 & 9008 & 1847], 8782 & -32578);
      this.w(this);
   }

   public void w(boolean var1) {
      super.w(var1);
      this.aK.eX().U(var1);
   }
}
