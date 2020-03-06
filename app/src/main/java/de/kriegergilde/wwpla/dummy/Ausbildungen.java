package de.kriegergilde.wwpla.dummy;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.kriegergilde.wwpla.R;

/**
 * Helper class for providing badges
 */
public class Ausbildungen {

    /**
     * An array of all badges.
     */
    public static final List<Badge> ITEMS = new ArrayList<Badge>();

    /**
     * A map of badges, by ID.
     */
    public static final Map<String, Badge> ITEM_MAP = new HashMap<String, Badge>();

    // stores ids
    public static Set<String> possessions = new HashSet<>();

    static {
        // Add the badges
        addItem(new Badge("seepferdchen", R.drawable.seepferdchen, "Anfängerzeugnis (Seepferdchen)"));
        addItem(new Badge("seeraeuber", R.drawable.seeraeuber, "Seeräuber"));

        //addItem(new Badge("djsa_bronze", R.drawable.djsa_bronze, "Jugendschwimmabzeichen in Bronze - Freischwimmer"));
        //addItem(new Badge("djsa_silber", R.drawable.djsa_silber, "Jugendschwimmabzeichen in Silber"));
        //addItem(new Badge("djsa_gold", R.drawable.djsa_gold, "Jugendschwimmabzeichen in Gold"));

        addItem(new Badge("schnorchel_ww", R.drawable.schnorchel_ww, "Schnorchelabzeichen (Wasserwacht)"));

        addItem(new Badge("dsa_bronze", R.drawable.djsa_bronze, "Schwimmabzeichen in Bronze"));
        addItem(new Badge("dsa_silber", R.drawable.djsa_silber, "Schwimmabzeichen in Silber"));
        addItem(new Badge("dsa_gold", R.drawable.djsa_gold, "Schwimmabzeichen in Gold"));

        addItem(new Badge("ersthelfer", R.drawable.ersthelfer, "Ersthelfer"));

        addItem(new Badge("rettungsschwimmer_bronze_ww", R.drawable.rettungsschwimmer_bronze_ww, "Rettungsschwimmabzeichen in Bronze"));
        addItem(new Badge("rettungsschwimmer_silber_ww", R.drawable.rettungsschwimmer_silber_ww, "Rettungsschwimmabzeichen in Silber"));
        addItem(new Badge("rettungsschwimmer_gold_ww", R.drawable.rettungsschwimmer_gold_ww, "Rettungsschwimmabzeichen in Gold"));

        addItem(new Badge("totenkopf_060", R.drawable.totenkopf_060, "Stundenschwimmer 'Totenkopf' in Schwarz"));
        addItem(new Badge("totenkopf_090", R.drawable.totenkopf_090, "Stundenschwimmer 'Totenkopf' in Silber"));
        addItem(new Badge("totenkopf_120", R.drawable.totenkopf_120, "Stundenschwimmer 'Totenkopf' in Gold"));

        //addItem(new Badge("schwimmen", R.drawable.schwimmen, "Fachdienst Schwimmen"));

        addItem(new Badge("san", R.drawable.san_b, "Sanitäter"));

        addItem(new Badge("sanitaetsdienst", R.drawable.sanitaetsdienst, "Fachdienst Sanitätswesen"));

        addItem(new Badge("rettungssschwimmen", R.drawable.rettungsschwimmen, "Rettungsschwimmer im Wasserrettungsdienst"));

        addItem(new Badge("WR", R.drawable.wr, "Wasserretter"));

        //addItem(new Badge("bootsmann", R.drawable.bootsmann, "Bootsmann"));
        addItem(new Badge("motorboot", R.drawable.motorboot, "Motorbootführer"));
        addItem(new Badge("tauchen", R.drawable.tauchen, "Rettungstaucher"));
        addItem(new Badge("naturschutz", R.drawable.naturschutz, "Naturschutz-Streifenführer"));

        addItem(new Badge("rettungshelfer", R.drawable.rettungshelfer, "Rettungshelfer"));
        addItem(new Badge("rettungssanitaeter", R.drawable.rettungssanitaeter, "Rettungssanitäter"));

        addItem(new Badge("sanitaetsdienst_ausbilder", R.drawable.sanitaetsdienst_ausbilder, "Ausbilder Sanitätsdienst"));

        addItem(new Badge("schwimmen_ausbilder", R.drawable.schwimmen_ausbilder, "Ausbilder Schwimmen"));

        addItem(new Badge("rettungsschwimmen_ausbilder", R.drawable.rettungsschwimmen_ausbilder, "Ausbilder Rettungsschwimmen"));

        addItem(new Badge("WR_A", R.drawable.wasserretter_ausbilder, "Ausbilder Wasserretter"));

        addItem(new Badge("motorboot_ausbilder", R.drawable.motorboot_ausbilder, "Ausbilder Motorbootführer"));

        addItem(new Badge("tauchen_ausbilder", R.drawable.tauchen_ausbilder, "Ausbilder Rettungstaucher"));

        addItem(new Badge("naturschutz_ausbilder", R.drawable.naturschutz_ausbilder, "Ausbilder Naturschutz-Streifenführer"));

        addItem(new Badge("f1", R.drawable.f1, "Truppführer"));
        addItem(new Badge("f2", R.drawable.f2, "Gruppenführer (Wachleiter)"));
        addItem(new Badge("f3", R.drawable.f3, "Gruppenführer (SEG-Leiter)"));
        addItem(new Badge("f4", R.drawable.f4, "Zugführer (Einsatzleiter)"));
        addItem(new Badge("f5", R.drawable.f5, "Verbandsführer (Zugführer K-WRZ)"));
    }

    private static void addItem(Badge item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }



    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    public static void savePossessions(Context ctx){
        SharedPreferences sharedPref = ctx.getSharedPreferences(
                "possessions_file", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.clear();
        editor.putStringSet("possessions", possessions);
        editor.commit();
    }

    public static void loadPossessions(Context ctx){
        SharedPreferences sharedPref = ctx.getSharedPreferences(
                "possessions_file", Context.MODE_PRIVATE);
        possessions = sharedPref.getStringSet("possessions", new HashSet<String>());
    }

    /**
     * Eine Ausbildung / ein Abzeichen
     */
    public static class Badge {
        public final String id;
        public final int resId;
        public final String content;

        public Badge(String id, int resId, String content) {
            this.id = id;
            this.resId = resId;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
