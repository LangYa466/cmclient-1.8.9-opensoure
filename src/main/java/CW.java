public class Cw extends Cs {
   private Cy bas;

   protected Fm yX() {
      return null;
   }

   public zH zM() {
      return zH.aRK;
   }

   protected void q(NW var1, cv var2) {
      this.q(e.q[-16738 & 478], 0.15F, 1.0F);
   }

   protected boolean CS() {
      return true;
   }

   public Cw(QI var1) {
      super(var1);
      this.d(0.4F, 0.3F);
      this.aPR.q(1, new AM(this));
      this.aPR.q(3, this.bas = new Cy(this));
      this.aPR.q(4, new zT(this, DD.class, 1.0D, false));
      this.aPR.q(5, new Cx(this));
      this.aPM.q(1, new An(this, true, new Class[0]));
      this.aPM.q(2, new Ay(this, DD.class, true));
   }

   protected boolean mG() {
      return false;
   }

   public double pP() {
      return 0.2D;
   }

   protected void yJ() {
      super.yJ();
      this.q(zR.aSa).h(8.0D);
      this.q(zR.aSd).h(0.25D);
      this.q(zR.aSb).h(1.0D);
   }

   protected String zv() {
      return e.q[-24356 & 1725];
   }

   public boolean q(Oz var1, float var2) {
      if (this.q(var1)) {
         return false;
      } else {
         if (var1 instanceof OB || var1 == Oz.bPF) {
            this.bas.DA();
         }

         return super.q(var1, var2);
      }
   }

   public boolean yy() {
      if (super.yy()) {
         DD var1 = this.vR.y(this, 5.0D);
         return var1 == null;
      } else {
         return false;
      }
   }

   public float xC() {
      return 0.1F;
   }

   public void hv() {
      this.aQB = this.aOn;
      super.hv();
   }

   protected String zC() {
      return e.q[3261 & 4253];
   }

   public float H(NW var1) {
      return this.vR.g(var1.Vj()).ds() == Ea.biP ? 10.0F : super.H(var1);
   }

   protected String zp() {
      return e.q[19931 & 187];
   }
}
