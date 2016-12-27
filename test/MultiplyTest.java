package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	/**
	 *  Eclipse --> Help --> Search : "JUnit" found Document
	 * 
	 *  �إ� : File -> New -> Other --> JUnit --> JUnit test Case
	 *  �إ߮ɥi��ܬO�_�n�۰ʫإߥH�U��k:
	 *  setUpBeforeClass()�Aclass��l�Ƥ���եΡA�Ψӧ@���ժ��ǳƤu�@�C
		tearDownAfterClass()�Aclass�������e�եΡA�Ψӧ@���ժ��M�z�u�@�C
        setUp() �A�b����method�e�եΡA�Ψӧ@���ժ��ǳƤu�@
        tearDown() �b����method��եΡA�Ψӧ@���ժ��M�z�u�@�C
     *  
     *  �D�n�]���ժ��a��|�b�o�� @Test ��k��
     *  �i�H�f�t   assertEquals(expect result, actual result) ��k
     *  �ӧP�_�O�_�����~
     *  �� :  int result = test.multiply(2, 2);  //result = 4
     *  	 assertEquals(4,result);  //�w��result = 4 , ��result �]����4 :  ��O�L���~
     *  
     *  ���� : "class" �� "class �U�b�Y --> func name"  
     *  ���k�� Run As --> JUnit Test
	 */
	
	@Test
	public void test() {
		Junit test = new Junit();
		int result = test.multiply(2, 2);
		assertEquals(4,result);
	}
 
}
