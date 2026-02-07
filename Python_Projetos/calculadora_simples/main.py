# Principal:

from calculadora import Calculadora


def main():

    # Criando objeto da classe Calculadora
    # Acessando os métodos
    calc = Calculadora()


    while True:
         # Menu
        print("\n=== CALCULADORA ===")
        print("soma")
        print("subtracao")
        print("multiplicacao")
        print("divisao")
        print("media")
        print("porcentagem")
        print("resto")
        print("sair")

        operacao = input("Escolha a operação: ").lower()

        if operacao == "sair":
            print("Encerrando programa...")
            break

        if operacao in ["porcentagem", "resto"]:
            # exigindo 2 valores
            try:
                a = float(input("Digite o primeiro valor: "))
                b = float(input("Digite o segundo valor: "))

                resultado = calc.calcular(operacao, a, b)

                print("Resultado:", resultado)

            except ValueError:
                print("Erro: Digite apenas números")
                
        else:
            # Para as demais operações
            # Podemos inserir qualquer quantidade
            try:
                entrada = input(
                    "Digite os números separados por espaço:"

                )

                # Lista de floats
                numeros = [float(n) for n in entrada.split()]

                resultado = calc.calcular(operacao, *numeros)

                print("Resultado: ", resultado)

            except ValueError:
                print("Erro: Digite apenas números")

            except ZeroDivisionError:
                print("Erro: Divisão por zero")

if __name__ == "__main__":
    main()
