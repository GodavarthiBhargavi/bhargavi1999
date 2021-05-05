public class GenericTest {
public static void main(String[] args) {
		
		MyValues<Integer> mi = new MyValues<Integer>(10,20);
		mi.print();
		mi.swap();
		mi.print();
		
		System.out.println("----------------------");
		
		MyValues<Float> mf = new MyValues<Float>(10.4f, 20.5f);
		mf.print();
		mf.swap();
		mf.print();
		
		System.out.println("----------------------");
		
		MyValues<String> ms = new MyValues<String>("Jack","Julie");
		ms.print();
		ms.swap();
		ms.print();
		
		System.out.println("----------------------");
		
		/* Song s1 = new Song("Tanhayee","Dil Chahta Hai","Sonu Nigam",2003);
		Song s2 = new Song("Pirindhaai","Adithya Varma","Sid Sriram",2020);
		
		MyValues<Song>mss = new  MyValues<Song>(s1,s2);
		mss.print();
		mss.swap();
		mss.print();*/
		
	}
}
class MyValues<AnyType>
{
	AnyType x;	
	AnyType y;
	
	MyValues(AnyType x, AnyType y) {
		this.x = x;
		this.y = y;
	}
	void swap() {
		System.out.println("Swapping...");
		AnyType temp;
		temp = x ;
		x = y;
		y = temp;
		System.out.println("Swapped...");
	}
	void print() {
		System.out.println("x "+x);	
		System.out.println("y "+y);
	}
}
/*class MyIntegers
{
	int x;	
	int y;
	
	MyIntegers(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void swap() {
		System.out.println("Swapping...");
		int temp;
		temp = x ;
		x = y;
		y = temp;
		System.out.println("Swapped...");
	}
	void print() {
		System.out.println("x "+x);	
		System.out.println("y "+y);
	}
}

class MyValues<Floats>
{
	floats x;	
	floats y;
	
	MyValues<Floats>(floats x, floats y) {
		this.x = x;
		this.y = y;
	}
	void swap() {
		System.out.println("Swapping...");
		float temp;
		temp = x ;
		x = y;
		y = temp;
		System.out.println("Swapped...");
	}
	void print() {
		System.out.println("x "+x);	
		System.out.println("y "+y);
	}
}

class MyValues<Strings>

{
	Strings x;	
	Strings y;
	
	MyValues(Strings x, Strings y) {
		this.x = x;
		this.y = y;
	}
	void swap() {
		System.out.println("Swapping...");
		Strings temp;
		temp = x ;
		x = y;
		y = temp;
		System.out.println("Swapped...");
	}
	void print() {
		System.out.println("x "+x);	
		System.out.println("y "+y);
	}
}

class MyValues<Songs>
{
	Songs x;	
	Songs y;
	
	MyValues(Songs x, Songs y) {
		this.x = x;
		this.y = y;
	}
	void swap() {
		System.out.println("Swapping...");
		Songs temp;
		temp = x ;
		x = y;
		y = temp;
		System.out.println("Swapped...");
	}
	void print() {
		System.out.println("x "+x);	
		System.out.println("y "+y);
	}
}

class Songs
{
	String title;
	String album;
	String artist;
	int year;
	
	Songs(String title, String album, String artist, int year) {
		super();
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", album=" + album + ", artist=" + artist + ", year=" + year + "]";
	}
	
	
}*/



