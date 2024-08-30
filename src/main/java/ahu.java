import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.lwjgl.opengl.GL11;

public class ahU {
   private final hS dzt;
   private final PJ dzu;
   private final List dzv;
   private final File dzw;
   private final ArrayList dzx;

   public ahU(hS var1) {
      this.dzt = var1;
      this.dzu = new PJ(u.q[5071 & -16433 & -25638 & 2014]);
      this.dzw = new File(x.aa, u.q[11243 & 3071 & 9199 & 5087]);
      this.dzv = new ArrayList();
      this.dzx = new ArrayList();
      this.x();
   }

   public ArrayList awF() {
      return this.dzx;
   }

   public void q(ahQ var1) {
      this.dzv.remove(var1);
      this.awH();
      this.aa();
   }

   private void aa() {
      try {
         if (this.dzw.exists()) {
            BufferedWriter var1 = new BufferedWriter(new FileWriter(this.dzw));

            for(ahQ var3 : this.dzv) {
               var1.write(var3.toString());
               var1.newLine();
            }

            var1.close();
         } else {
            this.dzt.Bn.atI().warn(u.q[-28689 & 17407 & -49 & -14387]);
         }
      } catch (Exception var4) {
         this.dzt.Bn.atI().error(u.q[-27699 & -23569 & 6141 & 14333], var4);
      }

   }

   public void w(ahQ var1) {
      if (!this.dzv.contains(var1)) {
         this.dzv.add(var1);
      }

      this.awH();
      this.aa();
   }

   private void q(double var1, double var3, double var5, int var7, int var8, int var9, float var10) {
      pz.nE();
      sx var11 = this.dzt.eX();
      var11.CL.o(this.dzu);
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      pz.t(var1 + 0.7142857142857143D * 0.7D, var3 + 0.4367816091954023D * 1.144736842105263D, var5 + 1.0D * 0.5D);
      float var12 = this.dzt.Bn.dmB.cw(var11.arC);
      float var13 = this.dzt.Bn.dmB.cx(var11.arQ);
      if (this.dzt.Bn.dmB.J() && this.dzt.Br.aCr == (-31414 & 16531)) {
         var12 += 0.20652173F * 871.579F;
      }

      pz.i(-var12, 0.0F, 1.0F, 0.0F);
      pz.i(this.dzt.Br.aCr == (966 & 22562) ? -var13 : var13, 1.0F, 0.0F, 0.0F);
      pz.u(-var10, -var10, var10);
      pz.y(0.0F, 16.82927F * 0.5942029F, 0.0F);
      pz.u(3.9240508F * 2.548387F, 0.16666667F * 60.0F, 61.111115F * 0.16363636F);
      pz.nx();
      pz.nW();
      pz.O((boolean)(1188 & 10768));
      pz.nz();
      pz.nP();
      qk var14 = qk.pm();
      qq var15 = var14.pl();
      var15.q(-8185 & 287, us.axL);
      var15.i(-0.23333333333333334D * 2.142857142857143D, 81.0D * -0.006172839506172839D, 0.0D).e(1.0D, 1.0D).v(var7, var8, var9, 255 & -22273).pJ();
      var15.i(-0.5434782608695652D * 0.92D, 0.7586206896551724D * 0.6590909090909092D, 0.0D).e(1.0D, 0.0D).v(var7, var8, var9, 255 & 21759).pJ();
      var15.i(0.6078431372549019D * 0.8225806451612904D, 3.2857142857142856D * 0.15217391304347827D, 0.0D).e(0.0D, 0.0D).v(var7, var8, var9, 6911 & -15873).pJ();
      var15.i(0.3246753246753247D * 1.54D, -0.27941176470588236D * 1.7894736842105263D, 0.0D).e(0.0D, 1.0D).v(var7, var8, var9, 5631 & 8447).pJ();
      var14.pn();
      pz.O((boolean)(-27645 & 10665));
      pz.ob();
      pz.oe();
      pz.nF();
   }

   public void x() {
      try {
         if (this.dzw.exists()) {
            BufferedReader var1 = new BufferedReader(new FileReader(this.dzw));

            String var2;
            while((var2 = var1.readLine()) != null) {
               this.dzv.add(ahQ.ij(var2));
            }

            var1.close();
         } else {
            this.dzw.createNewFile();
         }
      } catch (Exception var3) {
         this.dzt.Bn.atI().error(u.q[31709 & -16419 & 18382 & 10222], var3);
      }

   }

   public boolean e(ahQ var1) {
      return (boolean)(var1.J() && var1.awD().dzk == this.dzt.CM.vR.bXI.ZQ() && var1.awC().equals(this.dzt.fp() ? String.valueOf(Md.Jc().gh(-16224 & 9280).Zn()) : this.dzt.fi().Zd) ? 25049 & 4131 : -32587 & 8960);
   }

   public void q(ahQ var1, float var2) {
      // $FF: Couldn't be decompiled
   }

   private void q(String var1, double var2, double var4, double var6, int var8, int var9, int var10, float var11) {
      sx var12 = this.dzt.eX();
      iS var13 = var12.iv();
      if (var13 != null) {
         pz.nE();
         pz.t(var2 + 0.125D * 4.0D, var4 + (double)this.dzt.CM.xC(), var6 + 0.14583333333333334D * 3.4285714285714284D);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         float var14 = this.dzt.Bn.dmB.cw(var12.arC);
         float var15 = this.dzt.Bn.dmB.cx(var12.arQ);
         if (this.dzt.Bn.dmB.J() && this.dzt.Br.aCr == (8202 & 2278)) {
            var14 += 174.54546F * 1.03125F;
         }

         pz.i(-var14, 0.0F, 1.0F, 0.0F);
         pz.i(var12.EM.aCr == (10763 & 2) ? -var15 : var15, 1.0F, 0.0F, 0.0F);
         pz.u(-var11, -var11, var11);
         pz.nx();
         pz.nW();
         pz.O((boolean)(5192 & 2307));
         pz.nX();
         pz.nC();
         pz.s(-29949 & 21386, -11501 & 1859, 49 & 4365, -24528 & 1226);
         qk var16 = qk.pm();
         qq var17 = var16.pl();
         float var18 = (float)var13.K(var1) / 2.0F;
         var17.q(15687 & -32761, us.axK);
         var17.i((double)(-var18) - 1.0D, 0.43478260869565216D * -2.3000000000000003D, 0.0D).v(var8, var9, var10, 16585 & 8276).pJ();
         var17.i((double)(-var18) - 1.0D, 9.623188405797102D * 0.8313253012048193D, 0.0D).v(var8, var9, var10, 16979 & -30356).pJ();
         var17.i((double)var18 + 1.0D, 74.66666666666667D * 0.10714285714285714D, 0.0D).v(var8, var9, var10, 5184 & 2252).pJ();
         var17.i((double)var18 + 1.0D, -4.0D * 0.25D, 0.0D).v(var8, var9, var10, 104 & 1477).pJ();
         var16.pn();
         var17.q(931 & -23537, us.axK);
         var17.i((double)(-var18) - 1.0D, -1.959183673469388D * 0.5104166666666666D, 0.0D).v(var8, var9, var10, 5793 & 16534).pJ();
         var17.i((double)(-var18) - 1.0D, 0.06382978723404255D * 125.33333333333334D, 0.0D).v(var8, var9, var10, -30592 & 13204).pJ();
         var17.i((double)var18 + 1.0D, 0.8765432098765432D * 9.126760563380282D, 0.0D).v(var8, var9, var10, -24408 & 1156).pJ();
         var17.i((double)var18 + 1.0D, 1.8571428571428572D * -0.5384615384615384D, 0.0D).v(var8, var9, var10, 712 & 164).pJ();
         var17.i((double)(-var18) - 1.0D, -3.090909090909091D * 0.3235294117647059D, 0.0D).v(var8, var9, var10, -32576 & 654).pJ();
         var16.pn();
         pz.nP();
         var13.w(var1, -var18, 0.0F, -1 & -1, (boolean)(-31738 & 28969));
         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
         pz.nz();
         pz.O((boolean)(16385 & -27513));
         pz.ob();
         pz.oe();
         pz.nF();
      }

   }

   public List awG() {
      return this.dzv;
   }

   private void q(double var1, double var3, double var5, int var7, int var8, int var9, int var10, int var11, double var12) {
      pz.nE();
      pz.t(var1, var3, var5);
      pz.nx();
      pz.O((boolean)(-29691 & 32));
      pz.nX();
      pz.nC();
      pz.nK();
      pz.nB();
      pz.s(-15510 & 774, -14557 & 835, -31423 & 28673, 8720 & -12250);
      qk var14 = qk.pm();
      qq var15 = var14.pl();
      double var16 = 0.2987012987012987D * 1.673913043478261D - var12;
      var15.q(14375 & -31601, us.axK);
      var15.i(1.0D - var16, (double)var11, 1.0D - var16).v(var7, var8, var9, var10).pJ();
      var15.i(var16, (double)var11, 1.0D - var16).v(var7, var8, var9, var10).pJ();
      var15.i(var16, 0.0D, 1.0D - var16).v(var7, var8, var9, var10).pJ();
      var15.i(1.0D - var16, 0.0D, 1.0D - var16).v(var7, var8, var9, var10).pJ();
      var15.i(var16, (double)var11, 1.0D - var16).v(var7, var8, var9, var10).pJ();
      var15.i(var16, (double)var11, var16).v(var7, var8, var9, var10).pJ();
      var15.i(var16, 0.0D, var16).v(var7, var8, var9, var10).pJ();
      var15.i(var16, 0.0D, 1.0D - var16).v(var7, var8, var9, var10).pJ();
      var15.i(var16, (double)var11, var16).v(var7, var8, var9, var10).pJ();
      var15.i(1.0D - var16, (double)var11, var16).v(var7, var8, var9, var10).pJ();
      var15.i(1.0D - var16, 0.0D, var16).v(var7, var8, var9, var10).pJ();
      var15.i(var16, 0.0D, var16).v(var7, var8, var9, var10).pJ();
      var15.i(1.0D - var16, (double)var11, var16).v(var7, var8, var9, var10).pJ();
      var15.i(1.0D - var16, (double)var11, 1.0D - var16).v(var7, var8, var9, var10).pJ();
      var15.i(1.0D - var16, 0.0D, 1.0D - var16).v(var7, var8, var9, var10).pJ();
      var15.i(1.0D - var16, 0.0D, var16).v(var7, var8, var9, var10).pJ();
      var14.pn();
      pz.hT();
      pz.nL();
      pz.nP();
      pz.nz();
      pz.O((boolean)(-27539 & 25089));
      pz.oe();
      pz.nF();
   }

   public void awH() {
      this.dzx.clear();
      Stream var10000 = this.dzv.stream().filter(this::e);
      ArrayList var10001 = this.dzx;
      this.dzx.getClass();
      var10000.forEach(var10001::add);
   }
}
