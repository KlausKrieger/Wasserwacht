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
        addItem(new Badge("seepferdchen", R.drawable.seepferdchen, "Frühschwimmer (Seepferdchen)",
                "Leistungen:\n" +
                        "* Sprung vom Beckenrand und 25 m Schwimmen.\n" +
                        "* Heraufholen eines Gegenstandes mit den Händen aus schultertiefem Wasser. (Schultertiefe bezogen auf den Prüfling.)"));
        addItem(new Badge("seeraeuber", R.drawable.seeraeuber, "Seeräuber",
                "Leistungen:\n" +
                        "* 100 m technikgerechtes Schwimmen, \n" +
                        "* 5 m Streckentauchen mit anschließendem Herausholen eines Gegenstandes aus mindestens 1 Meter Wassertiefe."));

        addItem(new Badge("djsa_bronze", R.drawable.djsa_bronze, "Jugendschwimmabzeichen in Bronze - Freischwimmer",
                "Leistungen:\n" +
                        "* Sprung vom Beckenrand und mindestens 200 Meter Schwimmen in höchstens 15 Minuten,\n" +
                        "* einmal ca. 2 Meter Tieftauchen von der Wasseroberfläche und Heraufholen eines Gegenstandes,\n" +
                        "* Sprung aus 1 Meter Höhe oder Startsprung,\n" +
                        "* Kenntnis der Baderegeln"));
        addItem(new Badge("djsa_silber", R.drawable.djsa_silber, "Jugendschwimmabzeichen in Silber",
                "Leistungen:\n" +
                        "* Startsprung und mindestens 400 Meter Schwimmen in höchstens 25 Minuten (300 Meter Bauch- und 100 Meter Rückenlage),\n" +
                        "* zweimal ca. 2 Meter Tieftauchen von der Wasseroberfläche mit Heraufholen je eines Gegenstandes,\n" +
                        "* Sprung aus 3 Meter Höhe,\n" +
                        "* 10 Meter Streckentauchen (ohne Schwimmbrille),\n" +
                        "* Kenntnis von Baderegeln und der Selbstrettung"));
        addItem(new Badge("djsa_gold", R.drawable.djsa_gold, "Jugendschwimmabzeichen in Gold",
                "Leistungen:\n" +
                        "* 600 Meter Schwimmen in höchstens 24 Minuten,\n" +
                        "* 50 Meter Brustschwimmen in höchstens 70 Sekunden,\n" +
                        "* 25 Meter Kraulschwimmen,\n" +
                        "* 50 Meter Rückenschwimmen mit Grätschschwung ohne Armtätigkeit oder 50 Meter Rückenkraulschwimmen,\n" +
                        "* Tieftauchen von der Wasseroberfläche mit Heraufholen von 3 Tauchringen aus einer Wassertiefe von etwa 2 Metern innerhalb von 3 Minuten bei maximal 3 Tauchversuchen,\n" +
                        "* 15 Meter Streckentauchen,\n" +
                        "* Sprung aus 3 Meter Höhe,\n" +
                        "* 50 Meter Transportschwimmen (Schieben oder Ziehen),\n" +
                        "* Kenntnis der Baderegeln,\n" +
                        "* Kenntnis über Hilfe bei Bade-, Boots- und Eisunfällen (Selbstrettung und einfache Fremdrettung)"));

        addItem(new Badge("schnorchel_ww", R.drawable.schnorchel_ww, "Schnorchelabzeichen (Wasserwacht)",
                "Voraussetzungen:\n" +
                        "* Mindestalter 9 Jahre\n" +
                        "* Deutsches Jugenschwimmabzeichen Silber\n" +
                        "\nLeistungen:\n" +
                        "* 200 m Flossenschwimmen ohne Zeitbegrenzung, davon 100 m in Brustlage - 100 m in Rückenlage\n" +
                        "* 100 m Schnorchelschwimmen ohne Startsprung mit Grundausrüstung, dabei viermaliges Abtauchen und Heraufholen je eines kleinen Tauchringes, Wasser nicht tiefer als 2,50 m Abtauchen auf 1,80 m bis 2,50 m Tiefe\n" +
                        "* Tauchbrille abnehmen, wieder aufsetzen und ausblasen, mit freier Brille auftauchen\n" +
                        "* 50 m Retten (Abschleppen mit Flossen im Achselgriff (Partner ohne Flossen)\n" +
                        " \n" +
                        "Kenntnisse über\n" +
                        "* Atmung, Überatmung und Pendelatmung\n" +
                        "* Wasserdruck und Wassertemperatur\n" +
                        "* Grundausrüstung - Schnorcheltechnik: Tauchbrille, Flossen, Schnorchel - Beschaffenheit, Wirkung, Pflege"));





        addItem(new Badge("dsa_bronze", R.drawable.schwimm_bronze, "Schwimmabzeichen in Bronze - Freischwimmer",
                "Mindestalter: 18 Jahre. \n\nLeistungen:\n" +
                        "* Sprung vom Beckenrand und mindestens 200 Meter Schwimmen in höchstens 7 Minuten\n" +
                        "* Kenntnis der Baderegeln" +
                        "\n\nAltersdifferenzierung:\n" +
                        "Bei den Schwimmbedingungen für den Deutschen Schwimmpass werden die Höchstzeiten je Lebensdekade erhöht – (erstmals mit dem vollendeten 30. Lebensjahr)\n" +
                        "* um eine Minute beim 200 m Schwimmen für das Deutsche Schwimmabzeichen Bronze"));
        addItem(new Badge("dsa_silber", R.drawable.schwimm_silber, "Schwimmabzeichen in Silber",
                "Mindestalter: 18 Jahre. \n\nLeistungen:\n" +
                        "* Sprung vom Beckenrand und mindestens 400 Meter Schwimmen in höchstens 12 Minuten\n" +
                        "* zweimal ca. 2 Meter Tieftauchen von der Wasseroberfläche mit Heraufholen je eines Gegenstandes\n" +
                        "* 10 Meter Streckentauchen\n" +
                        "* 2 Sprünge vom Beckenrand (je 1 Sprung kopf- und fußwärts)\n" +
                        "* Kenntnis der Baderegeln und Maßnahmen der Selbstrettung" +
                        "\n\nAltersdifferenzierung:\n" +
                        "Bei den Schwimmbedingungen für den Deutschen Schwimmpass werden die Höchstzeiten je Lebensdekade erhöht – (erstmals mit dem vollendeten 30. Lebensjahr)\n" +
                        "* um eine Minute beim 400 m Schwimmen für das Deutsche Schwimmabzeichen Silber\n"));
        addItem(new Badge("dsa_gold", R.drawable.schwimm_gold, "Schwimmabzeichen in Gold",
                "Mindestalter: 18 Jahre. \n\nLeistungen:\n" +
                        "* 1000 m Schwimmen in höchstens 24 Minuten für Männer und 29 Minuten für Frauen\n" +
                        "* 100 Meter Schwimmen in höchstens 1:50 Minuten für Männer und 2:00 Minuten für Frauen\n" +
                        "* 100 Meter Rückenschwimmen, davon 50 Meter mit Grätschschwung (Brustbeinschlagbewegung) ohne Armtätigkeit\n" +
                        "* Tieftauchen von der Wasseroberfläche (drei Tauchringe aus ca. 2 Meter tiefem Wasser in 3 Minuten bei maximal 3 Tauchversuchen)\n" +
                        "* 15 Meter Streckentauchen\n" +
                        "* Sprung aus 3 m Höhe oder 2 Sprünge aus 1 m Höhe (davon ein Sprung kopf- und ein Sprung fußwärts)\n" +
                        "* 50 Meter Transportschwimmen (Schieben oder Ziehen)\n" +
                        "* Kenntnis der Baderegeln\n" +
                        "* Hilfe bei Bade-, Boots- und Eisunfällen (Selbst- und einfache Fremdrettung)" +
                        "\n\nAltersdifferenzierung:\n" +
                        "Bei den Schwimmbedingungen für den Deutschen Schwimmpass werden die Höchstzeiten je Lebensdekade erhöht – (erstmals mit dem vollendeten 30. Lebensjahr)\n" +
                        "* um 2 Minuten beim 1000 m Schwimmen für das Deutsche Schwimmabzeichen Gold sowie\n" +
                        "* um 10 Sekunden beim 100 m Schwimmen für das Deutsche Schwimmabzeichen Gold."));


        addItem(new Badge("ersthelfer", R.drawable.ersthelfer, "Ersthelfer",
                "Der Teilnehmer kann nach der Absolvierung als Sofort- / Ersthelfer an einer Unfallstelle handeln: \n" +
                        "In diesem Lehrgang kann jeder die Maßnahmen zur Erstversorgung von vital bedrohten Betroffenen erlernen. " +
                        "Mit dem hier erworbenen Wissen ist man für nahezu alle Notfälle, " +
                        "die sich jederzeit im privaten und beruflichen Umfeld ereignen können, gut gerüstet. " +
                        "Hierbei geht es zu einem großen Teil um Notfälle bezüglich Atmung und Kreislauf. " +
                        "Auch die Versorgung von Verletzungen, Verbrennungen, Schockzuständen sowie Vergiftungen wird gelehrt. \n" +
                        "Seit dem 1. April 2015 ersetzt der neue Erste-Hilfe-Lehrgang im Umfang von 9 Unterrichtseinheiten die bisherige Schulung " +
                        "in lebensrettenden Sofortmaßnahmen(LSM). \n" +
                        "Die Teilnahme ist in Deutschland eine Mindestvoraussetzung " +
                        "für den Erwerb der Führerscheinklassen AM, A1, A2, A, B, BE, L und T.\n"));



        addItem(new Badge("rettungsschwimmer_bronze_ww", R.drawable.rettungsschwimmer_bronze_ww, "Rettungsschwimmabzeichen in Bronze",
                "Allgemeines:\n" +
                        "Das Deutsche Rettungsschwimmabzeichen (auch Rettungsschwimmpass) ist ein durch den Arbeiter-Samariter-Bund (ASB), " +
                        "die Deutsche Lebens-Rettungs-Gesellschaft (DLRG) oder durch die Wasserwacht " +
                        "im Deutschen Roten Kreuz (DRK) verliehenes Abzeichen für die Befähigung zur Rettung von Menschen, " +
                        "die zu ertrinken drohen. " +
                        "Es wird in Bronze, Silber oder Gold verliehen. " +
                        "Die Verleihung erfolgt durch eine Urkunde. " +
                        "Der ASB, die DLRG und die Wasserwacht haben dieselben Ausbildungsbedingungen für das Deutsche Rettungsschwimmabzeichen. \n" +
                        "Die Abzeichen sind Voraussetzung für viele Berufe. (Polizeidienst, Sportlehrer etc.)\n" +
                        "\nVoraussetzungen\n" +
                        "* Mindestalter 12 Jahre\n" +
                        "\nPrüfungsteile\n" +
                        "* 200 m Schwimmen in höchstens 10 Minuten, davon 100 m in Bauchlage und 100 m in Rückenlage mit Grätschschwung ohne Armtätigkeit\n" +
                        "* 100 m Schwimmen in Kleidung in höchstens 4 Minuten, anschließend im Wasser entkleiden\n" +
                        "* 3 verschiedene Sprünge aus etwa 1 m Höhe\n" +
                        "* 15 m Streckentauchen\n" +
                        "* zweimal Tieftauchen von der Wasseroberfläche, einmal kopfwärts und einmal fußwärts innerhalb 3 Minuten mit zweimaligem Heraufholen eines 5-kg-Tauchrings oder eines gleichartigen Gegenstandes (Wassertiefe 2 bis 3 m)\n" +
                        "* 50 m Transportschwimmen: Schieben oder Ziehen\n" +
                        "* Nachweis der Kenntnisse zur Vermeidung von Umklammerungen sowie Fähigkeiten zur Befreiung aus\n" +
                        "** Halsumklammerung von hinten\n" +
                        "** Halswürgegriff von hinten\n" +
                        "* 50 m Schleppen mit Kopf- oder Achselschleppgriff und dem Standard-Fesselschleppgriff\n" +
                        "* Kombinierte Übung, die ohne Pause und in der angegebenen Reihenfolge zu erfüllen ist:\n" +
                        "** 20 m Anschwimmen in Bauchlage\n" +
                        "** abtauchen auf halber Strecke auf 2 bis 3 m Wassertiefe und Heraufholen eines 5-kg-Tauchrings oder eines gleichartigen Gegenstandes, diesen anschließend fallenlassen, Anschwimmen fortsetzen\n" +
                        "** 20 m Schleppen eines Partners\n" +
                        "** Demonstration des Anlandbringens\n" +
                        "** Vorführung der Herz-Lungen-Wiederbelebung\n" +
                        "* Nachweis folgender Kenntnisse (Theoretische Prüfung):\n" +
                        "** Gefahren am und im Wasser\n" +
                        "** Hilfe bei Bade-, Boots- und Eisunfällen (Selbst- und Fremdrettung)\n" +
                        "** Vermeidung von Umklammerungen\n" +
                        "** Atmung und Blutkreislauf\n" +
                        "** Hilfe bei Verletzungen und Ertrinkungsunfällen, Hitze- und Kälteschäden\n" +
                        "** Aufgaben der ausbildenden Wasserrettungsorganisationen"));
        addItem(new Badge("rettungsschwimmer_silber_ww", R.drawable.rettungsschwimmer_silber_ww, "Rettungsschwimmabzeichen in Silber",
                "Allgemeines:\n" +
                        "Das Deutsche Rettungsschwimmabzeichen (auch Rettungsschwimmpass) " +
                        "ist ein durch den Arbeiter-Samariter-Bund (ASB), die Deutsche Lebens-Rettungs-Gesellschaft (DLRG) " +
                        "oder durch die Wasserwacht im Deutschen Roten Kreuz (DRK) verliehenes Abzeichen für die Befähigung zur Rettung von Menschen, " +
                        "die zu ertrinken drohen. " +
                        "Es wird in Bronze, Silber oder Gold verliehen. " +
                        "Die Verleihung erfolgt durch eine Urkunde. " +
                        "Der ASB, die DLRG und die Wasserwacht haben dieselben Ausbildungsbedingungen für das Deutsche Rettungsschwimmabzeichen. \n" +
                        "Die Abzeichen sind Voraussetzung für viele Berufe. (Polizeidienst, Sportlehrer etc.)\n" +
                        "\nEhrenzeichen\n" +
                        "Die Abzeichen in Silber und Gold sind dabei Abzeichen im Sinne von Ehrenzeichen, da vom Bundespräsidenten anerkannt " +
                        "(siehe BGBl. I S. 644 vom 3. August 1964 für DLRG und Wasserwacht sowie BGBl. I S. 1619 " +
                        "vom 17. Oktober 2014 für ASB). " +
                        "Dies bedeutet insbesondere, dass sie am Dienstanzug von Bundeswehr, Polizei, Feuerwehr etc. " +
                        "neben anderen Orden und Ehrenzeichen getragen werden dürfen.\n" +
                        "\nVoraussetzungen\n" +
                        "* Mindestalter 15 Jahre\n" +
                        "* Nachweis Erste Hilfe Kurs nicht älter als 3 Jahre\n" +
                        "\nPrüfungsteile\n" +
                        "* 400 m Schwimmen in höchstens 15 Minuten, davon 50 m Kraulschwimmen, 150 m Brustschwimmen und 200 m Schwimmen in Rückenlage mit Grätschschwung ohne Armtätigkeit\n" +
                        "* 300 m Schwimmen in Kleidung in höchstens 12 Minuten, anschließend im Wasser entkleiden\n" +
                        "* Sprung aus 3 m Höhe\n" +
                        "* 25 m Streckentauchen\n" +
                        "* dreimal Tieftauchen von der Wasseroberfläche, zweimal kopfwärts und einmal fußwärts innerhalb von 3 Minuten, mit dreimaligem Heraufholen eines 5-kg-Tauchrings oder eines gleichartigen Gegenstandes (Wassertiefe zwischen 3 und 5 m)\n" +
                        "* 50 m Transportschwimmen: Schieben oder Ziehen in höchstens 1:30 Minuten\n" +
                        "* Nachweis der Kenntnisse zur Vermeidung von Umklammerungen sowie Fähigkeiten zur Befreiung aus\n" +
                        "** Halsumklammerung von hinten\n" +
                        "** Halswürgegriff von hinten\n" +
                        "* 50 m Schleppen in höchstens 4 Minuten, beide Partner in Kleidung, je eine Hälfte der Strecke mit Kopf- oder Achsel- und einem Fesselschleppgriff (Standard-Fesselschleppgriff oder Seemannsgriff)\n" +
                        "* Kombinierte Übung, die ohne Pause in der angegebenen Reihenfolge zu erfüllen ist:\n" +
                        "** 20 m Anschwimmen in Bauchlage\n" +
                        "** Abtauchen auf 3 bis 5 m Tiefe, Heraufholen eines 5-kg-Tauchrings oder eines gleichartigen Gegenstandes, diesen anschließend fallen lassen\n" +
                        "** Lösen aus einer Umklammerung durch einen Befreiungsgriff\n" +
                        "** 25 m Schleppen\n" +
                        "** Anlandbringen des Geretteten\n" +
                        "** 3 Minuten Vorführung der Herz-Lungen-Wiederbelebung (HLW)\n" +
                        "* Nachweis folgender Kenntnisse (Theoretische Prüfung):\n" +
                        "** Atmung und Blutkreislauf\n" +
                        "** Gefahren am und im Wasser\n" +
                        "** Hilfe bei Bade-, Boots- und Eisunfällen (Selbst- und Fremdrettung)\n" +
                        "** Vermeidung von Umklammerungen\n" +
                        "** Erste Hilfe (EH)" +
                        "** Rechte und Pflichten bei Hilfeleistungen\n" +
                        "** Rettungsgeräte\n" +
                        "** Aufgaben und Tätigkeiten der ausbildenden Wasserrettungsorganisationen\n"));
        addItem(new Badge("rettungsschwimmer_gold_ww", R.drawable.rettungsschwimmer_gold_ww, "Rettungsschwimmabzeichen in Gold",
                "Allgemeines:\n" +
                        "Das Deutsche Rettungsschwimmabzeichen (auch Rettungsschwimmpass) ist ein durch den Arbeiter-Samariter-Bund (ASB), " +
                        "die Deutsche Lebens-Rettungs-Gesellschaft (DLRG) oder durch die Wasserwacht im Deutschen Roten Kreuz (DRK) " +
                        "verliehenes Abzeichen für die Befähigung zur Rettung von Menschen, die zu ertrinken drohen. " +
                        "Es wird in Bronze, Silber oder Gold verliehen. " +
                        "Die Verleihung erfolgt durch eine Urkunde. " +
                        "Der ASB, die DLRG und die Wasserwacht haben dieselben Ausbildungsbedingungen für das Deutsche Rettungsschwimmabzeichen. \n" +
                        "Die Abzeichen sind Voraussetzung für viele Berufe. (Polizeidienst, Sportlehrer etc.)\n" +
                        "\nEhrenzeichen\n" +
                        "Die Abzeichen in Silber und Gold sind dabei Abzeichen im Sinne von Ehrenzeichen, da vom Bundespräsidenten anerkannt " +
                        "(siehe BGBl. I S. 644 vom 3. August 1964 für DLRG und Wasserwacht sowie BGBl. " +
                        "I S. 1619 vom 17. Oktober 2014 für ASB). Dies bedeutet insbesondere, " +
                        "dass sie am Dienstanzug von Bundeswehr, Polizei, Feuerwehr etc. neben anderen Orden und Ehrenzeichen getragen werden dürfen.\n" +
                        "\nVoraussetzungen\n" +
                        "* Mindestalter 16 Jahre\n" +
                        "* Besitz des Rettungsschwimmabzeichens Silber\n" +
                        "* ärztliche Bescheinigung über die Tauglichkeit (bei der DLRG: Selbsterklärung zum Gesundheitszustand)\n" +
                        "* Nachweis der erfolgreichen Teilnahme an einem Erste-Hilfe-Lehrgang nicht älter als 3 Jahre\n" +
                        "\nPrüfungsteile\n" +
                        "* 300 m Flossenschwimmen in höchstens 6 Min., davon 250 m in Bauch- oder Seitenlage und 50 m Schleppen, Partner in Kleidung (Achselschleppgriff)\n" +
                        "* 300 m Schwimmen in Kleidung in höchstens 9 Min., anschließend im Wasser entkleiden\n" +
                        "* 100 m Schwimmen in höchstens 1:40 Min.\n" +
                        "* 30 m Streckentauchen, dabei Heraufholen von 10 kleinen Ringen oder Tellern, die auf einer Strecke von 20 m in einer höchstens 2 m breiten Gasse verteilt sind; mindestens 8 Stück aufsammeln\n" +
                        "* Dreimal Tieftauchen in Kleidung innerhalb von 3 Min.; das erste Mal mit Kopfsprung, anschließend je einmal kopf- und fußwärts von der Wasseroberfläche mit gleichzeitigem Heraufholen von jeweils zwei 5-kg-Tauchringen oder gleichartigen Gegenständen, die etwa 3 m voneinander entfernt liegen (Wassertiefe 3 bis 5 m)\n" +
                        "* 50 m Transportschwimmen, beide Partner in Kleidung: Schieben oder Ziehen in höchstens 1:30 Min.\n" +
                        "* Nachweis der Kenntnisse zur Vermeidung von Umklammerungen sowie Fähigkeiten zur Befreiung aus\n" +
                        "** Halsumklammerung von hinten\n" +
                        "** Halswürgegriff von hinten\n" +
                        "* Kombinierte Übung (beide Partner in Kleidung), die ohne Pause und in der angegebenen Reihenfolge zu erfüllen ist:\n" +
                        "** 25 m Anschwimmen in höchstens 30 Sekunden\n" +
                        "** Abtauchen 3 bis 5 m tief, Heraufholen eines 5-kg-Tauchrings oder eines gleichartigen Gegenstandes, diesen anschließend fallenlassen\n" +
                        "** Lösen aus einer Umklammerung durch einen Befreiungsgriff\n" +
                        "** 25 m Schleppen in höchstens 60 Sekunden mit Fesselschleppgriff\n" +
                        "** Anlandbringen des Geretteten\n" +
                        "** 3 Minuten Vorführung der Wiederbelebung\n" +
                        "* Handhabung folgender Rettungsgeräte:\n" +
                        "** Retten mit Rettungsball und Leine:\n" +
                        "** 12 m Weitwerfen in einen Zielsektor mit einer 3-m-Öffnung, 6 Würfe innerhalb von 5 Minuten, davon 4 Treffer\n" +
                        "** Retten mit Rettungsgurt und Rettungsleine (als Schwimmer und Leinenführer)\n" +
                        "** Handhabung gebräuchlicher Wiederbelebungsgeräte\n" +
                        "* Nachweis folgender Kenntnisse (Theoretische Prüfung):\n" +
                        "** Vermeidung von Umklammerungen\n" +
                        "** Erste Hilfe\n" +
                        "** Die Wasserrettungsorganisationen: Organisation, Aufgaben unter besonderer Berücksichtigung des Wasserrettungsdienstes\n"));


        addItem(new Badge("totenkopf_060", R.drawable.totenkopf_060, "Stundenschwimmer 'Totenkopf' in Schwarz",
                "Leistungen:\n" +
                        "1 Stunde schwimmen ohne Pause (ohne sich am Beckenrand festzuhalten).\n" +
                        "\nAnmerkung:\n" +
                        "Die 'Totenkopfschwimmer' gehören nicht (mehr) zu den offiziellen Schwimmabzeichen der Deutschen Prüfungsordnung Schwimmen/Rettungsschwimmen. " +
                        "Sie waren sehr begehrt, werden aber seit Beginn der 1970er Jahre nur noch selten abgenommen"));
        addItem(new Badge("totenkopf_090", R.drawable.totenkopf_090, "Stundenschwimmer 'Totenkopf' in Silber",
                "Leistungen:\n" +
                        "90 Minuten schwimmen ohne Pause (ohne sich am Beckenrand festzuhalten).\n" +
                        "\nAnmerkung:\n" +
                        "Die 'Totenkopfschwimmer' gehören nicht (mehr) zu den offiziellen Schwimmabzeichen der Deutschen Prüfungsordnung Schwimmen/Rettungsschwimmen. " +
                        "Sie waren sehr begehrt, werden aber seit Beginn der 1970er Jahre nur noch selten abgenommen"));
        addItem(new Badge("totenkopf_120", R.drawable.totenkopf_120, "Stundenschwimmer 'Totenkopf' in Gold",
                "Leistungen:\n" +
                        "2 Stunden schwimmen ohne Pause (ohne sich am Beckenrand festzuhalten).\n" +
                        "\nAnmerkung:\n" +
                        "Die 'Totenkopfschwimmer' gehören nicht (mehr) zu den offiziellen Schwimmabzeichen der Deutschen Prüfungsordnung Schwimmen/Rettungsschwimmen. " +
                        "Sie waren sehr begehrt, werden aber seit Beginn der 1970er Jahre nur noch selten abgenommen"));



        addItem(new Badge("schwimmen", R.drawable.schwimmen, "Fachdienst Schwimmen",
                "Ärmelabzeichen an der Dienstuniform für Mitglieder das Fachdienstes Schwimmen."));



        addItem(new Badge("san", R.drawable.san_b, "Sanitäter",
                "Inhalte:\n" +
                        "- Definition Notfall\n" +
                        "- Bewusstlosigkeit\n" +
                        "- Gewalteinwirkungen auf den Kopf\n" +
                        "- Atmung und Atemstörungen inkl. Beatmung mit Beatmungshilfen\n" +
                        "- Blutkreislauf\n" +
                        "- Herz-Kreislaufstörung inkl. Wiederbelebung, Schock\n" +
                        "- Bedrohliche Blutungen, Wunden, Wundversorgung\n" +
                        "- Brustkorb- und Bauchraumverletzungen\n" +
                        "- Knochenbrüche\n" +
                        "- Unterkühlung/Erfrierung, Verbrennungen, Vergiftungen\n" +
                        "- Praktische Übungen anhand von Fallbeispielen\n" +
                        " \n" +
                        "Teilnehmerkreis:\n" +
                        "Aktive, ehrenamtliche Helferinnen und Helfer aller RK-Gemeinschaften und Externe Teilnehmer mit erfolgreich abgeschlossnem Erste-Hilfe-Kurs.\n" +
                        " \n" +
                        "Dauer:\n" +
                        "55 Unterrichtseinheiten"));

        addItem(new Badge("rettungssschwimmen", R.drawable.rettungsschwimmen, "Fachdienst Rettungsschwimmen",
                "Als Ärmelabzeichen an der Dienstuniform: \n" +
                        "Mitglied des Fachdienstes 'Rettungsschwimmen'.\n" +
                        "\nAls Kennzeichnung an der Einsatzkleidung: \n" +
                        "'Rettungsschwimmer im Wasserrettungsdienst'. \n" +
                        "Benötigte Voraussetzung: \n" +
                        "* Rettungsschwimmabzeichen in Silber \n" +
                        "* Sanitätsgrundausbildung (A+B)\n" +
                        "\nDiese Ausbildungsstufe ist Mindestvoraussetzung zur Teilnahme innerhalb der Schnelleinsatzgruppe (SEG).\n" +
                        "Die nächste Weiterbildungsstufe ist die zum Wasserretter."));

        addItem(new Badge("WR", R.drawable.wr, "Wasserretter",
                "Beschreibung:\n" +
                        "\n" +
                        "Die besonderen Anforderungen im Wasserrettungsdienst machen es notwendig, " +
                        "dass die Mitglieder der Wasserwacht zusätzliche Kenntnisse und Fertigkeiten in der Wasserrettung erwerben. " +
                        "In der Ausbildung zum Wasserretter erhalten die Teilnehmer die nötige Sicherheit " +
                        "zur Durchführung der entsprechenden Maßnahmen. " +
                        "Der Lehrgang, welcher mindestens 24 Unterrichtseinheiten umfasst, " +
                        "baut auf die Sanitätsausbildung auf. Hier werden in der Theorie die Themenbereiche wie z. B.\n" +
                        "* Einsatztaktik\n" +
                        "* Tauch- und Ertrinkungsunfälle\n" +
                        "* thermische Schäden\n" +
                        "* Basisausbildung Fließwasserrettung\n" +
                        "* Retten mit dem Motorrettungsboot\n" +
                        "* Notfalltraining Reanimation\n" +
                        "gelehrt. " +
                        "\nDamit die Teilnehmer aber auch in der Praxis fit werden und das in der Theorie gelernte anwenden können " +
                        "wird in der Ausbildung zum Wasserretter viel Wert auf die praktische Ausbildung gelegt. In den Themenbereichen\n" +
                        "* HLW am Erwachsenen, Kind und Säugling\n" +
                        "* Retten eines Beinaheertrunkenen mit den üblichen Rettungsgeräten\n" +
                        "* Retten eines Patienten aus dem Wasser mithilfe des Motorrettungsbootes\n" +
                        "* Retten und Versorgen eines Tauchers\n" +
                        "* Versorgung eines Verletzten an Land und anschließendem Transport über den Wasserweg\n" +
                        "* Fließwasserrettung\n" +
                        "* Knotenkunde\n" +
                        "werden die Anwärter für den Wasserrettungsdienst ausgebildet. " +
                        "\nDer Lehrgang endet mit einer theoretischen und praktischen Prüfung. " +
                        "Mit dem Bestehen der Prüfung kann man nun für den Wasserrettungsdienst in der Wasserwacht eingesetzt werden. " +
                        "\nAls Wasserretter hat man auch die Möglichkeit sich weiter als Rettungstaucher, Motorbootführer oder " +
                        "Wachleiter bzw. Einsatzleiter ausbilden zu lassen."));



        addItem(new Badge("bootsmann", R.drawable.bootsmann, "Bootsmann",
                "Ärmelabzeichen an der Dienstuniform: \n" +
                        "(einfaches) Mitglied der Bootsbesatzung'.\n"));
        addItem(new Badge("motorboot", R.drawable.motorboot, "Motorbootführer",
                "Als Ärmelabzeichen an der Dienstuniform oder Abzeichen an der Einsatzkleidung: \n" +
                        "Motorbootführer.\n" +
                        "\nVoraussetzung für die Ausbildung zum Motorbootführer: \n" +
                        "abgeschlossene Ausbildung zum Wasserretter."));
        addItem(new Badge("tauchen", R.drawable.tauchen, "Rettungstaucher",
                "Als Ärmelabzeichen an der Dienstuniform oder Abzeichen an der Einsatzkleidung: \n" +
                        "Rettungstaucher.\n" +
                        "\nVoraussetzung für die Ausbildung zum Rettungstaucher: \n" +
                        "* abgeschlossene Ausbildung zum Wasserretter.\n" +
                        "* entsprechend bescheinigte ärztliche Tauglichkeit\n"));
        addItem(new Badge("naturschutz", R.drawable.naturschutz, "Fachdienst Naturschutz (Streifenführer)",
                "Als Ärmelabzeichen an der Dienstuniform oder Abzeichen an der Einsatzkleidung: \n" +
                        "Mitglied des Fachdienstes 'Naturschutz'. (Konkret: Streifenführer.)"));




        addItem(new Badge("rettungshelfer", R.drawable.rettungshelfer, "Rettungshelfer",
                "Beschreibung:\n" +
                        "Die Ausbildung zum Rettungshelfer stellt die Mindestqualifikation für die (ehrenamtliche oder berufliche) " +
                        "Mitarbeit im Rettungsdienst und Krankentransport dar.\n" +
                        "Der Ausbildungsverlauf gliedert sich in\n" +
                        "* einen 160stündigen Fachlehrgang an der DRK-Landesschule, der in Vollzeitform (4 Wochen à 5 Tage) und als berufsbegleitende Ausbildung an Wochenenden angeboten wird.\n" +
                        "* eine schriftliche, praktische und mündliche Prüfung am Ende des Fachlehrgangs.\n" +
                        "* ein 80stündiges (2 Wochen) Rettungswachenpraktikum, dessen erfolgreicher Verlauf testiert wird. Nach Einreichung des Testatheftes erhält der Teilnehmer das Zeugnis zum Rettungshelfer.\n" +
                        "\nEinsatz\n" +
                        "Der Einsatz als Rettungshelfer ist möglich im\n" +
                        "* Krankentransportwagen als Teammitglied neben einem Rettungssanitäter.\n" +
                        "* Rettungswagen als Teammitglied neben einem Rettungsassistenten.\n" +
                        "\nZielgruppe\n" +
                        "* ehrenamtliche Mitarbeiter der Rettungsdienste\n" +
                        "* Personen, die ein freiwilliges soziales Jahr oder den Bundesfreiwilligendienst im Rettungsdienst absolvieren\n" +
                        "* Privatpersonen ab dem 17. Lebensjahr"));
        addItem(new Badge("rettungssanitaeter", R.drawable.rettungssanitaeter, "Rettungssanitäter",
                "Die Ausbildung zum Rettungssanitäter schließt sich der zum Rettungshelfer an. " +
                        "Sie steht auch Personen offen, die nebenberuflich/ehrenamtlich im Rettungsdienst arbeiten möchten.\n" +
                        "Der Ausbildungsverlauf gliedert sich in\n" +
                        "* ein 160stündiges (4 Wochen) testiertes Klinikpraktikum.\n" +
                        "* ein 160stündiges (4 Wochen) testiertes Rettungswachenpraktikum.\n" +
                        "* einen 40stündigen Abschlusslehrgang (1 Woche).\n" +
                        "* eine schriftliche, praktische und mündliche Prüfung.\n" +
                        "\nNach erfolgreichem Abschluss der Prüfungen erhält der Teilnehmer das Zeugnis zum Rettungssanitäter. \n" +
                        "\nDer Einsatz als Rettungssanitäter ist möglich im\n" +
                        "* Krankentransportwagen als Teammitglied neben einem Rettungshelfer.\n" +
                        "* Rettungswagen als Teammitglied neben einem Rettungsassistenten.\n" +
                        "\nDie Gesamtausbildung zum Rettungssanitäter muss innerhalb von 2 Jahren abgeschlossen sein (inkl. Rettungshelfer)."));

        addItem(new Badge("sanitaetsdienst", R.drawable.sanitaetsdienst, "Fachdienst Sanitätswesen",
                "Als Ärmelabzeichen an der Dienstuniform oder Abzeichen an der Einsatzkleidung: \n" +
                        "Mitglied des Fachdienstes 'Sanittsdienst' bzw. Sanitäter.\n" +
                        "\nMindestvoraussetzung: \n" +
                        "* Sanitätsgrundausbildung (A+B)."));
        addItem(new Badge("sanitaetsdienst_ausbilder", R.drawable.sanitaetsdienst_ausbilder, "Sanitätsdienst (Ausbilder)",
                "Als Ärmelabzeichen an der Dienstuniform oder Abzeichen an der Einsatzkleidung: \n" +
                        "Ausbilder im Fachdienste 'Sanitätsdienst'."));

        addItem(new Badge("schwimmen_ausbilder", R.drawable.schwimmen_ausbilder, "Fachdienst Schwimmen (Ausbilder)",
                "Als Ärmelabzeichen an der Dienstuniform oder Abzeichen an der Einsatzkleidung: \n" +
                        "Ausbilder im Fachdienst 'Schwimmen'.\n" +
                        "\nTODO Inhaber Lehrschein S (schwimmen) oder höher? (schon ab Lehrscheininhaber oder erst ab Instruktor/Lehrwart?)"));

        addItem(new Badge("rettungsschwimmen_ausbilder", R.drawable.rettungsschwimmen_ausbilder, "Fachdienst Rettungsschwimmen (Ausbilder)",
                "Als Ärmelabzeichen an der Dienstuniform oder Abzeichen an der Einsatzkleidung: \n" +
                        "Ausbilder im Fachdienst 'Rettungsschwimmen'.\n" +
                        "\nInhaber Lehrschein R (Rettungsschwimmen) oder höher (Instruktor, Lehrwart)."));

        addItem(new Badge("WR_A", R.drawable.wasserretter_ausbilder, "Wasserretter (Ausbilder)",
                "Als Ärmelabzeichen an der Dienstuniform oder Abzeichen an der Einsatzkleidung: \n" +
                         "Ausbilder im Fachdienst 'Wasserrettung'.\n"));

        addItem(new Badge("motorboot_ausbilder", R.drawable.motorboot_ausbilder, "Motorbootführer (Ausbilder)",
                "Als Ärmelabzeichen an der Dienstuniform oder Abzeichen an der Einsatzkleidung: \n" +
                        "Ausbilder für 'Motorbootführer'.\n"));

        addItem(new Badge("tauchen_ausbilder", R.drawable.tauchen_ausbilder, "Rettungstaucher (Ausbilder)",
                "Als Ärmelabzeichen an der Dienstuniform oder Abzeichen an der Einsatzkleidung: \n" +
                        "Ausbilder für 'Rettungstaucher'.\n"));

        addItem(new Badge("naturschutz_ausbilder", R.drawable.naturschutz_ausbilder, "Naturschutz (Ausbilder)",
                "Als Ärmelabzeichen an der Dienstuniform oder Abzeichen an der Einsatzkleidung: \n" +
                        "Ausbilder für 'Naturschutz-Streifenführer'.\n"));
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
        public final String details;

        public Badge(String id, int resId, String content, String details) {
            this.id = id;
            this.resId = resId;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
