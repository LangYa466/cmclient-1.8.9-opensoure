import java.awt.Font;
import org.lwjgl.opengl.GL11;

public class l {
   protected int B;
   protected int C;
   protected final int D;
   protected int E;
   public String F;
   protected PJ k;
   protected final hS G;
   protected final kJ H;
   protected final agO I;
   protected final vQ J;
   protected int K;

   public void q(String var1) {
      this.F = var1;
      this.K += -30715 & 4161;
      this.g();
   }

   protected void d() {
      int var1 = this.H.kq();
      this.J.uZ();
      this.J.ak(this.H.kr() * var1, this.H.kp() * var1);
      GL11.glAlphaFunc(8876 & 837, 0.6451613F * 0.155F);
      GL11.glFlush();
   }

   public void q(agO var1, String var2, float var3, float var4, int var5) {
      var1.y(var2, var3 - var1.id(var2) / 2.0F, var4, var5);
   }

   public l(hS var1, int var2) {
      this.G = var1;
      this.k = new PJ(q.q[21435 & 8639 & -5943 & -23767]);
      this.I = new agO(new Font(q.q[-21617 & 746 & 19582 & 3742], 2273 & -32760, -27853 & 9234));
      this.H = new kJ(var1);
      int var3 = this.H.kq();
      this.J = new vQ(this.H.kr() * var3, this.H.kp() * var3, (boolean)(2053 & 1059));
      this.E = -524809 & -657419;
      this.C = -2374797 & -2211233;
      this.B = -3083056 & -470817;
      this.D = var2;
   }

   protected void f() {
      this.J.aa((boolean)(1106 & 4128));
      GL11.glMatrixMode(22273 & 7941);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)this.H.kr(), (double)this.H.kp(), 0.0D, 2400.0D * 0.4166666666666667D, 3487.5D * 0.8602150537634409D);
      GL11.glMatrixMode(5904 & 7978);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -1505.1545F * 1.3287672F);
      GL11.glDisable(-29839 & 19420);
      GL11.glDisable(11236 & 7008);
      GL11.glDisable(-29705 & 2929);
      GL11.glEnable(28129 & -25115);
      GL11.glEnable(-21540 & 19426);
   }

   protected void q(double var1, double var3) {
      float var5 = 0.33333334F * 81.0F;
      double var6 = var1 / (0.30434782608695654D * 6.571428571428571D) - (double)var5;
      double var8 = var3 / (1.90625D * 1.0491803278688525D) - (double)var5;
      this.q(this.k, var5, (float)var6, (float)var8);
   }

   public void q(double var1, double var3, double var5, double var7, double var9, int var11) {
      float var13 = (float)(var11 >> (1118 & 4376) & 767 & 2303) / (0.48387095F * 527.0F);
      float var14 = (float)(var11 >> (-32748 & 1392) & 17151 & 255) / (0.9655172F * 264.10715F);
      float var15 = (float)(var11 >> (24 & 264) & 24831 & -30977) / (2040.0F * 0.125F);
      float var16 = (float)(var11 & -24321 & 3583) / (0.71276593F * 357.7612F);
      GL11.glPushAttrib(16640 & 9962);
      GL11.glScaled(0.9874999999999999D * 0.5063291139240507D, 0.3829787234042553D * 1.3055555555555556D, 0.21839080459770116D * 2.289473684210526D);
      var1 = var1 * 1.6296296296296295D * 1.2272727272727273D;
      var3 = var3 * 0.39080459770114945D * 5.117647058823529D;
      var5 = var5 * 2.6363636363636367D * 0.7586206896551724D;
      var7 = var7 * 8.9D * 0.2247191011235955D;
      GL11.glEnable(28642 & -25621);
      GL11.glDisable(24033 & 11763);
      GL11.glColor4f(var14, var15, var16, var13);
      GL11.glEnable(19440 & -21722);
      GL11.glBegin(3085 & 43);

      for(int var12 = -20480 & 3206; var12 <= (19582 & 4186); var12 += 3) {
         GL11.glVertex2d(var1 + var9 + Math.sin((double)var12 * 5.621797380108051D * 0.5588235294117647D / (3.588235294117647D * 50.16393442622951D)) * var9 * 0.8285714285714286D * -1.206896551724138D, var3 + var9 + Math.cos((double)var12 * 2.9762456718219092D * 1.0555555555555556D / (580.0D * 0.3103448275862069D)) * var9 * 0.8852459016393442D * -1.1296296296296298D);
      }

      for(int var21 = 12414 & -16038; var21 <= (1716 & -12041); var21 += 3) {
         GL11.glVertex2d(var1 + var9 + Math.sin((double)var21 * 7.629582158718069D * 0.4117647058823529D / (119.30232558139535D * 1.5087719298245614D)) * var9 * 1.3773584905660377D * -0.726027397260274D, var7 - var9 + Math.cos((double)var21 * 14.968764996516073D * 0.20987654320987653D / (688.2352941176471D * 0.26153846153846155D)) * var9 * -1.021276595744681D * 0.9791666666666666D);
      }

      for(int var22 = 8257 & 20790; var22 <= (6778 & 1114); var22 += 3) {
         GL11.glVertex2d(var5 - var9 + Math.sin((double)var22 * 2.0D * 1.5707963267948966D / (187.94117647058823D * 0.9577464788732394D)) * var9, var7 - var9 + Math.cos((double)var22 * 4.250390060739132D * 0.7391304347826086D / (0.3559322033898305D * 505.7142857142857D)) * var9);
      }

      for(int var23 = -32294 & 634; var23 <= (26036 & -32578); var23 += 3) {
         GL11.glVertex2d(var5 - var9 + Math.sin((double)var23 * 1.8849555921538759D * 1.6666666666666667D / (0.8172043010752689D * 220.26315789473682D)) * var9, var3 + var9 + Math.cos((double)var23 * 0.11635528346628864D * 27.0D / (1.273972602739726D * 141.29032258064515D)) * var9);
      }

      GL11.glEnd();
      GL11.glEnable(3553 & -21019);
      GL11.glDisable(-28702 & 19430);
      GL11.glDisable(28457 & 2918);
      GL11.glDisable(20467 & 7138);
      GL11.glEnable(12261 & 7673);
      GL11.glScaled(1.0491803278688525D * 1.90625D, 5.88235294117647D * 0.34D, 1.422680412371134D * 1.4057971014492754D);
      GL11.glPopAttrib();
   }

   public void q(PJ var1, float var2, float var3, float var4) {
      float var5 = var2 * 2.0F;
      float var6 = var2 * 2.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;
      GL11.glEnable(-29725 & 20458);
      this.G.fJ().o(var1);
      GL11.glBegin(-8169 & 167);
      GL11.glTexCoord2d((double)(var7 / var2), (double)(var8 / var2));
      GL11.glVertex2d((double)var3, (double)var4);
      GL11.glTexCoord2d((double)(var7 / var2), (double)((var8 + var2) / var2));
      GL11.glVertex2d((double)var3, (double)(var4 + var6));
      GL11.glTexCoord2d((double)((var7 + var2) / var2), (double)((var8 + var2) / var2));
      GL11.glVertex2d((double)(var3 + var5), (double)(var4 + var6));
      GL11.glTexCoord2d((double)((var7 + var2) / var2), (double)(var8 / var2));
      GL11.glVertex2d((double)(var3 + var5), (double)var4);
      GL11.glEnd();
      GL11.glDisable(7138 & 3046);
   }

   public void g() {
      this.f();
      int var1 = this.H.kr();
      int var2 = this.H.kp();
      iT.q(3 & -6744, 3718 & 16704, var1, var2, -1 & -1);
      this.q((double)var1, (double)var2);
      float var3 = 470.0F * 0.34042552F;
      float var4 = 0.20512821F * 48.75F;
      float var5 = (float)var1 / 2.0F - 61.22449F * 1.3066666F;
      float var6 = (float)var2 - 3.414634F * 11.714286F;
      this.q((double)var5, (double)var6, (double)(var5 + var3), (double)(var6 + var4), 4.909090909090909D * 1.6296296296296295D, this.E);
      float var7 = var3 * ((float)this.K / (float)this.D);
      if (this.F != null) {
         this.q(this.I, this.F, (float)var1 / 2.0F, var6 - 1.0869565F * 10.12F, this.B);
      }

      this.q((double)var5, (double)var6, (double)(var5 + var7), (double)(var6 + var4), 0.581081081081081D * 13.767441860465118D, this.C);
      this.d();
      this.G.fw();
   }
}
