import java.util.ArrayList;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,1,2,1,2,1,2,1,3,1,3,1,5,2,0};
		ArrayList<Integer> ab= new ArrayList<Integer>();
		
		for (int i=0;i<a.length;i++)
		{
			if(!ab.contains(a[i]))
			{
				int k=0;
				ab.add(a[i]);
				k++;
				for(int j= i+1;j<a.length;j++)
				{
					if (a[j]==a[i])
					{
						k++;
				}}
				
				System.out.println(a[i]);
				System.out.println(k);
				
			}
			
		}

	}

}
