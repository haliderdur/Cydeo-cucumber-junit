package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

    @Test
    public void read_from_excel_file() throws IOException {
        String path = "SampleData.xlsx";

        // to read data from excel file, need to load it to FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);

        // workbook>sheet>row>cell

        //<1> Create a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //<2> To get specific sheet from currently opened workbook
        XSSFSheet sheet = workbook.getSheet("Employees");

        // <3> Select row and cell
        // indexes start from 0
        System.out.println(sheet.getRow(1).getCell(1));

        // print developer
        System.out.println(sheet.getRow(3).getCell(2));

        // Return the count of used cells only
        // starts counting from 1
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println(usedRows);

        // Return the number from top cell to bottom cell
        // does not careif the cell is empty or not
        // starts counting from 0
        int lastUsedRow = sheet.getLastRowNum();
        System.out.println(lastUsedRow);

        // TODO: Create a logic to print Vinod's name
        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")) {
                System.out.println(sheet.getRow(rowNum).getCell(0));
            }
        }

        // TODO: Create a logic to print Linda's job_ID
        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Linda")) {
                System.out.println(sheet.getRow(rowNum).getCell(2));
            }
        }


    }


}
