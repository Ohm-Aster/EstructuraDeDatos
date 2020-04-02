


public class ordenar {
	
	public static String caracter[] = new String [5];
	public static void main(String[] args)
		{
		
		for(int i=0; i<=4; i++)
		{
			System.out.println("introduce valor "+ i);
			KBReader captura = new KBReader();
			caracter[i] = captura.getString();
		}
	
		System.out.print(caracter);
}
public class KBReader
{
	public String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
}