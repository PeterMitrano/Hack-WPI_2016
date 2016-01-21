import java.io.*;

class HelloWorld {

	public static void main(String[] args){
		String name = "Peter";
		if (args.length > 0) {
			name = args[0];
		}
		HelloWorld peter = new HelloWorld(name);
		peter.greet();
	}

	private String name;

	HelloWorld(String name){
		this.name = name;
	}

	public void greet(){
		System.out.println(name);
	}

}
