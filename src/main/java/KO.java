import java.net.UnknownHostException;

class kO implements Runnable {
   // $FF: synthetic field
   final kN Qb;

   public void run() {
      try {
         kN.w(this.Qb).iM().y(kN.q(this.Qb));
      } catch (UnknownHostException var2) {
         kN.q(this.Qb).Ze = -1L;
         kN.q(this.Qb).Za = OJ.bQb + i.q[1516 & -31747];
      } catch (Exception var3) {
         kN.q(this.Qb).Ze = -1L;
         kN.q(this.Qb).Za = OJ.bQb + r.q[6120 & 19451];
      }

   }

   kO(kN var1) {
      this.Qb = var1;
   }
}
