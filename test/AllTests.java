package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * @author R30
 * JUnit test Suite 
 * 可以將 JUnit test case (ConcateTest.class, MultiplyTest.class) 合併起來一起測
 * 建立 : File -> New -> Other --> JUnit --> JUnit test Suite
 * 執行 : 對者class 右鍵 --> Run As --> JUnite test
 */
@RunWith(Suite.class)
@SuiteClasses({ ConcateTest.class, MultiplyTest.class })
public class AllTests {

}
