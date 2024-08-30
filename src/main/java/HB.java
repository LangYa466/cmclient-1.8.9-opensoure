import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Hb {
   private static final Hb bsV = new Hb();
   private final List bsW = Lists.newArrayList();

   public List Iq() {
      return this.bsW;
   }

   public void q(GX var1, Object... var2) {
      ArrayList var3 = Lists.newArrayList();

      for(Object var7 : var2) {
         if (var7 instanceof GX) {
            var3.add(((GX)var7).HW());
         } else if (var7 instanceof Fm) {
            var3.add(new GX((Fm)var7));
         } else {
            if (!(var7 instanceof cv)) {
               throw new IllegalArgumentException(p.q[8699 & -14985] + var7.getClass().getName() + w.q[13622 & 17268]);
            }

            var3.add(new GX((cv)var7));
         }
      }

      this.bsW.add(new Hx(var1, var3));
   }

   public GX q(EZ var1, QI var2) {
      for(He var4 : this.bsW) {
         if (var4.e(var1, var2)) {
            return var4.q(var1);
         }
      }

      return null;
   }

   public GX[] w(EZ var1, QI var2) {
      for(He var4 : this.bsW) {
         if (var4.e(var1, var2)) {
            return var4.w(var1);
         }
      }

      GX[] var5 = new GX[var1.CB()];

      for(int var6 = 0; var6 < var5.length; ++var6) {
         var5[var6] = var1.er(var6);
      }

      return var5;
   }

   private Hb() {
      (new Hu()).q(this);
      (new Hv()).q(this);
      (new Hr()).q(this);
      (new Hq()).q(this);
      (new Ho()).q(this);
      (new Hi()).q(this);
      (new Hp()).q(this);
      this.bsW.add(new Hj());
      this.bsW.add(new Hf());
      this.bsW.add(new Hs());
      this.bsW.add(new Ht());
      this.bsW.add(new Hg());
      this.bsW.add(new Hh());
      (new Hk()).q(this);
      this.w(new GX(Et.bnZ, 3), q.q[3552 & 4532], '#', Et.bmf);
      this.q(new GX(Et.bmR, 1), Et.bnZ, Et.bnZ, Et.bnZ, Et.bng);
      this.q(new GX(Et.bmU, 1), Et.bmR, new GX(Et.boc, 1, Fk.bqy.Hl()), Et.bmh);
      this.w(new GX(Ea.bis, 3), p.q[5077 & 343], p.q[1493 & 2389], '#', Et.bod, 'W', new GX(Ea.bko, 1, ff.sB.dm()));
      this.w(new GX(Ea.biD, 3), p.q[-13827 & 341], p.q[1525 & 16733], '#', Et.bod, 'W', new GX(Ea.bko, 1, ff.sD.dm()));
      this.w(new GX(Ea.bkb, 3), p.q[8535 & 885], p.q[24949 & -29859], '#', Et.bod, 'W', new GX(Ea.bko, 1, ff.sC.dm()));
      this.w(new GX(Ea.biH, 3), p.q[9557 & -11915], p.q[989 & 3413], '#', Et.bod, 'W', new GX(Ea.bko, 1, ff.sE.dm()));
      this.w(new GX(Ea.biG, 3), p.q[20821 & 3413], p.q[-32419 & 885], '#', Et.bod, 'W', new GX(Ea.bko, 1, 4 + ff.sF.dm() - 4));
      this.w(new GX(Ea.bjx, 3), p.q[6013 & 10581], p.q[2397 & -27819], '#', Et.bod, 'W', new GX(Ea.bko, 1, 4 + ff.sG.dm() - 4));
      this.w(new GX(Ea.bhp, 6, hc.ym.dm()), q.q[16816 & -31837], q.q[16820 & 480], '#', Ea.bks);
      this.w(new GX(Ea.bhp, 6, hc.yn.dm()), q.q[10675 & 4580], q.q[-30796 & 2472], '#', Ea.bjG);
      this.w(new GX(Ea.bhZ, 6), q.q[-14944 & 482], q.q[3508 & 13224], '#', Ea.bkl);
      this.w(new GX(Ea.bjw, 1), p.q[20311 & -32426], p.q[-16010 & 10071], '#', Et.bod, 'W', new GX(Ea.bko, 1, ff.sB.dm()));
      this.w(new GX(Ea.bhl, 1), p.q[16734 & 13686], p.q[4574 & -7818], '#', Et.bod, 'W', new GX(Ea.bko, 1, ff.sD.dm()));
      this.w(new GX(Ea.bku, 1), p.q[10583 & -31906], p.q[-26794 & 2390], '#', Et.bod, 'W', new GX(Ea.bko, 1, ff.sC.dm()));
      this.w(new GX(Ea.bhH, 1), p.q[7670 & -7849], p.q[16727 & -30762], '#', Et.bod, 'W', new GX(Ea.bko, 1, ff.sE.dm()));
      this.w(new GX(Ea.bjS, 1), p.q[8662 & -32386], p.q[1366 & 4438], '#', Et.bod, 'W', new GX(Ea.bko, 1, 4 + ff.sF.dm() - 4));
      this.w(new GX(Ea.bkj, 1), p.q[19958 & 854], p.q[-3617 & 342], '#', Et.bod, 'W', new GX(Ea.bko, 1, 4 + ff.sG.dm() - 4));
      this.w(new GX(Ea.bhM, 1), q.q[1452 & 24992], t.q[-12033 & 478], q.q[-29787 & 1456], '#', Ea.bko, 'X', Et.bnC);
      this.w(new GX(Et.bmY, 2), p.q[-32425 & 2551], p.q[17881 & 348], p.q[16729 & 6137], '~', Et.bmg, 'O', Et.blv);
      this.w(new GX(Ea.bhj, 1), q.q[944 & 8674], t.q[-23842 & 478], q.q[1447 & 5032], '#', Ea.bko, 'X', Et.blP);
      this.w(new GX(Ea.biv, 1), q.q[1505 & -32350], t.q[-32565 & 20616], q.q[6560 & 8690], '#', Ea.bko, 'X', Et.bmR);
      this.w(new GX(Ea.biM, 1), t.q[735 & -4641], t.q[-24353 & 1535], '#', Et.blS);
      this.w(new GX(Ea.bhe, 6), q.q[416 & 19872], '#', Ea.biM);
      this.w(new GX(Ea.biX, 1), t.q[2303 & 10207], t.q[18655 & -28417], '#', Et.blz);
      this.w(new GX(Ea.bhE, 1), t.q[21727 & 223], t.q[-20257 & 17663], '#', Et.blW);
      this.w(new GX(Ea.bib, 1), t.q[-13601 & 4575], t.q[479 & 17119], '#', Et.blo);
      this.w(new GX(Ea.bje, 1), t.q[24799 & 255], t.q[6367 & -14881], '#', Et.bns);
      this.w(new GX(Ea.bhI, 1), t.q[2047 & 28895], t.q[10495 & 479], '#', Et.bmg);
      this.w(new GX(Ea.bjE, 1), p.q[12762 & -31394], t.q[222 & 2527], p.q[346 & 22014], 'X', Et.bmZ, '#', Ea.bjg);
      this.w(new GX(Ea.bin, 6, gK.xa.dm()), q.q[-24096 & 4012], '#', Ea.bks);
      this.w(new GX(Ea.bin, 6, gK.wX.dm()), q.q[-25680 & 1508], '#', new GX(Ea.biP, gG.wu.dm()));
      this.w(new GX(Ea.bin, 6, gK.wY.dm()), q.q[1448 & 20902], '#', Ea.bhT);
      this.w(new GX(Ea.bin, 6, gK.xb.dm()), q.q[9659 & 20900], '#', Ea.bhE);
      this.w(new GX(Ea.bin, 6, gK.xc.dm()), q.q[2476 & 17314], '#', Ea.bkz);
      this.w(new GX(Ea.bin, 6, gK.xd.dm()), q.q[26041 & 928], '#', Ea.bkl);
      this.w(new GX(Ea.bin, 6, gK.xe.dm()), q.q[504 & 8611], '#', Ea.bje);
      this.w(new GX(Ea.bkt, 6, gM.xn.dm()), q.q[-13913 & 8608], '#', Ea.bjU);
      this.w(new GX(Ea.big, 6, 0), q.q[2976 & -15966], '#', new GX(Ea.bko, 1, ff.sB.dm()));
      this.w(new GX(Ea.big, 6, ff.sD.dm()), q.q[10169 & 2532], '#', new GX(Ea.bko, 1, ff.sD.dm()));
      this.w(new GX(Ea.big, 6, ff.sC.dm()), q.q[418 & -24096], '#', new GX(Ea.bko, 1, ff.sC.dm()));
      this.w(new GX(Ea.big, 6, ff.sE.dm()), q.q[418 & -20064], '#', new GX(Ea.bko, 1, ff.sE.dm()));
      this.w(new GX(Ea.big, 6, 4 + ff.sF.dm() - 4), q.q[432 & -13912], '#', new GX(Ea.bko, 1, 4 + ff.sF.dm() - 4));
      this.w(new GX(Ea.big, 6, 4 + ff.sG.dm() - 4), q.q[8610 & 5544], '#', new GX(Ea.bko, 1, 4 + ff.sG.dm() - 4));
      this.w(new GX(Ea.bjK, 3), t.q[4343 & 1317], q.q[17312 & 11699], t.q[-32731 & 6887], '#', Et.bod);
      this.w(new GX(Et.bnU, 3), t.q[-32545 & 4319], t.q[223 & 8415], t.q[-32545 & 2271], '#', new GX(Ea.bko, 1, ff.sB.dm()));
      this.w(new GX(Et.bnJ, 3), t.q[16639 & 4319], t.q[14591 & 16607], t.q[17119 & -28193], '#', new GX(Ea.bko, 1, ff.sC.dm()));
      this.w(new GX(Et.bmz, 3), t.q[7391 & 8447], t.q[2271 & 17631], t.q[-30753 & 223], '#', new GX(Ea.bko, 1, ff.sD.dm()));
      this.w(new GX(Et.bmq, 3), t.q[1503 & 17151], t.q[28895 & 2559], t.q[3327 & -28193], '#', new GX(Ea.bko, 1, ff.sE.dm()));
      this.w(new GX(Et.bmC, 3), t.q[735 & -19201], t.q[16607 & -24353], t.q[4575 & 8415], '#', new GX(Ea.bko, 1, ff.sF.dm()));
      this.w(new GX(Et.bnt, 3), t.q[17119 & -29441], t.q[12543 & 17375], t.q[735 & 2271], '#', new GX(Ea.bko, 1, ff.sG.dm()));
      this.w(new GX(Ea.bjl, 2), q.q[-24158 & 2473], q.q[28073 & 4532], '#', Ea.bko);
      this.w(new GX(Et.bnW, 3), t.q[1759 & -18209], t.q[4319 & 223], t.q[223 & 17407], '#', Et.bmQ);
      this.w(new GX(Ea.bjY, 1), t.q[2271 & 29919], t.q[10463 & 21215], '#', Et.bmQ);
      this.w(new GX(Et.bma, 3), q.q[490 & -32348], q.q[17312 & 12784], p.q[1499 & 8571], '#', Ea.bko, 'X', Et.bod);
      this.w(new GX(Et.blZ, 1), p.q[1404 & -32292], p.q[16861 & 8541], y.q[26175 & -32065], 'A', Et.bmW, 'B', Et.bov, 'C', Et.bnB, 'E', Et.blL);
      this.w(new GX(Et.bov, 1), q.q[-32329 & 12713], '#', Et.bmf);
      this.w(new GX(Ea.bko, 4, ff.sB.dm()), q.q[8613 & 16867], '#', new GX(Ea.bkr, 1, ff.sB.dm()));
      this.w(new GX(Ea.bko, 4, ff.sC.dm()), q.q[1533 & 23457], '#', new GX(Ea.bkr, 1, ff.sC.dm()));
      this.w(new GX(Ea.bko, 4, ff.sD.dm()), q.q[1001 & 10657], '#', new GX(Ea.bkr, 1, ff.sD.dm()));
      this.w(new GX(Ea.bko, 4, ff.sE.dm()), q.q[5601 & 2489], '#', new GX(Ea.bkr, 1, ff.sE.dm()));
      this.w(new GX(Ea.bko, 4, 4 + ff.sF.dm() - 4), q.q[939 & 1505], '#', new GX(Ea.bjn, 1, ff.sF.dm() - 4));
      this.w(new GX(Ea.bko, 4, 4 + ff.sG.dm() - 4), q.q[-32351 & 14323], '#', new GX(Ea.bjn, 1, ff.sG.dm() - 4));
      this.w(new GX(Et.bod, 4), q.q[4521 & 17825], q.q[481 & -20043], '#', Ea.bko);
      this.w(new GX(Ea.bjq, 4), q.q[82 & 7127], q.q[4581 & 8609], 'X', Et.blH, '#', Et.bod);
      this.w(new GX(Ea.bjq, 4), q.q[18522 & 5366], q.q[5537 & 10679], 'X', new GX(Et.blH, 1, 1), '#', Et.bod);
      this.w(new GX(Et.blQ, 4), t.q[293 & 20653], t.q[-15816 & 1049], '#', Ea.bko);
      this.w(new GX(Et.blF, 3), t.q[-25561 & 24869], t.q[-30178 & 120], '#', Ea.bif);
      this.w(new GX(Ea.bgR, 16), p.q[9694 & -13986], p.q[10203 & 16734], p.q[26462 & 4447], 'X', Et.bmQ, '#', Et.bod);
      this.w(new GX(Ea.bkm, 6), p.q[22878 & 9726], p.q[1019 & -11938], p.q[9567 & 4479], 'X', Et.blD, 'R', Et.blP, '#', Et.bod);
      this.w(new GX(Ea.bhA, 6), p.q[2408 & -6688], p.q[3550 & 12634], p.q[4467 & 2404], 'X', Et.bmQ, '#', Ea.bhP, 'S', Et.bod);
      this.w(new GX(Ea.bhY, 6), p.q[-5793 & 4478], p.q[4602 & 8538], p.q[-31393 & 351], 'X', Et.bmQ, 'R', Et.blP, '#', Ea.biu);
      this.w(new GX(Et.bli, 1), t.q[-2523 & 53], q.q[1440 & 27058], '#', Et.bmQ);
      this.w(new GX(Et.bmX, 1), t.q[8557 & 1063], t.q[-32723 & 1333], q.q[2468 & 1019], '#', Et.bmQ);
      this.w(new GX(Et.bnN, 1), y.q[2965 & 16917], q.q[496 & 2978], '#', Ea.bks, 'B', Et.bnK);
      this.w(new GX(Ea.bio, 1), p.q[1889 & -26247], p.q[8546 & 16894], 'A', Ea.biV, 'B', Ea.bjq);
      this.w(new GX(Et.bmO, 1), p.q[-23193 & 20849], p.q[-32398 & 26986], 'A', Ea.bjP, 'B', Et.bli);
      this.w(new GX(Et.bnm, 1), p.q[-10887 & 9057], p.q[17762 & 4450], 'A', Ea.bkE, 'B', Et.bli);
      this.w(new GX(Et.blR, 1), p.q[2403 & -10391], p.q[-23582 & 16746], 'A', Ea.bjE, 'B', Et.bli);
      this.w(new GX(Et.bml, 1), p.q[487 & 2401], p.q[883 & -7838], 'A', Ea.bhk, 'B', Et.bli);
      this.w(new GX(Et.bmc, 1), t.q[-23507 & 4151], q.q[944 & 8685], '#', Ea.bko);
      this.w(new GX(Et.bmP, 1), t.q[175 & 5685], t.q[4380 & 8731], '#', Et.bmQ);
      this.w(new GX(Et.bmb, 1), t.q[53 & 10925], t.q[-32707 & 28186], '#', Et.blW);
      this.q(new GX(Et.bna, 1), new GX(Et.bmQ, 1), new GX(Et.bos, 1));
      this.w(new GX(Et.bnl, 1), q.q[27041 & 5116], '#', Et.bnB);
      this.w(new GX(Ea.bih, 4), r.q[13310 & 3071], t.q[191 & -8070], q.q[-32352 & 18405], '#', new GX(Ea.bko, 1, ff.sB.dm()));
      this.w(new GX(Ea.bjX, 4), r.q[21502 & 3070], t.q[18554 & -31042], q.q[5034 & 9636], '#', new GX(Ea.bko, 1, ff.sD.dm()));
      this.w(new GX(Ea.bhD, 4), r.q[-31745 & 18430], t.q[254 & 3642], q.q[22944 & 1448], '#', new GX(Ea.bko, 1, ff.sC.dm()));
      this.w(new GX(Ea.biA, 4), r.q[6142 & 1022], t.q[639 & 314], q.q[16805 & 3040], '#', new GX(Ea.bko, 1, ff.sE.dm()));
      this.w(new GX(Ea.bhr, 4), r.q[18431 & 9214], t.q[17530 & 442], q.q[1522 & 16812], '#', new GX(Ea.bko, 1, 4 + ff.sF.dm() - 4));
      this.w(new GX(Ea.bjB, 4), r.q[1022 & -13314], t.q[7290 & -16326], q.q[5544 & 2484], '#', new GX(Ea.bko, 1, 4 + ff.sG.dm() - 4));
      this.w(new GX(Et.bmu, 1), t.q[5138 & 24579], p.q[-28465 & 8447], p.q[18896 & 4313], '#', Et.bod, 'X', Et.bmg);
      this.w(new GX(Et.bow, 1), t.q[-5745 & 236], p.q[-15885 & 1379], '#', Et.bmu, 'X', Et.bmK);
      this.w(new GX(Ea.bht, 4), r.q[4094 & 5119], t.q[3135 & -32710], q.q[1440 & -25688], '#', Ea.bks);
      this.w(new GX(Ea.bhB, 4), r.q[3071 & -30722], t.q[17982 & 187], q.q[1448 & -19548], '#', Ea.bhE);
      this.w(new GX(Ea.bky, 4), r.q[-14338 & 3070], t.q[18747 & 9406], q.q[421 & 18928], '#', Ea.bkz);
      this.w(new GX(Ea.bii, 4), r.q[9214 & 6143], t.q[2618 & 8314], q.q[1460 & -30229], '#', Ea.bkl);
      this.w(new GX(Ea.biY, 4), r.q[1022 & -5122], t.q[-28294 & 1214], q.q[10144 & -11870], '#', Ea.bhT);
      this.w(new GX(Ea.bjk, 4), r.q[1023 & -1026], t.q[-22214 & 16507], q.q[4000 & 4605], '#', Ea.bjU);
      this.w(new GX(Ea.bjp, 4), r.q[1022 & 1022], t.q[-32710 & 17915], q.q[16800 & 10739], '#', Ea.bje);
      this.w(new GX(Et.bnD, 1), q.q[2464 & -11800], t.q[-16162 & 14047], q.q[-26196 & 18338], '#', Et.bod, 'X', Ea.bhI);
      this.w(new GX(Et.bne, 1), q.q[16808 & 1445], t.q[24799 & 1022], q.q[-31328 & 8608], '#', Et.bod, 'X', Et.bng);
      this.w(new GX(Et.blf, 1, 0), q.q[421 & 2978], t.q[5598 & 16607], q.q[-32334 & 1444], '#', Et.blD, 'X', Et.bnj);
      this.w(new GX(Et.blf, 1, 1), q.q[-15447 & 482], t.q[4318 & -13826], q.q[438 & 6560], '#', Ea.biZ, 'X', Et.bnj);
      this.w(new GX(Et.bnX, 1, 0), q.q[18912 & -28242], t.q[734 & 9439], q.q[16864 & 8621], '#', Et.bln, 'X', Et.bmK);
      this.w(new GX(Et.blJ, 1), q.q[16826 & 10208], t.q[2782 & -27170], q.q[11188 & 417], '#', Et.bln, 'X', Et.bkY);
      this.w(new GX(Ea.bhm, 1), q.q[-30510 & 4722], q.q[16353 & 433], '#', Ea.bks, 'X', Et.bod);
      this.w(new GX(Ea.bho, 2), p.q[484 & 876], e.q[6968 & -30856], q.q[8609 & -31317], '#', Ea.bko, 'S', Et.bod, 'I', Et.bmQ);
      this.w(new GX(Ea.bhP, 1), q.q[8795 & 21590], q.q[2465 & 1469], '#', Et.bod, 'X', Et.blP);
      this.w(new GX(Et.blY, 1), t.q[478 & 1246], p.q[12141 & -28299], '#', Ea.bhP, 'X', Et.blP, 'I', new GX(Ea.biP, 1, gG.wu.dm()));
      this.w(new GX(Et.bmv, 1), t.q[5208 & 830], t.q[12510 & 16606], p.q[8567 & 21861], '#', Ea.bhP, 'X', Et.bns, 'I', new GX(Ea.biP, 1, gG.wu.dm()));
      this.w(new GX(Et.bnP, 1), t.q[5468 & 18458], t.q[28894 & -29954], t.q[2458 & 24665], '#', Et.blD, 'X', Et.blP);
      this.w(new GX(Et.boh, 1), t.q[9436 & -26055], t.q[2302 & 13278], t.q[2073 & -6856], '#', Et.bmQ, 'X', Et.blP);
      this.w(new GX(Et.bla, 1), q.q[4576 & 3498], t.q[4574 & 2270], q.q[-26208 & 16808], '#', Et.bnZ, 'X', Et.boh);
      this.w(new GX(Ea.bhK, 1), q.q[-31827 & 19889], '#', new GX(Ea.biP, 1, gG.wu.dm()));
      this.w(new GX(Ea.bjt, 1), q.q[947 & 8621], '#', Ea.bko);
      this.w(new GX(Ea.biu, 1), t.q[223 & 2527], '#', new GX(Ea.biP, 1, gG.wu.dm()));
      this.w(new GX(Ea.bhb, 1), t.q[255 & -27681], '#', Ea.bko);
      this.w(new GX(Ea.bhd, 1), t.q[-5409 & 1279], '#', Et.bmQ);
      this.w(new GX(Ea.bjm, 1), t.q[-32545 & 1535], '#', Et.blD);
      this.w(new GX(Ea.biR, 1), q.q[8617 & 2980], t.q[254 & -12065], p.q[1510 & 20838], '#', Ea.bks, 'X', Et.bmx, 'R', Et.blP);
      this.w(new GX(Ea.bhR, 1), q.q[25004 & 8176], t.q[4149 & -30681], p.q[-28185 & 358], '#', Ea.bks, 'R', Et.blP);
      this.w(new GX(Ea.bkc, 1), p.q[2407 & 1391], t.q[19678 & -32034], p.q[486 & -20106], '#', Ea.bks, 'X', Et.bmQ, 'R', Et.blP, 'T', Ea.bko);
      this.w(new GX(Ea.bhS, 1), e.q[-27844 & 2040], p.q[-16024 & 2542], 'S', Et.blv, 'P', Ea.bkc);
      this.w(new GX(Et.bnG, 1), q.q[428 & 10720], t.q[-22130 & 16520], '#', Ea.bhI, 'X', Ea.bko);
      this.w(new GX(Ea.bia, 1), y.q[-31939 & 28311], p.q[-22149 & 20973], q.q[17312 & 1520], '#', Ea.bit, 'B', Et.bmR, 'D', Et.bnC);
      this.w(new GX(Ea.bjO, 1), p.q[-30747 & 16759], p.q[875 & -8834], p.q[-14997 & 379], 'I', Ea.biW, 'i', Et.bmQ);
      this.w(new GX(Et.bng), t.q[25055 & -28449], t.q[25311 & -32513], '#', Et.bkW);
      this.q(new GX(Et.bmt, 1), Et.blp, Et.bmH);
      this.q(new GX(Et.bnw, 3), Et.bmZ, Et.bmH, Et.blH);
      this.q(new GX(Et.bnw, 3), Et.bmZ, Et.bmH, new GX(Et.blH, 1, 1));
      this.w(new GX(Ea.bjT), y.q[564 & -27978], p.q[18926 & 381], p.q[16765 & -32403], 'G', Ea.bif, 'Q', Et.bns, 'W', Ea.big);
      this.w(new GX(Ea.bhk), p.q[366 & 17278], p.q[367 & 3567], p.q[380 & -24080], 'I', Et.bmQ, 'C', Ea.bjP);
      this.w(new GX(Et.bnR, 1), p.q[1403 & 501], o.q[460 & -22659], p.q[8566 & -31886], '/', Et.bod, '_', new GX(Ea.bin, 1, gK.wX.dm()));
      Collections.sort(this.bsW, new Hc(this));
   }

   public void q(He var1) {
      this.bsW.add(var1);
   }

   public Hw w(GX var1, Object... var2) {
      String var3 = q.q[22122 & 8196];
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      if (var2[var4] instanceof String[]) {
         String[] var11 = (String[])var2[var4++];

         for(int var8 = 0; var8 < var11.length; ++var8) {
            String var9 = var11[var8];
            ++var6;
            var5 = var9.length();
            var3 = var3 + var9;
         }
      } else {
         while(var2[var4] instanceof String) {
            String var7 = (String)var2[var4++];
            ++var6;
            var5 = var7.length();
            var3 = var3 + var7;
         }
      }

      HashMap var12;
      for(var12 = Maps.newHashMap(); var4 < var2.length; var4 += 2) {
         Character var13 = (Character)var2[var4];
         GX var15 = null;
         if (var2[var4 + 1] instanceof Fm) {
            var15 = new GX((Fm)var2[var4 + 1]);
         } else if (var2[var4 + 1] instanceof cv) {
            var15 = new GX((cv)var2[var4 + 1], 1, 32767);
         } else if (var2[var4 + 1] instanceof GX) {
            var15 = (GX)var2[var4 + 1];
         }

         var12.put(var13, var15);
      }

      GX[] var14 = new GX[var5 * var6];

      for(int var16 = 0; var16 < var5 * var6; ++var16) {
         char var10 = var3.charAt(var16);
         if (var12.containsKey(Character.valueOf(var10))) {
            var14[var16] = ((GX)var12.get(Character.valueOf(var10))).HW();
         } else {
            var14[var16] = null;
         }
      }

      Hw var17 = new Hw(var5, var6, var14, var1);
      this.bsW.add(var17);
      return var17;
   }

   public static Hb Ir() {
      return bsV;
   }
}
