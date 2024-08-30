package net.optifine.util;

import java.util.ArrayList;

public class y {
   private int cVm;
   private float cVn;
   private int cVo;
   private ArrayList cVp;

   public void t(int var1, Object var2) {
      if (var2 != null) {
         ++this.cVo;
      }

      this.cVp.add(var1, var2);
   }

   public int amq() {
      return this.cVo;
   }

   public y(int var1) {
      this(var1, 0.75F);
   }

   public void clear() {
      this.cVp.clear();
      this.cVo = 0;
   }

   public Object jC(int var1) {
      Object var2 = this.cVp.remove(var1);
      if (var2 != null) {
         --this.cVo;
      }

      return var2;
   }

   public Object y(int var1, Object var2) {
      Object var3 = this.cVp.set(var1, var2);
      if (var2 != var3) {
         if (var3 == null) {
            ++this.cVo;
         }

         if (var2 == null) {
            --this.cVo;
         }
      }

      return var3;
   }

   public boolean contains(Object var1) {
      return this.cVp.contains(var1);
   }

   public y() {
      this(10, 0.75F);
   }

   public boolean add(Object var1) {
      if (var1 != null) {
         ++this.cVo;
      }

      return this.cVp.add(var1);
   }

   public boolean isEmpty() {
      return this.cVp.isEmpty();
   }

   public Object jD(int var1) {
      return this.cVp.get(var1);
   }

   public y(int var1, float var2) {
      this.cVp = null;
      this.cVm = 0;
      this.cVn = 1.0F;
      this.cVo = 0;
      this.cVp = new ArrayList(var1);
      this.cVm = var1;
      this.cVn = var2;
   }

   public void amr() {
      if (this.cVo <= 0 && this.cVp.size() <= 0) {
         this.clear();
      } else if (this.cVp.size() > this.cVm) {
         float var1 = (float)this.cVo / (float)this.cVp.size();
         if (var1 <= this.cVn) {
            int var2 = 0;

            for(int var3 = 0; var3 < this.cVp.size(); ++var3) {
               Object var4 = this.cVp.get(var3);
               if (var4 != null) {
                  if (var3 != var2) {
                     this.cVp.set(var2, var4);
                  }

                  ++var2;
               }
            }

            for(int var5 = this.cVp.size() - 1; var5 >= var2; --var5) {
               this.cVp.remove(var5);
            }
         }
      }

   }

   public int size() {
      return this.cVp.size();
   }
}
