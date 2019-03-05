import java.util.*;
public class name
{
	public static void main (String args[]) 
	{
		String [] namelist = {"闵天","司浩楠","姚明宇","张驰","张雪原"};
		//String []  numberlist= {"20175210","201752XX","20175223","20175201","20175216"};
		int choiceone = 0;
		for(int count = 0; count != 1; count++)
		{
			System.out.println("请选择您想要的服务:");
			System.out.println("1.检索有无相同姓氏;\n"+"2.检索有无相同名字结尾.\n"
			+"3.检索学生姓名以确认是否存在.\n"+"4.列出所有学生名单.\n"
			+"5.检索具有关键字符的学生姓名.\n"+"6.输入字符序列，检索关键词首\\尾位置.\n"
			+"7.输入字符序列，提取相应关键词.\n"+"8.去掉输入字符序列两边的空格.\n"+"0.退出.\n");
		
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
					System.out.println("已退出.\n");
					System.exit(-1);
					break;
				default:
					System.out.println("错误!请重新输入:\n");
					count = 1;
			}
		}
		if(choiceone == 1)
		{
			System.out.println("请输入你要查的姓氏:");
			Scanner inputtwo = new Scanner(System.in);
			String familyname = inputtwo.nextLine();
			for(int count=0, choicetwo = 0; count < namelist.length; count++)
			{
				
				if(namelist[count].startsWith(familyname))		//String常用方法三:public boolean startsWith(String s)
				{
					choicetwo = 1;
				}
				if((choicetwo == 1)&&(count == namelist.length-1))
				{
					System.out.printf("有姓 %s 的人.\n", familyname);
				}
				else if((choicetwo == 0)&&(count == namelist.length-1))
				{
					System.out.printf("没有姓 %s 的人.\n", familyname);
				}
				else
				{
					;
				}
			}
		}
		else if(choiceone == 2)
		{
			System.out.println("请输入你要查的名字结尾:");
			Scanner inputtwo = new Scanner(System.in);
			String familyname = inputtwo.nextLine();
			for(int count=0, choicetwo = 0; count < namelist.length; count++)
			{
				
				if(namelist[count].endsWith(familyname))		//String常用方法三:public boolean endsWith(String s)
				{
					choicetwo = 1;
				}
				if((choicetwo == 1)&&(count == namelist.length-1))
				{
					System.out.printf("有名字结尾为 %s 的人.\n", familyname);
				}
				else if((choicetwo == 0)&&(count == namelist.length-1))
				{
					System.out.printf("没有名字结尾为 %s 的人.\n", familyname);
				}
				else
				{
					;
				}
			}
		}
		else if(choiceone == 3)
		{
			System.out.println("请输入404寝室其中一人名字:");
			Scanner reader = new Scanner(System.in);
			String x = reader.nextLine();
			int i = 0;
			int j = 0;
			for(i = 0; i < namelist.length; i++)		//String常用方法一:public int length
			{
				if(x.equals(namelist[i]))				//String常用方法二:public boolean equals(String s)
				{	
					System.out.printf("Nice to meet you! %s", namelist[i]);
					continue;
				}
				else
				{
					j++;
					if((i == namelist.length-1)&&(j == namelist.length))
					{
						System.out.println("没有此人.");
					}
				}
			}
		}
		else if(choiceone == 4)
		{
			System.out.println("请选择您想要的服务:\n"+"1.以字典顺序列表.\n"+"2.以编号由小到大列表.\n");
				/*String [] namelistcopy = new String(namelist);       有错，在哪？
				for(int count = 0; count < namelistcopy.length; count++)
				{	
					System.out.println((count+1)+"."+namelistcopy[count]);
				}
				*/
			Scanner reader = new Scanner(System.in);
			int inputthree = reader.nextInt();
			if(inputthree == 1)
			{
				System.out.println("\n以字典顺序列表:");
				Arrays.sort(namelist);						//Arrays.sort();  属于Arrays类，按字典顺序排列；是否等同于下面的程序？
				/*
				for(int countt = 0; countt < namelist.length; countt++)
				{
					for(int count = 0; count < namelist.length-1; count++)
					{
						if(namelist[count].compareTo(namelist[count+1]) >= 0)			//String常见方法四:public int compareTo(String s);
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
				System.out.println("\n以编号由小到大列表:");
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
			System.out.println("请输入关键字:");
			Scanner reader = new Scanner(System.in);
			String x = reader.nextLine();
			int i = 0;
			int j = 0;
			for(i = 0; i < namelist.length; i++)		//String常用方法一:public int length
			{
				if(namelist[i].contains(x))				//String常用方法五:public boolean contains(String s)
				{	
					System.out.printf("具有关键字 %s 的学生为: %s", x, namelist[i]);
					continue;
				}
				else
				{
					j++;
					if((i == namelist.length-1)&&(j == namelist.length))
					{
						System.out.println("没有此人.");
					}
				}
			}
		}
		else if(choiceone == 6)
		{
			System.out.println("请输入字符序列:");
			Scanner readerone = new Scanner(System.in);
			String x = readerone.nextLine();
			System.out.println("请输入关键词:");
			Scanner readertwo = new Scanner(System.in);
			String key = readertwo.nextLine();
			System.out.println("请选择检索首次/末次(1/2)出项关键词:");
			Scanner readerthree = new Scanner(System.in);
			int choicethree = readerthree.nextInt();
			if(choicethree == 1)
			{
				if(x.indexOf(key) != -1)
				{
					System.out.println("关键词 "+key+" 首次出现在第 "+x.indexOf(key)+" 个字符(由0开始).\n");			//String常用方法六:public int index(String s);
				}
				else
				{
					System.out.printf("该字符序列中没有关键词 %s.", key);
				}
			}
			else
			{
				if(x.indexOf(key) != -1)
				{
					System.out.println("关键词 "+key+" 末次出现在第 "+x.lastIndexOf(key)+" 个字符(由0开始).\n");		//String常用方法六:public int lastindex(String s);
				}
				else
				{
					System.out.printf("该字符序列中没有关键词 %s.", key);
				}
			}
		}
		else if(choiceone == 7)
		{
			System.out.println("请输入字符序列:");
			Scanner reader = new Scanner(System.in);
			String strings = reader.nextLine();
			System.out.println("请输入提取索引开始位置(由0开始):");
			Scanner startpoint = new Scanner(System.in);
			int start = startpoint.nextInt();
			System.out.println("请输入提取索引结束位置+1(由0开始):");
			Scanner endpoint = new Scanner(System.in);
			int end = endpoint.nextInt();
			if((start < end)&&(start < strings.length())&&(end < strings.length()+1))
			{
				String key = strings.substring(start, end);
				System.out.println("关键词为 "+key);
			}
			else
			{
				System.out.println("输入错误.");
			}
		}
		else if(choiceone == 8)
		{
			System.out.println("请输入字符序列:");
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
