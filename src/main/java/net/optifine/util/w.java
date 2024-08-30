package net.optifine.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class w {
   public static String q(float[] var0, String var1) {
      if (var0 == null) {
         return .q.q[1544 & 10464];
      } else {
         StringBuffer var2 = new StringBuffer(var0.length * 5);

         for(int var3 = 0; var3 < var0.length; ++var3) {
            float var4 = var0[var3];
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append(var4);
         }

         return var2.toString();
      }
   }

   public static int[] w(int[] var0, int var1) {
      return q(var0, new int[]{var1});
   }

   public static String t(float[] var0) {
      return q(var0, .q.q[3182 & 8815]);
   }

   public static String q(Object[] var0, String var1) {
      if (var0 == null) {
         return .q.q[16581 & 5136];
      } else {
         StringBuffer var2 = new StringBuffer(var0.length * 5);

         for(int var3 = 0; var3 < var0.length; ++var3) {
            Object var4 = var0[var3];
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append(var4);
         }

         return var2.toString();
      }
   }

   public static String q(int[] var0, String var1) {
      if (var0 == null) {
         return .q.q[6224 & 25090];
      } else {
         StringBuffer var2 = new StringBuffer(var0.length * 5);

         for(int var3 = 0; var3 < var0.length; ++var3) {
            int var4 = var0[var3];
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append(var4);
         }

         return var2.toString();
      }
   }

   public static Object[] q(Object[] var0, Object[] var1) {
      if (var0 == null) {
         throw new NullPointerException(.w.q[6103 & 2902]);
      } else if (var1.length == 0) {
         return var0;
      } else {
         int var2 = var0.length;
         int var3 = var2 + var1.length;
         Object[] var4 = Array.newInstance(var0.getClass().getComponentType(), var3);
         System.arraycopy(var0, 0, var4, 0, var2);
         System.arraycopy(var1, 0, var4, var2, var1.length);
         return var4;
      }
   }

   public static String w(Object[] var0) {
      return q(var0, .q.q[8431 & 7790]);
   }

   public static boolean w(Object var0, Object[] var1) {
      if (var1 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            Object var3 = var1[var2];
            if (var0 == var3) {
               return true;
            }
         }

         return false;
      }
   }

   public static Object[] q(Collection var0, Class var1) {
      if (var0 == null) {
         return null;
      } else if (var1 == null) {
         return null;
      } else if (var1.isPrimitive()) {
         throw new IllegalArgumentException(.w.q[9047 & 855] + var1);
      } else {
         Object[] var2 = Array.newInstance(var1, var0.size());
         return var0.toArray(var2);
      }
   }

   public static boolean q(Object var0, Object[] var1) {
      if (var1 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            Object var3 = var1[var2];
            if (e(var0, var3)) {
               return true;
            }
         }

         return false;
      }
   }

   public static Object[] q(Object[] var0, Object var1, int var2) {
      ArrayList var3 = new ArrayList(Arrays.asList(var0));
      var3.add(var2, var1);
      Object[] var4 = Array.newInstance(var0.getClass().getComponentType(), var3.size());
      return var3.toArray(var4);
   }

   public static boolean e(Object[] var0, Object var1) {
      if (var0 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            Object var3 = var0[var2];
            if (var3 == var1) {
               return true;
            }
         }

         return false;
      }
   }

   public static int[] q(Integer[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return new int[0];
      } else {
         int[] var1 = new int[var0.length];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = var0[var2].intValue();
         }

         return var1;
      }
   }

   public static String e(int[] var0, String var1) {
      if (var0 == null) {
         return .q.q[2670 & -11008];
      } else {
         StringBuffer var2 = new StringBuffer(var0.length * 5);

         for(int var3 = 0; var3 < var0.length; ++var3) {
            int var4 = var0[var3];
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append(.o.q[-15490 & 16375]);
            var2.append(Integer.toHexString(var4));
         }

         return var2.toString();
      }
   }

   public static int[] q(int[] var0, int[] var1) {
      if (var0 != null && var1 != null) {
         int var2 = var0.length;
         int var3 = var2 + var1.length;
         int[] var4 = new int[var3];
         System.arraycopy(var0, 0, var4, 0, var2);
         System.arraycopy(var1, 0, var4, 0 + var2, var1.length);
         return var4;
      } else {
         throw new NullPointerException(.w.q[2903 & 13142]);
      }
   }

   public static Object[] w(Object[] var0, Object var1) {
      if (var0 == null) {
         throw new NullPointerException(.w.q[21334 & 1887]);
      } else {
         int var2 = var0.length;
         int var3 = var2 + 1;
         Object[] var4 = Array.newInstance(var0.getClass().getComponentType(), var3);
         System.arraycopy(var0, 0, var4, 0, var2);
         var4[var2] = var1;
         return var4;
      }
   }

   public static String q(float[] var0, String var1, String var2) {
      if (var0 == null) {
         return .q.q[-14808 & 148];
      } else {
         StringBuffer var3 = new StringBuffer(var0.length * 5);

         for(int var4 = 0; var4 < var0.length; ++var4) {
            float var5 = var0[var4];
            if (var4 > 0) {
               var3.append(var1);
            }

            var3.append(String.format(var2, var5));
         }

         return var3.toString();
      }
   }

   public static boolean e(Object var0, Object var1) {
      return var0 == var1 || var0 != null && var0.equals(var1);
   }

   public static Object[] q(Object[] var0, Object var1) {
      ArrayList var2 = new ArrayList(Arrays.asList(var0));
      var2.remove(var1);
      Object[] var3 = q(var2, var0.getClass().getComponentType());
      return var3;
   }

   public static String o(int[] var0) {
      return q(var0, .q.q[16494 & 8687]);
   }

   public static boolean r(int var0, int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] == var0) {
            return true;
         }
      }

      return false;
   }

   public static String q(boolean[] var0, String var1) {
      if (var0 == null) {
         return .q.q[17168 & 2051];
      } else {
         StringBuffer var2 = new StringBuffer(var0.length * 5);

         for(int var3 = 0; var3 < var0.length; ++var3) {
            boolean var4 = var0[var3];
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append(var4);
         }

         return var2.toString();
      }
   }
}
