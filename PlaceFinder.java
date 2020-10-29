public class PlaceFinder 
{
	public static String[] palace = {"Delhi ", "Mysore ", "Hyderabad","Chikkabanawara","Hassan","Mangalore","Jalahalli","Odisha","Howrah","China","Kerala"};
	public static String find(int fromDistance) 
	{
		if (fromDistance<=10) 
		{
			return PlaceFinder.places[0];
		}
		else if (fromDistance <= 50) 
		{
			return PlaceFinder.places[1];
		}
		else if(fromDistance <=100)
			{
			return PlaceFinder.places[2];
		}
		else if(fromDistance <= 250) 
		{
			return PlaceFinder.places[3];
		}
		else if (fromDistance <= 350)
			{
			return PlaceFinder.places[4];
		}
		else if (fromDistance <= 450)
			{
			return PlaceFinder.places[5];
		}
		else if(fromDistance<=900) 
		{
			return PlaceFinder.places[6];
		}
		else if(fromDistance<=1500)
			{
			return PlaceFinder.places[7];
		
		}
		else if(fromDistance<=2000)
			{
			return PlaceFinder.places[8];
		}
		else if(fromDistance<=2500)
			{
			return PlaceFinder.places[9];
		} 
		else if(fromDistance<=3000) 
		{
			return PlaceFinder.places[10];
			
	}

	}
	public static String finder(int fromDistance, int toDistance) 
{
		if (fromDistance<=10) 
		{
			if (toDistance<=10)
				{
				return PlaceFinder.places[0];
			}
			else 
			{
				return PlaceFinder.places[1];
			}	
		}
}
}