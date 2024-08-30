import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;

public class agh implements JsonDeserializer {
   public agk m(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      if (!var1.isJsonObject()) {
         return null;
      } else {
         JsonObject var4 = (JsonObject)var1;
         agk var5 = new agk(q.q[-32077 & 5434 & 10566 & 12677]);
         if (var4.has(q.q[-26885 & -32165 & -26501 & 627])) {
            var5.bUa = var4.get(q.q[22907 & 21339 & -23469 & -23597]).getAsFloat();
         }

         if (var4.has(q.q[-23595 & -21923 & -7969 & 349])) {
            var5.bUb = var4.get(q.q[-22017 & 13535 & -28427 & -25737]).getAsFloat();
         }

         if (var4.has(q.q[1247 & -30121 & -4265 & -3233])) {
            var5.bTZ = var4.get(q.q[15231 & 3063 & -12073 & -15625]).getAsFloat();
         }

         if (var4.has(p.q[-4098 & -30754 & 25086 & 10239])) {
            var5.Xu = var4.get(p.q[13822 & 9727 & -7714 & -31778]).getAsFloat();
         }

         if (var4.has(p.q[32767 & 20479 & 17407 & -32289])) {
            var5.WZ = var4.get(p.q[8671 & -24097 & 10719 & 5087]).getAsFloat();
         }

         if (var4.has(p.q[3045 & -15363 & -27152 & -14856])) {
            var5.Xa = var4.get(p.q[6641 & -13825 & 16868 & 2540]).getAsFloat();
         }

         if (var4.has(e.q[-29624 & 17146 & 29275 & -24503])) {
            var5.dsm = var4.get(e.q[-10530 & -2436 & 2523 & -13846]).getAsFloat();
         }

         if (var4.has(e.q[-19378 & -19386 & 8671 & -31801])) {
            var5.dso = var4.get(e.q[26983 & 8687 & 1502 & -31490]).getAsFloat();
         }

         if (var4.has(p.q[10211 & -6685 & -32283 & 4079])) {
            var5.dst = var4.get(p.q[32749 & 26621 & -31257 & -32285]).getAsFloat();
         }

         return var5;
      }
   }

   // $FF: synthetic method
   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.m(var1, var2, var3);
   }
}
