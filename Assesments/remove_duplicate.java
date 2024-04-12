import java.util.*;
public class remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<Integer> l=new ArrayList<Integer>();
  l.add(10);
  l.add(20);
  l.add(30);
  l.add(40);
  l.add(50);
  l.add(10);
  l.add(20);
  //System.out.println(l);
  Set<Integer> s=new HashSet<Integer>(l);
  System.out.println(s);
	}

}
