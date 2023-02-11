package Write_Data;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.*;

public class WriteData {

    @Test
    public void writeToFileTest() throws IOException {
        File file = new File("src/main/resources/TestSetup.xlsx");

        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook= new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet= workbook.getSheetAt(0);
        XSSFRow newRow=  sheet.createRow(sheet.getLastRowNum()+1); //created one more row on the sheet.

        XSSFCell newCell = newRow.createCell(0, CellType.STRING);
        newCell.setCellValue("Preprod");

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        workbook.write(fileOutputStream);





    }
}
