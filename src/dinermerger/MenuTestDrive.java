package dinermerger;

import java.util.ArrayList;

public class MenuTestDrive {
	public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);  // 두 메뉴를 인자로 전달
		waitress.printMenu();
		
	}
}
