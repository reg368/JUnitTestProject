package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * @author R30
 * JUnit test Suite 
 * �i�H�N JUnit test case (ConcateTest.class, MultiplyTest.class) �X�ְ_�Ӥ@�_��
 * �إ� : File -> New -> Other --> JUnit --> JUnit test Suite
 * ���� : ���class �k�� --> Run As --> JUnite test
 */
@RunWith(Suite.class)
@SuiteClasses({ ConcateTest.class, MultiplyTest.class })
public class AllTests {

}
