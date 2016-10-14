package com.sysco.locators;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataPoolCoordinates {
public	static  String[] userNameDataPool= new String[26];
public 	static String[]  passwordDataPool= new String[26];
public 	static String[]  accountDataPool= new String[26];
public 	static String[] locationNameDataPool = new String[24];
public 	static String[] editedLocationNameDataPool = new String[12];
public 	static String[] categoryNameDataPool = new String[5];
public 	static String[] searchNameDataPool = new String[5];
public 	static String[] prepItemDataPool = new String[15];
public 	static String[] nonSyscoItemDataPool = new String[27];
public 	static String[] supplier1DataPool= new String[10];
public 	static String[] supplier2DataPool= new String[10];
public 	static String[] supplier3DataPool= new String[10];
public 	static String[] supplier4DataPool= new String[10];
public 	static String[] supplier5DataPool= new String[10];
public 	static String[] uomQuantityDataPool= new String[6];
public 	static String[] productNickNameDataPool=new String[2];
public 	static String[] listNameDataPool = new String[6];
public 	static String[] listProduct1DataPool = new String[6];
public 	static String[] listProduct2DataPool = new String[6];
public 	static String[] listCategoryDataPool = new String[6];
public 	static String[] listUnCatProduct1DataPool = new String[6];
public 	static String[] listUnCatProduct2DataPool = new String[6];
public 	static String[] listUnCatProduct3DataPool = new String[6];
public 	static String[] purchasesDataPool = new String[42];
public 	static String[] foodItemDataPool = new String[5];
public 	static String[] foodPriceDataPool = new String[5];


public  String userNameDataPool1;
public  String passwordDataPool1;

public 	 String[]  cellReferenceLocationName_Excel={"A1","A2","A3","A4","A5","A6","A7","A8","A9","A10","A11","A12"};
public 	 String[]  cellReferenceEditedLocationName_Excel={"B1","B2","B3","B4","B5","B6","B7","B8","B9","B10","B11","B12"};

public 	 String[]  cellReferenceUserName_Excel={"A1","A2","A3","A4","A5","A6","A7","A8","A9","A10","A11","A12","A13","A14","A15","A16","A17","A18","A19","A20","A21","A22","A23","A24","A25","A26"};

public 	 String[]  cellReferenceAccountNumber_Excel={"C1","C2","C3","C4","C5","C6","C7","C8","C9","C10","C11","C12","C13","C14","C15","C16","C17","C18","C19","C20","C21","C22","C23","C24","C25","C26"};
public 	 String[]  cellReferencePassword_Excel={"B1","B2","B3","B4","B5","B6","B7","B8","B9","B10","B11","B12","B13","B14","B15","B16","B17","B18","B19","B20","B21","B22","B23","B24","B25","B26"};

public 	 String[]  cellReferenceCategoryName_Excel={"A1","A2","A3","A4"};
public 	 String[]  cellReferenceSearchName_Excel={"A1","A2","A3","A4"};
public  String[] cellReferencePrepItemData_Excel={"B1","B2","B3","B4","B5","B6","B7","C1","C2","C3","C4","C5","C6","C7"};
public 	 String[]  cellReferenceSupplier1_Excel={"A2","B2","C2","D2","E2","F2"};
public 	 String[]  cellReferenceSupplier2_Excel={"A3","B3","C3","D3","E3","F3"};
public 	 String[]  cellReferenceSupplier3_Excel={"A4","B4","C4","D4","E4","F4"};
public 	 String[]  cellReferenceSupplier4_Excel={"A5","B5","C5","D5","E5","F5"};
public 	 String[]  cellReferenceSupplier5_Excel={"A6","B6","C6","D6","E6","F6"};
public 	 String[]  cellReferenceUomQuantity_Excel={"A2","B2","A3","B3","A4","A5"};
public 	 String[]  cellReferenceProductNickName_Excel={"A2"};
public 	 String[]  cellReferenceListName_Excel={"A1","A2","A3","A4","A5"};
public 	 String[]  cellReferenceProduct1_Excel={"B1","B2","B3","B4","B5"};
public 	 String[]  cellReferenceProduct2_Excel={"C1","C2","C3","C4","C5"};
public 	 String[]  cellReferenceListCategoryName_Excel={"G1","G2","G3","G4","G5"};
public 	 String[]  cellReferenceUnCatProduct1_Excel={"D1","D2","D3","D4","D5"};
public 	 String[]  cellReferenceUnCatProduct2_Excel={"E1","E2","E3","E4","E5"};
public 	 String[]  cellReferenceUnCatProduct3_Excel={"F1","F2","F3","F4","F5"};
public 	 String[]  cellReferencePurchases_Excel={"A2","B2","C2","D2","E2","F2","G2","H2","I2","J2","K2","L2","M2"};

public 	 String[]  cellReferenceFoodItem_Excel={"A2","A3","A4","A5"};
public 	 String[]  cellReferenceFoodPrice_Excel={"B2","B3","B4","B5"};
int i;
String excelFilePath = "/com/DataPool.xlsx";

InputStream ins;

Workbook workbook;
protected Sheet loginExcelData;
Sheet locationsExcelData;
Sheet categoryExcelData;
Sheet searchExcelData;
Sheet supplier1ExcelData;
Sheet supplier2ExcelData;
Sheet supplier3ExcelData;
Sheet supplier4ExcelData;
Sheet supplier5ExcelData;
Sheet uomQuantityExcelData;
Sheet productNickNameExcelData;
Sheet prepItemExcelData;
Sheet nonSyscoItemExcelData;
Sheet purchaseExcelData;
Sheet listExcelData;
Sheet purchasesData;
Sheet foodItemData, foodPriceData;
public String[] userName= new String[5];
public String password;
public String locationName;
public String editedLocationName;
String locationName1;
String locationName2;
String categoryName1;
String categoryName2;


public 	static String[] list2DataPool= new String[29];
Sheet list2ExcelData;
public 	 String[]  cellReferenceList2_Excel={"A3","B3","C3"};
public 	static String[] list3DataPool= new String[29];
Sheet list3ExcelData;
public 	 String[]  cellReferenceList3_Excel={"A4","B4","C4"};
public 	static String[] list4DataPool= new String[29];
Sheet list4ExcelData;
public 	 String[]  cellReferenceList4_Excel={"A2","B2"};
public	String[] cellReferenceNonSyscoItemData_Excel={"B1","B2","B3","B4","B5","B6","B7","B8","B9","C1","C2","C3","C4","C5","C6","C7","C8","C9","D1","D2","D3","D4","D5","D6","D7","D8","D9"};

public 	static String[] list6DataPool= new String[6];
Sheet list6ExcelData;
public 	 String[]  cellReferenceList6_Excel={"A6","H6","I6","J6","K6","E5"};


public   DataPoolCoordinates readFromExcelUserInfo() throws IOException{

	try{
	  ins= getClass().getResourceAsStream(excelFilePath);
	}
	catch(Exception e){
	excelFilePath="/com/DataPool.xlsx";
	System.out.println(excelFilePath);
	ins=getClass().getResourceAsStream(excelFilePath);
	}
	  workbook = new XSSFWorkbook(ins);
	  loginExcelData  = workbook.getSheetAt(0);
	
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
loginExcelData = workbook.getSheetAt(0);*/

for (int i = 0; i < cellReferenceUserName_Excel.length; i++) {
	CellReference loginDataUserNameReference = new CellReference(cellReferenceUserName_Excel[i]); 
    Row loginUserNameRow = loginExcelData.getRow(loginDataUserNameReference.getRow());
    userNameDataPool[i] = loginUserNameRow.getCell(loginDataUserNameReference.getCol()).toString();
    
    CellReference loginPasswordDataReference = new CellReference(cellReferencePassword_Excel[i]); 
    Row loginPasswordRow2 = loginExcelData.getRow(loginPasswordDataReference.getRow());
    passwordDataPool[i]= loginPasswordRow2.getCell(loginPasswordDataReference.getCol()).toString();	
    
    CellReference loginAccountNumberDataReference = new CellReference(cellReferenceAccountNumber_Excel[i]); 
    Row loginAccountNumberRow2 = loginExcelData.getRow(loginAccountNumberDataReference.getRow());
    if(!loginAccountNumberRow2.getCell(loginAccountNumberDataReference.getCol(),loginAccountNumberRow2.RETURN_BLANK_AS_NULL).equals(null))
    {
    accountDataPool[i]= loginAccountNumberRow2.getCell(loginAccountNumberDataReference.getCol()).toString();	
    }
    
    
}

return this;
}	


public   DataPoolCoordinates readFromExcelLocationInfo() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
locationsExcelData = workbook.getSheetAt(1);*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  locationsExcelData  = workbook.getSheetAt(1);

for (int j = 0; j < cellReferenceLocationName_Excel.length; j++) {
	CellReference locationDataReference = new CellReference(cellReferenceLocationName_Excel[j]); 
    Row locationDataRow = locationsExcelData.getRow(locationDataReference.getRow());
    locationNameDataPool[j] = locationDataRow.getCell(locationDataReference.getCol()).toString();
    CellReference editedLocationDataReference = new CellReference( cellReferenceEditedLocationName_Excel[j]); 
    Row editedLocationRow2 = locationsExcelData.getRow(editedLocationDataReference.getRow());
    editedLocationNameDataPool[j]= editedLocationRow2.getCell(editedLocationDataReference.getCol()).toString();	
    
}
return this;

}	



public   DataPoolCoordinates readFromExcelCategoryInfo() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
categoryExcelData= workbook.getSheetAt(2);*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  categoryExcelData  = workbook.getSheetAt(2);

for (int k = 0; k < cellReferenceCategoryName_Excel.length; k++) {

	CellReference categoryDataReference = new CellReference(cellReferenceCategoryName_Excel[k]); 
    Row categoryDataRow = categoryExcelData.getRow(categoryDataReference.getRow());
    categoryNameDataPool[k] = categoryDataRow.getCell(categoryDataReference.getCol()).toString();
}
return this;
}		

public   DataPoolCoordinates readFromExcelSearchInfo() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
searchExcelData= workbook.getSheetAt(8);*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  searchExcelData  = workbook.getSheetAt(8);

for (int m = 0; m < cellReferenceSearchName_Excel.length; m++) {

	CellReference searchDataReference = new CellReference(cellReferenceSearchName_Excel[m]); 
    Row searchDataRow = searchExcelData.getRow(searchDataReference.getRow());
    searchNameDataPool[m] = searchDataRow.getCell(searchDataReference.getCol()).toString();
	
}
return this;
}	



public  DataPoolCoordinates readFromExcelPrepItemInfo() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
prepItemExcelData= workbook.getSheetAt(5);*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  prepItemExcelData  = workbook.getSheetAt(5);

for (int l = 0; l < cellReferencePrepItemData_Excel.length; l++) {

CellReference prepItemDataReference = new CellReference(cellReferencePrepItemData_Excel[l]);
 Row prepItemDataRow = prepItemExcelData.getRow(prepItemDataReference.getRow());
prepItemDataPool[l] = prepItemDataRow.getCell(prepItemDataReference.getCol()).toString();
	
}
return this;
}	

public  DataPoolCoordinates readFromExcelNonSyscoItemInfo() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
nonSyscoItemExcelData= workbook.getSheetAt(4);*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  nonSyscoItemExcelData  = workbook.getSheetAt(4);

for (int m = 0; m < cellReferenceNonSyscoItemData_Excel.length; m++) {

	CellReference nonSyscoItemDataReference = new CellReference(cellReferenceNonSyscoItemData_Excel[m]);
 Row nonSyscoDataRow = nonSyscoItemExcelData.getRow(nonSyscoItemDataReference.getRow());
 nonSyscoItemDataPool[m] = nonSyscoDataRow.getCell(nonSyscoItemDataReference.getCol()).toString();
}
return this;

}	
public   DataPoolCoordinates readFromExcelSupplier1Info() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
supplier1ExcelData = workbook.getSheetAt(10);*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  supplier1ExcelData  = workbook.getSheetAt(10);

for (int i = 0; i < cellReferenceSupplier1_Excel.length; i++) {
	CellReference supplier1DataReference = new CellReference(cellReferenceSupplier1_Excel[i]); 
    Row supplier1Row = supplier1ExcelData.getRow(supplier1DataReference.getRow());
    supplier1DataPool[i] = supplier1Row.getCell(supplier1DataReference.getCol()).toString();
}
return this;
}	

public   DataPoolCoordinates readFromExcelSupplier2Info() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
supplier2ExcelData = workbook.getSheetAt(10);
*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  supplier2ExcelData  = workbook.getSheetAt(10);
for (int i = 0; i < cellReferenceSupplier2_Excel.length; i++) {
	CellReference supplier2DataReference = new CellReference(cellReferenceSupplier2_Excel[i]); 
    Row supplier2Row = supplier2ExcelData.getRow(supplier2DataReference.getRow());
    supplier2DataPool[i] = supplier2Row.getCell(supplier2DataReference.getCol()).toString();
}
return this;
}

public   DataPoolCoordinates readFromExcelSupplier3Info() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
supplier3ExcelData = workbook.getSheetAt(10);*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  supplier3ExcelData  = workbook.getSheetAt(10);

for (int i = 0; i < cellReferenceSupplier3_Excel.length; i++) {
	CellReference supplier3DataReference = new CellReference(cellReferenceSupplier3_Excel[i]); 
    Row supplier3Row = supplier3ExcelData.getRow(supplier3DataReference.getRow());
    supplier3DataPool[i] = supplier3Row.getCell(supplier3DataReference.getCol()).toString();
}
return this;
}

public   DataPoolCoordinates readFromExcelSupplier4Info() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
supplier4ExcelData = workbook.getSheetAt(10);
*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  supplier4ExcelData  = workbook.getSheetAt(10);
for (int i = 0; i < cellReferenceSupplier3_Excel.length; i++) {
	CellReference supplier4DataReference = new CellReference(cellReferenceSupplier4_Excel[i]); 
    Row supplier4Row = supplier4ExcelData.getRow(supplier4DataReference.getRow());
    supplier4DataPool[i] = supplier4Row.getCell(supplier4DataReference.getCol()).toString();
}
return this;
}
public   DataPoolCoordinates readFromExcelSupplier5Info() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
supplier5ExcelData = workbook.getSheetAt(10);*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  supplier5ExcelData  = workbook.getSheetAt(10);

for (int i = 0; i < cellReferenceSupplier5_Excel.length; i++) {
	CellReference supplier5DataReference = new CellReference(cellReferenceSupplier4_Excel[i]); 
    Row supplier4Row = supplier5ExcelData.getRow(supplier5DataReference.getRow());
    supplier5DataPool[i] = supplier4Row.getCell(supplier5DataReference.getCol()).toString();
}
return this;
}
	
public   DataPoolCoordinates readFromExcelProductNickNameInfo() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
productNickNameExcelData = workbook.getSheetAt(7);
*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  productNickNameExcelData  = workbook.getSheetAt(7);
for (int i = 0; i < cellReferenceProductNickName_Excel.length; i++) {
	CellReference productNickNameDataReference = new CellReference(cellReferenceProductNickName_Excel[i]); 
    Row productNickNameRow = productNickNameExcelData.getRow(productNickNameDataReference.getRow());
    productNickNameDataPool[i] = productNickNameRow.getCell(productNickNameDataReference.getCol()).toString();
}
return this;
}

public   DataPoolCoordinates readFromExcelPurchasesInfo() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
purchaseExcelData = workbook.getSheetAt(7);*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  purchaseExcelData  = workbook.getSheetAt(7);
System.out.println(purchaseExcelData.getSheetName());

for (int i = 0; i < cellReferencePurchases_Excel.length; i++) {
	CellReference purchasesDataReference = new CellReference(cellReferencePurchases_Excel[i]); 
	System.out.println(purchasesDataReference.getRow());
    Row purchasesRow = purchaseExcelData.getRow(purchasesDataReference.getRow());
    purchasesDataPool[i] = purchasesRow.getCell(purchasesDataReference.getCol()).toString();
}
return this;
}



public   DataPoolCoordinates readFromExcelListInfo() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
listExcelData= workbook.getSheetAt(3);
*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  listExcelData  = workbook.getSheetAt(3);
for (int l = 0; l < cellReferenceListName_Excel.length; l++) {

	CellReference listNameDataReference = new CellReference(cellReferenceListName_Excel[l]); 
    Row listDataRow = listExcelData.getRow(listNameDataReference.getRow());
   listNameDataPool[l] = listDataRow.getCell(listNameDataReference.getCol()).toString();
	System.out.println("list name"+listNameDataPool[3]);
	
	CellReference listProduct1DataReference = new CellReference(cellReferenceProduct1_Excel[l]); 
    Row product1DataRow = listExcelData.getRow(listProduct1DataReference.getRow());
   listProduct1DataPool[l] = product1DataRow.getCell(listProduct1DataReference.getCol()).toString();
	System.out.println("pdt1"+listProduct1DataPool[3]);
	
	CellReference listProduct2DataReference = new CellReference(cellReferenceProduct2_Excel[l]); 
    Row product2DataRow = listExcelData.getRow(listProduct2DataReference.getRow());
   listProduct2DataPool[l] = product2DataRow.getCell(listProduct2DataReference.getCol()).toString();
	System.out.println("pdt2"+listProduct2DataPool[3]);
	
	CellReference listCategoryDataReference = new CellReference(cellReferenceListCategoryName_Excel[l]); 
    Row listCategoryDataRow = listExcelData.getRow(listCategoryDataReference.getRow());
    listCategoryDataPool[l] = listCategoryDataRow.getCell(listCategoryDataReference.getCol()).toString();
	System.out.println("list name"+listCategoryDataPool[4]);
	
	CellReference listUncatProduct1DataReference = new CellReference(cellReferenceUnCatProduct1_Excel[l]); 
    Row unCatProduct1DataRow = listExcelData.getRow(listUncatProduct1DataReference.getRow());
   listUnCatProduct1DataPool[l] =unCatProduct1DataRow.getCell(listUncatProduct1DataReference.getCol()).toString();
	System.out.println("pdt1"+listUnCatProduct1DataPool[4]);
	
	CellReference listUnCatProduct2DataReference = new CellReference(cellReferenceUnCatProduct2_Excel[l]); 
    Row unCatProduct2DataRow = listExcelData.getRow( listUnCatProduct2DataReference.getRow());
   listUnCatProduct2DataPool[l] = unCatProduct2DataRow.getCell( listUnCatProduct2DataReference.getCol()).toString();
	System.out.println("pdt2"+listUnCatProduct2DataPool[4]);
	
	CellReference listUnCatProduct3DataReference = new CellReference(cellReferenceUnCatProduct3_Excel[l]); 
    Row unCatProduct3DataRow = listExcelData.getRow( listUnCatProduct3DataReference.getRow());
   listUnCatProduct2DataPool[l] = unCatProduct3DataRow.getCell( listUnCatProduct3DataReference.getCol()).toString();
	System.out.println("pdt2"+listUnCatProduct3DataPool[4]);
	
	
}
return this;
}	

public   DataPoolCoordinates readFromExcelList4Info() throws IOException{
//FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
//workbook = new XSSFWorkbook(inputStream);
//list4ExcelData = workbook.getSheetAt(3);
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  list4ExcelData  = workbook.getSheetAt(3);

for (int i = 0; i < cellReferenceList4_Excel.length; i++) {
	CellReference list4DataReference = new CellReference(cellReferenceList4_Excel[i]); 
    Row list4Row = list4ExcelData.getRow(list4DataReference.getRow());
    list4DataPool[i] = list4Row.getCell(list4DataReference.getCol()).toString();
    System.out.println(list4DataPool[0]);
}
return this;
}

public   DataPoolCoordinates readFromExcelList6Info() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
list6ExcelData = workbook.getSheetAt(3);*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  list6ExcelData  = workbook.getSheetAt(3);

for (int i = 0; i < cellReferenceList6_Excel.length; i++) {
	CellReference list6DataReference = new CellReference(cellReferenceList6_Excel[i]); 
    Row list6Row = list6ExcelData.getRow(list6DataReference.getRow());
    list6DataPool[i] = list6Row.getCell(list6DataReference.getCol()).toString();
    System.out.print("  "+ list6DataPool[i]);
}
return this;
}
public   DataPoolCoordinates readFromExcelUOMQuantityInfo() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
uomQuantityExcelData = workbook.getSheetAt(9);*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/sysco/locators/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  uomQuantityExcelData  = workbook.getSheetAt(9);

for (int i = 0; i < cellReferenceUomQuantity_Excel.length; i++) {
	CellReference uomQuantityDataReference = new CellReference(cellReferenceUomQuantity_Excel[i]); 
    Row uomQuantityRow = uomQuantityExcelData.getRow(uomQuantityDataReference.getRow());
    uomQuantityDataPool[i] = uomQuantityRow.getCell(uomQuantityDataReference.getCol()).toString();
    System.out.print(""+uomQuantityDataPool[0]);
}
//System.out.println(uomQuantityDataPool[0]);
return this;
}

public   DataPoolCoordinates readFromExcelList2Info() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
list2ExcelData = workbook.getSheetAt(3);*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  list2ExcelData  = workbook.getSheetAt(3);

for (int i = 0; i < cellReferenceList2_Excel.length; i++) {
	CellReference list2DataReference = new CellReference(cellReferenceList2_Excel[i]); 
    Row list2Row = list2ExcelData.getRow(list2DataReference.getRow());
    list2DataPool[i] = list2Row.getCell(list2DataReference.getCol()).toString();
 
}
return this;
}
public   DataPoolCoordinates readFromExcelList3Info() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
list3ExcelData = workbook.getSheetAt(3);*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  list3ExcelData  = workbook.getSheetAt(3);

for (int i = 0; i < cellReferenceList3_Excel.length; i++) {
	CellReference list3DataReference = new CellReference(cellReferenceList3_Excel[i]); 
    Row list3Row = list3ExcelData.getRow(list3DataReference.getRow());
    list3DataPool[i] = list3Row.getCell(list3DataReference.getCol()).toString();
    
}
return this;
}


public   DataPoolCoordinates readFromExcelFoodItemInfo() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
foodItemData = workbook.getSheetAt(11);*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  foodItemData  = workbook.getSheetAt(11);

for (int i = 0; i < cellReferenceFoodItem_Excel.length; i++) {
	CellReference purchasesDataReference = new CellReference(cellReferenceFoodItem_Excel[i]); 
    Row purchasesRow = foodItemData.getRow(purchasesDataReference.getRow());
    foodItemDataPool[i] = purchasesRow.getCell(purchasesDataReference.getCol()).toString();
}
return this;
}

public   DataPoolCoordinates readFromExcelFoodPriceInfo() throws IOException{
/*FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
workbook = new XSSFWorkbook(inputStream);
foodPriceData = workbook.getSheetAt(11);*/
	try{
		  ins= getClass().getResourceAsStream(excelFilePath);
		}
		catch(Exception e){
		excelFilePath="com/DataPool.xlsx";
		System.out.println(excelFilePath);
		ins=getClass().getResourceAsStream(excelFilePath);
		}
		  workbook = new XSSFWorkbook(ins);
		  foodPriceData  = workbook.getSheetAt(11);

for (int i = 0; i < cellReferenceFoodPrice_Excel.length; i++) {
	CellReference purchasesDataReference = new CellReference(cellReferenceFoodPrice_Excel[i]); 
    Row purchasesRow = foodPriceData.getRow(purchasesDataReference.getRow());
    foodPriceDataPool[i] = purchasesRow.getCell(purchasesDataReference.getCol()).toString();
}
return this;
}


}
