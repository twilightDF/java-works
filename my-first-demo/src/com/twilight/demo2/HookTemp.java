package com.twilight.demo2;
/**
 * 测试回调（钩子函数！）
 * @author 杜锋
 *实际上也是多态！
 *也叫模板方法模式
 */
//制定模板
public class HookTemp {
	public static void drawFrame(FatherClass f/*这是传进一个父类的对象*/) {
		System.out.println("启动线程！");
		System.out.println("增加循环！");
		System.out.println("查看消息栈！");
		
		//画窗口！
		
		f.paint();/*hook 挂钩函数*/
		
		System.out.println("启动缓存，增加效率！");
	}
	
	public static void main(String[] args) {
		//传入了01子类的对象！
		drawFrame(new SonClass01());
		//即父类引用指向子类对象！
		
		
		/*drawFrame(new SonClass02());*/
		
	}
}
//定义一个父类！
class FatherClass{
	public void paint() {
		System.out.println("窗口自己弹出来！");
		
	}
}
//定义多个子类
class SonClass01 extends FatherClass {
  @Override
public void paint() {
	  //重写paint（）；
	  System.out.println("弹出01的窗口！");
}
}

class SonClass02 extends FatherClass{
	@Override
	public void paint() {
		System.out.println("弹出02的窗口！");
	}
}







