/**
 * Class Main
 */
public class Main {

        /**
         * Demonstration der Liste. Wenn alles richtig implementiert ist soll diese
         * Methode
         *
         * eins
         * zwei
         * drei
         * vier
         * fünf
         * sechs
         *
         * auf der Konsole ausgeben und es sollte keine Exception auftreten.
         *
         * @param args
         *            ignoriert
         */
        public static void main(String[] args) {
                List list = new List();
                list.insert("vier");
                list.append("fünf");
                list.insert("zwei");
                list.insert("drei");
                list.append("sechs");
                list.rewind();
                list.deleteNext();
                list.insert("sieben");
                list.deleteFirst();
                list.insert("zwei");
                list.insert("eins");

                dump( list );

                list.step();
                list.getCurrent();
                list.deleteNext();
                for (int i = 0; i < 7; i++) {
                        list.deleteFirst();
                }
                list.deleteNext();

                dump( list );
        }


        /** Gibt eine Liste auf der Konsole aus.
         *
         * @param list auszugebende Liste.
         */
        public static void dump( List list ) {
                list.rewind();
                String data = list.getCurrent();
                while (null != data) {
                        System.out.println(data);
                        list.step();
                        data = list.getCurrent();
                }
        }
}
