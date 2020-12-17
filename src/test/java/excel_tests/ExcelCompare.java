/*
package excel_tests;


import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ExcelCompare {
    {
        Workbook wb1 = WorkbookFactory.create(new File("src/main/java/com/excel/TestData.xlsx"));
        Workbook wb2 = WorkbookFactory.create(new File("src/main/java/com/excel/Testdata2.xlsx"));
        List<String> listOfDifferences = ExcelComparator.compare(wb1, wb2);
        for (String differences : listOfDifferences)
            System.out.println(differences);
        System.out.println("DifferenceFound = " + excelFileDifference.isDifferenceFound);
    }


    @SuppressWarnings({"java:S106", "java:S4823", "java:S1192"})
    public static class ExcelComparator {

        private static final String CELL_DATA_DOES_NOT_MATCH = "Cell Data does not Match ::";
        private static final String CELL_FONT_ATTRIBUTES_DOES_NOT_MATCH = "Cell Font Attributes does not Match ::";

        private static class Locator {
            Workbook workbook;
            Sheet sheet;
            Row row;
            Cell cell;
        }

        List<String> listOfDifferences = new ArrayList<>();
        // private final DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ROOT);


        public static void main(String[] args) throws Exception {
            if (args.length != 2 || !(new File(args[0]).exists()) || !(new File(args[1]).exists())) {
                System.err.println("java -cp <classpath> " + ExcelComparator.class.getCanonicalName() + " <workbook1.xls/x> <workbook2.xls/x");
                System.exit(-1);
            }

            try (Workbook wb1 = WorkbookFactory.create(new File(args[0]), null, true)) {
                try (Workbook wb2 = WorkbookFactory.create(new File(args[1]), null, true)) {
                    for (String d : ExcelComparator.compare(wb1, wb2)) {
                        System.out.println(d);
                    }
                }
            }
        }

        */
/**
         * Utility to compare Excel File Contents cell by cell for all sheets.
         *
         * @param wb1 the workbook1
         * @param wb2 the workbook2
         * @return the Excel file difference containing a flag and a list of differences
         *//*

        public static List<String> compare(Workbook wb1, Workbook wb2) {
            Locator loc1 = new Locator();
            Locator loc2 = new Locator();
            loc1.workbook = wb1;
            loc2.workbook = wb2;

            ExcelComparator excelComparator = new ExcelComparator();
            excelComparator.compareNumberOfSheets(loc1, loc2);
            excelComparator.compareSheetNames(loc1, loc2);
            excelComparator.compareSheetData(loc1, loc2);

            return excelComparator.listOfDifferences;
        }
    }
}*/
