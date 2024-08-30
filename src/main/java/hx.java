import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.UUID;

public final class HX {
   public static GameProfile n(HL var0) {
      String var1 = null;
      String var2 = null;
      if (var0.d(q.q[-30289 & 1007], 8)) {
         var1 = var0.bG(q.q[-31297 & 495]);
      }

      if (var0.d(o.q[325 & 101], 8)) {
         var2 = var0.bG(o.q[-24475 & 5197]);
      }

      if (PQ.Z(var1) && PQ.Z(var2)) {
         return null;
      } else {
         UUID var3;
         try {
            var3 = UUID.fromString(var2);
         } catch (Throwable var12) {
            var3 = null;
         }

         GameProfile var4 = new GameProfile(var3, var1);
         if (var0.d(w.q[-19490 & 17379], 10)) {
            HL var5 = var0.bO(w.q[15302 & 17362]);

            for(String var7 : var5.IG()) {
               HT var8 = var5.s(var7, 10);

               for(int var9 = 0; var9 < var8.II(); ++var9) {
                  HL var10 = var8.fv(var9);
                  String var11 = var10.bG(w.q[4971 & 26943]);
                  if (var10.d(p.q[-28426 & 9422], 8)) {
                     var4.getProperties().put(var7, new Property(var7, var11, var10.bG(p.q[4294 & 25303])));
                  } else {
                     var4.getProperties().put(var7, new Property(var7, var11));
                  }
               }
            }
         }

         return var4;
      }
   }

   public static HL q(HL var0, GameProfile var1) {
      if (!PQ.Z(var1.getName())) {
         var0.a(q.q[16815 & 943], var1.getName());
      }

      if (var1.getId() != null) {
         var0.a(o.q[-28585 & 2373], var1.getId().toString());
      }

      if (!var1.getProperties().isEmpty()) {
         HL var2 = new HL();

         for(String var4 : var1.getProperties().keySet()) {
            HT var5 = new HT();

            for(Property var7 : var1.getProperties().get(var4)) {
               HL var8 = new HL();
               var8.a(w.q[299 & 18799], var7.getValue());
               if (var7.hasSignature()) {
                  var8.a(p.q[198 & 21999], var7.getSignature());
               }

               var5.q(var8);
            }

            var2.w(var4, var5);
         }

         var0.w(w.q[10183 & -27710], var2);
      }

      return var0;
   }

   public static boolean q(HE var0, HE var1, boolean var2) {
      if (var0 == var1) {
         return true;
      } else if (var0 == null) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (!var0.getClass().equals(var1.getClass())) {
         return false;
      } else if (var0 instanceof HL) {
         HL var9 = (HL)var0;
         HL var10 = (HL)var1;

         for(String var12 : var9.IG()) {
            HE var13 = var9.bP(var12);
            if (!q(var13, var10.bP(var12), var2)) {
               return false;
            }
         }

         return true;
      } else if (var0 instanceof HT && var2) {
         HT var3 = (HT)var0;
         HT var4 = (HT)var1;
         if (var3.II() == 0) {
            return var4.II() == 0;
         } else {
            for(int var5 = 0; var5 < var3.II(); ++var5) {
               HE var6 = var3.fw(var5);
               boolean var7 = false;

               for(int var8 = 0; var8 < var4.II(); ++var8) {
                  if (q(var6, var4.fw(var8), var2)) {
                     var7 = true;
                     break;
                  }
               }

               if (!var7) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return var0.equals(var1);
      }
   }
}
