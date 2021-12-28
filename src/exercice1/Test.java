package exercice1;

public class Test {
	
	public static void main(String[] args){
		Pile p = new Pile();
		try {
		for(int i=0;i<args.length;i++) {
			p.empile(args[i]);
			}
		}
		
		catch(PilePleine e) {
			System.out.println(e.getMessage());
		}
		try {
		for(;;) System.out.print(p.depile()+" ");
		}
		catch(PileVide a) {
			System.out.println(a.getMessage());
			}
		}
}


