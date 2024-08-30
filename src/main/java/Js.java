import org.lwjgl.opengl.GL11;

public class js extends kf {
   private final f JF = new f(4000L);
   private final PJ JG = new PJ(t.q[28414 & 702]);
   private final PJ JH = new PJ(o.q[-23953 & 22383]);

   public void o() {
      this.Mt.clear();
      byte var1 = -16;
      this.Mt.add(new iU(1, this.eo / 2 - 100, this.eC / 4 + 120 + var1, uI.q(p.q[3491 & 4775])));
      if (!this.G.fS()) {
         ((iU)this.Mt.get(0)).iX = uI.q(p.q[-28700 & 28853]);
      }

      this.Mt.add(new iU(4, this.eo / 2 - 100, this.eC / 4 + 24 + var1, uI.q(p.q[10405 & 437])));
      this.Mt.add(new iU(0, this.eo / 2 - 100, this.eC / 4 + 96 + var1, 98, 20, uI.q(p.q[16550 & 679])));
      boolean var2 = this.G.fp() && !this.G.fQ().Qh();
      this.Mt.add(new iU(7, this.eo / 2 + 2, this.eC / 4 + 96 + var1, 98, 20, var2 ? uI.q(p.q[17335 & -29521]) : uI.q(p.q[1208 & 4777])));
      this.Mt.add(new iU(5, this.eo / 2 - 100, this.eC / 4 + 48 + var1, 98, 20, uI.q(u.q[-32379 & 5309])));
      this.Mt.add(new iU(6, this.eo / 2 + 2, this.eC / 4 + 48 + var1, 98, 20, uI.q(e.q[7039 & 927])));
      this.Mt.add(new iU(8, this.eo / 2 - 100, this.eC / 4 + 72 + var1, uI.q(p.q[9449 & 4541])));
   }

   protected void q(iU var1) {
      switch(var1.aq) {
      case 0:
         this.G.r(new jM(this, this.G.Br));
         break;
      case 1:
         boolean var2 = this.G.fS();
         var1.aM = false;
         this.G.Cg.lW();
         this.G.q((mP)null);
         this.G.r((kf)(var2 ? new k() : new jI(new k())));
         this.G.Bn.atM().q(new agq());
      case 2:
      case 3:
      default:
         break;
      case 4:
         this.G.r((kf)null);
         this.G.fC();
         break;
      case 5:
         this.G.r(new kR(this, this.G.CM.hw()));
         break;
      case 6:
         this.G.r(new kS(this, this.G.CM.hw()));
         break;
      case 7:
         boolean var3 = this.G.fp() && !this.G.fQ().Qh();
         if (var3) {
            this.G.r(new kt(this));
         } else {
            this.G.r(new bF((kf)null));
         }
         break;
      case 8:
         this.G.r(new jI((kf)null));
      }

   }

   public void q(int var1, int var2, float var3) {
      this.jA();
      if (this.G.Bn.atS().br.af()) {
         this.o((double)this.eo);
      } else {
         this.w(this.CB, uI.q(p.q[9195 & 19626]), this.eo / 2, 40, 16777215);
      }

      super.q(var1, var2, var3);
   }

   public void p() {
      super.p();
   }

   private void o(double var1) {
      if (!this.JF.e()) {
         this.JF.w();
         this.JF.u();
      }

      float var3 = 18.0F;
      double var4 = var1 / 2.0D - (double)var3;
      double var6 = this.Mt.size() > 2 ? (double)((float)((iU)this.Mt.get(1)).hF - var3 - 32.0F) : -100.0D;
      GL11.glPushMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glTranslatef((float)var4, (float)var6, 1.0F);
      GL11.glTranslatef(var3, var3, var3);
      GL11.glRotatef(180.0F * this.JF.y(), 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(-var3, -var3, -var3);
      z.w(this.JH, var3, 0.0F, 0.0F);
      GL11.glPopMatrix();
      z.w(this.JG, var3, (float)var4, (float)var6);
   }
}
