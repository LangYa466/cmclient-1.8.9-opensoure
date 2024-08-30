public class afG {
   public acj dsk = new acj();
   public acl dsl;
   public int apI;
   public float dsm;
   public float bUb;
   public String av;
   public float Xu = 1.0F;
   public acj dsn = new acj();
   public float Xa = 1.0F;
   public float dso;
   public afG dsp;
   public float bUa;
   public String dsq;
   public float WZ = 1.0F;
   public acj dsr;
   public acj dss = new acj();
   public float dst;
   public float bTZ;
   public acl dsu;

   public afG(int var1, String var2, String var3, acl var4, acj var5) {
      this.apI = var1;
      this.av = var2;
      this.dsq = var3;
      this.dsr = var5;
      this.dsu = new acl(var5.dcJ, var5.dcG, var5.dcz);
      this.dsl = var4;
      this.dsk.q(var5).aph();
   }

   public acj q(acj var1, float var2, float var3) {
      this.dsn.q(this.dss);
      this.dsn.G(this.bUa, this.bUb, this.bTZ);
      this.dsn.F(this.Xu, this.WZ, this.Xa);
      if (this.dst != 0.0F) {
         this.dsn.bQ(this.dst);
      }

      float var4 = this.dso + var2;
      float var5 = this.dsm + var3;
      if (var4 != 0.0F) {
         this.dsn.bS(var4);
      }

      if (var5 != 0.0F) {
         this.dsn.bR(var5);
      }

      if (this.dsp != null) {
         var1 = new acj(this.dsp.dsn);
      }

      return var1.e(this.dsn);
   }

   public acj Z(float var1, float var2) {
      acj var3 = this.q(new acj(), var1, var2);
      this.dsn.q(var3);
      var3.e(this.dsk);
      return var3;
   }

   public acj avi() {
      return this.Z(0.0F, 0.0F);
   }

   public void pK() {
      this.bUa = this.bUb = this.bTZ = 0.0F;
      this.dsm = this.dso = this.dst = 0.0F;
      this.Xu = this.WZ = this.Xa = 1.0F;
   }
}
