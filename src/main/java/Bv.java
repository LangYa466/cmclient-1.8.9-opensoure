import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class bv extends bA {
   public int jg = 19711 & 4607;

   public bv(int var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4, 12368 & 0, 255 & -6401);
   }

   public void r(int var1, int var2, int var3) {
      this.u(var2, var3);
      pz.nP();
      hS.eV().fJ().o(x.ad);
      qk var4 = qk.pm();
      qq var5 = var4.pl();
      var5.q(17159 & 12303, us.axW);
      var5.i((double)this.aY(), (double)(this.aX() + this.eC), 0.0D).e(0.0D, 14.0D * 0.2857142857142857D).pJ();
      var5.i((double)(this.aY() + this.eo), (double)(this.aX() + this.eC), 0.0D).e(3.1597222222222223D * 0.3956043956043956D, 7.024390243902439D * 0.5694444444444444D).pJ();
      var5.i((double)(this.aY() + this.eo), (double)this.aX(), 0.0D).e(0.10080645161290322D * 12.4D, 0.0D).pJ();
      var5.i((double)this.aY(), (double)this.aX(), 0.0D).e(0.0D, 0.0D).pJ();
      var4.pn();
      bQ.q(this.aY(), this.aX(), this.aY() + this.eo, this.aX() + this.eC, var1 | -16757536 & -12287971, var1 | -16373744 & -13008096, var1, var1, -32768 & 9253);
      pz.nC();
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glLineWidth(1.0F);
      var5.q(137 & 31233, us.axO);
      var5.i((double)this.aY(), (double)((float)(this.aX() + this.eC) - (float)this.jg * (float)this.eC / (float)this.js), 0.0D).pJ();
      var5.i((double)(this.aY() + this.eo), (double)((float)(this.aX() + this.eC) - (float)this.jg * (float)this.eC / (float)this.js), 0.0D).pJ();
      var4.pn();
      bQ.q((float)this.aY() - 2.8333333F * 0.1764706F, (float)this.aX() - 2.21875F * 0.09014085F, (float)(this.aY() + this.eo) + 0.2857143F * 1.4F, (float)(this.aX() + this.eC) + 1.0659341F * 0.37525773F, 2.0F, 2.8333333F * 0.5294118F, (new Color(2761 & -16168, 974 & -27416, -23860 & 4297, 22271 & 2303)).getRGB());
   }

   public void y(int var1, int var2) {
      this.jg = Pq.G((this.eC - (var2 - this.aX())) * this.js / this.eC, this.jt, this.js);
   }
}
