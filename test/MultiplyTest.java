package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	/**
	 *  Eclipse --> Help --> Search : "JUnit" found Document
	 * 
	 *  建立 : File -> New -> Other --> JUnit --> JUnit test Case
	 *  建立時可選擇是否要自動建立以下方法:
	 *  setUpBeforeClass()，class初始化之後調用，用來作測試的準備工作。
		tearDownAfterClass()，class結束之前調用，用來作測試的清理工作。
        setUp() ，在測試method前調用，用來作測試的準備工作
        tearDown() 在測試method後調用，用來作測試的清理工作。
     *  
     *  主要跑測試的地方會在這個 @Test 方法內
     *  可以搭配   assertEquals(expect result, actual result) 方法
     *  來判斷是否有錯誤
     *  例 :  int result = test.multiply(2, 2);  //result = 4
     *  	 assertEquals(4,result);  //預期result = 4 , 而result 也等於4 :  綠燈無錯誤
     *  
     *  執行 : "class" 或 "class 下箭頭 --> func name"  
     *  按右鍵 Run As --> JUnit Test
	 */
	
	@Test
	public void test() {
		Junit test = new Junit();
		int result = test.multiply(2, 2);
		assertEquals(4,result);
	}
 
}
