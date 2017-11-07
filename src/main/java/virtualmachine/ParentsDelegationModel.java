package virtualmachine;

public class ParentsDelegationModel {

	//启动类加载器：这个类加载起是由c++语言实现，是虚拟机的一部分
	
	//扩展类加载器：这个加载器可以让开发者直接使用
	
	//应用程序加载器：这个加载起是ClassLoader中的getSystemLoader()方法的返回值，所以成为系统类加载器，如果不指定自己的加载器，系统一般默认该加载器
	
	
	//双亲委派模型：
		//如果一个类加载起收到了类加载的请求，它首先不会自己区尝试加载这个类，而是讲将这个请求委派给父类加载起去完成，
			//因此所有的加载请求都应该传送到启动类加载器，只有当父类加载器反馈无法加载这个请求时，子类加载器才会尝试自己加载
}
