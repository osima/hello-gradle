package jp.osima.hello.gradle;

class Main {
	static void main(String[] args){

		def cli = new CliBuilder()
		cli._(longOpt:'name', argName:'name',required:true,  args:1 , 'name')

		def options = cli.parse(args)
		if(options.name)
			println new Greeter().sayHello( options.name )
	}
}
