import java.lang.reflect.Field;

public class aeC {
   private static Field dnd = null;
   private static final hS dne = hS.eV();

   public static PM fD() {
      return dne.fD();
   }

   public static Field atW() {
      if (dnd == null) {
         try {
            Field[] var0 = hS.class.getDeclaredFields();
            int var1 = var0.length;

            for(int var2 = 17284 & 65; var2 < var1; ++var2) {
               Field var3 = var0[var2];
               if (var3.getType().isAssignableFrom(PM.class)) {
                  dnd = var3;
                  dnd.setAccessible((boolean)(17409 & -30703));
                  break;
               }
            }
         } catch (Exception var4) {
            dnd = null;
         }
      }

      return dnd;
   }

   public static void q(PM var0) {
      try {
         atW().set(dne, var0);
      } catch (IllegalAccessException var2) {
         System.err.println(var2.getMessage());
      }

   }
}
