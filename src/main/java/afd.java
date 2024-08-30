import org.lwjgl.opengl.GL11;

public class afD {
   private final hS dse;

   public afD(hS var1) {
      this.dse = var1;
   }

   public void r(DD var1, int var2) {
      if (var1.bdJ == null && !var1.bdK) {
         var1.bdK = (boolean)(8231 & 1025);
         this.dse.Bn.w(e.q[635 & 2939 & -10251 & -10509] + var2 + q.q[12524 & 8333 & -28579 & -11201], (var1x) -> {
            var1.bdJ = var1x;
         });
      }

      if (var1.bdJ != null) {
         double var3 = M.cg.ce.af() ? var1.yb().auf() : (var1.hI() ? 1.0D : 0.0D);
         if (System.currentTimeMillis() > var1.xN()) {
            if (var1.hI()) {
               var1.aOu = (float)((double)var1.aOu - 0.08333333333333333D * 1.1280000000000001D);
            }

            if (var1.aOQ && !var1.aNG) {
               var1.aOu = (float)((double)var1.aOu + 0.32426470588235295D * 1.3877551020408163D);
            } else {
               var1.aOu = (float)((double)var1.aOu + 0.03333333333333333D * 1.5D);
            }

            var1.s(System.currentTimeMillis() + (-1820133360960087890L & 1820133360312582667L));
         }

         qk var5 = qk.pm();
         GL11.glPushMatrix();
         GL11.glScalef(1.2571429F * 0.875F, 5.0F * 0.22F, 1.1388888F * 0.96585375F);
         GL11.glTranslatef(0.0F, 0.11130137F * 1.1230769F, 0.051315792F * 2.4358974F);
         GL11.glTranslated(0.0D, 0.8450704225352113D * 0.0591666675483187D * var3, 0.19207316746072073D * 0.9111111111111111D * var3);
         GL11.glRotatef(2.5F * 36.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotated(0.4782608695652174D * 50.18181818181818D + 3.9583333333333335D * 1.5157894736842106D * var3 + Math.sin((double)var1.aOu / (3.72D * 1.075268817204301D)) * 0.7692307692307693D * 26.0D, 0.0D, 0.0D, 1.0D);
         GL11.glRotated(0.36538461538461536D * 41.05263157894737D * var3, 1.0D, 0.0D, 0.0D);
         GL11.glTranslatef(-0.17857143F * 0.7F, 0.18877551F * 0.6621622F, 0.07875F * 2.2857144F);
         GL11.glTranslatef(0.0F, 0.0F, 0.17910448F * -0.111666664F);
         this.dse.fJ().o(var1.bdJ);
         GL11.glRotatef(1.0487804F * 95.34884F, 0.0F, 1.0F, 0.0F);
         this.p(var5.pl());
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(7.5900006F * 0.14492753F, 2.5575001F * 0.43010753F, 2.3309524F * 0.47191012F);
         GL11.glTranslatef(0.0F, 0.12328768F * 1.0138888F, 1.4848485F * 0.08418367F);
         GL11.glTranslated(0.0D, 0.08796296427371325D * 0.5684210526315789D * var3, 0.45592104486728974D * 0.3838383838383838D * var3);
         GL11.glRotatef(0.37037036F * 243.00002F, 1.0F, 0.0F, 0.0F);
         GL11.glRotated(1.5818181818181818D * -15.172413793103448D - 1.4307692307692308D * 4.193548387096774D * var3 - Math.sin((double)var1.aOu / (3.183673469387755D * 1.2564102564102564D)) * 7.82608695652174D * 2.5555555555555554D, 0.0D, 0.0D, 1.0D);
         GL11.glRotated(0.5111111111111111D * 29.347826086956523D * var3, 1.0D, 0.0D, 0.0D);
         GL11.glTranslatef(0.0F, 0.027439026F * 4.5555553F, 1.1445783F * 0.15726316F);
         GL11.glTranslatef(0.0F, 0.0F, 0.9F * -0.04888889F);
         this.dse.fJ().o(var1.bdJ);
         GL11.glRotatef(191.51515F * 0.4177215F, 0.0F, 1.0F, 0.0F);
         this.p(var5.pl());
         GL11.glPopMatrix();
      }

   }

   private void p(qq var1) {
      qk var2 = qk.pm();
      GL11.glTranslated(0.0D, 0.0D, 0.0D);
      GL11.glEnable(23695418 & 1141942590);
      GL11.glTranslatef(1.0F, -0.04705883F * 2.125F, 1.2083334F * 0.08275862F);
      GL11.glScalef(0.27272728F * 6.875F, 2.4739583F * 0.75789475F, 1.0F);
      GL11.glRotatef(0.0F, 0.0F, 0.22222222F * 900.0F, 0.0F);
      GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(0.98275864F * -0.95394737F, 2.8709676F * -0.021769663F, 0.0F);
      GL11.glScaled(1.0D, 1.0D, 0.07446808510638298D * 9.4D);
      var1.q(39 & -9897, us.axH);
      var1.i(0.0D, 0.0D, 0.0D).e(1.0D, 1.0D).o(0.0F, 0.0F, 1.0F).pJ();
      var1.i(1.0D, 0.0D, 0.0D).e(0.0D, 1.0D).o(0.0F, 0.0F, 1.0F).pJ();
      var1.i(1.0D, 1.0D, 0.0D).e(0.0D, 0.0D).o(0.0F, 0.0F, 1.0F).pJ();
      var1.i(0.0D, 1.0D, 0.0D).e(1.0D, 0.0D).o(0.0F, 0.0F, 1.0F).pJ();
      var2.pn();
      var1.q(3143 & 16935, us.axH);
      var1.i(0.0D, 1.0D, 1.2763157894736843D * -0.061211340206185565D).e(1.0D, 0.0D).o(0.0F, 0.0F, 0.4918033F * -2.0333333F).pJ();
      var1.i(1.0D, 1.0D, -0.041666666666666664D * 1.875D).e(0.0D, 0.0D).o(0.0F, 0.0F, -0.50574714F * 1.9772727F).pJ();
      var1.i(1.0D, 0.0D, -0.044642857142857144D * 1.75D).e(0.0D, 1.0D).o(0.0F, 0.0F, -31.0F * 0.032258064F).pJ();
      var1.i(0.0D, 0.0D, -0.09057971014492754D * 0.8625D).e(1.0D, 1.0D).o(0.0F, 0.0F, -1.457627F * 0.68604654F).pJ();
      var2.pn();
      var1.q(-23385 & 4127, us.axH);

      for(int var3 = -7928 & 516; (float)var3 < 31.030304F * 1.03125F; ++var3) {
         float var4 = (float)var3 / (42.666668F * 0.75F);
         float var5 = 1.0F + -0.75F * 1.3333334F * var4 - 0.018229166F * 0.85714287F;
         var4 = var4 + 0.06451613F * 0.484375F;
         var1.i((double)var4, 1.0D, 0.5581395348837209D * -0.13997395833333334D).e((double)var5, 0.0D).o(1.0F, 0.0F, 0.0F).pJ();
         var1.i((double)var4, 1.0D, 0.0D).e((double)var5, 0.0D).o(1.0F, 0.0F, 0.0F).pJ();
         var1.i((double)var4, 0.0D, 0.0D).e((double)var5, 1.0D).o(1.0F, 0.0F, 0.0F).pJ();
         var1.i((double)var4, 0.0D, -0.10340073529411765D * 0.7555555555555555D).e((double)var5, 1.0D).o(1.0F, 0.0F, 0.0F).pJ();
      }

      var2.pn();
      var1.q(4239 & -32729, us.axH);

      for(int var6 = 17345 & 3104; (float)var6 < 0.44827586F * 71.38461F; ++var6) {
         float var8 = (float)var6 / (2.8333333F * 11.294118F);
         float var10 = 1.0F + 4.611111F * -0.21686746F * var8 - 0.019042969F * 0.82051283F;
         var8 = var8 + 0.010995371F * 2.8421052F;
         var1.i(0.0D, (double)var8, 0.0D).e(1.0D, (double)var10).o(0.0F, 1.0F, 0.0F).pJ();
         var1.i(1.0D, (double)var8, 0.0D).e(0.0D, (double)var10).o(0.0F, 1.0F, 0.0F).pJ();
         var1.i(1.0D, (double)var8, 0.6923076923076923D * -0.11284722222222222D).e(0.0D, (double)var10).o(0.0F, 1.0F, 0.0F).pJ();
         var1.i(0.0D, (double)var8, -0.13839285714285712D * 0.5645161290322581D).e(1.0D, (double)var10).o(0.0F, 1.0F, 0.0F).pJ();
      }

      var2.pn();
      GL11.glDisable(379686331 & 4231290);
   }
}
