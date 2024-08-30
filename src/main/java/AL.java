import java.util.function.Consumer;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class al extends E {
   public final bI dR;
   public final bI dS;
   public final bI dT;
   public final bI dU;

   private float r() {
      float var1 = (float)this.dU.bk() * 1.2F * 8.333333F;
      int var2 = this.dS.bk();
      if (var2 != 0) {
         var1 += (float)var2 / (0.05263158F * 95.0F);
      }

      return var1 / (0.22727273F * 4400.0F);
   }

   public al() {
      super(u.q[-14197 & -13685 & -23873 & 31467], -14178 & 1103);
      new bI(this, u.q[4046 & 16878 & 15516 & -16740]);
      this.dU = (new bI(this, u.q[29615 & 31677 & -22129 & -11075])).q(Integer.valueOf(126 & 306)).t(17444 & 7042, 603 & 1150, -14277 & 4101);
      this.dS = (new bI(this, u.q[8127 & 2014 & -785 & -9745])).q(Integer.valueOf(4224 & 608)).t(-32540 & 8705, 9054 & 6235, 2625 & -27391);
      this.dR = (new bI(this, u.q[-14145 & 6063 & -13089 & 11471])).o((boolean)(-10172 & 523));
      this.dT = (new bI(this, u.q[30876 & 2198 & -11533 & 13234])).o((boolean)(-10019 & 9473));
      this.aK.Bn.atM().e(agw.class, this::q);
   }

   public void w(boolean var1) {
      if (var1 && !this.aK.Bn.dmc) {
         hS var10000 = this.aK;
         kf var10003 = this.aK.Cx;
         String[] var10004 = new String[-23234 & 18435];
         var10004[16512 & 6145] = u.q[17819 & -24142 & 21202 & -15685];
         var10004[16721 & 4097] = MV.bIf;
         var10000.r(new agH(var10003, var10004));
      } else {
         super.w(var1);
      }
   }

   public void q(agw var1) {
      if (this.J() && (this.aK.Cx == null || !this.dR.af())) {
         if (!this.dT.af() || Display.isActive()) {
            this.aK.CF.cf(u.q[21663 & 23707 & 17341 & 9621]);
            float var2 = this.r();
            GL11.glAccum(423 & 24915, var2);
            GL11.glAccum(25473 & -28394, 1.0F - var2);
            GL11.glAccum(25526 & 6467, 1.0F);
            this.aK.CF.Ol();
         }
      }
   }
}
