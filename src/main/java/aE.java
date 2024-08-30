import com.google.common.base.Predicate;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ae extends zW {
   private Class aTl;
   private final Predicate aTm;
   private static final Logger aTn = LogManager.getLogger();
   private final AA aTo;
   private zz aTp;
   private zx aTq;

   public boolean Ay() {
      zz var1 = this.aTq.zc();
      if (var1 == null) {
         return false;
      } else if (!var1.xV()) {
         return false;
      } else {
         double var2 = this.AG();
         return this.aTq.B(var1) > var2 * var2 ? false : !(var1 instanceof DH) || !((DH)var1).beL.Qn();
      }
   }

   // $FF: synthetic method
   static zx q(Ae var0) {
      return var0.aTq;
   }

   public Ae(zx var1, Class var2) {
      this.aTq = var1;
      this.aTl = var2;
      if (var1 instanceof zr) {
         aTn.warn(q.q[13283 & -29789]);
      }

      this.aTm = new Af(this);
      this.aTo = new AA(var1);
   }

   public void Az() {
      this.aTq.f(this.aTp);
      super.Az();
   }

   protected double AG() {
      Bj var1 = this.aTq.q(zR.aSe);
      return var1 == null ? 16.0D : var1.Bs();
   }

   public boolean Av() {
      double var1 = this.AG();
      List var3 = this.aTq.vR.q(this.aTl, this.aTq.xE().C(var1, 4.0D, var1), this.aTm);
      Collections.sort(var3, this.aTo);
      if (var3.isEmpty()) {
         return false;
      } else {
         this.aTp = (zz)var3.get(0);
         return true;
      }
   }

   public void Aw() {
      this.aTq.f((zz)null);
      super.Az();
   }
}
