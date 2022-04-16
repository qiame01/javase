package clazz.encapsulation.static_final;

/**
 * 4. 静态方法 static修饰的方法 (类方法)   与    非静态方法 (对象方法)   的使用注意事项 :
		区别1 : 调用格式
			           静态方法 :		类名.方法名();对象名.方法名();
				非静态方法 :	对象名.方法名();
		区别2: 时间 (类先于对象被加载, 先有类,才有对象)
			    静态方法 :	在类加载时存放到方法区的 `静态区` 中, 直接使用类名调用, 无需对象.
			    非静态方法 :	非静态方法依赖与对象的调用. 必须先有对象, 才能调用 `非静态方法`.
		
		区别3: 静态关键字是一个修饰符。可以修饰类中的对象方法和成员属性。
		              不能修饰构造方法, 因为构造方法就是用来初始化对象的.    
			  注意：static 关键字和对象没有任何关系, 构造方法就是用来创建和初始化对象的. 所以不能混合使用. 
		
		区别4: 静态方法中不能调用非静态方法和属性,因为静态方法中没有 this, 无法确定是具体哪一个对象调用.
			   非静态方法可以调用静态方法和静态属性。
	
		区别5: 静态方法中不能使用this 和 super关键字。
			this关键字它表示的是当前调用这个方法的那个对象。而在静态方法中是没有对象的。
	5. 静态修饰的优劣
		1. 优点
			1. 节省内存中开辟对象的空间
			2. 提升了程序的执行效率
		2. 缺点
			1. 静态方法无法访问非静态方法和属性
	6. 静态代码块
		1. 局部代码块（知道）：控制变量的生命周期，没意义 
		2. 构造代码块（知道）：存在于类中的成员位置，每创建一个对象执行一次（先于构造方法执行，但作用雷同，所以几乎不用）
		3. 静态代码块
			1. 它优先于主方法执行、优先于构造代码块执行，当以任意形式第一次使用到该类时执行。
			2. 该类不管创建多少对象，静态代码块只执行一次，可用于给静态变量赋值，用来给类进行初始化。
			3. 应用：后面学到的数据库中应用（第一步注册数据库驱动，这块代码在整个系统中只需要执行一次，所以使用静态代码块）。
 *
 */
//StaticDemo.main
public class StaticBlockTest {
	static{
		System.out.println("嘿嘿，我来了main方法");
	}
	static int i;
	
	public static void main(String[] args) {
		//1. 局部代码块（知道）：控制变量的生命周期，没意义 
		{
			int x = 1;
		}
		System.out.println("我是main方法");
		
		Person p1 = new Person();
		Person p2 = new Person();
	}
}
class Person{
	int age;
	//2. 构造代码块（知道）：存在于类中的成员位置，每创建一个对象执行一次（先于构造方法执行，但作用雷同，所以几乎不用）
	{
		System.out.println("哈哈，我是构造代码块！");
	}
	static{
		System.out.println("哈哈，我是静态代码块！");
	}
	public Person(){
		System.out.println("哈哈，我是构造方法");
	}
}
