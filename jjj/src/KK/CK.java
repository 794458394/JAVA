package KK;

public class CK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] s1={"ab","bb","cb","db"};
		String [] s2={"1b","2b","3b","4b"};
		String [] s3={"qb","wb","eb","rb"};
		int index = (int) Math.random() * s1.length;
		int index1 = (int) Math.random() * s2.length;
		int index2 = (int) Math.random() * s3.length;
		String K=s1[index]+s2[index1]+s3[index2];
		System.out.println(K);
		
		

	}

}
