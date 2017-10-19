import java.util.Scanner;

public class main 
{

	public static void main(String[] args)
	{
		// Declaramos variables
		int intentos=3,passUsuario=0;
		final int PASS_VALIDA=12345;
	
		Scanner teclado=new Scanner (System.in);
						
			do 
			{
				System.out.println("Tienes "+intentos+ " intentos");
				System.out.println("Introduce la contraseña:");
				passUsuario=teclado.nextInt();
				
				
				if(passUsuario!=PASS_VALIDA)
				{
					System.out.println("fallastes");
					intentos--;
				}
								
			}
			while ((passUsuario!=PASS_VALIDA) && (intentos>0));
			
			if (intentos>0)
			{
				System.out.println("Combinación correcta");
				
			}
			else
			{
				System.out.println("Has superado en número de intentos");
			}
			
			
		}

}
