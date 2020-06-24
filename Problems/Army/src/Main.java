import javax.print.Doc;

class Army {

    public static void createArmy() {
        // Implement this method
        Unit ezhik = new Unit("Ezhik");
        Unit kopatich = new Unit("Kopatich");
        Unit krosh = new Unit("Krosh");
        Unit barash = new Unit("Barash");
        Unit nyusha = new Unit("Nyusha");
        Knight pin = new Knight("Pin");
        Knight karKarich = new Knight("Kar Karich");
        Knight sovunya = new Knight("Sovunya");
        General griffith = new General("Griffith");
        Doctor doc = new Doctor("Dr. Jekyll");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}