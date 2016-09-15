import java.util.Scanner;
public class parking_lot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int park[]=new int[40];
		int sum=0;
		boolean cont=true;
		
		for(int i=1;i<=40;i++)
		{
			park[i-1]=0;
		}
		
		while(cont==true){
			System.out.println("1.空車位數量  2.停車  3.查詢空車位 4.離開");
			int a=scn.nextInt();
			if(a>4||a<1){System.out.println("請輸入1~4");continue;}
			switch(a){
				case 1:
					sum=0;
					for(int i=1;i<=40;i++)
					{
						if(park[i-1]==0){sum=sum+1;}
					}
					System.out.println("目前有"+sum+"個空位");
					break;
				case 2:
					while(true){
						System.out.println("請輸入車位編號:");
						int b=scn.nextInt();
						if(b>40||b<1){System.out.println("請輸入1~40");continue;}
						if(park[b-1]==1){System.out.println("此車位已有人使用");continue;}
						park[b-1]=1;
						break;
					}
						break;
				case 3:
					System.out.println("目前可停的車位有:");
					for(int i=1;i<=40;i++)
					{
						if(park[i-1]==0){System.out.print(i+"  ");}
					}
					System.out.println("");
					break;
				case 4:cont=false;
					break;
			}
		}
		System.out.println("謝謝您的使用");
	}

}
