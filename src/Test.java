
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack=new Stack<>();
		String s="a";
		for(int i=0;i<20;i++){
			stack.push(s);
		
			s=s+1;
		}
//		for(int i=0;i<20;i++){
//			System.out.println(stack.pop());
//		}
		for(String b:stack){
			System.out.println(b);
		}
	}

}
