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
			System.out.println("1.�Ũ���ƶq  2.����  3.�d�ߪŨ��� 4.���}");
			int a=scn.nextInt();
			if(a>4||a<1){System.out.println("�п�J1~4");continue;}
			switch(a){
				case 1:
					sum=0;
					for(int i=1;i<=40;i++)
					{
						if(park[i-1]==0){sum=sum+1;}
					}
					System.out.println("�ثe��"+sum+"�ӪŦ�");
					break;
				case 2:
					while(true){
						System.out.println("�п�J����s��:");
						int b=scn.nextInt();
						if(b>40||b<1){System.out.println("�п�J1~40");continue;}
						if(park[b-1]==1){System.out.println("������w���H�ϥ�");continue;}
						park[b-1]=1;
						break;
					}
						break;
				case 3:
					System.out.println("�ثe�i�������즳:");
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
		System.out.println("���±z���ϥ�");
	}

}
