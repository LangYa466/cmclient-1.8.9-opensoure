import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;

public class xG extends wd {
   public List q(wZ var1, String[] var2, NW var3) {
      if (var2.length == 1) {
         String var4 = var2[var2.length - 1];
         ArrayList var5 = Lists.newArrayList();

         for(GameProfile var9 : Md.Jc().PN()) {
            if (!Md.Jc().Pw().p(var9) && i(var4, var9.getName())) {
               var5.add(var9.getName());
            }
         }

         return var5;
      } else {
         return null;
      }
   }

   public String vJ() {
      return r.q[991 & 6126];
   }

   public String e(wZ var1) {
      return r.q[2031 & -31793];
   }

   public int vE() {
      return 3;
   }

   public void q(wZ var1, String[] var2) {
      if (var2.length == 1 && var2[0].length() > 0) {
         Md var3 = Md.Jc();
         GameProfile var4 = var3.Po().cB(var2[0]);
         if (var4 == null) {
            throw new wq(r.q[-30768 & 19412], new Object[]{var2[0]});
         } else {
            var3.Pw().a(var4);
            q(var1, this, r.q[11221 & -14351], new Object[]{var2[0]});
         }
      } else {
         throw new xr(r.q[991 & 975], new Object[0]);
      }
   }
}
