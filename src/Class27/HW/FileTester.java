package Class27.HW;

public class FileTester {

    public static void main(String[] args) {

        File[] objArr={new JavaFile(), new WordFile(), new PdfFile()};
        //FileTester.printAllObj(objArr);
        for (File all:objArr) {

            all.open();
            all.edit();
            all.close();

        }

    }

   /* static void printAllObj(File[] objArr){
        for (File all:objArr) {

            all.open();
            all.edit();
            all.close();

        }
    }*/
}
