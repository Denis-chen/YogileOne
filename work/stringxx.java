import java.util.*;
public class stringxx
{
	public static void main (String args[]) 
	{
		String [] namelist = {"????","????","?????","???","????"};
		//String []  numberlist= {"20175210","201752XX","20175223","20175201","20175216"};
		int choiceone = 0;
		for(int count = 0; count != 1; count++)
		{
			System.out.println("��ѡ������Ҫ�ķ���:");
			System.out.println("1.����������ͬ����;\n"+"2.����������ͬ���ֽ�β.\n"
			+"3.����ѧ��������ȷ���Ƿ����.\n"+"4.�г�����ѧ������.\n"
			+"5.�������йؼ��ַ���ѧ������.\n"+"6.�����ַ����У������ؼ�����\\βλ��.\n"
			+"7.�����ַ����У���ȡ��Ӧ�ؼ���.\n"+"8.ȥ�������ַ��������ߵĿո�.\n"+"0.�˳�.\n");
		
			Scanner inputone = new Scanner(System.in);
			int service = inputone.nextInt();
			choiceone = 0;
			switch(service)
			{
				case 1:
					choiceone = 1;
					count = 0;
					break;
				case 2:
					choiceone = 2;
					count = 0;
					break;
				case 3:
					choiceone = 3;
					count = 0;
					break;
				case 4:
					choiceone = 4;
					count = 0;
					break;
				case 5:
					choiceone = 5;
					count = 0;
					break;
				case 6:
					choiceone = 6;
					count = 0;
					break;
				case 7:
					choiceone = 7;
					count = 0;
					break;
				case 8:
					choiceone = 8;
					count = 0;
					break;
				case 0:
					choiceone = 0;
					count = 0;
					System.out.println("���˳�.\n");
					System.exit(-1);
					break;
				default:
					System.out.println("����!����������:\n");
					count = 1;
			}
		}
		if(choiceone == 1)
		{
			System.out.println("��������Ҫ�������:");
			Scanner inputtwo = new Scanner(System.in);
			String familyname = inputtwo.nextLine();
			for(int count=0, choicetwo = 0; count < namelist.length; count++)
			{
				
				if(namelist[count].startsWith(familyname))		//String���÷�����:public boolean startsWith(String s)
				{
					choicetwo = 1;
				}
				if((choicetwo == 1)&&(count == namelist.length-1))
				{
					System.out.printf("���� %s ����.\n", familyname);
				}
				else if((choicetwo == 0)&&(count == namelist.length-1))
				{
					System.out.printf("û���� %s ����.\n", familyname);
				}
				else
				{
					;
				}
			}
		}
		else if(choiceone == 2)
		{
			System.out.println("��������Ҫ������ֽ�β:");
			Scanner inputtwo = new Scanner(System.in);
			String familyname = inputtwo.nextLine();
			for(int count=0, choicetwo = 0; count < namelist.length; count++)
			{
				
				if(namelist[count].endsWith(familyname))		//String���÷�����:public boolean endsWith(String s)
				{
					choicetwo = 1;
				}
				if((choicetwo == 1)&&(count == namelist.length-1))
				{
					System.out.printf("�����ֽ�βΪ %s ����.\n", familyname);
				}
				else if((choicetwo == 0)&&(count == namelist.length-1))
				{
					System.out.printf("û�����ֽ�βΪ %s ����.\n", familyname);
				}
				else
				{
					;
				}
			}
		}
		else if(choiceone == 3)
		{
			System.out.println("������404��������һ������:");
			Scanner reader = new Scanner(System.in);
			String x = reader.nextLine();
			int i = 0;
			int j = 0;
			for(i = 0; i < namelist.length; i++)		//String���÷���һ:public int length
			{
				if(x.equals(namelist[i]))				//String���÷�����:public boolean equals(String s)
				{	
					System.out.printf("Nice to meet you! %s", namelist[i]);
					continue;
				}
				else
				{
					j++;
					if((i == namelist.length-1)&&(j == namelist.length))
					{
						System.out.println("û�д���.");
					}
				}
			}
		}
		else if(choiceone == 4)
		{
			System.out.println("��ѡ������Ҫ�ķ���:\n"+"1.���ֵ�˳���б�.\n"+"2.�Ա����С�����б�.\n");
				/*String [] namelistcopy = new String(namelist);       �д����ģ�
				for(int count = 0; count < namelistcopy.length; count++)
				{	
					System.out.println((count+1)+"."+namelistcopy[count]);
				}
				*/
			Scanner reader = new Scanner(System.in);
			int inputthree = reader.nextInt();
			if(inputthree == 1)
			{
				System.out.println("\n���ֵ�˳���б�:");
				Arrays.sort(namelist);						//Arrays.sort();  ����Arrays�࣬���ֵ�˳�����У��Ƿ��ͬ������ĳ���
				/*
				for(int countt = 0; countt < namelist.length; countt++)
				{
					for(int count = 0; count < namelist.length-1; count++)
					{
						if(namelist[count].compareTo(namelist[count+1]) >= 0)			//String����������:public int compareTo(String s);
						{
							String tempone;
							tempone = namelist[count];
							namelist[count] = namelist[count+1];
							namelist[count+1] = tempone;
						}
					}
				}
				*/
				for(int count = 0; count < namelist.length; count++)
				{
					
					System.out.println((count+1)+"."+namelist[count]);
				}
			}
			else if(inputthree == 2)
			{
				System.out.println("\n�Ա����С�����б�:");
				for(int count = 0; count < namelist.length; count++)
				{
					System.out.println((count+1)+"."+namelist[count]);
				}
			}
			else
			{
				;
			}
			//System.out.println("");
			
		}
		else if(choiceone == 5)
		{
			System.out.println("������ؼ���:");
			Scanner reader = new Scanner(System.in);
			String x = reader.nextLine();
			int i = 0;
			int j = 0;
			for(i = 0; i < namelist.length; i++)		//String���÷���һ:public int length
			{
				if(namelist[i].contains(x))				//String���÷�����:public boolean contains(String s)
				{	
					System.out.printf("���йؼ��� %s ��ѧ��Ϊ: %s", x, namelist[i]);
					continue;
				}
				else
				{
					j++;
					if((i == namelist.length-1)&&(j == namelist.length))
					{
						System.out.println("û�д���.");
					}
				}
			}
		}
		else if(choiceone == 6)
		{
			System.out.println("�������ַ�����:");
			Scanner readerone = new Scanner(System.in);
			String x = readerone.nextLine();
			System.out.println("������ؼ���:");
			Scanner readertwo = new Scanner(System.in);
			String key = readertwo.nextLine();
			System.out.println("��ѡ������״�/ĩ��(1/2)����ؼ���:");
			Scanner readerthree = new Scanner(System.in);
			int choicethree = readerthree.nextInt();
			if(choicethree == 1)
			{
				if(x.indexOf(key) != -1)
				{
					System.out.println("�ؼ��� "+key+" �״γ����ڵ� "+x.indexOf(key)+" ���ַ�(��0��ʼ).\n");			//String���÷�����:public int index(String s);
				}
				else
				{
					System.out.printf("���ַ�������û�йؼ��� %s.", key);
				}
			}
			else
			{
				if(x.indexOf(key) != -1)
				{
					System.out.println("�ؼ��� "+key+" ĩ�γ����ڵ� "+x.lastIndexOf(key)+" ���ַ�(��0��ʼ).\n");		//String���÷�����:public int lastindex(String s);
				}
				else
				{
					System.out.printf("���ַ�������û�йؼ��� %s.", key);
				}
			}
		}
		else if(choiceone == 7)
		{
			System.out.println("�������ַ�����:");
			Scanner reader = new Scanner(System.in);
			String strings = reader.nextLine();
			System.out.println("��������ȡ������ʼλ��(��0��ʼ):");
			Scanner startpoint = new Scanner(System.in);
			int start = startpoint.nextInt();
			System.out.println("��������ȡ��������λ��+1(��0��ʼ):");
			Scanner endpoint = new Scanner(System.in);
			int end = endpoint.nextInt();
			if((start < end)&&(start < strings.length())&&(end < strings.length()+1))
			{
				String key = strings.substring(start, end);
				System.out.println("�ؼ���Ϊ "+key);
			}
			else
			{
				System.out.println("�������.");
			}
		}
		else if(choiceone == 8)
		{
			System.out.println("�������ַ�����:");
			Scanner reader = new Scanner(System.in);
			String strings = reader.nextLine();
			String ezstrings = strings.trim();
			System.out.println(ezstrings);
		}
		else
		{
			;
		}
		
	}
}

/*
int scan(int x)
{
	Scanner in = new Scanner(System.in);
	
	
		System.out.println("");
}
*/