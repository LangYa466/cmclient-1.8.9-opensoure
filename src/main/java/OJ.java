public class Oj extends Ol {
   private String aLv = q.q[2121 & 5248];
   private final String bOw;
   private final String bOx;

   public String Vp() {
      Md var1 = Md.Jc();
      if (var1 != null && var1.PL() && PQ.Z(this.aLv)) {
         LY var2 = var1.gh(0).wp();
         LW var3 = var2.cr(this.bOx);
         if (var2.w(this.bOw, var3)) {
            LS var4 = var2.e(this.bOw, var3);
            this.cZ(String.format(e.q[13295 & -12571], var4.Ot()));
         } else {
            this.aLv = q.q[154 & 32261];
         }
      }

      return this.aLv;
   }

   // $FF: synthetic method
   public OX Vq() {
      return this.Vr();
   }

   public Oj Vr() {
      Oj var1 = new Oj(this.bOw, this.bOx);
      var1.cZ(this.aLv);
      var1.q(this.Vw().VN());

      for(OX var3 : this.Vx()) {
         var1.f(var3.Vq());
      }

      return var1;
   }

   public String toString() {
      return p.q[18997 & 13365] + this.bOw + '\'' + p.q[-24458 & 54] + this.bOx + '\'' + i.q[493 & -25235] + this.bOz + i.q[367 & -13970] + this.Vw() + '}';
   }

   public Oj(String var1, String var2) {
      this.bOw = var1;
      this.bOx = var2;
   }

   public String Vs() {
      return this.bOx;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof Oj)) {
         return false;
      } else {
         Oj var2 = (Oj)var1;
         return this.bOw.equals(var2.bOw) && this.bOx.equals(var2.bOx) && super.equals(var1);
      }
   }

   public void cZ(String var1) {
      this.aLv = var1;
   }

   public String bY() {
      return this.bOw;
   }
}
