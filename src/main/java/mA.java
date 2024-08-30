import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Ma extends LY {
   private LZ bEz;
   private final Set bEA = Sets.newHashSet();
   private final Md bEB;

   public void r(String var1, LW var2) {
      super.r(var1, var2);
      this.bEB.Pw().i(new KX(var1, var2));
      this.OP();
   }

   public void q(LZ var1) {
      this.bEz = var1;
   }

   public void e(LW var1) {
      super.e(var1);
      if (this.bEA.contains(var1)) {
         this.i(var1);
      }

      this.OP();
   }

   public void y(LW var1) {
      List var2 = this.p(var1);

      for(DH var4 : this.bEB.Pw().QG()) {
         for(IF var6 : var2) {
            var4.beK.t(var6);
         }
      }

      this.bEA.add(var1);
   }

   public Ma(Md var1) {
      this.bEB = var1;
   }

   public boolean s(String var1, String var2) {
      if (super.s(var1, var2)) {
         LX var3 = this.bc(var2);
         this.bEB.Pw().i(new La(var3, Arrays.asList(var1), 3));
         this.OP();
         return true;
      } else {
         return false;
      }
   }

   public void e(LX var1) {
      super.e(var1);
      this.bEB.Pw().i(new La(var1, 0));
      this.OP();
   }

   public void cl(String var1) {
      super.cl(var1);
      this.bEB.Pw().i(new KX(var1));
      this.OP();
   }

   public int u(LW var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < 19; ++var3) {
         if (this.gd(var3) == var1) {
            ++var2;
         }
      }

      return var2;
   }

   public void i(LW var1) {
      List var2 = this.o(var1);

      for(DH var4 : this.bEB.Pw().QG()) {
         for(IF var6 : var2) {
            var4.beK.t(var6);
         }
      }

      this.bEA.remove(var1);
   }

   public void r(LW var1) {
      super.r(var1);
      this.OP();
   }

   public void t(LW var1) {
      super.t(var1);
      if (this.bEA.contains(var1)) {
         this.bEB.Pw().i(new KW(var1, 2));
      }

      this.OP();
   }

   protected void OP() {
      if (this.bEz != null) {
         this.bEz.vv();
      }

   }

   public void q(int var1, LW var2) {
      LW var3 = this.gd(var1);
      super.q(var1, var2);
      if (var3 != var2 && var3 != null) {
         if (this.u(var3) > 0) {
            this.bEB.Pw().i(new KZ(var1, var2));
         } else {
            this.i(var3);
         }
      }

      if (var2 != null) {
         if (this.bEA.contains(var2)) {
            this.bEB.Pw().i(new KZ(var1, var2));
         } else {
            this.y(var2);
         }
      }

      this.OP();
   }

   public void q(LX var1) {
      super.q(var1);
      this.bEB.Pw().i(new La(var1, 1));
      this.OP();
   }

   public List o(LW var1) {
      ArrayList var2 = Lists.newArrayList();
      var2.add(new KW(var1, 1));

      for(int var3 = 0; var3 < 19; ++var3) {
         if (this.gd(var3) == var1) {
            var2.add(new KZ(var3, var1));
         }
      }

      return var2;
   }

   public void r(LX var1) {
      super.r(var1);
      this.bEB.Pw().i(new La(var1, 2));
      this.OP();
   }

   public List p(LW var1) {
      ArrayList var2 = Lists.newArrayList();
      var2.add(new KW(var1, 0));

      for(int var3 = 0; var3 < 19; ++var3) {
         if (this.gd(var3) == var1) {
            var2.add(new KZ(var3, var1));
         }
      }

      for(LS var4 : this.w(var1)) {
         var2.add(new KX(var4));
      }

      return var2;
   }

   public void q(String var1, LX var2) {
      super.q(var1, var2);
      this.bEB.Pw().i(new La(var2, Arrays.asList(var1), 4));
      this.OP();
   }

   public void q(LS var1) {
      super.q(var1);
      if (this.bEA.contains(var1.Os())) {
         this.bEB.Pw().i(new KX(var1));
      }

      this.OP();
   }
}
