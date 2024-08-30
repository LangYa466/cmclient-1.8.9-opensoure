import io.netty.buffer.ByteBuf;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class xw implements wZ {
   private final wE aKN = new wE();
   private boolean aKO = true;
   private static final SimpleDateFormat aKP = new SimpleDateFormat(u.q[-16680 & 761]);
   private String aKQ = q.q[4608 & 8290];
   private OX aKR = null;
   private String aKS = e.q[-16194 & 1341];
   private int aKT;

   public void i(HL var1) {
      this.aKQ = var1.bG(o.q[952 & 4592]);
      this.aKT = var1.bQ(o.q[5565 & 433]);
      if (var1.d(q.q[495 & -5688], 8)) {
         this.aKS = var1.bG(q.q[8650 & 17388]);
      }

      if (var1.d(o.q[14834 & 442], 1)) {
         this.aKO = var1.bL(o.q[434 & -24066]);
      }

      if (var1.d(o.q[-23049 & 19379], 8) && this.aKO) {
         this.aKR = OY.di(var1.bG(o.q[499 & -15949]));
      }

      this.aKN.y(var1);
   }

   public void u(QI var1) {
      if (var1.bXF) {
         this.aKT = 0;
      }

      Md var2 = Md.Jc();
      if (var2 != null && var2.PL() && var2.PK()) {
         wY var3 = var2.PP();

         try {
            this.aKR = null;
            this.aKT = var3.o(this, this.aKQ);
         } catch (Throwable var7) {
            xW var5 = xW.q(var7, o.q[20918 & 444]);
            ye var6 = var5.bd(o.q[12725 & 1975]);
            var6.q(o.q[-32336 & 1458], new xx(this));
            var6.q(q.q[447 & -30801], new xy(this));
            throw new PI(var5);
         }
      } else {
         this.aKT = 0;
      }

   }

   public OX wh() {
      return this.aKR;
   }

   public String wi() {
      return this.aKQ;
   }

   public wE wj() {
      return this.aKN;
   }

   public abstract void q(ByteBuf var1);

   public String bY() {
      return this.aKS;
   }

   public void ba(String var1) {
      this.aKQ = var1;
      this.aKT = 0;
   }

   public boolean vR() {
      Md var1 = Md.Jc();
      return var1 == null || !var1.PL() || var1.bEU[0].vU().bL(i.q[191 & 6395]);
   }

   public int wk() {
      return this.aKT;
   }

   public abstract void wl();

   public void o(HL var1) {
      var1.a(o.q[432 & -31304], this.aKQ);
      var1.a(o.q[945 & 31159], this.aKT);
      var1.a(q.q[-30262 & 2045], this.aKS);
      var1.s(o.q[-30282 & 14259], this.aKO);
      if (this.aKR != null && this.aKO) {
         var1.a(o.q[16823 & 2555], OY.j(this.aKR));
      }

      this.aKN.u(var1);
   }

   public boolean wm() {
      return this.aKO;
   }

   public void q(OX var1) {
      if (this.aKO && this.vQ() != null && !this.vQ().bXF) {
         this.aKR = (new Oo(w.q[4529 & 18361] + aKP.format(new Date()) + y.q[-29819 & 4636])).f(var1);
         this.wl();
      }

   }

   public void o(OX var1) {
      this.aKR = var1;
   }

   public boolean t(DD var1) {
      if (!var1.bdO.bfz) {
         return false;
      } else {
         if (var1.vQ().bXF) {
            var1.q(this);
         }

         return true;
      }
   }

   public void q(wG var1, int var2) {
      this.aKN.q(this, var1, var2);
   }

   public void ab(boolean var1) {
      this.aKO = var1;
   }

   public OX dh() {
      return new Oo(this.bY());
   }

   public void bb(String var1) {
      this.aKS = var1;
   }

   public boolean q(int var1, String var2) {
      return var1 <= 2;
   }

   public abstract int wn();
}
