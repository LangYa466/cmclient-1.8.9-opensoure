import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Wx implements Wp {
   private static final Logger cnK = LogManager.getLogger();
   protected final File cnL;

   public boolean dD(String var1) {
      return false;
   }

   public List abY() {
      ArrayList var1 = Lists.newArrayList();

      for(int var2 = 0; var2 < 5; ++var2) {
         String var3 = e.q[461 & -21012] + (var2 + 1);
         WB var4 = this.dK(var3);
         if (var4 != null) {
            var1.add(new Ww(var3, q.q[-32507 & 2626], var4.adD(), var4.adB(), var4.mr(), false, var4.adv(), var4.aaz()));
         }
      }

      return var1;
   }

   public String bY() {
      return o.q[5755 & 16635];
   }

   public boolean dL(String var1) {
      File var2 = new File(this.cnL, var1);
      return var2.isDirectory();
   }

   public boolean dJ(String var1) {
      File var2 = new File(this.cnL, var1);
      if (!var2.exists()) {
         return true;
      } else {
         cnK.info(o.q[126 & 28287] + var1);

         for(int var3 = 1; var3 <= 5; ++var3) {
            cnK.info(o.q[127 & 23679] + var3 + q.q[-16207 & 13816]);
            if (q(var2.listFiles())) {
               break;
            }

            cnK.warn(o.q[8578 & 5320]);
            if (var3 < 5) {
               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var5) {
                  ;
               }
            }
         }

         return var2.delete();
      }
   }

   public boolean dE(String var1) {
      return false;
   }

   public boolean q(String var1, Pb var2) {
      return false;
   }

   public Wx(File var1) {
      if (!var1.exists()) {
         var1.mkdirs();
      }

      this.cnL = var1;
   }

   public Wq f(String var1, boolean var2) {
      return new Wy(this.cnL, var1, var2);
   }

   public WB dK(String var1) {
      File var2 = new File(this.cnL, var1);
      if (!var2.exists()) {
         return null;
      } else {
         File var3 = new File(var2, w.q[927 & 10138]);
         if (var3.exists()) {
            try {
               HL var9 = Hy.y(new FileInputStream(var3));
               HL var10 = var9.bO(r.q[9845 & 6837]);
               return new WB(var10);
            } catch (Exception var7) {
               cnK.error(o.q[8316 & 18556] + var3, var7);
            }
         }

         var3 = new File(var2, r.q[16950 & -27906]);
         if (var3.exists()) {
            try {
               HL var4 = Hy.y(new FileInputStream(var3));
               HL var5 = var4.bO(r.q[-7371 & 7861]);
               return new WB(var5);
            } catch (Exception var6) {
               cnK.error(o.q[16636 & -17284] + var3, var6);
            }
         }

         return null;
      }
   }

   public void aca() {
   }

   public void k(String var1, String var2) {
      File var3 = new File(this.cnL, var1);
      if (var3.exists()) {
         File var4 = new File(var3, w.q[-31845 & 17310]);
         if (var4.exists()) {
            try {
               HL var5 = Hy.y(new FileInputStream(var4));
               HL var6 = var5.bO(r.q[16951 & 2805]);
               var6.a(r.q[-32097 & 4254], var2);
               Hy.q(var5, new FileOutputStream(var4));
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }
      }

   }

   protected static boolean q(File[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         File var2 = var0[var1];
         cnK.debug(t.q[-32497 & 14759] + var2);
         if (var2.isDirectory() && !q(var2.listFiles())) {
            cnK.warn(o.q[4545 & -32601] + var2);
            return false;
         }

         if (!var2.delete()) {
            cnK.warn(o.q[1714 & -32634] + var2);
            return false;
         }
      }

      return true;
   }

   public boolean dI(String var1) {
      File var2 = new File(this.cnL, var1);
      if (var2.exists()) {
         return false;
      } else {
         try {
            var2.mkdir();
            var2.delete();
            return true;
         } catch (Throwable var4) {
            cnK.warn(o.q[381 & -32515], var4);
            return false;
         }
      }
   }
}
