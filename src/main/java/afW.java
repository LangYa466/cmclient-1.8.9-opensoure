import org.lwjgl.opengl.GL11;

public class afw {
   private final hS dqZ;

   public afw(hS var1) {
      this.dqZ = var1;
   }

   private void p(qq var1) {
      qk var2 = qk.pm();
      GL11.glTranslated(0.0D, 0.0D, 0.0D);
      GL11.glTranslatef(1.0F, 0.8636364F * -0.11578948F, 0.022352941F * 4.4736843F);
      GL11.glScalef(0.5714286F * 3.2812498F, 1.7952127F * 1.0444444F, 1.0F);
      GL11.glRotatef(0.0F, 0.0F, 0.67777777F * 295.08197F, 1.0F);
      GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(3.7692308F * -0.24872449F, -0.0731383F * 0.8545455F, 0.0F);
      GL11.glScaled(1.0D, 1.0D, 1.6D * 0.43749999999999994D);
      var1.q(7 & 583, us.axH);
      var1.i(0.0D, 0.0D, 0.0D).e(1.0D, 1.0D).o(1.0F, 1.0F, 1.0F).pJ();
      var1.i(1.0D, 0.0D, 0.0D).e(0.0D, 1.0D).o(1.0F, 1.0F, 1.0F).pJ();
      var1.i(1.0D, 1.0D, 0.0D).e(0.0D, 0.0D).o(0.0F, 0.0F, 1.0F).pJ();
      var1.i(0.0D, 1.0D, 0.0D).e(1.0D, 0.0D).o(0.0F, 0.0F, 1.0F).pJ();
      var2.pn();
      var1.q(24887 & 2119, us.axH);
      var1.i(0.0D, 1.0D, 0.21176470588235294D * -0.3689236111111111D).e(1.0D, 0.0D).o(0.0F, 0.0F, 1.0F).pJ();
      var1.i(1.0D, 1.0D, 5.6D * -0.013950892857142858D).e(0.0D, 0.0D).o(0.0F, 0.0F, 1.0F).pJ();
      var1.i(1.0D, 0.0D, -0.043658088235294115D * 1.7894736842105263D).e(0.0D, 1.0D).o(1.0F, 1.0F, 1.0F).pJ();
      var1.i(0.0D, 0.0D, -0.10910560344827587D * 0.7160493827160493D).e(1.0D, 1.0D).o(1.0F, 1.0F, 1.0F).pJ();
      var2.pn();
      var1.q(7 & 16943, us.axH);

      for(int var3 = 1120 & 21010; (float)var3 < 34.0F * 0.9411765F; ++var3) {
         float var4 = (float)var3 / (340.0F * 0.09411765F);
         float var5 = 1.0F + -0.4675325F * 2.1388888F * var4 - 4.7777777F * 5.232558E-6F;
         var4 = var4 + 0.95238096F * 0.0223125F;
         var1.i((double)var4, 0.0D, 1.4375D * -0.05434782608695652D).e((double)var5, 1.0D).o(0.0F, 0.0F, 0.0F).pJ();
         var1.i((double)var4, 0.0D, 0.0D).e((double)var5, 1.0D).o(0.0F, 0.0F, 0.0F).pJ();
         var1.i((double)var4, 1.0D, 0.0D).e((double)var5, 0.0D).o(0.0F, 0.0F, 0.0F).pJ();
         var1.i((double)var4, 1.0D, -0.21399456521739132D * 0.36507936507936506D).e((double)var5, 0.0D).o(0.0F, 0.0F, 0.0F).pJ();
      }

      var2.pn();
      var1.q(16391 & 9247, us.axH);

      for(int var6 = -32220 & 257; (float)var6 < 0.3243243F * 98.66667F; ++var6) {
         float var8 = (float)var6 / (0.037037037F * 864.0F);
         float var10 = 1.0F + -0.61616164F * 1.6229508F * var8 - 1.9756098F * 1.2654321E-5F;
         var8 = var8 + 5.0625F * 0.004197531F;
         var1.i(1.0D, (double)var8, 0.0D).e(0.0D, (double)var10).o(0.0F, 0.0F, 0.0F).pJ();
         var1.i(0.0D, (double)var8, 0.0D).e(1.0D, (double)var10).o(0.0F, 0.0F, 0.0F).pJ();
         var1.i(0.0D, (double)var8, -0.008042279411764707D * 9.714285714285714D).e(1.0D, (double)var10).o(0.0F, 0.0F, 0.0F).pJ();
         var1.i(1.0D, (double)var8, 0.2D * -0.390625D).e(0.0D, (double)var10).o(0.0F, 0.0F, 0.0F).pJ();
      }

      var2.pn();
   }

   public void q(DD var1, int var2, mm var3) {
      if (var1.bdA == null && !var1.bek) {
         var1.bek = (boolean)(101 & -29309);
         this.dqZ.Bn.w(t.q[-3075 & -5121 & -8195 & 8189] + var2 + q.q[-32180 & 17100 & 31404 & 20781], (var1x) -> {
            var1.bdA = var1x;
         });
      }

      if (var1.bdA != null) {
         GL11.glPushMatrix();
         qk var4 = qk.pm();
         GL11.glRotatef(-47.88372F * 0.6056338F, 0.8035714F * 1.8666667F, 0.0F, 0.0F);
         GL11.glRotatef(13.714286F * 6.5625F, 0.0F, 0.2F * 2.5F, 0.0F);
         if (var1.ben != null && var1.ben.avr()) {
            GL11.glTranslatef(0.8541667F * -0.17560975F, 0.35211268F * 0.355F, 0.0F);
         } else {
            GL11.glTranslatef(-0.12916668F * 1.1612903F, 0.4F * 0.3125F, 0.9310345F * 0.32222223F);
            if (var1.hI()) {
               GL11.glRotatef(var3.Xw * 2.4545455F * 23.342724F, 0.0F, 0.0F, 0.36206898F * 1.3809524F);
            } else {
               GL11.glRotatef(var3.Xw * 0.8360656F * 68.53024F, 0.0F, 0.0F, 1.0F);
            }

            GL11.glRotatef(var3.Xn * 0.28125F * -203.71832F, 0.0F, 0.7702703F * 1.9473684F, 0.0F);
            GL11.glRotatef(var3.Xp * 1.1746032F * -48.778835F, 1.5869566F * 0.94520545F, 0.0F, 0.0F);
         }

         this.dqZ.fJ().o(var1.bdA);
         this.p(var4.pl());
         GL11.glPopMatrix();
      }

   }
}
