Calculadora de Equações do 2º Grau (Fórmula de Bhaskara)Este projeto é uma ferramenta de linha de comando desenvolvida em Java 

para resolver equações quadráticas. O diferencial desta aplicação é o detalhamento completo de cada etapa do cálculo matemático, 

desde o discriminante ($\Delta$) até as raízes finais.🚀 FuncionalidadesO programa interage com o usuário para processar 

os termos da equação:Captura Dinâmica: Solicita a entrada dos coeficientes $a$, $b$ e $c$ via console.Resolução Completa: 

Utiliza a classe ResolvedorBaskara para processar a lógica matemática.Detalhamento de Cálculos: 

Exibe não apenas as raízes ($x'$ e $x''$), mas todos os passos intermediários, como o valor de $\Delta$, $\sqrt{\Delta}$, 

e as divisões por $2a$.🛠️ Tecnologias UtilizadasJava: Linguagem principal do projeto.java.util.Scanner: 

Para a leitura de dados do teclado.Try-with-resources: Utilizado no Scanner para garantir o fechamento automático do fluxo 

de entrada e evitar vazamento de memória.💻 Exemplo de ExecuçãoAo fornecer os valores $a=1, b=-2, c=-3$, 

o sistema gera a seguinte saída detalhada:PlaintextSeja bem vindo a Calculadora de Equações do 2º Grau!

Digite o termo "a": 1
Digite o termo "b": -2
Digite o termo "c": -3

Resultado: x' = 3,0, x'' = -1,0
Cálculos realizados:
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
📁 Estrutura de Pacotesbaskara: Pacote principal que contém a classe de execução Programa.baskara.ResolvedorBaskara: 

Contém a lógica de negócio e a classe interna ResultadoBaskara para encapsular os dados do cálculo.

📝 Como ExecutarCertifique-se de ter o JDK 17 ou superior instalado (conforme seu perfil de Engenheiro de Software).

Compile as classes do projeto.Execute a classe Programa.java.

