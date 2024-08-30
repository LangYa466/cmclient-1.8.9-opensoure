public class om extends nV {
   private tS ach;
   private int aci;
   private static final uu acj = (new uu()).q(us.axS).q(us.axJ).q(us.axF).q(us.axT).q(us.axX).q(us.axP);
   private static final PJ ack = new PJ(p.q[1431 & -32298]);
   private float acl;
   private int acm;

   public int mv() {
      return 3;
   }

   public void hv() {
      this.aOf = this.aNZ;
      this.aNH = this.aNK;
      this.aNW = this.aOt;
      ++this.aci;
      if (this.aci == this.acm) {
         this.yo();
      }

   }

   protected om(tS var1, QI var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      super(var2, var3, var5, var7, 0.0D, 0.0D, 0.0D);
      this.ach = var1;
      this.acm = 6 + this.oF.nextInt(4);
      this.abD = this.abN = this.abE = this.oF.nextFloat() * 0.6F + 0.4F;
      this.acl = 1.0F - (float)var9 * 0.5F;
   }

   public int I(float var1) {
      return 61680;
   }

   public void q(qq var1, zk var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = (int)(((float)this.aci + var3) * 15.0F / (float)this.acm);
      if (var9 <= 15) {
         this.ach.o(ack);
         float var10 = (float)(var9 % 4) / 4.0F;
         float var11 = var10 + 0.24975F;
         float var12 = (float)(var9 / 4) / 4.0F;
         float var13 = var12 + 0.24975F;
         float var14 = 2.0F * this.acl;
         float var15 = (float)(this.aOf + (this.aNZ - this.aOf) * (double)var3 - abL);
         float var16 = (float)(this.aNH + (this.aNK - this.aNH) * (double)var3 - abI);
         float var17 = (float)(this.aNW + (this.aOt - this.aNW) * (double)var3 - abF);
         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
         pz.nx();
         qh.pj();
         var1.q(7, acj);
         var1.i((double)(var15 - var4 * var14 - var7 * var14), (double)(var16 - var5 * var14), (double)(var17 - var6 * var14 - var8 * var14)).e((double)var11, (double)var13).p(this.abD, this.abN, this.abE, 1.0F).ad(0, 240).o(0.0F, 1.0F, 0.0F).pJ();
         var1.i((double)(var15 - var4 * var14 + var7 * var14), (double)(var16 + var5 * var14), (double)(var17 - var6 * var14 + var8 * var14)).e((double)var11, (double)var12).p(this.abD, this.abN, this.abE, 1.0F).ad(0, 240).o(0.0F, 1.0F, 0.0F).pJ();
         var1.i((double)(var15 + var4 * var14 + var7 * var14), (double)(var16 + var5 * var14), (double)(var17 + var6 * var14 + var8 * var14)).e((double)var10, (double)var12).p(this.abD, this.abN, this.abE, 1.0F).ad(0, 240).o(0.0F, 1.0F, 0.0F).pJ();
         var1.i((double)(var15 + var4 * var14 - var7 * var14), (double)(var16 - var5 * var14), (double)(var17 + var6 * var14 - var8 * var14)).e((double)var10, (double)var13).p(this.abD, this.abN, this.abE, 1.0F).ad(0, 240).o(0.0F, 1.0F, 0.0F).pJ();
         qk.pm().pn();
         pz.oe();
      }

   }
}
