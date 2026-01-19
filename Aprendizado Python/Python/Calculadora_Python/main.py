import math

print("=== Calculadora Python ===")
print("Operações disponíveis:")
print("+  → soma")
print("-  → subtração")
print("*  → multiplicação")
print("/  → divisão")
print("%  → resto da divisão")
print("** → potência")
print("sqrt → raiz quadrada (usa só o primeiro número)")

# .strip() é um método de strings que remove 
# espaços em branco do início e do fim da resposta.
operacao = input("Escolha a operação: ").strip()

# lista onde guardaremos todos os números
numeros = []

# Entrada dos números
while True:
    valor = input("Digite um número (ou ENTER para parar): ")
    if valor == "":
        break
    # try serve pra executar algo sem 
    # quebrar o programa se der erro
    try:
        # float(valor) tenta converter esse valor
        # para um número decimal (ponto flutuante).
        # numeros.append(...) adiciona esse número à lista numeros.
        # essa linha transforma o que o usuário digitou em número e guarda na lista.  
        numeros.append(float(valor))
    # Se o usuário digitar algo que não pode virar número
    # Python gera um erro chamado ValueError.
    except ValueError:
        print("Por favor, digite um número válido!")

# Verificar se há números o bastante
if len(numeros) == 0:
    print("Nenhum número inserido.")
else:
    if operacao == "sqrt":
        # Raiz quadrada só usa o primeiro número
        resultado = math.sqrt(numeros[0])
    else:
        # O resultado atribuímos a 0
        # pra acumular a soma
        resultado = numeros[0]
        # Pegue a partir do índice 1 até o final da lista
        # Ele ignora o número da posição 0
        # E pega só os números a partir do segundo em diante.
        for n in numeros[1:]:
            if operacao == "+":
                resultado += n

            elif operacao == "-":
                resultado -= n

            elif operacao == "*":
                resultado *= n

            elif operacao == "/":
                if n != 0:
                    resultado /= n
                else:
                    print("Erro! Divisão por zero!")
                    resultado = None
                    break

            elif operacao == "%":
                resultado %= n
            
            elif operacao == "**":
                resultado **= n
            
            else:
                print("Operação inválida!")
                resultado = None
                break
        # O que é esse f?
        # O f (de formatted) diz pro Python:
        # Substitua tudo que estiver entre chaves {} pelo valor da variável correspondente
        # Exemplo simples:
        # nome = "Mel"
        # idade = 18
        # print(f"Olá, {nome}! Você tem {idade} anos.")
        # Saída:
        # Olá, Mel! Você tem 18 anos.
        # idade trocado por 18 e nome trocado por Mel
        if resultado is not None:
            print(f"\nResultado final: {resultado}")   
        # Diferenças importantes
        # None é Variável que não tem valor definido, especial do Python
        # Vazio é resultado = "" , ou seja String vazia
        # Zero é resultado = 0 , número 0, é válido*