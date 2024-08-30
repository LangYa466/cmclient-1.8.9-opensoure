import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class D extends E {
   private static final List aA = ImmutableList.of(new PJ(q.q[-31882 & -10372 & 20345 & 28529], y.q[-30849 & 18428 & -1666 & -21636]), new PJ(q.q[13176 & 7032 & -3085 & -22669], y.q[-20995 & -8707 & -28289 & 12799]), new PJ(q.q[17271 & -11397 & 28531 & 3956], y.q[10623 & 27006 & 4095 & 2046]), new PJ(q.q[-9223 & -7172 & 1909 & 1905], y.q[-129 & 28031 & -32257 & -23553]));
   private static final PJ aB = new PJ(q.q[883 & -17551 & 882 & 18424], q.q[-8387 & -9411 & 1577 & -28951]);
   private static final PJ aC = new PJ(q.q[-29831 & -29831 & 22516 & 26608], y.q[6523 & -12801 & -31874 & -14341]);
   private static final PJ aD = new PJ(q.q[11129 & 10097 & -31746 & 1019], y.q[-23685 & -14337 & 11647 & 3963]);
   private static final PJ aE = new PJ(q.q[8179 & -16399 & 22388 & -15500], q.q[16959 & 1639 & -145 & 18151]);
   private static final Random aF = new Random();
   private final bI aG;

   private float G() {
      return 1.0F;
   }

   private void q(qq var1, tO var2, int var3, int var4, int var5, boolean var6) {
      var1.q(2415 & -31225, var6 ? us.axI : us.axH);
      this.q(var1.i(2.4324324324324325D * -0.20555555555555555D, -1.0657894736842106D * 0.2345679012345679D, 0.0D).e((double)var2.sp(), (double)var2.sa()), var3, var4, var5, var6).o(0.0F, 1.0F, 0.0F).pJ();
      this.q(var1.i(0.18518518518518517D * 2.7D, -0.2473404255319149D * 1.010752688172043D, 0.0D).e((double)var2.sj(), (double)var2.sa()), var3, var4, var5, var6).o(0.0F, 1.0F, 0.0F).pJ();
      this.q(var1.i(0.2828282828282828D * 1.767857142857143D, 2.2325581395348837D * 0.3359375D, 0.0D).e((double)var2.sj(), (double)var2.sd()), var3, var4, var5, var6).o(0.0F, 1.0F, 0.0F).pJ();
      this.q(var1.i(0.06521739130434782D * -7.666666666666667D, 1.608695652173913D * 0.46621621621621623D, 0.0D).e((double)var2.sp(), (double)var2.sd()), var3, var4, var5, var6).o(0.0F, 1.0F, 0.0F).pJ();
      qk.pm().pn();
   }

   private void y(int var1) {
      if (var1 > 0) {
         float var3 = (aF.nextFloat() * 2.0F - 1.0F) * 0.8482759F * 0.35365853F;
         float var2 = (aF.nextFloat() * 2.0F - 1.0F) * 4.733333F * 0.063380286F;
         float var4 = (aF.nextFloat() * 2.0F - 1.0F) * 0.70000005F * 0.42857143F;
         GL11.glTranslatef(var3, var2, var4);
      }

      float var6 = -this.aK.eX().arQ;
      float var5 = 1.1470588F * 156.92308F - this.aK.eX().arC;
      GL11.glRotatef(var5, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var6, 1.0F, 0.0F, 0.0F);
   }

   public void q(BD var1, double var2, double var4, double var6, float var8) {
      aF.setSeed(38814459L & 268999103L);
      GX var9 = var1.Ch();
      Fm var10 = var9.do1();
      if (!(var10 instanceof FO) && !(var10 instanceof GR) && this.aG.bk() != (5133 & -30383)) {
         tO var11 = this.aK.gi().ru().e(var10, var9.Ik());
         int var12 = -28602 & 2560;
         int var13 = -16744448 & -5963773;
         if (var10 instanceof FH || var10 instanceof GH || var10 instanceof GB) {
            var12 = -32671 & 16641;
            var13 = var10.t(var9, -31600 & 19209);
         }

         int var14 = this.u(var9.bsH);
         qk var15 = qk.pm();
         qq var16 = var15.pl();
         this.aK.fJ().o(tU.awb);
         pz.od();
         pz.nV();
         pz.ob();
         pz.nX();
         pz.s(6918 & 779, 13155 & 787, 705 & -24575, 272 & 30208);
         qh.pi();
         float var17 = Pq.bk(((float)var1.acq + var8) / (8.727272F * 1.1458334F) + var1.aYb) * 2.0F * 0.05F + 0.5543478F * 0.18039216F;
         GL11.glTranslated(var2, var4 + (double)var17 + 0.12388059701492538D * 0.8072289156626506D, var6);
         int var18 = var13 >> (21560 & 10770) & -31745 & 7423;
         int var19 = var13 >> (19099 & -24244) & -31745 & 8447;
         int var20 = var13 & 10751 & 18175;

         for(int var21 = 260 & -11240; var21 < var14; ++var21) {
            pz.nE();
            this.y(var21);
            float var22 = this.G();
            GL11.glScalef(var22, var22, var22);
            GL11.glScalef(0.8648649F * 0.578125F, 1.4029851F * 0.35638297F, 1.6458334F * 0.30379745F);
            if (this.w(var9)) {
               tO var23 = this.aK.Ca.aw(((PJ)Objects.requireNonNull(this.q(var9))).toString());
               int var24 = var10.t(var9, 4109 & 8323);
               int var25 = var24 >> (10352 & 16410) & 25855 & 4863;
               int var26 = var24 >> (1165 & -32406) & 25087 & -29441;
               int var27 = var24 & 19967 & -32513;
               this.q(var16, var23, var25, var26, var27, (boolean)(-24541 & 777));
            }

            this.q(var16, var11, var18, var19, var20, (boolean)var12);
            pz.nF();
         }

         pz.nS();
         pz.nz();
      } else {
         this.w(var1, var2, var4, var6, var8);
      }
   }

   private void w(BD var1, double var2, double var4, double var6, float var8) {
      aF.setSeed(6459579L & 654639611L);
      GX var9 = var1.Ch();
      vz var10 = this.aK.gi().ru().g(var9);
      int var11 = this.u(var9.bsH);
      pz.od();
      pz.nX();
      pz.s(10182 & 4874, 23303 & -23741, 425 & 5185, 19472 & 165);
      qh.pi();
      pz.nE();
      rL var12 = this.aK.eX().h(var1);
      var12.g(var1);
      float var13 = var10.uc().amZ.anC.y;
      float var14 = Pq.bk(((float)var1.acq + var8) / (26.666666F * 0.375F) + var1.aYb) * 0.11296296F * 0.8852459F + 3.6000001F * 0.027777778F;
      GL11.glTranslated(var2, var4 + (double)var14 + 4.5D * 0.05555555555555555D * (double)var13, var6);

      for(int var15 = -22400 & 769; var15 < var11; ++var15) {
         pz.nE();
         this.y(var15);
         float var16 = this.G();
         pz.u(var16, var16, var16);
         if (var10.ub() && !(var9.do1() instanceof GR)) {
            pz.i(0.0754717F * 2385.0F, 0.0F, 1.0F, 0.0F);
         } else if (var9.do1().cM().contains(y.q[-26629 & -29701 & -26245 & 9721])) {
            pz.i(1.8285714F * 49.21875F, 0.0F, 1.0F, 0.0F);
         }

         if (var10.qA()) {
            pz.r(1.2857142857142858D * 0.38888888888888884D, 0.1883116883116883D * 2.6551724137931036D, 0.6756756756756757D * 0.74D);
         }

         var10.uc().q(qM.ank);
         this.aK.gi().q(var9, var10);
         pz.nF();
      }

      pz.nF();
      pz.nS();
      pz.nz();
   }

   private PJ q(GX var1) {
      if (this.w(var1)) {
         Fm var2 = var1.do1();
         if (var2 instanceof GH) {
            return GH.fn(var1.Ik()) ? aE : aB;
         } else if (var2 instanceof GB) {
            return aC;
         } else {
            return var2 instanceof Gk ? aD : (PJ)aA.get(((FH)var2).brm);
         }
      } else {
         return null;
      }
   }

   private boolean w(GX var1) {
      Fm var2 = var1.do1();
      return (boolean)(!(var2 instanceof GH) && (!(var2 instanceof FH) || ((FH)var1.do1()).brq != FJ.brs) && !(var2 instanceof GB) && !(var2 instanceof Gk) ? 9776 & -32767 : 20753 & 199);
   }

   private qq q(qq var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         var1.v(var2, var3, var4, 17663 & -30465);
      }

      return var1;
   }

   public D() {
      super(y.q[15231 & -20097 & -12812 & 32245], 17006 & 1294);
      new bI(this, y.q[9719 & 5629 & -9345 & 14719]);
      bI var10001 = (new bI(this, y.q[12790 & -11786 & 8055 & 2935])).q(Integer.valueOf(2312 & -32764));
      String[] var10002 = new String[74 & 24722];
      var10002[8192 & -30142] = y.q[-3721 & 20983 & 13815 & 9719];
      var10002[6277 & 17705] = y.q[32121 & 22905 & 504 & 16892];
      this.aG = var10001.q(var10002);
   }

   private int u(int var1) {
      int var2 = 19591 & 9;
      if (var1 > (6929 & -31665)) {
         var2 = 1154 & 26635;
      }

      if (var1 > (317 & 1159)) {
         var2 = 23 & -28125;
      }

      if (var1 > (8284 & -25547)) {
         var2 = 26134 & 68;
      }

      if (var1 > (-31620 & 20520)) {
         var2 = -29307 & 28693;
      }

      return var2;
   }
}
