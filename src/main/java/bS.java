public class BS extends Cs {
   private int aZy;
   private float aZz = 0.5F;

   public void aB(boolean var1) {
      byte var2 = this.aNw.dy(16);
      if (var1) {
         var2 = (byte)(var2 | 1);
      } else {
         var2 = (byte)(var2 & -2);
      }

      this.aNw.e(16, Byte.valueOf(var2));
   }

   public void hu() {
      if (!this.aNG && this.aOO < 0.0D) {
         this.aOO *= 0.6D;
      }

      if (this.vR.bXF) {
         if (this.oF.nextInt(24) == 0 && !this.xP()) {
            this.vR.q(this.aNZ + 0.5D, this.aNK + 0.5D, this.aOt + 0.5D, r.q[910 & -24690], 1.0F + this.oF.nextFloat(), this.oF.nextFloat() * 0.7F + 0.3F, false);
         }

         for(int var1 = 0; var1 < 2; ++var1) {
            this.vR.q(OP.bRw, this.aNZ + (this.oF.nextDouble() - 0.5D) * (double)this.gK, this.aNK + this.oF.nextDouble() * (double)this.gJ, this.aOt + (this.oF.nextDouble() - 0.5D) * (double)this.gK, 0.0D, 0.0D, 0.0D);
         }
      }

      super.hu();
   }

   public boolean CR() {
      return (this.aNw.dy(16) & 1) != 0;
   }

   protected boolean CS() {
      return true;
   }

   public int I(float var1) {
      return 15728880;
   }

   public float J(float var1) {
      return 1.0F;
   }

   protected void mC() {
      super.mC();
      this.aNw.w(16, new Byte((byte)0));
   }

   public boolean xL() {
      return this.CR();
   }

   protected Fm yX() {
      return Et.bnK;
   }

   public BS(QI var1) {
      super(var1);
      this.aOI = true;
      this.aPJ = 10;
      this.aPR.q(4, new BT(this));
      this.aPR.q(5, new Aw(this, 1.0D));
      this.aPR.q(7, new AV(this, 1.0D));
      this.aPR.q(8, new AW(this, DD.class, 8.0F));
      this.aPR.q(8, new Ar(this));
      this.aPM.q(1, new An(this, true, new Class[0]));
      this.aPM.q(2, new Ay(this, DD.class, true));
   }

   public void f(float var1, float var2) {
   }

   protected String zC() {
      return r.q[9135 & 909];
   }

   protected void r(boolean var1, int var2) {
      if (var1) {
         int var3 = this.oF.nextInt(2 + var2);

         for(int var4 = 0; var4 < var3; ++var4) {
            this.r(Et.bnK, 1);
         }
      }

   }

   protected void yR() {
      if (this.xA()) {
         this.q(Oz.bPH, 1.0F);
      }

      --this.aZy;
      if (this.aZy <= 0) {
         this.aZy = 100;
         this.aZz = 0.5F + (float)this.oF.nextGaussian() * 3.0F;
      }

      zz var1 = this.zc();
      if (var1 != null && var1.aNK + (double)var1.xC() > this.aNK + (double)this.xC() + (double)this.aZz) {
         this.aOO += (0.30000001192092896D - this.aOO) * 0.30000001192092896D;
         this.aOQ = true;
      }

      super.yR();
   }

   protected String zv() {
      return r.q[988 & 22412];
   }

   protected String zp() {
      return r.q[5067 & 19339];
   }

   protected void yJ() {
      super.yJ();
      this.q(zR.aSb).h(6.0D);
      this.q(zR.aSd).h(0.23000000417232513D);
      this.q(zR.aSe).h(48.0D);
   }
}
