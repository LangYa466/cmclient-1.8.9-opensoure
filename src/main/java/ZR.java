import java.util.Collection;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class zR {
   public static final Bi aSa = (new Bl((Bi)null, t.q[17369 & 1009], 20.0D, 0.0D, 1024.0D)).bl(t.q[9179 & -30734]).ap(true);
   public static final Bi aSb = new Bl((Bi)null, t.q[10201 & 21471], 2.0D, 0.0D, 2048.0D);
   public static final Bi aSc = (new Bl((Bi)null, t.q[2005 & 1013], 0.0D, 0.0D, 1.0D)).bl(t.q[1022 & 20439]);
   public static final Bi aSd = (new Bl((Bi)null, t.q[983 & 12255], 0.699999988079071D, 0.0D, 1024.0D)).bl(t.q[3034 & -14340]).ap(true);
   public static final Bi aSe = (new Bl((Bi)null, t.q[17403 & 3031], 32.0D, 0.0D, 2048.0D)).bl(t.q[1013 & 2004]);
   private static final Logger aSf = LogManager.getLogger();

   private static HL q(Bj var0) {
      HL var1 = new HL();
      Bi var2 = var0.Bu();
      var1.a(q.q[5055 & 3503], var2.Bo());
      var1.w(e.q[3295 & 511], var0.Bt());
      Collection var3 = var0.Br();
      if (var3 != null && !var3.isEmpty()) {
         HT var4 = new HT();

         for(Bf var6 : var3) {
            if (var6.Bl()) {
               var4.q(q(var6));
            }
         }

         var1.w(t.q[9196 & -27700], var4);
      }

      return var1;
   }

   private static void q(Bj var0, HL var1) {
      var0.h(var1.bH(e.q[-3873 & 767]));
      if (var1.d(t.q[1004 & -31795], 9)) {
         HT var2 = var1.s(t.q[-30740 & 7116], 10);

         for(int var3 = 0; var3 < var2.II(); ++var3) {
            Bf var4 = d(var2.fv(var3));
            if (var4 != null) {
               Bf var5 = var0.t(var4.Bk());
               if (var5 != null) {
                  var0.r(var5);
               }

               var0.e(var4);
            }
         }
      }

   }

   public static Bf d(HL var0) {
      UUID var1 = new UUID(var0.bJ(q.q[-15384 & 941]), var0.bJ(q.q[17385 & 1979]));

      try {
         return new Bf(var1, var0.bG(q.q[-14417 & 2559]), var0.bH(t.q[8159 & -15379]), var0.bQ(t.q[3038 & -26642]));
      } catch (Exception var3) {
         aSf.warn(t.q[-30728 & 9169] + var3.getMessage());
         return null;
      }
   }

   public static HT q(Bh var0) {
      HT var1 = new HT();

      for(Bj var3 : var0.Bq()) {
         var1.q(q(var3));
      }

      return var1;
   }

   private static HL q(Bf var0) {
      HL var1 = new HL();
      var1.a(q.q[3503 & -23569], var0.bY());
      var1.w(t.q[-31795 & 5085], var0.Bj());
      var1.a(t.q[5070 & 27598], var0.Bi());
      var1.q(q.q[21416 & 2044], var0.Bk().getMostSignificantBits());
      var1.q(q.q[-17 & 937], var0.Bk().getLeastSignificantBits());
      return var1;
   }

   public static void q(Bh var0, HT var1) {
      for(int var2 = 0; var2 < var1.II(); ++var2) {
         HL var3 = var1.fv(var2);
         Bj var4 = var0.bk(var3.bG(q.q[16879 & -22593]));
         if (var4 != null) {
            q(var4, var3);
         } else {
            aSf.warn(t.q[-29745 & 975] + var3.bG(q.q[5551 & 431]) + q.q[16494 & 2092]);
         }
      }

   }
}
