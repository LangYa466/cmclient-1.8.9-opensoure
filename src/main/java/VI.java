import java.util.List;

public class vI implements vz {
   private final vz aCb;
   private final List aCc;
   private final int aCd;

   public vz a(long var1) {
      return ((vK)Qb.q(this.aCc, Math.abs((int)var1 >> 16) % this.aCd)).aCf;
   }

   public vI(List var1) {
      this.aCc = var1;
      this.aCd = Qb.t(var1);
      this.aCb = ((vK)var1.get(0)).aCf;
   }

   public tO ua() {
      return this.aCb.ua();
   }

   public qJ uc() {
      return this.aCb.uc();
   }

   public List g(OK var1) {
      return this.aCb.g(var1);
   }

   public boolean ub() {
      return this.aCb.ub();
   }

   public boolean qy() {
      return this.aCb.qy();
   }

   public boolean qA() {
      return this.aCb.qA();
   }

   public List ud() {
      return this.aCb.ud();
   }
}
