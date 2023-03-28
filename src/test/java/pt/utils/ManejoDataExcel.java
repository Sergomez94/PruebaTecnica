package pt.utils;

import java.util.Map;
import java.util.logging.Logger;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.IOException;


public class ManejoDataExcel {

	private static final Logger LOGGER = Logger.getLogger(AccionesObjetos.class.getName());
	
	public void escribirLog(String texto) {
		LOGGER.info("Escribirlog: "+texto);
	}
	
	public Map<String,String> leerFilaDataExcel(String NombreHojaExcel, int filaData){
		Map mapItems= null;
		
		try {
			FileInputStream file= new FileInputStream("./src/test/resources/data/DataFile.xlsx");
			XSSFWorkbook workbook= new XSSFWorkbook(file);
			XSSFSheet sheet= workbook.getSheet(NombreHojaExcel);
			int totalFilas= sheet.getLastRowNum()-sheet.getFirstRowNum()+1;
			int totalColumnas= sheet.getRow(1).getLastCellNum();
			if((filaData>totalFilas)||(filaData<=1)) {
				if(filaData==1) {
					escribirLog("Error en la fila "+ filaData + " del excel contiene las 'keys' no los datos");
					fail();
				}
				escribirLog("Error en la fila " +filaData+ " del excel no existen datos" );
			}
			filaData--;
			String [][] keysData= new String[totalColumnas][totalFilas];
			for(int col=0; col<totalColumnas;col++) {
				keysData[col][0]=sheet.getRow(0).getCell(col).getStringCellValue();
				try {
					keysData[col][1]=sheet.getRow(filaData).getCell(col).getStringCellValue();
					
				}catch(Exception e) {
					int value=(int)(sheet.getRow(filaData).getCell(col).getNumericCellValue());
					keysData[col][1]=Integer.toString(value);
				}
			}
			mapItems= ArrayUtils.toMap(keysData);
					
		}catch(IOException e){
			escribirLog("Error no se puede leer el archivo de Excel");
			fail();
		}
		return mapItems;
	}
}
