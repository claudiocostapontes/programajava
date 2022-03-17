# pacote  baskara ;

import  java.util.ArrayList ;
import  java.util.List ;
import  java.util.function.DoubleSupplier ;
importar  java.util.stream.Collectors ;

public  class  ResolvedorBaskara {
	
	List< CalculoIntermediarioBaskara > calculos =  new  ArrayList<> ();

	public  ResultadoBaskara  resolver ( double  a , double  b , double  c ) {
		double bAoQuadrado = calcula( " b² " , () - >  Math . pow(b, 2 ));
		
		double quatroAC = calcula( " 4ac " , () - >  4  * a * c);
		
		double delta = calcula( " Δ = b² - 4ac " , () - > bAoQuadrado - quatroAC);
		
		if (delta <  0 ) {
			throw  new  BaskaraException ( " Não existe raiz real para Δ negativo: "  + delta);
		}
		
		double raizDeDelta = calcula( " √Δ " , () - >  Math . sqrt(delta));
		
		double menosB = calcula( " -b " , () - >  - b);

		double menosBMaisRaizDeDelta = calcula( " -b + √Δ " , () - > menosB + raizDeDelta);

		double menosBMenosRaizDeDelta = calcula( " -b - √Δ " , () - > menosB - raizDeDelta);

		double doisA = calcula( " 2a " , () - >  2  * a);
		
		double x1 = calcula( " x' = (-b + √Δ) / 2a " , () - > menosBMaisRaizDeDelta / doisA);
		
		double x2 = calcula( " x'' = (-b - √Δ) / 2a " , () - > menosBMenosRaizDeDelta / doisA);
		
		retornar  novo  ResultadoBaskara (x1, x2, calculos);
	}

	private  double  calcula ( String  descricao , DoubleSupplier  calculo ) {
		valor duplo = calculo . getAsDouble();
		cálculos . add( new  CalculoIntermediarioBaskara (descricao, valor));
		valor de retorno ;
	}

	public  static  class  CalculoIntermediarioBaskara {
		private  final  String descricao;
		 valor duplo final  privado ;

		public  CalculoIntermediarioBaskara ( String  descricao , double  valor ) {
			isso . descrição = descrição;
			isso . valor = valor;
		}

		public  String  getDescricao () {
			retorno descrição;
		}

		public  double  getValor () {
			valor de retorno ;
		}

		@Sobrepor
		public  String  toString () {
			return descrição +  " = "  + valor;
		}

	}

	 classe estática   pública ResultadoBaskara { 
		privado  final  duplo x1;
		 duplo final  privado x2;
		private  List< CalculoIntermediarioBaskara > calculos;

		public  ResultadoBaskara ( double  x1 , double  x2 , List< CalculoIntermediarioBaskara >  calculos ) {
			isso . x1 = x1;
			isso . x2 = x2;
			isso . cálculos = cálculos;
		}

		public  double  getX1 () {
			retorna x1;
		}

		public  double  getX2 () {
			retorna x2;
		}

		@Sobrepor
		public  String  toString () {
			String texto =  " Resultado: x' = "  + x1 +  " , x'' = "  + x2 +  " \n " ;
			texto +=  " Cálculos extras: \n " ;
			texto +=  String . join( " \n " , calculos . stream() . map( CalculoIntermediarioBaskara :: toString) . collect( Collectors . toList()));
			retornar texto;
		}
	}

	
	 classe estática  pública BaskaraException estende RuntimeException {   
		private  estático  final  longo serialVersionUID =  1L ;

		public  BaskaraException ( String  mensagem ) {
			super (mensagem);
		}
	}
}programajava
