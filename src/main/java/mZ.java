import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mz {
   public static final File bGN = new File(o.q[2930 & -31838]);
   public static final File bGO = new File(o.q[-27873 & 799]);
   public static final File bGP = new File(o.q[7077 & -31901]);
   public static final File bGQ = new File(o.q[2864 & -26707]);
   private static final Logger bGR = LogManager.getLogger();

   // $FF: synthetic method
   static Logger hc() {
      return bGR;
   }

   private static void q(Md var0, Collection var1, ProfileLookupCallback var2) {
      String[] var3 = (String[])Iterators.toArray(Iterators.filter(var1.iterator(), new MA()), String.class);
      if (var0.PZ()) {
         var0.Pt().findProfilesByNames(var3, Agent.MINECRAFT, var2);
      } else {
         for(String var7 : var3) {
            UUID var8 = DD.e(new GameProfile((UUID)null, var7));
            GameProfile var9 = new GameProfile(var8, var7);
            var2.onProfileLookupSucceeded(var9);
         }
      }

   }

   public static String cC(String var0) {
      if (!PQ.Z(var0) && var0.length() <= 16) {
         Md var1 = Md.Jc();
         GameProfile var2 = var1.Po().cB(var0);
         if (var2 != null && var2.getId() != null) {
            return var2.getId().toString();
         } else if (!var1.PD() && var1.PZ()) {
            ArrayList var3 = Lists.newArrayList();
            MB var4 = new MB(var1, var3);
            q(var1, Lists.newArrayList(new String[]{var0}), var4);
            return var3.size() > 0 && ((GameProfile)var3.get(0)).getId() != null ? ((GameProfile)var3.get(0)).getId().toString() : q.q[16473 & -20096];
         } else {
            return DD.e(new GameProfile((UUID)null, var0)).toString();
         }
      } else {
         return var0;
      }
   }
}
