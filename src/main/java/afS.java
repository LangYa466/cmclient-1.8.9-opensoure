import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;

public class afs {
   public Map dqU = new HashMap();

   public afq q(uK var1) {
      try {
         BufferedReader var2 = new BufferedReader(new InputStreamReader(var1.getInputStream()));
         Throwable var3 = null;

         afq var20;
         try {
            afq var4 = new afq();

            String var5;
            while((var5 = var2.readLine()) != null) {
               if (!var5.isEmpty() && !var5.startsWith(q.q[10211 & 14307 & 18867 & -29251])) {
                  String[] var6 = var5.split(q.q[987 & 16382 & -17941 & 32619]);
                  String var7 = var6[5600 & 26639];
                  int var8 = -1 & -1;
                  switch(var7.hashCode()) {
                  case 102:
                     if (var7.equals(q.q[30837 & 6654 & 123 & 1405])) {
                        var8 = 2611 & -11133;
                     }
                     break;
                  case 118:
                     if (var7.equals(w.q[-19749 & 13051 & 28383 & 22523])) {
                        var8 = 3142 & 21000;
                     }
                     break;
                  case 3768:
                     if (var7.equals(w.q[-10497 & 17407 & 20222 & 1759])) {
                        var8 = 17541 & 12555;
                     }
                     break;
                  case 3774:
                     if (var7.equals(w.q[-21507 & -29731 & 27389 & -11523])) {
                        var8 = 666 & 5126;
                     }
                  }

                  switch(var8) {
                  case 0:
                     var4.avd().add(new Vector3f(Float.parseFloat(var6[2161 & 647]), Float.parseFloat(var6[5058 & -29674]), Float.parseFloat(var6[-30649 & 4667])));
                     break;
                  case 1:
                     var4.avc().add(new Vector3f(Float.parseFloat(var6[-22765 & 16429]), Float.parseFloat(var6[6346 & 16642]), Float.parseFloat(var6[-7669 & 3459])));
                     break;
                  case 2:
                     var4.ava().add(new Vector2f(Float.parseFloat(var6[24779 & 33]), Float.parseFloat(var6[4258 & 8210])));
                     break;
                  case 3:
                     List var10000 = var4.avb();
                     int[] var10003 = new int[1811 & 12291];
                     var10003[16640 & 1746] = Integer.parseInt(var6[17457 & 12933].split(q.q[-23969 & -21921 & 24031 & 21631])[-32761 & 6336]);
                     var10003[5153 & 17169] = Integer.parseInt(var6[4242 & 28522].split(q.q[7391 & 8959 & 14975 & 16255])[9413 & 6184]);
                     var10003[-32758 & 22530] = Integer.parseInt(var6[-23037 & 22611].split(q.q[-31137 & -31649 & -11937 & 20831])[28736 & 2488]);
                     int[] var10004 = new int[3 & 4135];
                     var10004[4273 & 3586] = Integer.parseInt(var6[16907 & -32703].split(q.q[26751 & 17887 & 9439 & 5631])[4113 & -14783]);
                     var10004[1025 & -25849] = Integer.parseInt(var6[-17086 & 35].split(q.q[-4001 & -12065 & -29825 & 11135])[187 & 321]);
                     var10004[-27341 & 2050] = Integer.parseInt(var6[2115 & 25631].split(q.q[4223 & 5631 & -25633 & -12449])[20531 & 11393]);
                     int[] var10005 = new int[8199 & 4883];
                     var10005[283 & 8708] = Integer.parseInt(var6[257 & 2699].split(q.q[1919 & 1535 & -21409 & 14431])[-16361 & 14338]);
                     var10005[1025 & -32489] = Integer.parseInt(var6[20518 & 8459].split(q.q[-25473 & 24063 & -16161 & -20385])[5274 & -16285]);
                     var10005[3378 & -16253] = Integer.parseInt(var6[6147 & -32521].split(q.q[2655 & 3423 & -10913 & -32033])[2 & 319]);
                     var10000.add(new afr(var10003, var10004, var10005));
                  }
               }
            }

            var20 = var4;
         } catch (Throwable var17) {
            var3 = var17;
            throw var17;
         } finally {
            if (var2 != null) {
               if (var3 != null) {
                  try {
                     var2.close();
                  } catch (Throwable var16) {
                     var3.addSuppressed(var16);
                  }
               } else {
                  var2.close();
               }
            }

         }

         return var20;
      } catch (IOException var19) {
         return null;
      }
   }

   public afs(hS var1) {
      try {
         afq var2 = this.q(var1.fF().w(new PJ(u.q[6015 & 2943 & -8321 & -13441])));
         if (var2 == null) {
            var1.Bn.atI().warn(u.q[13210 & 31700 & 19397 & -26708]);
            return;
         }

         this.dqU.put(Integer.valueOf(6279 & -32393), var2);
         this.dqU.put(Integer.valueOf(-30710 & 16732), var2);
      } catch (IOException var3) {
         var1.Bn.atI().error(u.q[1960 & 13281 & 26590 & 10201], var3);
      }

   }
}
