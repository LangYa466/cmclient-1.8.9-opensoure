import io.netty.buffer.Unpooled;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class ke extends li implements ET {
   private kz Mn;
   private EP Mo;
   private static final PJ Mp = new PJ(u.q[1910 & -3209]);
   private DJ Is;

   public void q(Ev var1, int var2, int var3) {
   }

   public void aL() {
      super.aL();
      Keyboard.enableRepeatEvents(false);
      this.RV.q(this);
   }

   public void q(Ev var1, EV var2) {
   }

   public void q(int var1, int var2, float var3) {
      super.q(var1, var2, var3);
      pz.nx();
      pz.nz();
      this.Mn.kh();
   }

   public ke(DJ var1, QI var2) {
      super(new EP(var1, var2, hS.eV().CM));
      this.Is = var1;
      this.Mo = (EP)this.RV;
   }

   private void jx() {
      String var1 = this.Mn.aZ();
      Fe var2 = this.Mo.eZ(0);
      if (var2 != null && var2.kM() && !var2.kO().HS() && var1.equals(var2.kO().tg())) {
         var1 = q.q[19716 & -20350];
      }

      this.Mo.bw(var1);
      this.G.CM.FE.q(new JE(y.q[-16257 & 4415], (new IG(Unpooled.buffer())).bX(var1)));
   }

   protected void q(char var1, int var2) {
      if (this.Mn.t(var1, var2)) {
         this.jx();
      } else {
         super.q(var1, var2);
      }

   }

   protected void j(int var1, int var2) {
      pz.nx();
      pz.nz();
      this.CB.q(uI.q(u.q[-31885 & 2931]), 60, 6, 4210752);
      if (this.Mo.bpm > 0) {
         int var3 = 8453920;
         boolean var4 = true;
         String var5 = uI.q(u.q[29694 & 885], this.Mo.bpm);
         if (this.Mo.bpm >= 40 && !this.G.CM.bdO.bfz) {
            var5 = uI.q(u.q[2933 & 22527]);
            var3 = 16736352;
         } else if (!this.Mo.eZ(2).kM()) {
            var4 = false;
         } else if (!this.Mo.eZ(2).n(this.Is.Dm)) {
            var3 = 16736352;
         }

         if (var4) {
            int var6 = -16777216 | (var3 & 16579836) >> 2 | var3 & -16777216;
            int var7 = this.RQ - 8 - this.CB.K(var5);
            byte var8 = 67;
            if (this.CB.hQ()) {
               q(var7 - 3, var8 - 2, this.RQ - 7, var8 + 10, -16777216);
               q(var7 - 2, var8 - 1, this.RQ - 8, var8 + 9, -12895429);
            } else {
               this.CB.q(var5, var7, var8 + 1, var6);
               this.CB.q(var5, var7 + 1, var8, var6);
               this.CB.q(var5, var7 + 1, var8 + 1, var6);
            }

            this.CB.q(var5, var7, var8, var3);
         }
      }

      pz.oe();
   }

   public void o() {
      super.o();
      Keyboard.enableRepeatEvents(true);
      int var1 = (this.eo - this.RQ) / 2;
      int var2 = (this.eC - this.RF) / 2;
      this.Mn = new kz(0, this.CB, var1 + 62, var2 + 24, 103, 12);
      this.Mn.aZ(-1);
      this.Mn.be(-1);
      this.Mn.H(false);
      this.Mn.bb(30);
      this.RV.q(this);
      this.RV.w(this);
   }

   public void q(Ev var1, List var2) {
      this.q(var1, 0, var1.eZ(0).kO());
   }

   protected void w(float var1, int var2, int var3) {
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      this.G.fJ().o(Mp);
      int var4 = (this.eo - this.RQ) / 2;
      int var5 = (this.eC - this.RF) / 2;
      this.e(var4, var5, 0, 0, this.RQ, this.RF);
      this.e(var4 + 59, var5 + 20, 0, this.RF + (this.Mo.eZ(0).kM() ? 0 : 16), 110, 16);
      if ((this.Mo.eZ(0).kM() || this.Mo.eZ(1).kM()) && !this.Mo.eZ(2).kM()) {
         this.e(var4 + 99, var5 + 45, this.RQ, 0, 28, 21);
      }

   }

   public void q(Ev var1, int var2, GX var3) {
      if (var2 == 0) {
         this.Mn.Y(var3 == null ? q.q[1060 & -8181] : var3.tg());
         this.Mn.w(var3 != null);
         if (var3 != null) {
            this.jx();
         }
      }

   }

   protected void q(int var1, int var2, int var3) {
      super.q(var1, var2, var3);
      this.Mn.q(var1, var2, var3);
   }
}
