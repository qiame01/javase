package exception;

import org.junit.jupiter.api.Test;

/**
 * 	6. 异常关键字throw和throws的用法
		1. throw : 在方法中,手动抛出异常。语法：throw new 异常类（）
		2. throws: 方法声明上使用,标识出方法内部会有异常,让调用者去处理
		3. 案例：买烟
			1. 定义一个Person，有一个买烟的方法，参数是int类型money
			2. 该方法内部判断，当money不够时，抛出异常，让调用者处理
		4. throw在开发中的应用：方法设计者不希望该方法被非法调用，如果非法使用throw抛异常给予警告
		5. throws声明 和 try..catch捕获
			1. throws不处理异常，抛给方法调用者，最终到main方法时，给JVM处理
			2. try..catch是自己处理
 *
 */
public class ThrowTest{

    @Test
    public void ThrowTest() {
		
//		Person p = new Person();
//		p.buyZhongHua(10);
//		System.out.println("买烟结束");
		/**
		 * 异常的解决有两种方式
		 * 	1. 抛出给方法的调用者
		 * 	2. try catch解决
		 */
		Person10 p = new Person10();
		p.buyZhongHua(10);
		/*try {

		} catch (Exception e) {
			//打印异常   栈中追溯（异常发生过程）
			e.printStackTrace();
		}*/
		System.out.println("买烟结束");
	}
}

class Person10{
	
	void buyZhongHua(int money) {
		if (money < 100) {
//			System.out.println("买个锤子，钱不够！");
			//当方法设计者不希望此方法被非法调用，会直接抛出异常
			throw new ArrayIndexOutOfBoundsException("买个锤子，钱不够！");
		}else{
			System.out.println("大哥，你的烟！");
		}
	}
}