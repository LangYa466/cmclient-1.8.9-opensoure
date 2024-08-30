package net.optifine.util;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class CacheObjectArray {
   private static final int cVk = 10;
   private static final ArrayDeque cVl = new ArrayDeque();

   private static long bQ(int var0, int var1) {
      long var2 = System.currentTimeMillis();

      for(int var4 = 0; var4 < var1; ++var4) {
         .hI[] var5 = new .hI[var0];
      }

      long var6 = System.currentTimeMillis();
      return var6 - var2;
   }

   public static void main(String[] var0) {
      short var1 = 4096;
      int var2 = 500000;
      bT(var1, var2);
      bR(var1, var2);
      bQ(var1, var2);
      bS(var1, var2);
      q(.hI.class, var1, var2);
      long var3 = bT(var1, var2);
      long var5 = bR(var1, var2);
      long var7 = bQ(var1, var2);
      long var9 = bS(var1, var2);
      long var11 = q(.hI.class, var1, var2);
      .MV.cM(.r.q[655 & -11860] + var3);
      .MV.cM(.r.q[141 & 7309] + var5);
      .MV.cM(.r.q[143 & 750] + var7);
      .MV.cM(.r.q[25343 & 7567] + var9);
      .MV.cM(.r.q[12754 & 19120] + var11);
   }

   private static long bR(int var0, int var1) {
      long var2 = System.currentTimeMillis();
      int[] var4 = new int[var0];

      for(int var5 = 0; var5 < var1; ++var5) {
         int[] var6 = (int[])var4.clone();
      }

      long var7 = System.currentTimeMillis();
      return var7 - var2;
   }

   private static long bS(int var0, int var1) {
      long var2 = System.currentTimeMillis();
      .hI[] var4 = new .hI[var0];

      for(int var5 = 0; var5 < var1; ++var5) {
         .hI[] var6 = (.hI[])var4.clone();
      }

      long var7 = System.currentTimeMillis();
      return var7 - var2;
   }

   private static synchronized int[] jB(int var0) {
      int[] var1 = (int[])cVl.pollLast();
      if (var1 == null || var1.length < var0) {
         var1 = new int[var0];
      }

      return var1;
   }

   public static synchronized void j(int[] var0) {
      if (cVl.size() < 10) {
         cVl.add(var0);
      }

   }

   private static long q(Class var0, int var1, int var2) {
      long var3 = System.currentTimeMillis();

      for(int var5 = 0; var5 < var2; ++var5) {
         Object[] var6 = Array.newInstance(var0, var1);
      }

      long var7 = System.currentTimeMillis();
      return var7 - var3;
   }

   private static long bT(int var0, int var1) {
      long var2 = System.currentTimeMillis();

      for(int var4 = 0; var4 < var1; ++var4) {
         int[] var5 = (int[])Array.newInstance(Integer.TYPE, var0);
      }

      long var6 = System.currentTimeMillis();
      return var6 - var2;
   }
}
