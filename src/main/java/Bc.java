public class BC extends zk {
   private int acs;
   private int abY;

   public void q(byte var1) {
      if (var1 == 17 && this.vR.bXF) {
         GX var2 = this.aNw.dz(8);
         HL var3 = null;
         if (var2 != null && var2.HZ()) {
            var3 = var2.Ie().bO(r.q[16605 & 1533]);
         }

         this.vR.q(this.aNZ, this.aNK, this.aOt, this.aOd, this.aOO, this.aOL, var3);
      }

      super.q(var1);
   }

   public int I(float var1) {
      return super.I(var1);
   }

   public void r(HL var1) {
      this.abY = var1.bQ(o.q[7615 & 443]);
      this.acs = var1.bQ(o.q[26108 & 444]);
      HL var2 = var1.bO(o.q[-15875 & 9661]);
      if (var2 != null) {
         GX var3 = GX.x(var2);
         if (var3 != null) {
            this.aNw.e(8, var3);
         }
      }

   }

   public void k(double var1, double var3, double var5) {
      this.aOd = var1;
      this.aOO = var3;
      this.aOL = var5;
      if (this.aOr == 0.0F && this.aOF == 0.0F) {
         float var7 = Pq.B(var1 * var1 + var5 * var5);
         this.aOF = this.aOn = (float)(Pq.u(var1, var5) * 180.0D / 3.141592653589793D);
         this.aOr = this.aNN = (float)(Pq.u(var3, (double)var7) * 180.0D / 3.141592653589793D);
      }

   }

   public BC(QI var1, double var2, double var4, double var6, GX var8) {
      super(var1);
      this.abY = 0;
      this.d(0.25F, 0.25F);
      this.p(var2, var4, var6);
      int var9 = 1;
      if (var8 != null && var8.HZ()) {
         this.aNw.e(8, var8);
         HL var10 = var8.Ie();
         HL var11 = var10.bO(r.q[20701 & 3295]);
         if (var11 != null) {
            var9 += var11.bN(r.q[-27169 & 17118]);
         }
      }

      this.aOd = this.oF.nextGaussian() * 0.001D;
      this.aOL = this.oF.nextGaussian() * 0.001D;
      this.aOO = 0.05D;
      this.acs = 10 * var9 + this.oF.nextInt(6) + this.oF.nextInt(7);
   }

   protected void mC() {
      this.aNw.ao(8, 5);
   }

   public boolean mD() {
      return false;
   }

   public boolean f(double var1) {
      return var1 < 4096.0D;
   }

   public BC(QI var1) {
      super(var1);
      this.d(0.25F, 0.25F);
   }

   public void hv() {
      this.aOD = this.aNZ;
      this.aNE = this.aNK;
      this.aOC = this.aOt;
      super.hv();
      this.aOd *= 1.15D;
      this.aOL *= 1.15D;
      this.aOO += 0.04D;
      this.h(this.aOd, this.aOO, this.aOL);
      float var1 = Pq.B(this.aOd * this.aOd + this.aOL * this.aOL);
      this.aOn = (float)(Pq.u(this.aOd, this.aOL) * 180.0D / 3.141592653589793D);

      for(this.aNN = (float)(Pq.u(this.aOO, (double)var1) * 180.0D / 3.141592653589793D); this.aNN - this.aOr < -180.0F; this.aOr -= 360.0F) {
         ;
      }

      while(this.aNN - this.aOr >= 180.0F) {
         this.aOr += 360.0F;
      }

      while(this.aOn - this.aOF < -180.0F) {
         this.aOF -= 360.0F;
      }

      while(this.aOn - this.aOF >= 180.0F) {
         this.aOF += 360.0F;
      }

      this.aNN = this.aOr + (this.aNN - this.aOr) * 0.2F;
      this.aOn = this.aOF + (this.aOn - this.aOF) * 0.2F;
      if (this.abY == 0 && !this.xP()) {
         this.vR.q(this, o.q[442 & 16826], 3.0F, 1.0F);
      }

      ++this.abY;
      if (this.vR.bXF && this.abY % 2 < 2) {
         this.vR.q(OP.bRn, this.aNZ, this.aNK - 0.3D, this.aOt, this.oF.nextGaussian() * 0.05D, -this.aOO * 0.5D, this.oF.nextGaussian() * 0.05D);
      }

      if (!this.vR.bXF && this.abY > this.acs) {
         this.vR.q(this, (byte)17);
         this.yo();
      }

   }

   public float J(float var1) {
      return super.J(var1);
   }

   public void t(HL var1) {
      var1.a(o.q[17339 & -18949], this.abY);
      var1.a(o.q[-22594 & 20925], this.acs);
      GX var2 = this.aNw.dz(8);
      if (var2 != null) {
         HL var3 = new HL();
         var2.z(var3);
         var1.w(o.q[25021 & -26179], var3);
      }

   }
}
