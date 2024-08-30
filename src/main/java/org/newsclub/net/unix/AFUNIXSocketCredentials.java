package org.newsclub.net.unix;

import java.util.Arrays;
import java.util.UUID;

public final class AFUNIXSocketCredentials {
   private long dlk = -1L & -1L;
   private UUID dll = null;
   private long[] dlm = null;
   private long dln = -1L & -1L;

   public int hashCode() {
      int var1 = 31 & 17631;
      int var2 = 2067 & 8613;
      var2 = (-15841 & 2303) * var2 + Arrays.hashCode(this.dlm);
      var2 = (16927 & -28641) * var2 + (int)(this.dlk ^ this.dlk >>> (1056 & 16420));
      var2 = (-20353 & 3487) * var2 + (int)(this.dln ^ this.dln >>> (8234 & 288));
      var2 = (-30689 & 95) * var2 + (this.dll == null ? 2307 & 4224 : this.dll.hashCode());
      return var2;
   }

   void w(long[] var1) {
      this.dlm = (long[])var1.clone();
   }

   public long[] ath() {
      return this.dlm == null ? null : (long[])this.dlm.clone();
   }

   void hx(String var1) {
      this.dll = UUID.fromString(var1);
   }

   public UUID ati() {
      return this.dll;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(super.toString());
      var1.append((char)('쁟' & '㑛'));
      if (this.dln != (-1L & -1L)) {
         var1.append(.r.q[-4177 & -9301 & 31731 & -19593]).append(this.dln).append(.r.q[9125 & 7973 & -23578 & 4981]);
      }

      if (this.dlm != null) {
         var1.append(.r.q[-23753 & -13523 & 2031 & -14353]).append(Arrays.toString(this.dlm)).append(.r.q[957 & 814 & 24358 & 6966]);
      }

      if (this.dlk != (-1L & -1L)) {
         var1.append(.r.q[2879 & 1847 & 24438 & 31527]).append(this.dlk).append(.r.q[-14548 & 5949 & 17324 & 17188]);
      }

      if (this.dll != null) {
         var1.append(.r.q[-1177 & -7305 & 2863 & 17279]).append(this.dll).append(.r.q[9212 & 10101 & -25729 & -21721]);
      }

      if (var1.charAt(var1.length() - (-30655 & 819)) == (14143 & 16443)) {
         var1.setLength(var1.length() - (20613 & 10265));
      }

      var1.append((char)('豝' & '䁝'));
      return var1.toString();
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return (boolean)(-15359 & 4681);
      } else if (var1 == null) {
         return (boolean)(64 & -15344);
      } else if (this.getClass() != var1.getClass()) {
         return (boolean)(19172 & 8449);
      } else {
         AFUNIXSocketCredentials var2 = (AFUNIXSocketCredentials)var1;
         if (!Arrays.equals(this.dlm, var2.dlm)) {
            return (boolean)(4 & 256);
         } else if (this.dlk != var2.dlk) {
            return (boolean)(20516 & -24560);
         } else if (this.dln != var2.dln) {
            return (boolean)(1443 & 23104);
         } else {
            if (this.dll == null) {
               if (var2.dll != null) {
                  return (boolean)(-26607 & 2);
               }
            } else if (!this.dll.equals(var2.dll)) {
               return (boolean)(25857 & -32768);
            }

            return (boolean)(1061 & 16715);
         }
      }
   }

   public long atj() {
      return this.dln;
   }

   public long atk() {
      return this.dlk;
   }

   public long atl() {
      return this.dlm == null ? -1L & -1L : (this.dlm.length == 0 ? -1L & -1L : this.dlm[513 & 6166]);
   }
}
