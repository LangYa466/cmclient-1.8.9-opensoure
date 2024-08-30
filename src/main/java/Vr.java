import com.google.common.collect.Lists;
import java.util.List;
import org.lwjgl.util.vector.Matrix4f;

public class vR {
   private final List aIe = Lists.newArrayList();
   public final vQ aIf;
   private final List aIg = Lists.newArrayList();
   private final List aIh = Lists.newArrayList();
   private Matrix4f aIi;
   private final vX aIj;
   private final List aIk = Lists.newArrayList();
   public final vQ aIl;

   public vX vc() {
      return this.aIj;
   }

   public void aq(float var1) {
      this.vd();
      this.aIf.uZ();
      float var2 = (float)this.aIl.aIb;
      float var3 = (float)this.aIl.aHZ;
      pz.h(0, 0, (int)var2, (int)var3);
      this.aIj.q(o.q[8070 & 17286], this.aIf);

      for(int var4 = 0; var4 < this.aIg.size(); ++var4) {
         this.aIj.q((String)this.aIe.get(var4), this.aIg.get(var4));
         this.aIj.aI(o.q[17303 & 4079] + var4).s((float)((Integer)this.aIh.get(var4)).intValue(), (float)((Integer)this.aIk.get(var4)).intValue());
      }

      this.aIj.aI(o.q[-30835 & 21418]).w(this.aIi);
      this.aIj.aI(o.q[2953 & 1001]).s((float)this.aIf.aIb, (float)this.aIf.aHZ);
      this.aIj.aI(o.q[17294 & 1003]).s(var2, var3);
      this.aIj.aI(r.q[2266 & 1946]).ar(var1);
      hS var9 = hS.eV();
      this.aIj.aI(o.q[971 & -1141]).s((float)var9.Cr, (float)var9.BB);
      this.aIj.vs();
      this.aIl.va();
      this.aIl.aa(false);
      pz.O(false);
      pz.q(true, true, true, true);
      qk var5 = qk.pm();
      qq var6 = var5.pl();
      var6.q(7, us.axK);
      var6.i(0.0D, (double)var3, 500.0D).v(255, 255, 255, 255).pJ();
      var6.i((double)var2, (double)var3, 500.0D).v(255, 255, 255, 255).pJ();
      var6.i((double)var2, 0.0D, 500.0D).v(255, 255, 255, 255).pJ();
      var6.i(0.0D, 0.0D, 500.0D).v(255, 255, 255, 255).pJ();
      var5.pn();
      pz.O(true);
      pz.q(true, true, true, true);
      this.aIj.vr();
      this.aIl.uZ();
      this.aIf.uW();

      for(Object var8 : this.aIg) {
         if (var8 instanceof vQ) {
            ((vQ)var8).uW();
         }
      }

   }

   private void vd() {
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      pz.nz();
      pz.nW();
      pz.nB();
      pz.og();
      pz.nx();
      pz.oh();
      pz.nP();
      pz.bW(0);
   }

   public void ve() {
      this.aIj.ve();
   }

   public vR(uL var1, String var2, vQ var3, vQ var4) {
      this.aIj = new vX(var1, var2);
      this.aIf = var3;
      this.aIl = var4;
   }

   public void q(Matrix4f var1) {
      this.aIi = var1;
   }

   public void q(String var1, Object var2, int var3, int var4) {
      this.aIe.add(this.aIe.size(), var1);
      this.aIg.add(this.aIg.size(), var2);
      this.aIh.add(this.aIh.size(), Integer.valueOf(var3));
      this.aIk.add(this.aIk.size(), Integer.valueOf(var4));
   }
}
