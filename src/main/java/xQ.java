import java.util.UUID;

public class XQ implements XE {
   private zk axl;

   public int afy() {
      if (!(this.axl instanceof zx)) {
         return 0;
      } else {
         zx var1 = (zx)this.axl;
         return (int)var1.zE();
      }
   }

   public Rl afz() {
      return this.axl.xG().aNn;
   }

   public NW afx() {
      return this.axl.xG().aNm;
   }

   public void ah(zk var1) {
      this.axl = var1;
   }

   public String bY() {
      return this.axl.dg() ? this.axl.yj() : null;
   }

   public int B() {
      UUID var1 = this.axl.ym();
      long var2 = var1.getLeastSignificantBits();
      int var4 = (int)(var2 & 2147483647L);
      return var4;
   }

   public int afw() {
      if (!(this.axl instanceof zx)) {
         return 0;
      } else {
         zx var1 = (zx)this.axl;
         return (int)var1.zA();
      }
   }

   public zk Wv() {
      return this.axl;
   }
}
