public class CA extends zx implements CP {
   public float bay;
   public float baz;
   private boolean baA;
   public float baB;

   protected String Dt() {
      return i.q[-28191 & 16881] + (this.DE() > 1 ? i.q[11746 & 17395] : i.q[-32285 & 1527]);
   }

   protected void Dw() {
      this.baB *= 0.6F;
   }

   public void hv() {
      if (!this.vR.bXF && this.vR.Kq() == Qr.bWe && this.DE() > 0) {
         this.aNQ = true;
      }

      this.bay += (this.baB - this.bay) * 0.5F;
      this.baz = this.bay;
      super.hv();
      if (this.aNG && !this.baA) {
         int var1 = this.DE();

         for(int var2 = 0; var2 < var1 * 8; ++var2) {
            float var3 = this.oF.nextFloat() * 3.1415927F * 2.0F;
            float var4 = this.oF.nextFloat() * 0.5F + 0.5F;
            float var5 = Pq.bk(var3) * (float)var1 * 0.5F * var4;
            float var6 = Pq.bi(var3) * (float)var1 * 0.5F * var4;
            QI var7 = this.vR;
            OP var8 = this.Dr();
            double var9 = this.aNZ + (double)var5;
            double var11 = this.aOt + (double)var6;
            var7.q(var8, var9, this.xE().bNT, var11, 0.0D, 0.0D, 0.0D);
         }

         if (this.Dx()) {
            this.q(this.Dt(), this.zw(), ((this.oF.nextFloat() - this.oF.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         }

         this.baB = -0.5F;
      } else if (!this.aNG && this.baA) {
         this.baB = 1.0F;
      }

      this.baA = this.aNG;
      this.Dw();
   }

   protected Fm yX() {
      return this.DE() == 1 ? Et.blv : null;
   }

   protected void z(zz var1) {
      int var2 = this.DE();
      if (this.J(var1) && this.B(var1) < 0.6D * (double)var2 * 0.6D * (double)var2 && var1.q(Oz.n(this), (float)this.Dv())) {
         this.q(r.q[-23957 & 20347], 1.0F, (this.oF.nextFloat() - this.oF.nextFloat()) * 0.2F + 1.0F);
         this.e(this, var1);
      }

   }

   protected void mC() {
      super.mC();
      this.aNw.w(16, Byte.valueOf((byte)1));
   }

   public int yU() {
      return 0;
   }

   protected void zX() {
      this.aOO = 0.41999998688697815D;
      this.aOQ = true;
   }

   protected int Dv() {
      return this.DE();
   }

   public void yo() {
      int var1 = this.DE();
      if (!this.vR.bXF && var1 > 1 && this.zA() <= 0.0F) {
         int var2 = 2 + this.oF.nextInt(3);

         for(int var3 = 0; var3 < var2; ++var3) {
            float var4 = ((float)(var3 % 2) - 0.5F) * (float)var1 / 4.0F;
            float var5 = ((float)(var3 / 2) - 0.5F) * (float)var1 / 4.0F;
            CA var6 = this.Dq();
            if (this.dg()) {
               var6.bh(this.yj());
            }

            if (this.yY()) {
               var6.yN();
            }

            var6.ez(var1 / 2);
            var6.q(this.aNZ + (double)var4, this.aNK + 0.5D, this.aOt + (double)var5, this.oF.nextFloat() * 360.0F, 0.0F);
            this.vR.p(var6);
         }
      }

      super.yo();
   }

   protected String zv() {
      return i.q[-9231 & 489] + (this.DE() > 1 ? i.q[16866 & 13299] : i.q[21987 & 1003]);
   }

   protected OP Dr() {
      return OP.bRR;
   }

   public zJ q(Qq var1, zJ var2) {
      int var3 = this.oF.nextInt(3);
      if (var3 < 2 && this.oF.nextFloat() < 0.5F * var1.YZ()) {
         ++var3;
      }

      int var4 = 1 << var3;
      this.ez(var4);
      return super.q(var1, var2);
   }

   public void r(HL var1) {
      super.r(var1);
      int var2 = var1.bQ(i.q[-24097 & 18943]);
      if (var2 < 0) {
         var2 = 0;
      }

      this.ez(var2 + 1);
      this.baA = var1.bL(i.q[4580 & -22048]);
   }

   protected String zC() {
      return i.q[16865 & 14835] + (this.DE() > 1 ? i.q[17890 & -32261] : i.q[-15873 & 9187]);
   }

   public void t(HL var1) {
      super.t(var1);
      var1.a(i.q[16863 & -32289], this.DE() - 1);
      var1.s(i.q[6632 & 18420], this.baA);
   }

   protected CA Dq() {
      return new CA(this.vR);
   }

   public float xC() {
      return 0.625F * this.gJ;
   }

   protected boolean Dx() {
      return this.DE() > 2;
   }

   protected void ez(int var1) {
      this.aNw.e(16, Byte.valueOf((byte)var1));
      this.d(0.51000005F * (float)var1, 0.51000005F * (float)var1);
      this.p(this.aNZ, this.aNK, this.aOt);
      this.q(zR.aSa).h((double)(var1 * var1));
      this.q(zR.aSd).h((double)(0.2F + 0.1F * (float)var1));
      this.aC(this.zE());
      this.aPJ = var1;
   }

   protected float zw() {
      return 0.4F * (float)this.DE();
   }

   public CA(QI var1) {
      super(var1);
      this.aPD = new CF(this);
      this.aPR.q(1, new CD(this));
      this.aPR.q(2, new CB(this));
      this.aPR.q(3, new CC(this));
      this.aPR.q(5, new CE(this));
      this.aPM.q(1, new Ag(this));
      this.aPM.q(3, new Ae(this, Co.class));
   }

   protected boolean DD() {
      return this.DE() > 0;
   }

   public int DE() {
      return this.aNw.dy(16);
   }

   public boolean yy() {
      NW var1 = new NW(Pq.D(this.aNZ), 0, Pq.D(this.aOt));
      RQ var2 = this.vR.aB(var1);
      if (this.vR.Zz().aaD() == Rb.bYU && this.oF.nextInt(4) != 1) {
         return false;
      } else {
         if (this.vR.Kq() != Qr.bWe) {
            Rl var3 = this.vR.ai(var1);
            if (var3 == Rl.caM && this.aNK > 50.0D && this.aNK < 70.0D && this.oF.nextFloat() < 0.5F && this.oF.nextFloat() < this.vR.Zm() && this.vR.ar(new NW(this)) <= this.oF.nextInt(8)) {
               return super.yy();
            }

            if (this.oF.nextInt(10) == 0 && var2.F(987234911L).nextInt(10) == 0 && this.aNK < 40.0D) {
               return super.yy();
            }
         }

         return false;
      }
   }

   protected int Du() {
      return this.oF.nextInt(20) + 10;
   }

   public void u(DD var1) {
      if (this.Ds()) {
         this.z(var1);
      }

   }

   protected boolean Ds() {
      return this.DE() > 1;
   }

   public void dI(int var1) {
      if (var1 == 16) {
         int var2 = this.DE();
         this.d(0.51000005F * (float)var2, 0.51000005F * (float)var2);
         this.aOn = this.aQu;
         this.aQB = this.aQu;
         if (this.xg() && this.oF.nextInt(20) == 0) {
            this.xw();
         }
      }

      super.dI(var1);
   }

   public void x(zk var1) {
      super.x(var1);
      if (var1 instanceof Co && this.Ds()) {
         this.z((zz)var1);
      }

   }
}
