import com.mojang.authlib.GameProfile;
import java.util.List;

public class xA extends wd {
   public int vE() {
      return 3;
   }

   public String vJ() {
      return i.q[-32757 & 13019];
   }

   public void q(wZ var1, String[] var2) {
      if (var2.length == 1 && var2[0].length() > 0) {
         Md var3 = Md.Jc();
         GameProfile var4 = var3.Pw().Qv().cG(var2[0]);
         if (var4 == null) {
            throw new wq(i.q[20685 & 1325], new Object[]{var2[0]});
         } else {
            var3.Pw().t(var4);
            q(var1, this, i.q[3119 & 590], new Object[]{var2[0]});
         }
      } else {
         throw new xr(i.q[16652 & -23540], new Object[0]);
      }
   }

   public String e(wZ var1) {
      return i.q[332 & -25938];
   }

   public List q(wZ var1, String[] var2, NW var3) {
      return var2.length == 1 ? q(var2, Md.Jc().Pw().Qw()) : null;
   }
}
