package excel_tests;
import com.excel.Xls_Reader;
import com.sun.xml.internal.fastinfoset.util.CharArray;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CompareExcel {


    public static void main(String[] args) {
        XSSFWorkbook workbook = null;
        Xls_Reader reader = new Xls_Reader("src/main/java/com/excel/TestData.xlsx");
        Xls_Reader reader2 = new Xls_Reader("src/main/java/com/excel/Testdata2.xlsx");


        for (int i = 0; i <= 3; i++) {
            System.out.println(reader.getSheets().get(i));
            String sheetName = reader.getSheets().get(i);
            String sheetName2 = reader2.getSheets().get(i);
            compare(sheetName,sheetName2);
        }

    }


public static void compare(String sheetName,String sheetName2) {
    Xls_Reader reader = new Xls_Reader("src/main/java/com/excel/TestData.xlsx");
    Xls_Reader reader2 = new Xls_Reader("src/main/java/com/excel/Testdata2.xlsx");

    int rowCount = reader.getRowCount(sheetName);
    int colCount1 = reader.getColumnCount(sheetName);
    int rowCount2 = reader2.getRowCount(sheetName2);
    int colCount2 = reader2.getColumnCount(sheetName2);


    int row = Math.max(rowCount, rowCount2);
    int col = Math.max(colCount1, colCount2);


    String[][] sheetdata1 = new String[row][col];
    String[][] sheetdata2 = new String[row][col];

    for (int i = 1; i <= row; i++) {
        for (int j = 0; j < col; j++) {
            sheetdata1[i-1][j] = reader.getCellData(sheetName, j, i);

            sheetdata2[i-1][j] = reader2.getCellData(sheetName2, j, i);

            if (!sheetdata1[i-1][j].equals(sheetdata2[i-1][j])) {
                System.out.println("C" + j + "" + i + " contains < " + sheetdata1[i-1][j] + "> does not match with C" + j + "" + i + " contains < " + sheetdata2[i -1][j] + ">");
            }
        }
    }
}
}
//This is created by vishnu



