package Lambda;

public class ClassLambda {

	public static void main(String[] args) {

		// TODO Auto-generated method stub				
		Foo foo = e-> e + 1;
		
		
		UseFoo uf = new UseFoo();
		uf.method(2, foo);
	}

}

class UseFoo{
	
	public void method(int a, Foo foo) {
		System.out.println(foo.method(a));
	}
}

@FunctionalInterface
interface Foo {	
	public int method (int e) ;
}
