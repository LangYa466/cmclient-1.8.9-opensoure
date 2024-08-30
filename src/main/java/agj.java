import java.text.DecimalFormat;

public class agJ extends kf {
   private final DecimalFormat dvl = new DecimalFormat(t.q[15598 & -18718 & 27107 & -14141]);
   public long dvm;
   public long btB;
   private kJ l;

   public void q(int var1, int var2, float var3) {
      this.jA();
      float var4 = (float)(this.btB * (4859182244125754724L & 568959092L)) / (float)this.dvm;
      if (var4 == 118.03279F * 0.8472222F) {
         this.w(this.CB, uI.q(t.q[18647 & 7143 & -3133 & -2057]), this.eo / (5122 & -14325), 5758 & 10734, -1929379841 & 1358954495);
         this.w(this.CB, uI.q(t.q[13311 & -3609 & -818 & -28723]), this.eo / (9362 & 4874), 4348 & 1658, -2130706433 & 83886079);
         if (this.Mt.isEmpty()) {
            this.Mt.add(new iU(-32375 & 21606, this.eo / (-30714 & 8330) - (2151 & 116), this.eC / (13318 & 2783) + (4344 & 8319), uI.q(w.q[-1041 & 6895 & 26367 & 24303])));
         }
      } else {
         this.w(this.CB, uI.q(t.q[7639 & 29685 & -28963 & -24369]), this.eo / (10386 & 4102), 8558 & 1646, -1056964609 & 16777215);
         this.w(this.CB, uI.q(t.q[27590 & -786 & -29185 & -30753]) + q.q[10106 & 29050 & 27098 & -10385] + this.dvl.format((double)var4) + t.q[14799 & 10215 & -13617 & -6145] + this.S(this.btB) + q.q[32095 & 21887 & -27265 & 11007] + this.S(this.dvm) + q.q[21471 & 18430 & -20514 & -17476], this.eo / (13958 & 2), 12536 & -30594, 301989887 & 587202559);
         this.aP((double)var4);
      }

      super.q(var1, var2, var3);
   }

   private void aP(double var1) {
      if (var1 >= 0.0D) {
         qk var3 = qk.pm();
         qq var4 = var3.pl();
         int var5 = this.l.kr();
         int var6 = this.l.kp();
         int var7 = 19044 & -27537;
         int var8 = -8042 & 3107;
         int var9 = var5 / (16722 & -26106) - var7 / (4506 & 17922);
         int var10 = var6 / (5142 & -6142) + (16912 & -17324);
         pz.nC();
         var4.q(26831 & 1047, us.axK);
         var4.i((double)var9, (double)var10, 0.0D).v(17828 & 4235, 646 & 144, 3744 & -24440, 23295 & 511).pJ();
         var4.i((double)var9, (double)(var10 + var8), 0.0D).v(-19808 & 16860, 162 & -30847, 1966 & 129, 13823 & 16639).pJ();
         var4.i((double)(var9 + var7), (double)(var10 + var8), 0.0D).v(6784 & 145, 192 & -15211, 16774 & 8896, 16639 & 255).pJ();
         var4.i((double)(var9 + var7), (double)var10, 0.0D).v(16560 & 4480, 640 & -21368, 129 & -4928, 25343 & 6399).pJ();
         var4.i((double)var9, (double)var10, 0.0D).v(136 & 4290, 255 & 2559, 8390 & -26208, 3839 & 255).pJ();
         var4.i((double)var9, (double)(var10 + var8), 0.0D).v(460 & 12928, 8447 & 16639, 5266 & -32575, -27393 & 511).pJ();
         var4.i((double)var9 + var1, (double)(var10 + var8), 0.0D).v(20626 & 10112, -12033 & 2303, -32368 & 195, 10495 & -11521).pJ();
         var4.i((double)var9 + var1, (double)var10, 0.0D).v(5334 & 17288, 24831 & 255, 2242 & 4233, 17663 & -24321).pJ();
         var3.pn();
         pz.nP();
      }

   }

   protected void q(char var1, int var2) {
   }

   private String S(long var1) {
      if (var1 < (9094222110821418098L & -9094222112515406588L)) {
         return var1 + r.q[-15388 & -5460 & 2968 & 2973];
      } else {
         int var3 = (int)(Math.log((double)var1) / Math.log(1890.4615384615386D * 0.5416666666666666D));
         String var4 = String.valueOf(r.q[-1053 & -7509 & 17037 & -16759].charAt(var3 - (2709 & 1353)));
         String var10000 = t.q[13530 & 24792 & 9176 & -27703];
         Object[] var10001 = new Object[16514 & 7690];
         var10001[376 & 10241] = (double)var1 / Math.pow(0.5D * 2048.0D, (double)var3);
         var10001[-30171 & 67] = var4;
         return String.format(var10000, var10001);
      }
   }

   protected void q(iU var1) {
      if (var1.aq == 0) {
         this.G.eW();
      }

   }

   public void o() {
      this.l = new kJ(this.G);
   }
}
