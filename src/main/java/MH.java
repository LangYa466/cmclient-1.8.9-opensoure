import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class Mh extends MC {
   private HL bFH;

   public String q(SocketAddress var1, GameProfile var2) {
      return var2.getName().equalsIgnoreCase(this.Qe().Qb()) && this.cD(var2.getName()) != null ? r.q[-32292 & 30685] : super.q(var1, var2);
   }

   public Mi Qe() {
      return (Mi)super.Qf();
   }

   public Mh(Mi var1) {
      super(var1);
      this.gl(10);
   }

   // $FF: synthetic method
   public Md Qf() {
      return this.Qe();
   }

   public HL Qg() {
      return this.bFH;
   }

   protected void p(DH var1) {
      if (var1.bY().equals(this.Qe().Qb())) {
         this.bFH = new HL();
         var1.q(this.bFH);
      }

      super.p(var1);
   }
}
