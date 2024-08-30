public class ja extends kf {
   private final jc GZ;
   private String Ha;
   private Su Hb = Su.acr();
   private String Hc;
   private String Hd;
   private iU He;
   private jb Hf;
   private iU Hg;
   private iU Hh;

   public ja(jc var1, String var2) {
      this.GZ = var1;
      this.N(var2);
   }

   public void aJ() {
      super.aJ();
      this.Hf.aJ();
   }

   public void ic() {
      boolean var1 = this.ie();
      this.Hg.aM = var1;
      this.Hh.aM = var1;
      this.Hh.aM = false;
      this.He.aM = false;
   }

   public void N(String var1) {
      this.Hb = Su.dH(var1);
   }

   protected void q(iU var1) {
      int var2 = this.Hb.aco().size() - this.Hf.Hi - 1;
      if (var1.aq == 1) {
         this.G.r(this.GZ);
      } else if (var1.aq == 0) {
         this.GZ.Hq = this.id();
         this.G.r(this.GZ);
      } else if (var1.aq == 5) {
         this.G.r(new jm(this));
      } else if (var1.aq == 4 && this.ie()) {
         this.Hb.aco().remove(var2);
         this.Hf.Hi = Math.min(this.Hf.Hi, this.Hb.aco().size() - 1);
      }

      this.Hb.acn();
      this.ic();
   }

   public void o() {
      this.Mt.clear();
      this.Ha = uI.q(o.q[3047 & -16021]);
      this.Hd = uI.q(o.q[3429 & 16756]);
      this.Hc = uI.q(o.q[5605 & -22155]);
      this.Hf = new jb(this);
      this.Mt.add(this.He = new iU(2, this.eo / 2 - 154, this.eC - 52, 100, 20, uI.q(o.q[878 & 18807]) + o.q[17895 & -29849]));
      this.Mt.add(this.Hh = new iU(3, this.eo / 2 - 50, this.eC - 52, 100, 20, uI.q(o.q[10621 & -15382]) + o.q[10599 & 359]));
      this.Mt.add(this.Hg = new iU(4, this.eo / 2 - 155, this.eC - 52, 150, 20, uI.q(o.q[13673 & 361])));
      this.Mt.add(new iU(0, this.eo / 2 - 155, this.eC - 28, 150, 20, uI.q(q.q[19829 & -32513])));
      this.Mt.add(new iU(5, this.eo / 2 + 5, this.eC - 52, 150, 20, uI.q(o.q[8570 & -25233])));
      this.Mt.add(new iU(1, this.eo / 2 + 5, this.eC - 28, 150, 20, uI.q(q.q[3115 & 8746])));
      this.He.hW = this.Hh.hW = false;
      this.Hb.acn();
      this.ic();
   }

   public String id() {
      return this.Hb.toString();
   }

   private boolean ie() {
      return this.Hf.Hi > -1 && this.Hf.Hi < this.Hb.aco().size();
   }

   // $FF: synthetic method
   static Su q(ja var0) {
      return var0.Hb;
   }

   public void q(int var1, int var2, float var3) {
      this.jA();
      this.Hf.q(var1, var2, var3);
      this.w(this.CB, this.Ha, this.eo / 2, 8, 16777215);
      int var4 = this.eo / 2 - 92 - 16;
      this.q(this.CB, this.Hd, var4, 32, 16777215);
      this.q(this.CB, this.Hc, var4 + 2 + 213 - this.CB.K(this.Hc), 32, 16777215);
      super.q(var1, var2, var3);
   }
}
