import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.UUID;

public class NU extends No {
   private GameProfile bNQ = null;
   private int bNR;
   private int bNS;

   public void w(HL var1) {
      super.w(var1);
      this.bNR = var1.bN(i.q[-32324 & 23463]);
      this.bNS = var1.bN(i.q[-26187 & 1445]);
      if (this.bNR == 3) {
         if (var1.d(r.q[4480 & 504], 10)) {
            this.bNQ = HX.n(var1.bO(r.q[14768 & 453]));
         } else if (var1.d(i.q[9647 & 21430], 8)) {
            String var2 = var1.bG(i.q[422 & -15897]);
            if (!PQ.Z(var2)) {
               this.bNQ = new GameProfile((UUID)null, var2);
               this.UZ();
            }
         }
      }

   }

   public void gt(int var1) {
      this.bNR = var1;
      this.bNQ = null;
   }

   public void gu(int var1) {
      this.bNS = var1;
   }

   public void q(HL var1) {
      super.q(var1);
      var1.q(i.q[484 & 11708], (byte)(this.bNR & 255));
      var1.q(i.q[3573 & -28243], (byte)(this.bNS & 255));
      if (this.bNQ != null) {
         HL var2 = new HL();
         HX.q(var2, this.bNQ);
         var1.w(r.q[388 & 1928], var2);
      }

   }

   public GameProfile UY() {
      return this.bNQ;
   }

   public static GameProfile h(GameProfile var0) {
      if (var0 != null && !PQ.Z(var0.getName())) {
         if (var0.isComplete() && var0.getProperties().containsKey(y.q[1243 & 27291])) {
            return var0;
         } else if (Md.Jc() == null) {
            return var0;
         } else {
            GameProfile var1 = Md.Jc().Po().cB(var0.getName());
            if (var1 == null) {
               return var0;
            } else {
               Property var2 = (Property)Iterables.getFirst(var1.getProperties().get(y.q[11931 & 223]), (Object)null);
               if (var2 == null) {
                  var1 = Md.Jc().PJ().fillProfileProperties(var1, true);
               }

               return var1;
            }
         }
      } else {
         return var0;
      }
   }

   private void UZ() {
      this.bNQ = h(this.bNQ);
      this.vv();
   }

   public IF TU() {
      HL var1 = new HL();
      this.q(var1);
      return new KN(this.uc, 4, var1);
   }

   public int Va() {
      return this.bNR;
   }

   public int Vb() {
      return this.bNS;
   }

   public void j(GameProfile var1) {
      this.bNR = 3;
      this.bNQ = var1;
      this.UZ();
   }
}
