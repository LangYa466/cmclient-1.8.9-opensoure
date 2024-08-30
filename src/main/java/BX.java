public class Bx extends zk {
   public int aXK;
   public int aXL;

   public void hv() {
      this.aOf = this.aNZ;
      this.aNH = this.aNK;
      this.aNW = this.aOt;
      ++this.aXL;
      this.aNw.e(8, Integer.valueOf(this.aXK));
      int var1 = Pq.D(this.aNZ);
      int var2 = Pq.D(this.aNK);
      int var3 = Pq.D(this.aOt);
      if (this.vR.bXI instanceof QP && this.vR.g(new NW(var1, var2, var3)).ds() != Ea.bkn) {
         this.vR.r(new NW(var1, var2, var3), Ea.bkn.cx());
      }

   }

   protected void r(HL var1) {
   }

   public boolean xl() {
      return true;
   }

   public Bx(QI var1) {
      super(var1);
      this.aOM = true;
      this.d(2.0F, 2.0F);
      this.aXK = 5;
      this.aXL = this.oF.nextInt(100000);
   }

   protected void mC() {
      this.aNw.w(8, Integer.valueOf(this.aXK));
   }

   protected boolean mG() {
      return false;
   }

   public Bx(QI var1, double var2, double var4, double var6) {
      this(var1);
      this.p(var2, var4, var6);
   }

   public boolean q(Oz var1, float var2) {
      if (this.q(var1)) {
         return false;
      } else {
         if (!this.aNQ && !this.vR.bXF) {
            this.aXK = 0;
            if (this.aXK <= 0) {
               this.yo();
               if (!this.vR.bXF) {
                  this.vR.q((zk)null, this.aNZ, this.aNK, this.aOt, 6.0F, true);
               }
            }
         }

         return true;
      }
   }

   protected void t(HL var1) {
   }
}
