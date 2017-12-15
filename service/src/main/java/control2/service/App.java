package control2.service;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String getHelloFromService() {
		return control2.rep.App.getHelloFromRepo()+"Hello from Service! ";
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
