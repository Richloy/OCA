public class JAT4Ex2{
  public static void main(String[] args){
    Tree t = new Tree();
	Oak o = new Oak();
	Camera c = new Camera();
	DisposableCamera d = new DisposableCamera();
	Camera e = new DisposableCamera();
	
	// System.out.println(o instanceof t); // compiler error
	System.out.println(c instanceof Object);
	System.out.println(c instanceof Zoomable);
	System.out.println(t instanceof Zoomable);
	//System.out.println(o instanceof Camera); // compiler error: 'inconvertible types'
	System.out.println(d instanceof Zoomable);
	System.out.println(e instanceof Camera);
  }
}

class Tree{}

class Oak extends Tree{}

class Camera implements Zoomable{}

class DisposableCamera extends Camera{}

interface Zoomable{}