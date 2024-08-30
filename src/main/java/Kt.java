import com.google.common.base.Objects;
import com.mojang.authlib.GameProfile;

public class KT {
   private final OX bAg;
   // $FF: synthetic field
   final KQ bAh;
   private final int bAi;
   private final Ra bAj;
   private final GameProfile bAk;

   public Ra MP() {
      return this.bAj;
   }

   public OX dh() {
      return this.bAg;
   }

   public GameProfile Jw() {
      return this.bAk;
   }

   public String toString() {
      return Objects.toStringHelper(this).add(o.q[29374 & 1964], this.bAi).add(o.q[23533 & 9901], this.bAj).add(o.q[-32082 & 19118], this.bAk).add(o.q[19199 & 4783], this.bAg == null ? null : OY.j(this.bAg)).toString();
   }

   public int MQ() {
      return this.bAi;
   }

   public KT(KQ var1, GameProfile var2, int var3, Ra var4, OX var5) {
      this.bAh = var1;
      this.bAk = var2;
      this.bAi = var3;
      this.bAj = var4;
      this.bAg = var5;
   }
}
