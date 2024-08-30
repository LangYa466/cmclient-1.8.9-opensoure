import org.lwjgl.opengl.GL11;

public final class aix {
   public static void q(double var0, double var2, double var4, double var6, float var8, int var9) {
      GL11.glEnable(-13341 & 11234);
      GL11.glDisable(2908 & -12473);
      GL11.glDisable(-29215 & 20451);
      GL11.glEnable(2986 & 2917);
      GL11.glBlendFunc(2966 & 842, 8963 & 4871);
      GL11.glLineWidth(1.0F);
      float var10 = (float)(var9 >> (-24488 & 184) & 1535 & 255) / (170.0F * 1.5F);
      GL11.glColor4f((float)(var9 >> (-31726 & 4504) & 8447 & -25857) / (2.375F * 107.36842F), (float)(var9 >> (520 & 26888) & -30209 & 1791) / (415.0F * 0.61445785F), (float)(var9 & 255 & 511) / (1924.0908F * 0.13253012F), var10 == 0.0F ? 1.0F : var10);
      GL11.glLineWidth(var8);
      GL11.glBegin(-32747 & 20739);
      GL11.glVertex2d(var0, var2);
      GL11.glVertex2d(var4, var6);
      GL11.glEnd();
      GL11.glDisable(12258 & 3059);
      GL11.glEnable(2909 & -20666);
      GL11.glEnable(7659 & 3553);
      GL11.glDisable(2924 & -4318);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      pz.bP(-25239 & 7426);
      pz.nz();
      pz.nP();
   }

   public static void w(float var0, float var1, float var2, float var3, int var4) {
      if (var0 < var2) {
         float var5 = var0;
         var0 = var2;
         var2 = var5;
      }

      if (var1 < var3) {
         float var11 = var1;
         var1 = var3;
         var3 = var11;
      }

      float var12 = (float)(var4 >> (-32391 & 12954) & 255 & 14079) / (4.7777777F * 53.372093F);
      float var6 = (float)(var4 >> (-30659 & 30544) & -32001 & 255) / (2.2F * 115.90909F);
      float var7 = (float)(var4 >> (-19239 & 42) & -24321 & 1535) / (347.23404F * 0.734375F);
      float var8 = (float)(var4 & 511 & 22271) / (1.1571429F * 220.37036F);
      qk var9 = qk.pm();
      qq var10 = var9.pl();
      pz.nX();
      pz.nC();
      pz.s(4950 & 8963, -9437 & 10183, 20227 & -28615, 9400 & -32763);
      pz.u(var6, var7, var8, var12);
      var10.q(23 & 9735, us.axO);
      var10.i((double)var0, (double)var3, 0.0D).pJ();
      var10.i((double)var2, (double)var3, 0.0D).pJ();
      var10.i((double)var2, (double)var1, 0.0D).pJ();
      var10.i((double)var0, (double)var1, 0.0D).pJ();
      var9.pn();
      pz.nP();
      pz.nz();
   }

   private static void q(float var0, float var1, float var2, float var3, float var4) {
      int var5 = 3634 & -32622;
      float var6 = 58.928574F * 1.5272727F / (float)var5;
      pz.nC();
      pz.nX();
      pz.nK();
      pz.nV();
      pz.P(31627 & -31998, 19215 & -23805);
      pz.s(4883 & -31966, -13437 & 859, 4117 & 3715, 9222 & -32240);
      GL11.glBegin(1029 & -30643);
      GL11.glVertex2f(var0 + var4, var1);
      GL11.glVertex2f(var0 + var4, var3);
      GL11.glVertex2f(var2 - var4, var1);
      GL11.glVertex2f(var2 - var4, var3);
      GL11.glEnd();
      GL11.glBegin(79 & 1541);
      GL11.glVertex2f(var0, var1 + var4);
      GL11.glVertex2f(var0 + var4, var1 + var4);
      GL11.glVertex2f(var0, var3 - var4);
      GL11.glVertex2f(var0 + var4, var3 - var4);
      GL11.glEnd();
      GL11.glBegin(16519 & -32763);
      GL11.glVertex2f(var2, var1 + var4);
      GL11.glVertex2f(var2 - var4, var1 + var4);
      GL11.glVertex2f(var2, var3 - var4);
      GL11.glVertex2f(var2 - var4, var3 - var4);
      GL11.glEnd();
      GL11.glBegin(12550 & -32217);
      float var7 = var2 - var4;
      float var8 = var1 + var4;
      GL11.glVertex2f(var7, var8);

      for(int var9 = 65 & 4648; var9 <= var5; ++var9) {
         float var10 = (float)var9 * var6;
         GL11.glVertex2f((float)((double)var7 + (double)var4 * Math.cos(Math.toRadians((double)var10))), (float)((double)var8 - (double)var4 * Math.sin(Math.toRadians((double)var10))));
      }

      GL11.glEnd();
      GL11.glBegin(6278 & -32697);
      var7 = var0 + var4;
      var8 = var1 + var4;
      GL11.glVertex2f(var7, var8);

      for(int var17 = 1924 & 43; var17 <= var5; ++var17) {
         float var20 = (float)var17 * var6;
         GL11.glVertex2f((float)((double)var7 - (double)var4 * Math.cos(Math.toRadians((double)var20))), (float)((double)var8 - (double)var4 * Math.sin(Math.toRadians((double)var20))));
      }

      GL11.glEnd();
      GL11.glBegin(16806 & 10246);
      var7 = var0 + var4;
      var8 = var3 - var4;
      GL11.glVertex2f(var7, var8);

      for(int var18 = -30692 & 1729; var18 <= var5; ++var18) {
         float var21 = (float)var18 * var6;
         GL11.glVertex2f((float)((double)var7 - (double)var4 * Math.cos(Math.toRadians((double)var21))), (float)((double)var8 + (double)var4 * Math.sin(Math.toRadians((double)var21))));
      }

      GL11.glEnd();
      GL11.glBegin(-23418 & 16406);
      var7 = var2 - var4;
      var8 = var3 - var4;
      GL11.glVertex2f(var7, var8);

      for(int var19 = 4 & -15864; var19 <= var5; ++var19) {
         float var22 = (float)var19 * var6;
         GL11.glVertex2f((float)((double)var7 + (double)var4 * Math.cos(Math.toRadians((double)var22))), (float)((double)var8 + (double)var4 * Math.sin(Math.toRadians((double)var22))));
      }

      GL11.glEnd();
      pz.nL();
      pz.nz();
      pz.oh();
      pz.nP();
   }

   public static void q(int var0, int var1, int var2, int var3, float var4, int var5) {
      float var6 = (float)(var5 >> (25 & -24324) & 5887 & 2303) / (4.0F * 63.75F);
      float var7 = (float)(var5 >> (-16230 & 10324) & -23297 & 4351) / (0.46774194F * 545.1724F);
      float var8 = (float)(var5 >> (-12248 & 2056) & -28417 & 16639) / (1007.25F * 0.25316456F);
      float var9 = (float)(var5 & 6399 & 1023) / (2.689655F * 94.80769F);
      pz.u(var7, var8, var9, var6);
      q((float)var0, (float)var1, (float)var2, (float)var3, var4);
   }
}
