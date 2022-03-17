pacote  baskara ;

importar  java.util.Scanner ;

import  baskara.ResolvedorBaskara.ResultadoBaskara ;

 classe  pública Programa {
	public  static  void  main ( String [] args ) {
		
		try ( Scanner sc =  new  Scanner ( System . in)){
			Sistema . fora . println( " Seja bem vindo a Calculadora de Equações do 2º Grau! " );
			
			// Capturando variáveis
			Sistema . fora . print( " Digite o termo \" a \" : " );
			int a = sc . nextInt();
			Sistema . fora . print( " Digite o termo \" b \" : " );
			int b = sc . nextInt();
			Sistema . fora . print( " Digite o termo \" c \" : " );
			int c = sc . nextInt();
			
			ResolvedorBaskara resolvedor =  new  ResolvedorBaskara ();
			ResultadoBaskara resultado = resolvedor . resolver(a, b, c);
			Sistema . fora . println(resultado);
			/*
			Para a=1, b=-2 ec=-3, imprime:
				Resultado: x' = 3,0, x'' = -1,0
				Cálculos pagos:
				b² = 4,0
				4ac = -12,0
				Δ = b² - 4ac = 16,0
				√Δ = 4,0
				-b = 2,0
				-b + √Δ = 6,0
				-b - √Δ = -2,0
				2a = 2,0
				x' = (-b + √Δ) / 2a = 3,0
				x'' = (-b - √Δ) / 2a = -1,0
			*/

		}

	}
}
