
/**
 * linda turkmen
 * BIL122 - proje 01
 * manipulates a string
 * @author linda7lll
 *
 */
public class StringManipulator {

    /**
     * returns intiail of the given name
     * eger isim  "ALI VELI" ise,  return "AV".
     * Verilen ismin bas harflerini bulur, ornegin "Ayse Fatma" icin "AF" return eder.
     * ismin sadece 2 kelimeden olustugunu varsayabilirsiniz.
     */

    //isim ve soyisminin basharflerini alip buyuk harflere ceviren method
    String findInitials(String name) {

        String fName = new String();
        fName += name.substring(0,1);
        fName += name.charAt(name.indexOf(" ") + 1);
        fName  = fName.toUpperCase();

        return fName;


    }

    //dosya uzantisini degistirmeye yarayan method
    String changeExtension(String filename, String ext) {

        String extension = new String();
        extension = filename.substring(0,filename.indexOf("."));
        extension = extension + "." + ext;

        return extension;


    }

    public static void main(String[] args) {
		/*This part is not tested and graded.
		You can try to manually test your program from here
		bu kisim proje kapsaminda degerlendirilmeyecektir.
		*/

        String name = "linda turkmen";

        StringManipulator sm = new StringManipulator();
        String fName = sm.findInitials(name);
        String extension = sm.changeExtension("hello.java","txt");

        System.out.println("Girilen isim ve soyismin basharfleri:" + fName);
        System.out.println("Girilen dosyanin yeni uzantisi: " +extension );



    }

}
