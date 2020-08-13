package coder;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("渡辺",MemberAccess.無料メンバー);
		User user2 = new User("恵み",MemberAccess.黄金メンバー);
		
		if(user1.getType() == MemberAccess.無料メンバー) {
			System.out.println(user1.getName() + "は"+ MemberAccess.無料メンバー.toString() + "です。");
		}
	}

}
