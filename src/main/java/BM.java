import java.awt.Color;
import java.util.function.Consumer;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class bm extends bj {
   private final PJ iF;
   private final E iG;

   public void t(int var1, int var2, float var3) {
      if (this.aM) {
         float var4 = ((aX)this.iG).hA.br();
         int var5 = (int)((float)((aX)this.iG).ab() * var4);
         int var6 = (int)((float)((aX)this.iG).ac() * var4);
         float var7 = (float)bM.w(this.iG, (int)this.iG.P(), var5);
         float var8 = (float)bM.q(this.iG, (int)this.iG.N(), var6);
         this.hZ = (boolean)((float)var1 >= var7 && (float)var2 >= var8 && (float)var1 <= var7 + (float)var5 && (float)var2 <= var8 + (float)var6 ? 1 & -25057 : 20492 & 144);
         if (this.hZ) {
            bD.jB = this.iG;
         }

         GL11.glPushMatrix();
         bQ.w(var7, var8, var7 + (float)var5, var8 + (float)var6, this.hZ ? x.q(8246 & 179) : (new Color(-24516 & 2068, 8276 & 4628, 29 & -21196, 10546 & 4730)).getRGB());
         bQ.q(var7, var8, var7 + (float)var5, var8 + (float)var6, this.hZ ? x.q(16639 & 3583) : (new Color(384 & -28604, -32647 & 260, 22576 & 256, -25345 & 1023)).getRGB());
         if (var4 != 1.0F) {
            GL11.glTranslatef(var7, var8, 0.0F);
            GL11.glScalef(var4, var4, 0.0F);
            GL11.glTranslatef(-var7, -var8, 0.0F);
         }

         ((aX)this.iG).q(var7, var8);
         if (!this.iG.aP.isEmpty() && this.hZ) {
            int var9 = var6 > (78 & -31861) ? 16970 & -28662 : -24532 & 22282;
            pz.nX();
            bQ.B((new Color(-30694 & 20545, -28120 & 1174, -26416 & 24610, -30026 & 471)).getRGB());
            this.it.fJ().o(this.iF);
            bQ.q(var7 + (float)var5 - (float)var9 + 1.0F, var8 + (float)var6 - (float)var9 + 1.0F, 0.0F, 0.0F, var9, var9, (float)var9, (float)var9);
            if ((float)var1 > var7 + (float)var5 - (float)var9 && (float)var1 < var7 + (float)var5 && (float)var2 > var8 + (float)var6 - (float)var9 && (float)var2 < var8 + (float)var6) {
               bQ.B(x.q(2815 & -3841));
               if (Mouse.isButtonDown(-23412 & 49)) {
                  this.iG.L();
               }
            } else {
               pz.u(1.0F, 1.0F, 1.0F, 1.0F);
            }

            this.it.fJ().o(this.iF);
            bQ.q(var7 + (float)var5 - (float)var9, var8 + (float)var6 - (float)var9, 0.0F, 0.0F, var9, var9, (float)var9, (float)var9);
         }

         GL11.glPopMatrix();
      }

   }

   public bm(E var1, Consumer var2) {
      super(3843 & 8264, -13789 & 8320, -32736 & 7451, 97 & -12282, var2);
      this.iG = var1;
      this.iF = new PJ(a.q[14848 & -13762 & 9436 & 9879]);
   }
}
